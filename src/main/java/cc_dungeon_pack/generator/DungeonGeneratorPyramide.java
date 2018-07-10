package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorPyramide extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;
	private final IBlockState block3;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	private final ArrayList<Integer> bxa;
	private final ArrayList<Integer> bza;

	int vx1 = -40;
	int vx2 = 40;
	final int vy1 = -1;
	final int vy2 = 39;
	int vz1 = -40;
	int vz2 = 40;

	public DungeonGeneratorPyramide(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);

		this.mobs = mobs;

		this.items = items;

		this.bxa = new ArrayList<Integer>();

		for (int bx = this.vx1 + 10; bx <= this.vx2 - 10; bx += 4) {
			this.bxa.add(bx);
		}

		this.bza = new ArrayList<Integer>();

		for (int bz = this.vz1 + 10; bz <= this.vz2 - 10; bz += 4) {
			this.bza.add(bz);
		}
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		// for (int vx = this.vx1; vx <= this.vx2; vx++) {
		// for (int vz = this.vz1; vz <= this.vz2; vz++) {
		// for (int vy = y - 1; vy >= 0; vy--) {
		// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz))) {
		// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
		// this.block1);
		// } else {
		// break;
		// }
		// }
		// }
		// }

		int vxs1 = this.vx1;
		int vxs2 = this.vx2;
		int vzs1 = this.vz1;
		int vzs2 = this.vz2;

		for (int vy = this.vy1; vy <= this.vy2; vy++) {
			for (int vx = vxs1; vx <= vxs2; vx++) {
				for (int vz = vzs1; vz <= vzs2; vz++) {
					if (!(vy >= this.vy1 + 13 && vy <= this.vy2 - 2 && vx >= vxs1 + 3 && vx <= vxs2 - 3
							&& vz >= vzs1 + 3 && vz <= vzs2 - 3)) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
					} else {
						this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
					}
				}
			}
			vxs1++;
			vxs2--;
			vzs1++;
			vzs2--;
		}

		// Floor 0
		for (int bx = 0; bx < this.bxa.size(); bx++) {
			for (int bz = 0; bz < this.bza.size(); bz++) {
				this.placeRoom(random, x + this.bxa.get(bx), y, z + this.bza.get(bz));
			}
		}
		this.placeStairs(random, x, y, z, 2);

		if (random.nextBoolean()) {
			for (int vx = this.vx1 + 1; vx <= this.vx1 + 7; vx++) {
				this.placeHallwayX(random, x + vx, y, z);
			}
		}
		if (random.nextBoolean()) {
			for (int vx = this.vx2 - 7; vx <= this.vx2 - 1; vx++) {
				this.placeHallwayX(random, x + vx, y, z);
			}
		}
		if (random.nextBoolean()) {
			for (int vz = this.vz1 + 1; vz <= this.vz1 + 7; vz++) {
				this.placeHallwayZ(random, x, y, z + vz);
			}
		}
		if (random.nextBoolean()) {
			for (int vz = this.vz2 - 7; vz <= this.vz2 - 1; vz++) {
				this.placeHallwayZ(random, x, y, z + vz);
			}
		}
		for (int vz = this.vz1 + 5; vz <= this.vz2 - 5; vz++) {
			this.placeHallwayZ(random, x + this.vx1 + 6, y, z + vz);
			this.placeHallwayZ(random, x + this.vx2 - 6, y, z + vz);
		}
		for (int vx = this.vx1 + 5; vx <= this.vx2 - 5; vx++) {
			this.placeHallwayX(random, x + vx, y, z + this.vz1 + 6);
			this.placeHallwayX(random, x + vx, y, z + this.vz2 - 6);
		}

		// Floor 1
		for (int bx = 1; bx < this.bxa.size() - 1; bx++) {
			for (int bz = 1; bz < this.bza.size() - 1; bz++) {
				this.placeRoom(random, x + this.bxa.get(bx), y + 4, z + this.bza.get(bz));
			}
		}
		this.placeStairs(random, x, y + 4, z, 3);

		if (random.nextBoolean()) {
			for (int vx = this.vx1 + 5; vx <= this.vx1 + 11; vx++) {
				this.placeHallwayX(random, x + vx, y + 4, z);
			}
		}
		if (random.nextBoolean()) {
			for (int vx = this.vx2 - 11; vx <= this.vx2 - 5; vx++) {
				this.placeHallwayX(random, x + vx, y + 4, z);
			}
		}
		if (random.nextBoolean()) {
			for (int vz = this.vz1 + 5; vz <= this.vz1 + 11; vz++) {
				this.placeHallwayZ(random, x, y + 4, z + vz);
			}
		}
		if (random.nextBoolean()) {
			for (int vz = this.vz2 - 11; vz <= this.vz2 - 5; vz++) {
				this.placeHallwayZ(random, x, y + 4, z + vz);
			}
		}
		for (int vz = this.vz1 + 9; vz <= this.vz2 - 9; vz++) {
			this.placeHallwayZ(random, x + this.vx1 + 10, y + 4, z + vz);
			this.placeHallwayZ(random, x + this.vx2 - 10, y + 4, z + vz);
		}
		for (int vx = this.vx1 + 9; vx <= this.vx2 - 9; vx++) {
			this.placeHallwayX(random, x + vx, y + 4, z + this.vz1 + 10);
			this.placeHallwayX(random, x + vx, y + 4, z + this.vz2 - 10);
		}

		// Floor 2
		for (int bx = 2; bx < this.bxa.size() - 2; bx++) {
			for (int bz = 2; bz < this.bza.size() - 2; bz++) {
				this.placeRoom(random, x + this.bxa.get(bx), y + 8, z + this.bza.get(bz));
			}
		}
		this.placeStairs(random, x, y + 8, z, 4);

		if (random.nextBoolean()) {
			for (int vx = this.vx1 + 9; vx <= this.vx1 + 15; vx++) {
				this.placeHallwayX(random, x + vx, y + 8, z);
			}
		}
		if (random.nextBoolean()) {
			for (int vx = this.vx2 - 15; vx <= this.vx2 - 9; vx++) {
				this.placeHallwayX(random, x + vx, y + 8, z);
			}
		}
		if (random.nextBoolean()) {
			for (int vz = this.vz1 + 9; vz <= this.vz1 + 15; vz++) {
				this.placeHallwayZ(random, x, y + 8, z + vz);
			}
		}
		if (random.nextBoolean()) {
			for (int vz = this.vz2 - 15; vz <= this.vz2 - 9; vz++) {
				this.placeHallwayZ(random, x, y + 8, z + vz);
			}
		}
		for (int vz = this.vz1 + 13; vz <= this.vz2 - 13; vz++) {
			this.placeHallwayZ(random, x + this.vx1 + 14, y + 8, z + vz);
			this.placeHallwayZ(random, x + this.vx2 - 14, y + 8, z + vz);
		}
		for (int vx = this.vx1 + 13; vx <= this.vx2 - 13; vx++) {
			this.placeHallwayX(random, x + vx, y + 8, z + this.vz1 + 14);
			this.placeHallwayX(random, x + vx, y + 8, z + this.vz2 - 14);
		}

		// Top
		for (int vx = -14; vx <= 14; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 12, z + 14), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y + 12, z - 14), this.block2);
		}
		for (int vz = -13; vz <= 13; vz++) {
			this.placeBlock(random, new BlockPos(x + 14, y + 12, z + vz), this.block2);
			this.placeBlock(random, new BlockPos(x - 14, y + 12, z + vz), this.block2);
		}
		for (int vx = -13; vx <= 13; vx++) {
			for (int vz = 11; vz <= 13; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 12, z + vz), this.block1);
				this.placeBlock(random, new BlockPos(x + vx, y + 12, z - vz), this.block1);
			}
		}
		for (int vz = -10; vz <= 10; vz++) {
			for (int vx = 11; vx <= 13; vx++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 12, z + vz), this.block1);
				this.placeBlock(random, new BlockPos(x - vx, y + 12, z + vz), this.block1);
			}
		}
		for (int vx = -12; vx <= 12; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 13, z + 12), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y + 13, z - 12), this.block2);
		}
		for (int vz = -11; vz <= 11; vz++) {
			this.placeBlock(random, new BlockPos(x + 12, y + 13, z + vz), this.block2);
			this.placeBlock(random, new BlockPos(x - 12, y + 13, z + vz), this.block2);
		}
		for (int vx = -11; vx <= 11; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 13, z + 11), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 13, z - 11), this.block1);
		}
		for (int vz = -10; vz <= 10; vz++) {
			this.placeBlock(random, new BlockPos(x + 11, y + 13, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 11, y + 13, z + vz), this.block1);
		}
		for (int vx = -10; vx <= 10; vx++) {
			for (int vz = -10; vz <= 10; vz++) {
				for (int vy = 12; vy <= 13; vy++) {
					if (vx >= -7 && vx <= 7 && vz >= -7 && vz <= 7 || vx >= -1 && vx <= 1 && vz >= -10 && vz <= 10
							|| vx >= -10 && vx <= 10 && vz >= -1 && vz <= 1 || vy == 12) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
					} else {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block3);
					}
				}
			}
		}
		final int hs = 14;
		final int h = 3;

		for (int vy = hs; vy <= hs + h; vy++) {
			this.placeBlock(random, new BlockPos(x + -7, y + vy, z + -7), this.block1);
			this.placeBlock(random, new BlockPos(x + -2, y + vy, z + -7), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z + -7), this.block1);
			this.placeBlock(random, new BlockPos(x + 7, y + vy, z + -7), this.block1);
			this.placeBlock(random, new BlockPos(x + 7, y + vy, z + -2), this.block1);
			this.placeBlock(random, new BlockPos(x + 7, y + vy, z + 2), this.block1);
			this.placeBlock(random, new BlockPos(x + 7, y + vy, z + 7), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z + 7), this.block1);
			this.placeBlock(random, new BlockPos(x + -2, y + vy, z + 7), this.block1);
			this.placeBlock(random, new BlockPos(x + -7, y + vy, z + 7), this.block1);
			this.placeBlock(random, new BlockPos(x + -7, y + vy, z + 2), this.block1);
			this.placeBlock(random, new BlockPos(x + -7, y + vy, z + -2), this.block1);

			if (vy == hs + h) {
				this.placeBlock(random, new BlockPos(x + -6, y + vy + 1, z + -6), Blocks.glowstone.getDefaultState());
				this.placeBlock(random, new BlockPos(x + -6, y + vy + 1, z + 6), Blocks.glowstone.getDefaultState());
				this.placeBlock(random, new BlockPos(x + 6, y + vy + 1, z + -6), Blocks.glowstone.getDefaultState());
				this.placeBlock(random, new BlockPos(x + 6, y + vy + 1, z + 6), Blocks.glowstone.getDefaultState());
			}
		}

		int vxc1 = -8;
		int vxc2 = 8;
		final int vyc1 = hs + h + 1;
		final int vyc2 = vyc1 + 8;
		int vzc1 = -8;
		int vzc2 = 8;

		for (int vy = vyc1; vy <= vyc2; vy++) {
			for (int vx = vxc1; vx <= vxc2; vx++) {
				for (int vz = vzc1; vz <= vzc2; vz++) {
					if (!(vy >= vyc1 && vy <= vyc2 - 2 && vx >= vxc1 + 2 && vx <= vxc2 - 2 && vz >= vzc1 + 2
							&& vz <= vzc2 - 2)) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
					}
				}
			}
			vxc1++;
			vxc2--;
			vzc1++;
			vzc2--;
		}
		this.placeBlock(random, new BlockPos(x, y + hs + h + 9 - 2, z), Blocks.glowstone.getDefaultState());

		for (int vx = -5; vx <= 5; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 14, z + 5), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y + 14, z - 5), this.block2);
		}
		for (int vz = -4; vz <= 4; vz++) {
			this.placeBlock(random, new BlockPos(x + 5, y + 14, z + vz), this.block2);
			this.placeBlock(random, new BlockPos(x - 5, y + 14, z + vz), this.block2);
		}
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = -4; vz <= 4; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 14, z + vz), this.block1);
			}
		}

		this.placeBlock(random, new BlockPos(x, y + 15, z), Blocks.iron_block.getDefaultState());
		this.placeBlock(random, new BlockPos(x, y + 16, z), Blocks.lapis_block.getDefaultState());
		this.placeBlock(random, new BlockPos(x, y + 17, z), Blocks.gold_block.getDefaultState());
		this.placeBlock(random, new BlockPos(x, y + 18, z), Blocks.redstone_block.getDefaultState());
		this.placeBlock(random, new BlockPos(x, y + 19, z), Blocks.diamond_block.getDefaultState());
		this.placeBlock(random, new BlockPos(x, y + 20, z), Blocks.emerald_block.getDefaultState());

		this.placeObjects(random, x, y, z);
	}

	private void placeRoom(final Random random, final int x, final int y, final int z) {
		for (int vy = 0; vy <= 2; vy++) {
			for (int vx = -1; vx <= 1; vx++) {
				for (int vz = -1; vz <= 1; vz++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		if (random.nextBoolean() && !this.world.isAirBlock(new BlockPos(x, y, z + 2))) {
			for (int vy = 0; vy <= 2; vy++) {
				for (int vx = -1; vx <= 1; vx++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + 2));
				}
			}
		} else if (random.nextBoolean() && !this.world.isAirBlock(new BlockPos(x, y, z - 2))) {
			for (int vy = 0; vy <= 2; vy++) {
				for (int vx = -1; vx <= 1; vx++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z - 2));
				}
			}
		}
		if (random.nextBoolean() && !this.world.isAirBlock(new BlockPos(x + 2, y, z))) {
			for (int vy = 0; vy <= 2; vy++) {
				for (int vz = -1; vz <= 1; vz++) {
					this.world.setBlockToAir(new BlockPos(x + 2, y + vy, z + vz));
				}
			}
		} else if (random.nextBoolean() && !this.world.isAirBlock(new BlockPos(x - 2, y, z))) {
			for (int vy = 0; vy <= 2; vy++) {
				for (int vz = -1; vz <= 1; vz++) {
					this.world.setBlockToAir(new BlockPos(x - 2, y + vy, z + vz));
				}
			}
		}
		for (int vx = -2; vx <= 2; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				this.placeWallBlock(random, x + vx, y + vy, z + 2);
				this.placeWallBlock(random, x + vx, y + vy, z - 2);
			}
		}
		for (int vz = -1; vz <= 1; vz++) {
			for (int vy = 0; vy <= 2; vy++) {
				this.placeWallBlock(random, x + 2, y + vy, z + vz);
				this.placeWallBlock(random, x - 2, y + vy, z + vz);
			}
		}
	}

	private void placeStairs(final Random random, final int x, final int y, final int z, final int area) {
		for (int s = 0; s <= 2; s++) {
			int bx = 0;
			int bz = 0;

			if (random.nextBoolean()) {
				bx = random.nextInt(2) + area - 2;
			} else {
				bx = random.nextInt(2) + this.bxa.size() - area;
			}
			if (random.nextBoolean()) {
				bz = random.nextInt(2) + area - 2;
			} else {
				bz = random.nextInt(2) + this.bza.size() - area;
			}
			final int vbx = x + this.bxa.get(bx);
			final int vbz = z + this.bza.get(bz);

			for (int vy = 0; vy <= 3; vy++) {
				if (vy == 3) {
					for (int vx = -1; vx <= 1; vx++) {
						for (int vz = -1; vz <= 1; vz++) {
							if (!(vz == 0 && vx == 0)) {
								this.world.setBlockToAir(new BlockPos(vbx + vx, y + vy, vbz + vz));
							}
						}
					}
				} else {
					this.placeBlock(random, new BlockPos(vbx, y + vy, vbz), this.block1);
				}
			}
			this.placeBlock(random, new BlockPos(vbx - 1, y, vbz - 1), this.block2);
			this.placeBlock(random, new BlockPos(vbx - 1, y, vbz), this.block1);
			this.placeBlock(random, new BlockPos(vbx - 1, y + 1, vbz + 1), this.block2);
			this.placeBlock(random, new BlockPos(vbx, y + 1, vbz + 1), this.block1);
			this.placeBlock(random, new BlockPos(vbx + 1, y + 2, vbz + 1), this.block2);
			this.placeBlock(random, new BlockPos(vbx + 1, y + 2, vbz), this.block1);
			this.placeBlock(random, new BlockPos(vbx + 1, y + 3, vbz - 1), this.block2);
			this.placeBlock(random, new BlockPos(vbx, y + 3, vbz - 1), this.block1);
			this.placeBlock(random, new BlockPos(vbx - 1, y + 3, vbz - 1), this.block1);

			this.placeBlock(random, new BlockPos(x + 2, y, z), Blocks.air.getDefaultState());
			this.placeBlock(random, new BlockPos(x + 2, y + 1, z), Blocks.air.getDefaultState());
			this.placeBlock(random, new BlockPos(x - 2, y, z), Blocks.air.getDefaultState());
			this.placeBlock(random, new BlockPos(x - 2, y + 1, z), Blocks.air.getDefaultState());
			this.placeBlock(random, new BlockPos(x, y, z + 2), Blocks.air.getDefaultState());
			this.placeBlock(random, new BlockPos(x, y + 1, z + 2), Blocks.air.getDefaultState());
			this.placeBlock(random, new BlockPos(x, y, z - 2), Blocks.air.getDefaultState());
			this.placeBlock(random, new BlockPos(x, y + 1, z - 2), Blocks.air.getDefaultState());
		}
	}

	private void placeHallwayX(final Random random, final int x, final int y, final int z) {
		for (int vy = 0; vy <= 2; vy++) {
			for (int vz = -1; vz <= 1; vz++) {
				this.world.setBlockToAir(new BlockPos(x, y + vy, z + vz));
			}
		}
		for (int vy = 0; vy <= 2; vy++) {
			this.placeWallBlock(random, x, y + vy, z + 2);
			this.placeWallBlock(random, x, y + vy, z - 2);
		}
	}

	private void placeHallwayZ(final Random random, final int x, final int y, final int z) {
		for (int vy = 0; vy <= 2; vy++) {
			for (int vx = -1; vx <= 1; vx++) {
				this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z));
			}
		}
		for (int vy = 0; vy <= 2; vy++) {
			this.placeWallBlock(random, x + 2, y + vy, z);
			this.placeWallBlock(random, x - 2, y + vy, z);
		}
	}

	private void placeWallBlock(final Random random, final int x, final int y, final int z) {
		if (!this.world.isAirBlock(new BlockPos(x, y, z))) {
			if (random.nextInt(6) == 0) {
				this.placeBlock(random, new BlockPos(x, y, z), this.block1);
			} else {
				this.placeBlock(random, new BlockPos(x, y, z), this.block1);
			}
		}
	}

	private void placeObjects(final Random random, final int x, final int y, final int z) {
		for (int bx = 0; bx < this.bxa.size(); bx++) {
			for (int bz = 0; bz < this.bza.size(); bz++) {
				this.placeRoomObjects(random, x + this.bxa.get(bx), y, z + this.bza.get(bz));
			}
		}
		for (int bx = 1; bx < this.bxa.size() - 1; bx++) {
			for (int bz = 1; bz < this.bza.size() - 1; bz++) {
				this.placeRoomObjects(random, x + this.bxa.get(bx), y + 4, z + this.bza.get(bz));
			}
		}
		for (int bx = 2; bx < this.bxa.size() - 2; bx++) {
			for (int bz = 2; bz < this.bza.size() - 2; bz++) {
				this.placeRoomObjects(random, x + this.bxa.get(bx), y + 8, z + this.bza.get(bz));
			}
		}
		for (int vz = this.vz1 + 5; vz <= this.vz2 - 5; vz++) {
			this.placeHallwayZObjects(random, x + this.vx1 + 6, y, z + vz);
			this.placeHallwayZObjects(random, x + this.vx2 - 6, y, z + vz);
		}
		for (int vx = this.vx1 + 5; vx <= this.vx2 - 5; vx++) {
			this.placeHallwayXObjects(random, x + vx, y, z + this.vz1 + 6);
			this.placeHallwayXObjects(random, x + vx, y, z + this.vz2 - 6);
		}
		for (int vz = this.vz1 + 9; vz <= this.vz2 - 9; vz++) {
			this.placeHallwayZObjects(random, x + this.vx1 + 10, y + 4, z + vz);
			this.placeHallwayZObjects(random, x + this.vx2 - 10, y + 4, z + vz);
		}
		for (int vx = this.vx1 + 9; vx <= this.vx2 - 9; vx++) {
			this.placeHallwayXObjects(random, x + vx, y + 4, z + this.vz1 + 10);
			this.placeHallwayXObjects(random, x + vx, y + 4, z + this.vz2 - 10);
		}
		for (int vz = this.vz1 + 13; vz <= this.vz2 - 13; vz++) {
			this.placeHallwayZObjects(random, x + this.vx1 + 14, y + 8, z + vz);
			this.placeHallwayZObjects(random, x + this.vx2 - 14, y + 8, z + vz);
		}
		for (int vx = this.vx1 + 13; vx <= this.vx2 - 13; vx++) {
			this.placeHallwayXObjects(random, x + vx, y + 8, z + this.vz1 + 14);
			this.placeHallwayXObjects(random, x + vx, y + 8, z + this.vz2 - 14);
		}
		for (int vx = -24; vx <= 24; vx++) {
			for (int vz = -24; vz <= 24; vz++) {
				this.placeObject(random, x + vx, y + 12, z + vz);
			}
		}
		for (int vx = -14; vx <= 14; vx++) {
			for (int vz = -14; vz <= 14; vz++) {
				this.placeObject(random, x + vx, y + 13, z + vz);
			}
		}
		for (int vx = -12; vx <= 12; vx++) {
			for (int vz = -12; vz <= 12; vz++) {
				this.placeObject(random, x + vx, y + 14, z + vz);
			}
		}
		for (int vx = -7; vx <= 7; vx++) {
			for (int vz = -7; vz <= 7; vz++) {
				this.placeObject(random, x + vx, y + 15, z + vz);
			}
		}
	}

	private void placeRoomObjects(final Random random, final int x, final int y, final int z) {
		for (int vy = 0; vy <= 2; vy++) {
			for (int vx = -1; vx <= 1; vx++) {
				for (int vz = -1; vz <= 1; vz++) {
					this.placeObject(random, x + vx, y + vy, z + vz);
				}
			}
		}
	}

	private void placeHallwayXObjects(final Random random, final int x, final int y, final int z) {
		for (int vy = 0; vy <= 2; vy++) {
			for (int vz = -1; vz <= 1; vz++) {
				this.placeObject(random, x, y + vy, z + vz);
			}
		}
	}

	private void placeHallwayZObjects(final Random random, final int x, final int y, final int z) {
		for (int vy = 0; vy <= 2; vy++) {
			for (int vx = -1; vx <= 1; vx++) {
				this.placeObject(random, x + vx, y + vy, z);
			}
		}
	}

	private void placeObject(final Random random, final int x, final int y, final int z) {
		if (this.world.isAirBlock(new BlockPos(x, y, z))) {
			if ((!this.world.isAirBlock(new BlockPos(x - 1, y, z)) || !this.world.isAirBlock(new BlockPos(x + 1, y, z))
					|| !this.world.isAirBlock(new BlockPos(x, y, z - 1))
					|| !this.world.isAirBlock(new BlockPos(x, y, z + 1))
					|| this.world.getBlockState(new BlockPos(x, y - 1, z)).equals(this.block1))
					&& random.nextInt(60) == 0) {
				if (!this.block1.equals(Blocks.nether_brick.getDefaultState())) {
					this.placeBlock(random, new BlockPos(x, y, z), Blocks.torch.getDefaultState());
				} else {
					if (!this.world.isAirBlock(new BlockPos(x - 1, y, z))
							&& !this.world.getBlockState(new BlockPos(x - 1, y, z)).equals(this.block2)) {
						this.placeBlock(random, new BlockPos(x - 1, y, z), Blocks.glowstone.getDefaultState());
					} else if (!this.world.isAirBlock(new BlockPos(x + 1, y, z))
							&& !this.world.getBlockState(new BlockPos(x + 1, y, z)).equals(this.block2)) {
						this.placeBlock(random, new BlockPos(x + 1, y, z), Blocks.glowstone.getDefaultState());
					} else if (!this.world.isAirBlock(new BlockPos(x, y, z - 1))
							&& !this.world.getBlockState(new BlockPos(x, y, z - 1)).equals(this.block2)) {
						this.placeBlock(random, new BlockPos(x, y, z - 1), Blocks.glowstone.getDefaultState());
					} else if (!this.world.isAirBlock(new BlockPos(x, y, z + 1))
							&& !this.world.getBlockState(new BlockPos(x, y, z + 1)).equals(this.block2)) {
						this.placeBlock(random, new BlockPos(x, y, z + 1), Blocks.glowstone.getDefaultState());
					} else {
						this.placeBlock(random, new BlockPos(x, y - 1, z), Blocks.glowstone.getDefaultState());
					}
				}
			} else if (this.block1.equals(Blocks.stonebrick.getDefaultState())
					&& (!this.world.isAirBlock(new BlockPos(x - 1, y, z))
							|| !this.world.isAirBlock(new BlockPos(x + 1, y, z))
							|| !this.world.isAirBlock(new BlockPos(x, y, z - 1))
							|| !this.world.isAirBlock(new BlockPos(x, y, z + 1))
							|| this.world.getBlockState(new BlockPos(x, y - 1, z)) == this.block1)
					&& random.nextInt(48) == 0) {
				this.placeBlock(random, new BlockPos(x, y, z), Blocks.web.getDefaultState());
			} else if (this.world.getBlockState(new BlockPos(x, y - 1, z)).getBlock().getDefaultState()
					.equals(this.block1) && random.nextInt(90) == 0) {
				if (random.nextInt(3) == 0) {
					this.addChestWithCustomItemsLoot(this.world, random, x, y, z, this.items);
				} else {
					String mob = this.mobs.get(random.nextInt(this.mobs.size()));

					if (mob == "Ghast" && random.nextInt(4) == 0) {
						this.addMobSpawner(this.world, x, y, z, mob);
					} else {
						mob = this.mobs.get(random.nextInt(this.mobs.size()));

						this.addMobSpawner(this.world, x, y, z, mob);
					}
				}
			}
		}
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(4)));
		} else if (state.getBlock() instanceof BlockSandStone) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(3)));
		} else if (state.getBlock() instanceof BlockSlab) {
			if (this.block1.getBlock() == Blocks.stonebrick) {
				this.world.setBlockState(pos, state.getBlock().getStateFromMeta(5));
			} else if (this.block1.getBlock() == Blocks.sandstone) {
				this.world.setBlockState(pos, state.getBlock().getStateFromMeta(1));
			}
		} else if (state.getBlock() instanceof BlockTorch) {
			this.placeBlockTorch(this.world, random, pos, state.getBlock());
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
