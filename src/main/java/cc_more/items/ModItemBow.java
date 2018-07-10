package cc_more.items;

import java.util.List;

import cc_more.CCMore;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItemBow extends ItemBow {
	public float arrowDamage = 0;

	public ModItemBow(final String name, final int maxDamage, final float arrowDamage) {
		this.setCreativeTab(CCMore.creativeTab);
		this.setUnlocalizedName(name);
		this.arrowDamage = arrowDamage;
		this.maxStackSize = 1;
		this.setMaxDamage(maxDamage);
		this.setFull3D();
	}

	@Override
	public void onPlayerStoppedUsing(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer,
			final int par4) {
		int j = this.getMaxItemUseDuration(itemStack) - par4;
		final ArrowLooseEvent event = new ArrowLooseEvent(entityPlayer, itemStack, j);
		MinecraftForge.EVENT_BUS.post(event);

		if (event.isCanceled()) {
			return;
		}
		j = event.charge;
		final boolean flag = entityPlayer.capabilities.isCreativeMode
				|| EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, itemStack) > 0;

		if (flag || entityPlayer.inventory.hasItem(Items.arrow)) {
			float a = j / 20.0F;
			a = (a * a + a * 2.0F) / 3.0F;

			if (a < 0.1D) {
				return;
			}
			if (a > 1.0F) {
				a = 1.0F;
			}
			final EntityArrow entityarrow = new EntityArrow(world, entityPlayer, a * 2.0F);
			entityarrow.setDamage(entityarrow.getDamage() + this.arrowDamage);

			if (a == 1.0F) {
				entityarrow.setIsCritical(false);
			}
			final int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, itemStack);
			if (k > 0) {
				entityarrow.setDamage(entityarrow.getDamage() + k * 0.5D + 0.5D);
			}
			final int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, itemStack);
			if (l > 0) {
				entityarrow.setKnockbackStrength(l);
			}
			final int f = EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, itemStack);
			if (f > 0) {
				entityarrow.setFire(100);
			}
			itemStack.damageItem(1, entityPlayer);
			world.playSoundAtEntity(entityPlayer, "random.bow", 1.0F,
					1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
			if (flag) {
				entityarrow.canBePickedUp = 2;
			} else {
				entityPlayer.inventory.consumeInventoryItem(Items.arrow);
			}
			if (!world.isRemote) {
				world.spawnEntityInWorld(entityarrow);
			}
		}
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack itemStack, final EntityPlayer player, final List list,
			final boolean par4) {
		list.add(EnumChatFormatting.GREEN + "+" + this.arrowDamage + " arrow damage.");
	}
}
