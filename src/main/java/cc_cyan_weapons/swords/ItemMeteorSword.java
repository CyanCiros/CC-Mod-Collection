package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemMeteorSword extends ItemSword {
	public ItemMeteorSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.meteorSwordRightClickEffect) {
			final int x = (int) (entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX));
			final int y = (int) (entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) + 1.62D
					- entityPlayer.getYOffset());
			final int z = (int) (entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ));

			final MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world,
					entityPlayer, true);

			if (movingobjectposition != null
					&& movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
				final int ex = movingobjectposition.getBlockPos().getX();
				final int ey = movingobjectposition.getBlockPos().getY();
				final int ez = movingobjectposition.getBlockPos().getZ();

				if (ex == x - 1 && ey == y - 2 && ez == z) {
					this.placeFire(world, x + 2, y - 1, z);
					this.placeFire(world, x + 1, y - 1, z - 2);
					this.placeFire(world, x - 1, y - 1, z - 3);
					this.placeFire(world, x - 3, y - 1, z - 2);
					this.placeFire(world, x - 4, y - 1, z);
					this.placeFire(world, x - 3, y - 1, z + 2);
					this.placeFire(world, x - 1, y - 1, z + 3);
					this.placeFire(world, x + 1, y - 1, z + 2);

					itemStack.damageItem(24, entityPlayer);
				} else {
					this.placeFire(world, ex, ey + 1, ez);

					itemStack.damageItem(3, entityPlayer);
				}
			} else if (!world.isRemote) {
				final Vec3 look = entityPlayer.getLookVec();
				final EntityLargeFireball fireball = new EntityLargeFireball(world, entityPlayer, 1.0D, 1.0D, 1.0D);

				fireball.setPosition(entityPlayer.posX, entityPlayer.posY + 1, entityPlayer.posZ);
				fireball.accelerationX = look.xCoord * 0.5D;
				fireball.accelerationY = look.yCoord * 0.5D;
				fireball.accelerationZ = look.zCoord * 0.5D;

				world.spawnEntityInWorld(fireball);

				itemStack.damageItem(3, entityPlayer);
			}
			entityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 180, 0));

			itemStack.damageItem(3, entityPlayer);
		}
		return itemStack;
	}

	private void placeFire(final World world, final int x, final int y, final int z) {
		for (int vy = -3; vy <= 3; vy++) {
			if (world.isAirBlock(new BlockPos(x, y + vy, z)) && !world.isAirBlock(new BlockPos(x, y + vy - 1, z))) {
				world.setBlockState(new BlockPos(x, y + vy, z), Blocks.fire.getDefaultState());

				break;
			}
		}
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.meteorSwordHitEntityEffect) {
			entity1.setFire(9);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
