package cc_more.items;

import cc_more.CCMore;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemMinersDream extends Item {
	public ItemMinersDream(final String name) {
		this.setUnlocalizedName(name);
		this.setMaxStackSize(64);
		this.setCreativeTab(CCMore.creativeTab);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		final MovingObjectPosition movingObjectPosition = this.getMovingObjectPositionFromPlayer(world, entityPlayer,
				true);

		if (movingObjectPosition != null
				&& movingObjectPosition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
			final Vec3 ehit = movingObjectPosition.hitVec;

			int dx1 = (int) ehit.xCoord;
			int dx2 = (int) ehit.xCoord;
			int dy = (int) ehit.yCoord;
			int dz1 = (int) ehit.zCoord;
			int dz2 = (int) ehit.zCoord;
			Block block;

			switch (movingObjectPosition.sideHit) {
			case UP:
				block = world.getBlockState(new BlockPos(dx1, dy - 1, dz1)).getBlock();
				// Up
				dx1 += -11;
				dx2 += 11;
				dy += 0;
				dz1 += -11;
				dz2 += 11;

				this.cave(world, block, dx1, dx2, dy, dz1, dz2);
				break;
			case NORTH:
				block = world.getBlockState(new BlockPos(dx1, dy, dz1)).getBlock();
				// North
				// -z
				dx1 += -11;
				dx2 += 11;
				dy += 0;
				dz1 += 0;
				dz2 += 22;

				this.cave(world, block, dx1, dx2, dy, dz1, dz2);
				break;
			case SOUTH:
				block = world.getBlockState(new BlockPos(dx1, dy, dz1 - 1)).getBlock();
				// South
				// +z
				dx1 += -11;
				dx2 += 11;
				dy += 0;
				dz1 += -23;
				dz2 += -1;

				this.cave(world, block, dx1, dx2, dy, dz1, dz2);
				break;
			case WEST:
				block = world.getBlockState(new BlockPos(dx1, dy, dz1)).getBlock();
				// West
				// -x
				dx1 += 0;
				dx2 += 22;
				dy += 0;
				dz1 += -11;
				dz2 += 11;

				this.cave(world, block, dx1, dx2, dy, dz1, dz2);
				break;
			case EAST:
				block = world.getBlockState(new BlockPos(dx1 - 1, dy, dz1)).getBlock();
				// East
				// +x
				dx1 += -23;
				dx2 += -1;
				dy += 0;
				dz1 += -11;
				dz2 += 11;

				this.cave(world, block, dx1, dx2, dy, dz1, dz2);
				break;
			default:
				break;
			}
			itemStack.stackSize--;
		}

		return itemStack;
	}

	private void cave(final World world, final Block block, final int dx1, final int dx2, final int dy, final int dz1,
			final int dz2) {
		for (int vx = dx1; vx <= dx2; vx++) {
			for (int vz = dz1; vz <= dz2; vz++) {
				for (int vy = dy; vy <= dy + 3; vy++) {
					if (world.getBlockState(new BlockPos(vx, vy, vz)).getBlock() == block) {
						world.setBlockToAir(new BlockPos(vx, vy, vz));
					}
				}
			}
		}
		for (int vx = dx1 + 5; vx <= dx2 - 5; vx += 6) {
			for (int vz = dz1 + 5; vz <= dz2 - 5; vz += 6) {
				if (world.isAirBlock(new BlockPos(vx, dy, vz)) && !world.isAirBlock(new BlockPos(vx, dy - 1, vz))) {
					world.setBlockState(new BlockPos(vx, dy, vz), Blocks.torch.getDefaultState());
				}
			}
		}
	}
}
