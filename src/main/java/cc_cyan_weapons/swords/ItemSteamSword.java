package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class ItemSteamSword extends ItemSword {
	public ItemSteamSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.steamSwordRightClickEffect) {
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
				world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, entityPlayer.posX + 1.0D, entityPlayer.posY,
						entityPlayer.posZ, 0.0D, 0.5D, 0.0D);
				world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, entityPlayer.posX - 1.0D, entityPlayer.posY,
						entityPlayer.posZ, 0.0D, 0.5D, 0.0D);
				world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, entityPlayer.posX, entityPlayer.posY + 1.0D,
						entityPlayer.posZ, 0.0D, 0.5D, 0.0D);
				world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, entityPlayer.posX, entityPlayer.posY - 1.0D,
						entityPlayer.posZ, 0.0D, 0.5D, 0.0D);

				if (thisOne.posX < entityPlayer.posX && thisOne.posX - entityPlayer.posX <= 4.0D) {
					world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, thisOne.posX, thisOne.posY, thisOne.posZ,
							0.0D, 1.0D, 0.0D);

					if (thisOne.posZ < entityPlayer.posZ && thisOne.posX - entityPlayer.posX <= 4.0D
							&& thisOne.posY - entityPlayer.posY <= 3.0D) {
						thisOne.addVelocity(0.0D, 1.0D, 0.0D);
					}
					if (thisOne.posZ > entityPlayer.posZ && entityPlayer.posZ - thisOne.posZ >= -4.0D
							&& thisOne.posY - entityPlayer.posY <= 3.0D) {
						thisOne.addVelocity(0.0D, 1.0D, 0.0D);
					}
				}
				if (thisOne.posX > entityPlayer.posX && entityPlayer.posX - thisOne.posX >= -4.0D) {
					world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, thisOne.posX, thisOne.posY, thisOne.posZ,
							0.0D, 1.0D, 0.0D);

					if (thisOne.posZ < entityPlayer.posZ && thisOne.posX - entityPlayer.posX <= 4.0D
							&& thisOne.posY - entityPlayer.posY <= 3.0D) {
						thisOne.addVelocity(0.0D, 1.0D, 0.0D);
					}
					if (thisOne.posZ > entityPlayer.posZ && entityPlayer.posZ - thisOne.posZ >= -4.0D
							&& thisOne.posY - entityPlayer.posY <= 3.0D) {
						thisOne.addVelocity(0.0D, 1.0D, 0.0D);
					}
				}

				itemStack.damageItem(3, entityPlayer);
			}
		}
		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.steamSwordHitEntityEffect) {
			entity1.setFire(9);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
