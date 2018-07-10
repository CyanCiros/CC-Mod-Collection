package cc_cyan_weapons.bows;

import java.util.List;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import cc_cyan_weapons.entity.EntityEnderWindArrow;
import cc_cyan_weapons.items.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemEnderWindBow extends ModBow {
	public float arrowDamage;

	public ItemEnderWindBow(final String name, final int maxDamage, final float arrowDamage) {
		this.setCreativeTab(CCCyanWeapons.creativeTab);
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

		if (flag || entityPlayer.inventory.hasItem(ModItems.enderWindArrow)) {
			float a = j / 20.0F;
			a = (a * a + a * 2.0F) / 3.0F;

			if (a < 0.1D) {
				return;
			}
			if (a > 1.0F) {
				a = 1.0F;
			}
			final EntityEnderWindArrow entityarrow = new EntityEnderWindArrow(world, entityPlayer, a * 2.0F);
			entityarrow.setDamage(entityarrow.getDamage() + this.arrowDamage);

			if (a == 1.0F) {
				entityarrow.setIsCritical(false);
			}
			final int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, itemStack);

			if (k > 0) {
				entityarrow.setDamage(entityarrow.getDamage() + k * 0.5D + 0.5D);
			}
			// final int l = EnchantmentHelper.getEnchantmentLevel(
			// Enchantment.punch.effectId, itemStack);
			//
			// if (l > 0) {
			// entityarrow.setKnockbackStrength(l);
			// }
			entityarrow.setKnockbackStrength(2);

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
				entityPlayer.inventory.consumeInventoryItem(ModItems.enderWindArrow);
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

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		final ArrowNockEvent event = new ArrowNockEvent(entityPlayer, itemStack);
		MinecraftForge.EVENT_BUS.post(event);

		if (event.isCanceled()) {
			return event.result;
		}

		if (entityPlayer.capabilities.isCreativeMode || entityPlayer.inventory.hasItem(ModItems.enderWindArrow)) {
			entityPlayer.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		}

		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.enderWindBowHitEntityEffect) {
			final int y = (int) (entity1.prevPosY + (entity1.posY - entity1.prevPosY) + 1.62D - entity1.getYOffset());

			entity1.addVelocity(-MathHelper.sin(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.15F / 8.0D, 0.1D,
					MathHelper.cos(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.15F / 8.0D);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
