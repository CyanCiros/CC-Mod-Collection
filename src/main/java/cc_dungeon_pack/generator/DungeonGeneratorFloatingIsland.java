package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorFloatingIsland extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;
	private final IBlockState block3;
	private final IBlockState block4;
	private final IBlockState block5;
	private final IBlockState block6;
	private final IBlockState block7;
	private final IBlockState block8;
	private final IBlockState block9;
	private final IBlockState block10;
	private final IBlockState block11;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorFloatingIsland(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);
		this.block4 = blocks.get(3);
		this.block5 = blocks.get(4);
		this.block6 = blocks.get(5);
		this.block7 = blocks.get(6);
		this.block8 = blocks.get(7);
		this.block9 = blocks.get(8);
		this.block10 = blocks.get(9);
		this.block11 = blocks.get(10);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		for (int vx = -9; vx <= 0; vx++) {
			for (int vz = -4; vz <= 16; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block1);
			}
		}
		for (int vx = -11; vx <= 2; vx++) {
			for (int vz = -6; vz <= 18; vz++) {
				final int vxzr = random.nextInt(4) + 2;
				final int vxz = vxzr + 2;

				if (vz == -4) {
					for (int vz2 = 0; vz2 <= vxz; vz2++) {
						this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz - vz2), this.block1);

						if (random.nextInt(30) == 0) {
							this.placeObject(random, x + vx, y, z + vz - (random.nextInt(vxzr) + 3));
						}
					}
				} else if (vz == 16) {
					for (int vz2 = 0; vz2 <= vxz; vz2++) {
						this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz + vz2), this.block1);

						if (random.nextInt(30) == 0) {
							this.placeObject(random, x + vx, y, z + vz + random.nextInt(vxzr) + 3);
						}
					}
				} else if (vx == -9) {
					for (int vx2 = 0; vx2 <= vxz; vx2++) {
						this.placeBlock(random, new BlockPos(x + vx - vx2, y - 1, z + vz), this.block1);

						if (random.nextInt(30) == 0) {
							this.placeObject(random, x + vx - (random.nextInt(vxzr) + 3), y, z + vz);
						}
					}
				} else if (vx == 0) {
					for (int vx2 = 0; vx2 <= vxz; vx2++) {
						this.placeBlock(random, new BlockPos(x + vx + vx2, y - 1, z + vz), this.block1);

						if (random.nextInt(30) == 0) {
							this.placeObject(random, x + vx + random.nextInt(vxzr) + 3, y, z + vz);
						}
					}
				}
			}
		}
		for (int vz = -2; vz <= 18; vz++) {
			this.placeBlock(random, new BlockPos(x + 1, y + 8, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 0, y + 9, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 1, y + 10, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 2, y + 11, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 3, y + 12, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 4, y + 13, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 5, y + 13, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 6, y + 12, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 7, y + 11, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 8, y + 10, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 9, y + 9, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 10, y + 8, z + vz), this.block1);
		}
		for (int vx = -9; vx <= 0; vx++) {
			if (vx != -5 && vx != -4) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + -4), this.block2);
				this.placeBlock(random, new BlockPos(x + vx, y, z + -3), this.block6);
				this.placeBlock(random, new BlockPos(x + vx, y, z + -2), this.block6);
				this.placeBlock(random, new BlockPos(x + vx, y, z + -1), this.block6);
				this.placeBlock(random, new BlockPos(x + vx, y, z), this.block2);
			}
			this.placeBlock(random, new BlockPos(x + vx, y, z + 16), this.block2);
		}
		for (int vz = -4; vz <= 16; vz++) {
			this.placeBlock(random, new BlockPos(x + -9, y, z + vz), this.block2);
			this.placeBlock(random, new BlockPos(x + 0, y, z + vz), this.block2);
		}
		for (int vx = -9; vx <= 0; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 4, z + 0), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y + 4, z + 8), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y + 4, z + 16), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y + 8, z + 0), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y + 8, z + 8), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y + 8, z + 16), this.block2);
		}
		for (int vz = 0; vz <= 16; vz++) {
			this.placeBlock(random, new BlockPos(x + -9, y + 4, z + vz), this.block2);
			this.placeBlock(random, new BlockPos(x + 0, y + 4, z + vz), this.block2);
			this.placeBlock(random, new BlockPos(x + -9, y + 8, z + vz), this.block2);
			this.placeBlock(random, new BlockPos(x + 0, y + 8, z + vz), this.block2);
		}
		for (int vy = 1; vy <= 3; vy++) {
			this.placeBlock(random, new BlockPos(x, y + vy, z), this.block2);
			this.placeBlock(random, new BlockPos(x, y + vy, z + 8), this.block2);
			this.placeBlock(random, new BlockPos(x, y + vy, z + 16), this.block2);
			this.placeBlock(random, new BlockPos(x + -9, y + vy, z), this.block2);
			this.placeBlock(random, new BlockPos(x + -9, y + vy, z + 8), this.block2);
			this.placeBlock(random, new BlockPos(x + -9, y + vy, z + 16), this.block2);
		}
		for (int vy = 5; vy <= 7; vy++) {
			this.placeBlock(random, new BlockPos(x - 1, y + vy, z), this.block3);
			this.placeBlock(random, new BlockPos(x, y + vy, z), this.block3);
			this.placeBlock(random, new BlockPos(x, y + vy, z + 1), this.block3);
			this.placeBlock(random, new BlockPos(x, y + vy, z + 8), this.block2);
			this.placeBlock(random, new BlockPos(x, y + vy, z + 16), this.block2);
			this.placeBlock(random, new BlockPos(x + -8, y + vy, z), this.block3);
			this.placeBlock(random, new BlockPos(x + -9, y + vy, z), this.block3);
			this.placeBlock(random, new BlockPos(x + -9, y + vy, z + 1), this.block3);
			this.placeBlock(random, new BlockPos(x + -9, y + vy, z + 8), this.block2);
			this.placeBlock(random, new BlockPos(x + -9, y + vy, z + 16), this.block2);
		}
		for (int vx = -3; vx <= 0; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 1, z - 4), this.block3);
			this.placeBlock(random, new BlockPos(x + vx - 6, y + 1, z - 4), this.block3);
		}
		for (int vz = -3; vz <= -1; vz++) {
			this.placeBlock(random, new BlockPos(x - 9, y + 1, z + vz), this.block3);
			this.placeBlock(random, new BlockPos(x, y + 1, z + vz), this.block3);
		}
		for (int vz = 2; vz <= 6; vz++) {
			this.placeBlock(random, new BlockPos(x - 9, y + 2, z + vz), this.block3);
			this.placeBlock(random, new BlockPos(x, y + 2, z + vz), this.block3);
		}
		for (int vz = 2; vz <= 7; vz++) {
			this.placeBlock(random, new BlockPos(x - 9, y + 5, z + vz), this.block3);
			this.placeBlock(random, new BlockPos(x, y + 5, z + vz), this.block3);
		}
		for (int vz = -6; vz <= -5; vz++) {
			this.placeBlock(random, new BlockPos(x - 6, y, z + vz), this.block3);
			this.placeBlock(random, new BlockPos(x - 3, y, z + vz), this.block3);
		}
		this.placeBlock(random, new BlockPos(x - 6, y + 1, z + -5), this.block3);
		this.placeBlock(random, new BlockPos(x - 3, y + 1, z + -5), this.block3);

		for (int vx = -7; vx <= -2; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 5, z), this.block3);
		}
		for (int vy = 5; vy <= 7; vy++) {
			this.placeBlock(random, new BlockPos(x - 1, y + vy, z + 8), this.block3);
			this.placeBlock(random, new BlockPos(x - 3, y + vy, z + 8), this.block3);
			this.placeBlock(random, new BlockPos(x - 4, y + vy, z + 8), this.block3);
			this.placeBlock(random, new BlockPos(x - 5, y + vy, z + 8), this.block3);
			this.placeBlock(random, new BlockPos(x - 6, y + vy, z + 8), this.block3);
			this.placeBlock(random, new BlockPos(x - 8, y + vy, z + 8), this.block3);
		}
		for (int vx = -5; vx <= -4; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 3, z - 2), this.block3);
			this.placeBlock(random, new BlockPos(x + vx, y + 4, z - 2), this.block3);
			this.placeBlock(random, new BlockPos(x + vx, y + 4, z - 1), this.block3);
		}
		for (int vy = 9; vy <= 11; vy++) {
			this.placeBlock(random, new BlockPos(x + -4, y + vy, z), this.block9);
			this.placeBlock(random, new BlockPos(x + -5, y + vy, z), this.block9);
			this.placeBlock(random, new BlockPos(x + -4, y + vy, z + 16), this.block9);
			this.placeBlock(random, new BlockPos(x + -5, y + vy, z + 16), this.block9);
		}
		this.placeBlock(random, new BlockPos(x + -3, y + 10, z), this.block9);
		this.placeBlock(random, new BlockPos(x + -6, y + 10, z), this.block9);
		this.placeBlock(random, new BlockPos(x + -5, y + 12, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -6, y + 11, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -7, y + 10, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -8, y + 9, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -7, y + 9, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -6, y + 9, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -4, y + 12, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -3, y + 11, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -2, y + 10, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -1, y + 9, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -2, y + 9, z), this.block2);
		this.placeBlock(random, new BlockPos(x + -3, y + 9, z), this.block2);

		this.placeBlock(random, new BlockPos(x + -3, y + 10, z + 16), this.block9);
		this.placeBlock(random, new BlockPos(x + -6, y + 10, z + 16), this.block9);
		this.placeBlock(random, new BlockPos(x + -5, y + 12, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -6, y + 11, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -7, y + 10, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -8, y + 9, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -7, y + 9, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -6, y + 9, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -4, y + 12, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -3, y + 11, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -2, y + 10, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -1, y + 9, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -2, y + 9, z + 16), this.block2);
		this.placeBlock(random, new BlockPos(x + -3, y + 9, z + 16), this.block2);

		for (int vy = 1; vy <= 4; vy++) {
			this.placeBlock(random, new BlockPos(x + -3, y + vy, z + -2), this.block5);
			this.placeBlock(random, new BlockPos(x + -6, y + vy, z + -2), this.block5);
		}
		this.placeBlock(random, new BlockPos(x + -3, y + 4, z + -1), this.block5);
		this.placeBlock(random, new BlockPos(x + -6, y + 4, z + -1), this.block5);
		this.placeBlock(random, new BlockPos(x + -3, y + 1, z + -1), this.block3);
		this.placeBlock(random, new BlockPos(x + -6, y + 1, z + -1), this.block3);

		for (int vx = -8; vx <= -1; vx++) {
			for (int vz = 1; vz <= 8; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block4);
			}
		}
		for (int vx = -8; vx <= -1; vx++) {
			for (int vz = 9; vz <= 15; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block1);
			}
		}
		for (int vx = -8; vx <= -1; vx++) {
			for (int vz = 9; vz <= 12; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 4, z + vz), this.block1);
			}
		}
		for (int vx = -8; vx <= -6; vx++) {
			for (int vz = 13; vz <= 15; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 4, z + vz), this.block1);
			}
		}
		for (int vx = -4; vx <= -1; vx++) {
			for (int vz = 13; vz <= 15; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), this.block1);
			}
		}
		for (int vx = -3; vx <= -1; vx++) {
			for (int vz = 13; vz <= 15; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 2, z + vz), this.block1);
			}
		}
		for (int vx = -2; vx <= -1; vx++) {
			for (int vz = 13; vz <= 15; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 3, z + vz), this.block1);
			}
		}
		for (int vz = 13; vz <= 15; vz++) {
			this.placeBlock(random, new BlockPos(x + -1, y + 4, z + vz), this.block1);
		}
		for (int vz = 12; vz <= 15; vz++) {
			this.placeBlock(random, new BlockPos(x + -6, y + 5, z + vz), this.block3);
		}
		for (int vx = -5; vx <= -3; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 5, z + 12), this.block3);
		}
		for (int vz = -4; vz <= 0; vz++) {
			this.placeBlock(random, new BlockPos(x + -4, y, z + vz), this.block7);
			this.placeBlock(random, new BlockPos(x + -5, y, z + vz), this.block7);
		}
		for (int vz = 1; vz <= 15; vz++) {
			for (int vy = 1; vy <= 3; vy++) {
				if (this.world.isAirBlock(new BlockPos(x, y + vy, z + vz))) {
					if (random.nextBoolean()) {
						this.placeBlock(random, new BlockPos(x, y + vy, z + vz), this.block2);
						this.placeBlock(random, new BlockPos(x + -9, y + vy, z + vz), this.block2);
					} else {
						this.placeBlock(random, new BlockPos(x, y + vy, z + vz), this.block2);
						this.placeBlock(random, new BlockPos(x + -9, y + vy, z + vz), this.block2);
					}
				}
			}
		}
		for (int vz = 9; vz <= 15; vz++) {
			for (int vy = 5; vy <= 7; vy++) {
				if (this.world.isAirBlock(new BlockPos(x, y + vy, z + vz))) {
					if (random.nextBoolean()) {
						this.placeBlock(random, new BlockPos(x, y + vy, z + vz), this.block2);
						this.placeBlock(random, new BlockPos(x + -9, y + vy, z + vz), this.block2);
					} else {
						this.placeBlock(random, new BlockPos(x, y + vy, z + vz), this.block2);
						this.placeBlock(random, new BlockPos(x + -9, y + vy, z + vz), this.block2);
					}
				}
			}
		}
		for (int vx = -8; vx <= -1; vx++) {
			for (int vy = 1; vy <= 7; vy++) {
				if (this.world.isAirBlock(new BlockPos(x + vx, y + vy, z + 16))) {
					if (random.nextBoolean()) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 16), this.block2);
					} else {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 16), this.block2);
					}
				}
			}
		}
		for (int vx = -8; vx <= -1; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				if (this.world.isAirBlock(new BlockPos(x + vx, y + vy, z + 8))
						&& !(vx <= -4 && vx >= -5 && vy >= 1 && vy <= 2)) {
					if (random.nextBoolean()) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 8), this.block2);
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 0), this.block2);
					} else {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 8), this.block2);
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 0), this.block2);
					}
				}
			}
		}
		for (int vx = -8; vx <= -1; vx++) {
			for (int vz = 1; vz <= 7; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 4, z + vz), this.block2);
				this.placeBlock(random, new BlockPos(x + vx, y + 8, z + vz), this.block2);
			}
		}
		for (int vx = -8; vx <= -1; vx++) {
			for (int vz = 9; vz <= 15; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 8, z + vz), this.block2);
			}
		}
		for (int i = 0; i <= random.nextInt(7) + 5; i++) {
			final int r = random.nextInt(4);
			int vxt = 0;
			int vzt = 0;

			if (r == 0) {
				vxt += random.nextInt(8) + 16;
				vzt += random.nextInt(32);
			} else if (r == 1) {
				vxt += random.nextInt(8) + 16;
				vzt -= random.nextInt(16);
			} else if (r == 2) {
				vxt -= random.nextInt(8) + 24;
				vzt -= random.nextInt(16);
			} else if (r == 3) {
				vxt -= random.nextInt(8) + 24;
				vzt += random.nextInt(32);
			}
			final ArrayList<Integer> ax = new ArrayList<Integer>();
			final ArrayList<Integer> az = new ArrayList<Integer>();

			this.placeBlock(random, new BlockPos(x + vxt, y - 1, z + vzt), this.block1);

			ax.add(vxt);
			az.add(vzt);

			for (int g = 0; g <= 90; g++) {
				final int tr = random.nextInt(ax.size());
				int tx = ax.get(tr);
				int tz = az.get(tr);

				final int br = random.nextInt(4);

				if (br == 0) {
					tx--;
				} else if (br == 1) {
					tx++;
				} else if (br == 2) {
					tz--;
				} else if (br == 3) {
					tz++;
				}
				if (this.world.isAirBlock(new BlockPos(x + tx, y - 1, z + tz))) {
					this.placeBlock(random, new BlockPos(x + tx, y - 1, z + tz), this.block1);

					ax.add(tx);
					az.add(tz);

					if (random.nextInt(20) == 0) {
						this.placeObject(random, x + tx, y, z + tz);
					}
				}
			}
		}
		this.placeBlock(random, new BlockPos(x + -1, y + 1, z + 1), this.block3);
		this.placeBlock(random, new BlockPos(x + -1, y + 1, z + 7), this.block3);
		this.placeBlock(random, new BlockPos(x + -8, y + 1, z + 1), this.block3);
		this.placeBlock(random, new BlockPos(x + -8, y + 1, z + 7), this.block3);
		this.placeBlock(random, new BlockPos(x + -1, y + 2, z + 1), this.block9);
		this.placeBlock(random, new BlockPos(x + -1, y + 2, z + 7), this.block9);
		this.placeBlock(random, new BlockPos(x + -8, y + 2, z + 1), this.block9);
		this.placeBlock(random, new BlockPos(x + -8, y + 2, z + 7), this.block9);

		this.placeBlock(random, new BlockPos(x + -6, y + 5, z + 4), this.block5);
		this.placeBlock(random, new BlockPos(x + -5, y + 5, z + 4), this.block10);
		this.placeBlock(random, new BlockPos(x + -4, y + 5, z + 4), this.block10);
		this.placeBlock(random, new BlockPos(x + -3, y + 5, z + 4), this.block5);
		this.placeBlock(random, new BlockPos(x + -6, y + 6, z + 4), this.block5);
		this.placeBlock(random, new BlockPos(x + -5, y + 6, z + 4), this.block3);
		this.placeBlock(random, new BlockPos(x + -4, y + 6, z + 4), this.block3);
		this.placeBlock(random, new BlockPos(x + -3, y + 6, z + 4), this.block5);

		for (int vx = -4; vx <= -1; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 12), this.block3);
			}
		}
		for (int vx = -8; vx <= -1; vx++) {
			for (int vz = 1; vz <= 7; vz++) {
				if (this.world.isAirBlock(new BlockPos(x + vx, y + 1, z + vz)) && random.nextInt(4) == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), this.block8);
				}
			}
		}
		for (int vx = -8; vx <= -1; vx++) {
			for (int vz = 1; vz <= 7; vz++) {
				if (this.world.isAirBlock(new BlockPos(x + vx, y + 1, z + vz)) && random.nextInt(4) == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), this.block11);
				}
			}
		}
		for (int vz = 1; vz <= 7; vz++) {
			for (int vy = 1; vy <= 3; vy++) {
				if (this.world.isAirBlock(new BlockPos(x + -1, y + vy, z + vz)) && random.nextInt(3) == 0) {
					this.placeBlock(random, new BlockPos(x + -1, y + vy, z + vz), this.block8);
				}
				if (this.world.isAirBlock(new BlockPos(x + -8, y + vy, z + vz)) && random.nextInt(3) == 0) {
					this.placeBlock(random, new BlockPos(x + -8, y + vy, z + vz), this.block8);
				}
			}
		}

		this.addMobSpawner(this.world, x + -1, y + 1, z + -1, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + -8, y + 1, z + 2, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + -1, y + 1, z + 10, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + -5, y + 5, z + 2, this.mobs.get(random.nextInt(this.mobs.size())));

		this.addChestWithCustomItemsLoot(this.world, random, x + -1, y + 1, z + 4, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + -8, y + 1, z + 4, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + -8, y + 1, z + 10, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + -8, y + 5, z + 15, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + -7, y + 5, z + 15, this.items);
	}

	private void placeObject(final Random random, final int x, final int y, final int z) {
		if (this.world.isAirBlock(new BlockPos(x, y, z))) {
			if (random.nextInt(3) == 0) {
				this.addMobSpawner(this.world, x, y, z, this.mobs.get(random.nextInt(this.mobs.size())));
			} else {
				final int yth = random.nextInt(4) + 2;

				for (int vx3 = -2; vx3 <= 2; vx3++) {
					for (int vz3 = -2; vz3 <= 2; vz3++) {
						for (int zy = yth; zy <= yth + 1; zy++) {
							this.placeBlock(random, new BlockPos(x + vx3, y + zy, z + vz3), this.block5);
						}
					}
				}
				for (int vx3 = -1; vx3 <= 1; vx3++) {
					for (int vz3 = -1; vz3 <= 1; vz3++) {
						for (int zy = yth + 2; zy <= yth + 2; zy++) {
							this.placeBlock(random, new BlockPos(x + vx3, y + zy, z + vz3), this.block5);
						}
					}
				}
				for (int vy3 = 0; vy3 <= yth; vy3++) {
					this.placeBlock(random, new BlockPos(x, y + vy3, z), this.block9);
				}
			}
		}
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(4)));
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
