package cc_more.world;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cc_more.Config;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class MinersTeleporter extends Teleporter {
	private final WorldServer worldServerInstance;
	private final LongHashMap destinationCoordinateCache = new LongHashMap();
	@SuppressWarnings("rawtypes")
	private final List destinationCoordinateKeys = new ArrayList();

	public MinersTeleporter(final WorldServer worldServer) {
		super(worldServer);
		this.worldServerInstance = worldServer;
	}

	@Override
	public void placeInPortal(final Entity entity, final float rotationYaw) {
		if (this.worldServerInstance.provider.getDimensionId() == Config.minersDimension) {
			if (!this.placeInExistingPortal(entity, rotationYaw)) {
				this.makePortal(entity);
				this.placeInExistingPortal(entity, rotationYaw);
			}
		} else {
			final int x = MathHelper.floor_double(entity.posX);
			final int y = MathHelper.floor_double(entity.posY) - 1;
			final int z = MathHelper.floor_double(entity.posZ);

			entity.setLocationAndAngles(x, y + 1.0D, z, entity.rotationYaw, 0.0F);
			entity.motionX = entity.motionY = entity.motionZ = 0.0D;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean placeInExistingPortal(final Entity entity, final float p_180620_2_) {
		double d0 = -1.0D;
		final int i = MathHelper.floor_double(entity.posX);
		final int j = MathHelper.floor_double(entity.posZ);
		boolean flag1 = true;
		Object object = BlockPos.ORIGIN;
		final long k = ChunkCoordIntPair.chunkXZ2Int(i, j);

		if (this.destinationCoordinateCache.containsItem(k)) {
			final Teleporter.PortalPosition portalposition = (Teleporter.PortalPosition) this.destinationCoordinateCache
					.getValueByKey(k);
			d0 = 0.0D;
			object = portalposition;
			portalposition.lastUpdateTime = this.worldServerInstance.getTotalWorldTime();
			flag1 = false;
		} else {
			final BlockPos blockpos4 = new BlockPos(entity);

			for (int l = -128; l <= 128; ++l) {
				BlockPos blockpos1;

				for (int i1 = -128; i1 <= 128; ++i1) {
					for (BlockPos blockpos = blockpos4.add(l,
							this.worldServerInstance.getActualHeight() - 1 - blockpos4.getY(), i1); blockpos
									.getY() >= 0; blockpos = blockpos1) {
						blockpos1 = blockpos.down();

						if (this.worldServerInstance.getBlockState(blockpos)
								.getBlock() == MinersDimension.minersPortal) {
							while (this.worldServerInstance.getBlockState(blockpos1 = blockpos.down())
									.getBlock() == MinersDimension.minersPortal) {
								blockpos = blockpos1;
							}

							final double d1 = blockpos.distanceSq(blockpos4);

							if (d0 < 0.0D || d1 < d0) {
								d0 = d1;
								object = blockpos;
							}
						}
					}
				}
			}
		}

		if (d0 >= 0.0D) {
			if (flag1) {
				this.destinationCoordinateCache.add(k,
						new Teleporter.PortalPosition((BlockPos) object, this.worldServerInstance.getTotalWorldTime()));
				this.destinationCoordinateKeys.add(Long.valueOf(k));
			}

			double d4 = ((BlockPos) object).getX() + 0.5D;
			double d5 = ((BlockPos) object).getY() + 0.5D;
			double d6 = ((BlockPos) object).getZ() + 0.5D;
			EnumFacing enumfacing = null;

			if (this.worldServerInstance.getBlockState(((BlockPos) object).west()).getBlock() == Blocks.portal) {
				enumfacing = EnumFacing.NORTH;
			}

			if (this.worldServerInstance.getBlockState(((BlockPos) object).east()).getBlock() == Blocks.portal) {
				enumfacing = EnumFacing.SOUTH;
			}

			if (this.worldServerInstance.getBlockState(((BlockPos) object).north()).getBlock() == Blocks.portal) {
				enumfacing = EnumFacing.EAST;
			}

			if (this.worldServerInstance.getBlockState(((BlockPos) object).south()).getBlock() == Blocks.portal) {
				enumfacing = EnumFacing.WEST;
			}

			final EnumFacing enumfacing1 = EnumFacing.getHorizontal(entity.getTeleportDirection());

			if (enumfacing != null) {
				EnumFacing enumfacing2 = enumfacing.rotateYCCW();
				final BlockPos blockpos2 = ((BlockPos) object).offset(enumfacing);
				boolean flag2 = this.func_180265_a(blockpos2);
				boolean flag3 = this.func_180265_a(blockpos2.offset(enumfacing2));

				if (flag3 && flag2) {
					object = ((BlockPos) object).offset(enumfacing2);
					enumfacing = enumfacing.getOpposite();
					enumfacing2 = enumfacing2.getOpposite();
					final BlockPos blockpos3 = ((BlockPos) object).offset(enumfacing);
					flag2 = this.func_180265_a(blockpos3);
					flag3 = this.func_180265_a(blockpos3.offset(enumfacing2));
				}

				float f6 = 0.5F;
				float f1 = 0.5F;

				if (!flag3 && flag2) {
					f6 = 1.0F;
				} else if (flag3 && !flag2) {
					f6 = 0.0F;
				} else if (flag3) {
					f1 = 0.0F;
				}

				d4 = ((BlockPos) object).getX() + 0.5D;
				d5 = ((BlockPos) object).getY() + 0.5D;
				d6 = ((BlockPos) object).getZ() + 0.5D;
				d4 += enumfacing2.getFrontOffsetX() * f6 + enumfacing.getFrontOffsetX() * f1;
				d6 += enumfacing2.getFrontOffsetZ() * f6 + enumfacing.getFrontOffsetZ() * f1;
				float f2 = 0.0F;
				float f3 = 0.0F;
				float f4 = 0.0F;
				float f5 = 0.0F;

				if (enumfacing == enumfacing1) {
					f2 = 1.0F;
					f3 = 1.0F;
				} else if (enumfacing == enumfacing1.getOpposite()) {
					f2 = -1.0F;
					f3 = -1.0F;
				} else if (enumfacing == enumfacing1.rotateY()) {
					f4 = 1.0F;
					f5 = -1.0F;
				} else {
					f4 = -1.0F;
					f5 = 1.0F;
				}

				final double d2 = entity.motionX;
				final double d3 = entity.motionZ;
				entity.motionX = d2 * f2 + d3 * f5;
				entity.motionZ = d2 * f4 + d3 * f3;
				entity.rotationYaw = p_180620_2_ - enumfacing1.getHorizontalIndex() * 90
						+ enumfacing.getHorizontalIndex() * 90;
			} else {
				entity.motionX = entity.motionY = entity.motionZ = 0.0D;
			}

			entity.setLocationAndAngles(d4, d5, d6, entity.rotationYaw, entity.rotationPitch);
			return true;
		}
		return false;
	}

	private boolean func_180265_a(final BlockPos p_180265_1_) {
		return !this.worldServerInstance.isAirBlock(p_180265_1_)
				|| !this.worldServerInstance.isAirBlock(p_180265_1_.up());
	}

	@Override
	public boolean makePortal(final Entity entity) {
		final int x = MathHelper.floor_double(entity.posX);
		final int y = MathHelper.floor_double(entity.posY);
		final int z = MathHelper.floor_double(entity.posZ);

		for (int ax = -3; ax <= 3; ax++) {
			for (int az = -3; az <= 3; az++) {
				for (int ay = -1; ay <= 3; ay++) {
					if (ay == -1 || ay == 3) {
						this.worldServerInstance.setBlockState(new BlockPos(x + ax, y + ay, z + az),
								Blocks.quartz_block.getDefaultState());
					} else {
						this.worldServerInstance.setBlockState(new BlockPos(x + ax, y + ay, z + az),
								Blocks.air.getDefaultState());
					}
				}
			}
		}
		for (int by = 0; by <= 2; by++) {
			if (by < 2) {
				this.worldServerInstance.setBlockState(new BlockPos(x + 2, y + by, z + 2),
						Blocks.quartz_block.getDefaultState());
				this.worldServerInstance.setBlockState(new BlockPos(x - 2, y + by, z + 2),
						Blocks.quartz_block.getDefaultState());
				this.worldServerInstance.setBlockState(new BlockPos(x + 2, y + by, z - 2),
						Blocks.quartz_block.getDefaultState());
				this.worldServerInstance.setBlockState(new BlockPos(x - 2, y + by, z - 2),
						Blocks.quartz_block.getDefaultState());
			} else {
				this.worldServerInstance.setBlockState(new BlockPos(x + 2, y + by, z + 2),
						Blocks.glowstone.getDefaultState());
				this.worldServerInstance.setBlockState(new BlockPos(x - 2, y + by, z + 2),
						Blocks.glowstone.getDefaultState());
				this.worldServerInstance.setBlockState(new BlockPos(x + 2, y + by, z - 2),
						Blocks.glowstone.getDefaultState());
				this.worldServerInstance.setBlockState(new BlockPos(x - 2, y + by, z - 2),
						Blocks.glowstone.getDefaultState());
			}
			this.worldServerInstance.setBlockState(new BlockPos(x, y + by, z),
					MinersDimension.minersPortal.getDefaultState());
		}
		for (int cy = y - 2; cy >= 0; cy--) {
			boolean flag = true;

			for (int cx = -3; cx <= 3; cx++) {
				for (int cz = -3; cz <= 3; cz++) {
					if (this.worldServerInstance.isAirBlock(new BlockPos(x + cx, cy, z + cz))) {
						if (cx == -3 && cz == -3 || cx == -3 && cz == 3 || cx == 3 && cz == -3 || cx == 3 && cz == 3) {
							if (cy % 6 == 0) {
								this.worldServerInstance.setBlockState(new BlockPos(x + cx, cy, z + cz),
										Blocks.glowstone.getDefaultState());
							} else {
								this.worldServerInstance.setBlockState(new BlockPos(x + cx, cy, z + cz),
										Blocks.quartz_block.getDefaultState());
							}
						} else {
							this.worldServerInstance.setBlockState(new BlockPos(x + cx, cy, z + cz),
									Blocks.quartz_block.getDefaultState());
						}
						flag = false;
					}
				}
			}
			if (flag) {
				break;
			}
		}
		int dx1 = 4;
		int dy1 = y - 1;
		int dz1 = 0;
		int dx2 = 0;
		int dy2 = y - 1;
		int dz2 = 4;
		int dx3 = -4;
		int dy3 = y - 1;
		int dz3 = 0;
		int dx4 = 0;
		int dy4 = y - 1;
		int dz4 = -4;

		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = true;
		boolean flag4 = true;

		while (flag1) {
			if (this.worldServerInstance.isAirBlock(new BlockPos(x + dx1, dy1, z + dz1))) {
				if (Math.abs(dx1 % 2) == 1 || Math.abs(dz1 % 2) == 1) {
					this.worldServerInstance.setBlockState(new BlockPos(x + dx1, dy1, z + dz1),
							Blocks.stone_slab.getStateFromMeta(7));
					dy1--;
				} else {
					this.worldServerInstance.setBlockState(new BlockPos(x + dx1, dy1, z + dz1),
							Blocks.quartz_block.getDefaultState());
				}
			} else {
				flag1 = false;
			}

			if (dx1 == 4 && dz1 < 4) {
				dz1++;
			} else if (dz1 == 4 && dx1 > -4) {
				dx1--;
			} else if (dx1 == -4 && dz1 > -4) {
				dz1--;
			} else if (dz1 == -4 && dx1 < 4) {
				dx1++;
			}
		}

		while (flag2) {
			if (this.worldServerInstance.isAirBlock(new BlockPos(x + dx2, dy2, z + dz2))) {
				if (Math.abs(dx2 % 2) == 1 || Math.abs(dz2 % 2) == 1) {
					this.worldServerInstance.setBlockState(new BlockPos(x + dx2, dy2, z + dz2),
							Blocks.stone_slab.getStateFromMeta(7));
					dy2--;
				} else {
					this.worldServerInstance.setBlockState(new BlockPos(x + dx2, dy2, z + dz2),
							Blocks.quartz_block.getDefaultState());
				}
			} else {
				flag2 = false;
			}

			if (dx2 == 4 && dz2 < 4) {
				dz2++;
			} else if (dz2 == 4 && dx2 > -4) {
				dx2--;
			} else if (dx2 == -4 && dz2 > -4) {
				dz2--;
			} else if (dz2 == -4 && dx2 < 4) {
				dx2++;
			}
		}

		while (flag3) {
			if (this.worldServerInstance.isAirBlock(new BlockPos(x + dx3, dy3, z + dz3))) {
				if (Math.abs(dx3 % 2) == 1 || Math.abs(dz3 % 2) == 1) {
					this.worldServerInstance.setBlockState(new BlockPos(x + dx3, dy3, z + dz3),
							Blocks.stone_slab.getStateFromMeta(7));
					dy3--;
				} else {
					this.worldServerInstance.setBlockState(new BlockPos(x + dx3, dy3, z + dz3),
							Blocks.quartz_block.getDefaultState());
				}
			} else {
				flag3 = false;
			}

			if (dx3 == 4 && dz3 < 4) {
				dz3++;
			} else if (dz3 == 4 && dx3 > -4) {
				dx3--;
			} else if (dx3 == -4 && dz3 > -4) {
				dz3--;
			} else if (dz3 == -4 && dx3 < 4) {
				dx3++;
			}
		}

		while (flag4) {
			if (this.worldServerInstance.isAirBlock(new BlockPos(x + dx4, dy4, z + dz4))) {
				if (Math.abs(dx4 % 2) == 1 || Math.abs(dz4 % 2) == 1) {
					this.worldServerInstance.setBlockState(new BlockPos(x + dx4, dy4, z + dz4),
							Blocks.stone_slab.getStateFromMeta(7));
					dy4--;
				} else {
					this.worldServerInstance.setBlockState(new BlockPos(x + dx4, dy4, z + dz4),
							Blocks.quartz_block.getDefaultState());
				}
			} else {
				flag4 = false;
			}

			if (dx4 == 4 && dz4 < 4) {
				dz4++;
			} else if (dz4 == 4 && dx4 > -4) {
				dx4--;
			} else if (dx4 == -4 && dz4 > -4) {
				dz4--;
			} else if (dz4 == -4 && dx4 < 4) {
				dx4++;
			}
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void removeStalePortalLocations(final long p_85189_1_) {
		if (p_85189_1_ % 100L == 0L) {
			final Iterator<Long> iterator = this.destinationCoordinateKeys.iterator();
			final long j = p_85189_1_ - 600L;

			while (iterator.hasNext()) {
				final Long olong = iterator.next();
				final Teleporter.PortalPosition portalposition = (Teleporter.PortalPosition) this.destinationCoordinateCache
						.getValueByKey(olong.longValue());

				if (portalposition == null || portalposition.lastUpdateTime < j) {
					iterator.remove();
					this.destinationCoordinateCache.remove(olong.longValue());
				}
			}
		}
	}

	public class PortalPosition extends BlockPos {
		/** The worldtime at which this PortalPosition was last verified */
		public long lastUpdateTime;

		public PortalPosition(final BlockPos pos, final long p_i45747_3_) {
			super(pos.getX(), pos.getY(), pos.getZ());
			this.lastUpdateTime = p_i45747_3_;
		}
	}
}
