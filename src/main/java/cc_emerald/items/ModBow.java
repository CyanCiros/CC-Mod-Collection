package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBow extends ItemBow {
	private float arrowDamage;
	private String[] pullingModelNames;

	public ModBow() {
		super();
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModBow(final String name, final int maxUses, final float arrowDamage) {
		super();
		this.setUnlocalizedName(name);
		this.setMaxDamage(maxUses);
		this.arrowDamage = arrowDamage;
		this.setCreativeTab(CCEmerald.creativeTab);

		this.pullingModelNames = new String[3];
	}

	@SideOnly(Side.CLIENT)
	public void registerBowRender(final ItemModelMesher itemModelMesher) {
		final String baseModelName = CCEmerald.MODID + ":" + this.getUnlocalizedName().substring(5);

		ModelBakery.addVariantName(this, new String[] { baseModelName });
		itemModelMesher.register(this, 0, new ModelResourceLocation(baseModelName, "inventory"));

		for (int i = 0; i < 3; i++) {
			final String variantName = baseModelName + "_" + Integer.toString(i);
			this.pullingModelNames[i] = variantName;
			final ModelResourceLocation pullingModel = new ModelResourceLocation(variantName, "inventory");

			ModelBakery.addVariantName(this, new String[] { variantName });
			itemModelMesher.register(this, i + 1, pullingModel);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelResourceLocation getModel(final ItemStack stack, final EntityPlayer player, final int useRemaining) {
		if (useRemaining < 1) {
			return null;
		}
		final double vanillaTimeToFullPull = 18.0D;
		final double usedSoFar = this.getMaxItemUseDuration(stack) - useRemaining;
		final String variantName = this.pullingModelNames[Math
				.min((int) Math.floor(usedSoFar / vanillaTimeToFullPull * 2.0D), 2)];

		return new ModelResourceLocation(variantName, "inventory");
	}

	@Override
	public void onPlayerStoppedUsing(final ItemStack stack, final World worldIn, final EntityPlayer playerIn,
			final int timeLeft) {
		int j = this.getMaxItemUseDuration(stack) - timeLeft;
		final ArrowLooseEvent event = new ArrowLooseEvent(playerIn, stack, j);
		if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) {
			return;
		}
		j = event.charge;

		final boolean flag = playerIn.capabilities.isCreativeMode
				|| EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

		if (flag || playerIn.inventory.hasItem(Items.arrow)) {
			float f = j / 20.0F;
			f = (f * f + f * 2.0F) / 3.0F;

			if (f < 0.1D) {
				return;
			}

			if (f > 1.0F) {
				f = 1.0F;
			}

			final EntityArrow entityarrow = new EntityArrow(worldIn, playerIn, f * 2.0F);

			if (f == 1.0F) {
				entityarrow.setIsCritical(true);
			}

			final int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

			if (k > 0) {
				entityarrow.setDamage(entityarrow.getDamage() + k * 0.5D + 0.5D);
			}
			entityarrow.setDamage(entityarrow.getDamage() + this.arrowDamage);

			final int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

			if (l > 0) {
				entityarrow.setKnockbackStrength(l);
			}

			if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0) {
				entityarrow.setFire(100);
			}

			stack.damageItem(1, playerIn);
			worldIn.playSoundAtEntity(playerIn, "random.bow", 1.0F,
					1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

			if (flag) {
				entityarrow.canBePickedUp = 2;
			} else {
				playerIn.inventory.consumeInventoryItem(Items.arrow);
			}

			playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);

			if (!worldIn.isRemote) {
				worldIn.spawnEntityInWorld(entityarrow);
			}
		}
	}
}
