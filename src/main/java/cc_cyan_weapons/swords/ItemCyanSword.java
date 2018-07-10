package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemCyanSword extends ItemSword {
	public ItemCyanSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.cyanSwordRightClickEffect) {
			entityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0));
			entityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.id, 300, 0));

			entityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 300, 0));
			entityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 300, 0));

			entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 0));
			entityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 1));

			entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 300, 0));
			entityPlayer.addPotionEffect(new PotionEffect(Potion.absorption.id, 300, 0));

			itemStack.damageItem(24, entityPlayer);
		}
		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.cyanSwordHitEntityEffect) {
			entity1.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 180, 0));
			entity1.addPotionEffect(new PotionEffect(Potion.weakness.id, 180, 0));

			entity1.addPotionEffect(new PotionEffect(Potion.poison.id, 180, 0));
			entity1.addPotionEffect(new PotionEffect(Potion.wither.id, 180, 0));

			entity1.setFire(9);

			final int y = (int) (entity1.prevPosY + (entity1.posY - entity1.prevPosY) + 1.62D - entity1.getYOffset());
			entity1.addVelocity(-MathHelper.sin(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.05F / 8.0D, 0.1D,
					MathHelper.cos(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.05F / 8.0D);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
