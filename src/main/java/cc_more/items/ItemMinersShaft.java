package cc_more.items;

import cc_more.CCMore;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemMinersShaft extends Item {
	public ItemMinersShaft(final String name) {
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
			int dy1 = (int) ehit.yCoord;
			int dy2 = (int) ehit.yCoord;
			int dz1 = (int) ehit.zCoord;
			int dz2 = (int) ehit.zCoord;
			final Block block;
			final EnumFacing side = movingObjectPosition.sideHit;

			switch (side) {
			case UP:
				block = world.getBlockState(new BlockPos(dx1, dy1 - 1, dz1)).getBlock();
				// Up
				dx1 += -5;
				dx2 += 5;
				dy1 += -30;
				dy2 += -1;
				dz1 += -5;
				dz2 += 5;

				this.shaft(world, block, side, dx1, dx2, dy1, dy2, dz1, dz2);
				break;
			case NORTH:
				block = world.getBlockState(new BlockPos(dx1, dy1, dz1)).getBlock();
				// North
				// -z
				dx1 += -5;
				dx2 += 5;
				dy1 += 0;
				dy2 += 3;
				dz1 += 0;
				dz2 += 88;

				this.shaft(world, block, side, dx1, dx2, dy1, dy2, dz1, dz2);
				break;
			case SOUTH:
				block = world.getBlockState(new BlockPos(dx1, dy1, dz1 - 1)).getBlock();
				// South
				// +z
				dx1 += -5;
				dx2 += 5;
				dy1 += 0;
				dy2 += 3;
				dz1 += -89;
				dz2 += -1;

				this.shaft(world, block, side, dx1, dx2, dy1, dy2, dz1, dz2);
				break;
			case WEST:
				block = world.getBlockState(new BlockPos(dx1, dy1, dz1)).getBlock();
				// West
				// -x
				dx1 += 0;
				dx2 += 88;
				dy1 += 0;
				dy2 += 3;
				dz1 += -5;
				dz2 += 5;

				this.shaft(world, block, side, dx1, dx2, dy1, dy2, dz1, dz2);
				break;
			case EAST:
				block = world.getBlockState(new BlockPos(dx1 - 1, dy1, dz1)).getBlock();
				// East
				// +x
				dx1 += -89;
				dx2 += -1;
				dy1 += 0;
				dy2 += 3;
				dz1 += -5;
				dz2 += 5;

				this.shaft(world, block, side, dx1, dx2, dy1, dy2, dz1, dz2);
				break;
			default:
				break;
			}
			itemStack.stackSize--;
		}

		return itemStack;
	}

	private void shaft(final World world, final Block block, final EnumFacing side, final int dx1, final int dx2,
			final int dy1, final int dy2, final int dz1, final int dz2) {
		if (side == EnumFacing.UP) {
			for (int vx = dx1; vx <= dx2; vx++) {
				for (int vz = dz1; vz <= dz2; vz++) {
					for (int vy = dy1; vy <= dy2 - 1; vy++) {
						if (world.getBlockState(new BlockPos(vx, vy, vz)).getBlock() == block) {
							world.setBlockToAir(new BlockPos(vx, vy, vz));
						}
					}
				}
			}
			for (int vx = dx1; vx <= dx2; vx++) {
				world.setBlockToAir(new BlockPos(vx, dy2, dz1));
				world.setBlockToAir(new BlockPos(vx, dy2, dz2));
			}
			for (int vz = dz1; vz <= dz2; vz++) {
				world.setBlockToAir(new BlockPos(dx1, dy2, vz));
				world.setBlockToAir(new BlockPos(dx2, dy2, vz));
			}
			final int tpx = dx2;
			final int tmx = dx1;
			final int tpz = dz2;
			final int tmz = dz1;

			final int cx = tmx + (tpx - tmx) / 2;
			final int cz = tmz + (tpz - tmz) / 2;

			int sx1 = tpx;
			int sy1 = dy1;
			int sz1 = cz + 1;
			int sx2 = cx - 1;
			int sy2 = dy1;
			int sz2 = tpz;
			int sx3 = tmx;
			int sy3 = dy1;
			int sz3 = cz - 1;
			int sx4 = cx + 1;
			int sy4 = dy1;
			int sz4 = tmz;

			boolean flag1 = true;
			boolean flag2 = true;
			boolean flag3 = true;
			boolean flag4 = true;

			boolean blockFlag1 = true;
			boolean blockFlag2 = true;
			boolean blockFlag3 = true;
			boolean blockFlag4 = true;

			while (flag1) {
				if (sy1 <= dy2) {
					if (blockFlag1) {
						if (world.isAirBlock(new BlockPos(sx1, sy1, sz1))) {
							world.setBlockState(new BlockPos(sx1, sy1, sz1), Blocks.stone_slab.getDefaultState());
						}
						blockFlag1 = false;
					} else {
						if (world.isAirBlock(new BlockPos(sx1, sy1, sz1))) {
							world.setBlockState(new BlockPos(sx1, sy1, sz1), Blocks.stone.getDefaultState());

							if (sx1 == cx || sz1 == cz) {
								if (world.isAirBlock(new BlockPos(sx1, sy1 + 1, sz1))) {
									world.setBlockState(new BlockPos(sx1, sy1 + 1, sz1),
											Blocks.torch.getDefaultState());
								}
							}
						}
						sy1++;
						blockFlag1 = true;
					}
				} else {
					flag1 = false;
				}

				if (sx1 == tpx && sz1 < tpz) {
					sz1++;
				} else if (sz1 == tpz && sx1 > tmx) {
					sx1--;
				} else if (sx1 == tmx && sz1 > tmz) {
					sz1--;
				} else if (sz1 == tmz && sx1 < tpx) {
					sx1++;
				}
			}

			while (flag2) {
				if (sy2 <= dy2) {
					if (blockFlag2) {
						if (world.isAirBlock(new BlockPos(sx2, sy2, sz2))) {
							world.setBlockState(new BlockPos(sx2, sy2, sz2), Blocks.stone_slab.getDefaultState());
						}
						blockFlag2 = false;
					} else {
						if (world.isAirBlock(new BlockPos(sx2, sy2, sz2))) {
							world.setBlockState(new BlockPos(sx2, sy2, sz2), Blocks.stone.getDefaultState());

							if (sx2 == cx || sz2 == cz) {
								if (world.isAirBlock(new BlockPos(sx2, sy2 + 1, sz2))) {
									world.setBlockState(new BlockPos(sx2, sy2 + 1, sz2),
											Blocks.torch.getDefaultState());
								}
							}
						}
						sy2++;
						blockFlag2 = true;
					}
				} else {
					flag2 = false;
				}

				if (sx2 == tpx && sz2 < tpz) {
					sz2++;
				} else if (sz2 == tpz && sx2 > tmx) {
					sx2--;
				} else if (sx2 == tmx && sz2 > tmz) {
					sz2--;
				} else if (sz2 == tmz && sx2 < tpx) {
					sx2++;
				}
			}

			while (flag3) {
				if (sy3 <= dy2) {
					if (blockFlag3) {
						if (world.isAirBlock(new BlockPos(sx3, sy3, sz3))) {
							world.setBlockState(new BlockPos(sx3, sy3, sz3), Blocks.stone_slab.getDefaultState());
						}
						blockFlag3 = false;
					} else {
						if (world.isAirBlock(new BlockPos(sx3, sy3, sz3))) {
							world.setBlockState(new BlockPos(sx3, sy3, sz3), Blocks.stone.getDefaultState());

							if (sx3 == cx || sz3 == cz) {
								if (world.isAirBlock(new BlockPos(sx3, sy3 + 1, sz3))) {
									world.setBlockState(new BlockPos(sx3, sy3 + 1, sz3),
											Blocks.torch.getDefaultState());
								}
							}
						}
						sy3++;
						blockFlag3 = true;
					}
				} else {
					flag3 = false;
				}

				if (sx3 == tpx && sz3 < tpz) {
					sz3++;
				} else if (sz3 == tpz && sx3 > tmx) {
					sx3--;
				} else if (sx3 == tmx && sz3 > tmz) {
					sz3--;
				} else if (sz3 == tmz && sx3 < tpx) {
					sx3++;
				}
			}

			while (flag4) {
				if (sy4 <= dy2) {
					if (blockFlag4) {
						if (world.isAirBlock(new BlockPos(sx4, sy4, sz4))) {
							world.setBlockState(new BlockPos(sx4, sy4, sz4), Blocks.stone_slab.getDefaultState());
						}
						blockFlag4 = false;
					} else {
						if (world.isAirBlock(new BlockPos(sx4, sy4, sz4))) {
							world.setBlockState(new BlockPos(sx4, sy4, sz4), Blocks.stone.getDefaultState());

							if (sx4 == cx || sz4 == cz) {
								if (world.isAirBlock(new BlockPos(sx4, sy4 + 1, sz4))) {
									world.setBlockState(new BlockPos(sx4, sy4 + 1, sz4),
											Blocks.torch.getDefaultState());
								}
							}
						}
						sy4++;
						blockFlag4 = true;
					}
				} else {
					flag4 = false;
				}

				if (sx4 == tpx && sz4 < tpz) {
					sz4++;
				} else if (sz4 == tpz && sx4 > tmx) {
					sx4--;
				} else if (sx4 == tmx && sz4 > tmz) {
					sz4--;
				} else if (sz4 == tmz && sx4 < tpx) {
					sx4++;
				}
			}
		} else {
			for (int vx = dx1; vx <= dx2; vx++) {
				for (int vz = dz1; vz <= dz2; vz++) {
					for (int vy = dy1; vy <= dy2; vy++) {
						if (world.getBlockState(new BlockPos(vx, vy, vz)).getBlock() == block) {
							world.setBlockToAir(new BlockPos(vx, vy, vz));
						}
					}
				}
			}
			for (int vx = dx1 + 5; vx <= dx2 - 5; vx += 6) {
				for (int vz = dz1 + 5; vz <= dz2 - 5; vz += 6) {
					if (world.isAirBlock(new BlockPos(vx, dy1, vz))
							&& !world.isAirBlock(new BlockPos(vx, dy1 - 1, vz))) {
						world.setBlockState(new BlockPos(vx, dy1, vz), Blocks.torch.getDefaultState());
					}
				}
			}
		}
	}
}
