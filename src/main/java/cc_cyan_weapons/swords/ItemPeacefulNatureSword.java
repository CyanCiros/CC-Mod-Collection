package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemPeacefulNatureSword extends ItemSword {
	public ItemPeacefulNatureSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entity) {
		if (Config.peacefulNatureSwordRightClickEffect) {
			final int x = (int) (entity.prevPosX + (entity.posX - entity.prevPosX));
			final int y = (int) (entity.prevPosY + (entity.posY - entity.prevPosY) + 1.62D - entity.getYOffset());
			final int z = (int) (entity.prevPosZ + (entity.posZ - entity.prevPosZ));

			final MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, entity,
					true);

			if (movingobjectposition == null) {
				return itemStack;
			}
			if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
				final int ex = movingobjectposition.getBlockPos().getX();
				final int ey = movingobjectposition.getBlockPos().getY();
				final int ez = movingobjectposition.getBlockPos().getZ();

				if (ex == x - 1 && ey == y - 2 && ez == z) {
					this.placeBlock(world, x + 2, y - 1, z);
					this.placeBlock(world, x + 1, y - 1, z - 2);
					this.placeBlock(world, x - 1, y - 1, z - 3);
					this.placeBlock(world, x - 3, y - 1, z - 2);
					this.placeBlock(world, x - 4, y - 1, z);
					this.placeBlock(world, x - 3, y - 1, z + 2);
					this.placeBlock(world, x - 1, y - 1, z + 3);
					this.placeBlock(world, x + 1, y - 1, z + 2);

					itemStack.damageItem(24, entity);
				} else {
					this.placeBlock(world, ex, ey + 1, ez);

					itemStack.damageItem(3, entity);
				}
			}
			entity.addPotionEffect(new PotionEffect(Potion.resistance.id, 300, 0));

			itemStack.damageItem(3, entity);
		}
		return itemStack;
	}

	private void placeBlock(final World world, final int x, final int y, final int z) {
		for (int vy = -2; vy <= 2; vy++) {
			if (!world.isAirBlock(new BlockPos(x, y + vy - 1, z)) && world.isAirBlock(new BlockPos(x, y + vy, z))) {
				world.setBlockState(new BlockPos(x, y + vy, z), Blocks.hardened_clay.getDefaultState());
				world.setBlockState(new BlockPos(x, y + vy + 1, z), Blocks.hardened_clay.getDefaultState());
				break;
			}
		}
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.peacefulNatureSwordHitEntityEffect) {
			entity1.addPotionEffect(new PotionEffect(Potion.weakness.id, 180, 0));
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
