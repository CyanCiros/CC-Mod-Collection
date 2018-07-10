package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemWindWhirlSword extends ItemSword {
	public ItemWindWhirlSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.windWhirlSwordRightClickEffect) {
			float closest = 3.4028235E+38F;
			Entity thisOne = null;

			for (int i = 0; i < world.loadedEntityList.size(); i++) {
				if (((Entity) world.loadedEntityList.get(i)).getDistanceToEntity(entityPlayer) < closest) {
					if (world.loadedEntityList.get(i) instanceof EntityLiving) {
						closest = ((Entity) world.loadedEntityList.get(i)).getDistanceToEntity(entityPlayer);
						thisOne = (Entity) world.loadedEntityList.get(i);
					}
				}
			}
			if (thisOne != null) {
				entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 0));
				entityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 1));

				if (thisOne.posX < entityPlayer.posX && thisOne.posX - entityPlayer.posX <= 4.0D) {
					world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, entityPlayer.posX, entityPlayer.posY,
							entityPlayer.posZ, thisOne.posX - entityPlayer.posX, thisOne.posY - entityPlayer.posY,
							thisOne.posZ - entityPlayer.posZ);

					if (thisOne.posZ < entityPlayer.posZ && thisOne.posX - entityPlayer.posX <= 4.0D) {
						thisOne.addVelocity(thisOne.posX - entityPlayer.posX - 4.0D, 0.0D,
								thisOne.posZ - entityPlayer.posZ - 4.0D);
					}
					if (thisOne.posZ > entityPlayer.posZ && entityPlayer.posZ - thisOne.posZ >= -4.0D) {
						thisOne.addVelocity(thisOne.posX - entityPlayer.posX - 4.0D, 0.0D,
								entityPlayer.posX - thisOne.posX + 4.0D);
					}
				}
				if (thisOne.posX > entityPlayer.posX && entityPlayer.posX - thisOne.posX >= -4.0D) {
					world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, entityPlayer.posX, entityPlayer.posY,
							entityPlayer.posZ, thisOne.posX - entityPlayer.posX, thisOne.posY - entityPlayer.posY,
							thisOne.posZ - entityPlayer.posZ);

					if (thisOne.posZ < entityPlayer.posZ && thisOne.posX - entityPlayer.posX <= 4.0D) {
						thisOne.addVelocity(entityPlayer.posX - thisOne.posX + 4.0D, 0.0D,
								thisOne.posZ - entityPlayer.posZ - 4.0D);
					}
					if (thisOne.posZ > entityPlayer.posZ && entityPlayer.posZ - thisOne.posZ >= -4.0D) {
						thisOne.addVelocity(entityPlayer.posX - thisOne.posX + 4.0D, 0.0D,
								entityPlayer.posX - thisOne.posX + 4.0D);
					}
				}

				itemStack.damageItem(9, entityPlayer);
			}
		}
		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.windWhirlSwordHitEntityEffect) {
			final int y = (int) (entity1.prevPosY + (entity1.posY - entity1.prevPosY) + 1.62D - entity1.getYOffset());
			entity1.addVelocity(-MathHelper.sin(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.15F / 8.0D, 0.1D,
					MathHelper.cos(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.15F / 8.0D);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
