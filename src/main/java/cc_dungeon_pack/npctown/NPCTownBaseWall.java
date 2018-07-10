package cc_dungeon_pack.npctown;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class NPCTownBaseWall extends NPCTownBase {
	public NPCTownBaseWall(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		for (int vz = -39; vz <= 39; vz += 26) {
			this.generateWallX(random, x + vz, y, z + 52);
			this.generateWallX(random, x + vz, y, z - 52);
		}
		for (int vz = -39; vz <= 39; vz += 26) {
			this.generateWallZ(random, x + 52, y, z + vz);
			this.generateWallZ(random, x - 52, y, z + vz);
		}
		for (int vx = -52; vx <= 52; vx += 26) {
			this.generateTower(random, x + vx, y, z + 52);
			this.generateTower(random, x + vx, y, z - 52);
		}
		for (int vz = -26; vz <= 26; vz += 26) {
			this.generateTower(random, x + 52, y, z + vz);
			this.generateTower(random, x - 52, y, z + vz);
		}
	}

	private void generateWallX(final Random random, final int x, final int y, final int z) {
		final int vx1 = -10;
		final int vx2 = 10;

		for (int vy = 0; vy <= 13; vy++) {
			for (int vx = vx1; vx <= vx2; vx++) {
				for (int vz = -2; vz <= 2; vz++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vy = -1; vy <= 8; vy++) {
			for (int vx = vx1; vx <= vx2; vx++) {
				for (int vz = -2; vz <= 2; vz++) {
					if (vy == 8 && (vz == -2 || vz == 2) && vx % 2 == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block3);
					} else if (!(vy == 8 && vz >= -1 && vz <= 1) && !(vy >= 0 && vy <= 6 && vz >= -1 && vz <= 1)) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block3);
					}
					if ((vy == -1 || vy == 7) && vz == 0 && vx % 6 == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy + 1, z + vz), this.block14);
					}
				}
			}
		}
		// for (int vx = vx1; vx <= vx2; vx++) {
		// for (int vz = -2; vz <= 2; vz++) {
		// if (this.world.isAirBlock(new BlockPos(x + vx, y - 2, z + vz))) {
		// for (int vy = y - 2; vy >= 0; vy--) {
		// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz))) {
		// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
		// this.block11);
		// } else {
		// break;
		// }
		// }
		// }
		// }
		// }
		for (int vx = vx1; vx <= vx2; vx++) {
			for (int vz = -2; vz <= 2; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 11, z + vz), this.block4);
			}
		}
	}

	private void generateWallZ(final Random random, final int x, final int y, final int z) {
		final int vz1 = -10;
		final int vz2 = 10;

		for (int vy = 0; vy <= 13; vy++) {
			for (int vz = vz1; vz <= vz2; vz++) {
				for (int vx = -2; vx <= 2; vx++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vy = -1; vy <= 8; vy++) {
			for (int vz = vz1; vz <= vz2; vz++) {
				for (int vx = -2; vx <= 2; vx++) {
					if (vy == 8 && (vx == -2 || vx == 2) && vz % 2 == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block3);
					} else if (!(vy == 8 && vx >= -1 && vx <= 1) && !(vy >= 0 && vy <= 6 && vx >= -1 && vx <= 1)) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block3);
					}
					if ((vy == -1 || vy == 7) && vx == 0 && vz % 6 == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy + 1, z + vz), this.block14);
					}
				}
			}
		}
		// for (int vz = vz1; vz <= vz2; vz++) {
		// for (int vx = -2; vx <= 2; vx++) {
		// if (this.world.isAirBlock(new BlockPos(x + vx, y - 2, z + vz))) {
		// for (int vy = y - 2; vy >= 0; vy--) {
		// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz))) {
		// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
		// this.block11);
		// } else {
		// break;
		// }
		// }
		// }
		// }
		// }
		for (int vz = vz1; vz <= vz2; vz++) {
			for (int vx = -2; vx <= 2; vx++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 11, z + vz), this.block4);
			}
		}
	}

	private void generateTower(final Random random, final int x, final int y, final int z) {
		for (int vx = -3; vx <= 3; vx++) {
			for (int vz = -3; vz <= 3; vz++) {
				for (int vy = 0; vy <= 13; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
				// if (this.world.isAirBlock(new BlockPos(x + vx, y - 2, z +
				// vz))) {
				// for (int vy = y - 2; vy >= 0; vy--) {
				// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz)))
				// {
				// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
				// this.block11);
				// } else {
				// break;
				// }
				// }
				// }
			}
		}
		for (int vy = -1; vy <= 8; vy++) {
			for (int vx = -3; vx <= 3; vx++) {
				if (!(vy == 8 && vx >= -1 && vx <= 1)) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 3), this.block3);
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 3), this.block3);
				}
			}
			for (int vz = -2; vz <= 2; vz++) {
				if (!(vy == 8 && vz >= -1 && vz <= 1)) {
					this.placeBlock(random, new BlockPos(x + 3, y + vy, z + vz), this.block3);
					this.placeBlock(random, new BlockPos(x - 3, y + vy, z + vz), this.block3);
				}
			}
		}
		for (int vx = -2; vx <= 2; vx++) {
			for (int vz = -2; vz <= 2; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + -1, z + vz), this.block3);
				this.placeBlock(random, new BlockPos(x + vx, y + 7, z + vz), this.block3);

				if (vx == 0 && vz == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block14);
					this.placeBlock(random, new BlockPos(x + vx, y + 8, z + vz), this.block14);
				}
			}
		}
		for (int vy = -1; vy <= 8; vy++) {
			if (vy >= 0) {
				this.placeBlock(random, new BlockPos(x + 2, y + vy, z + 2), Blocks.ladder.getDefaultState());
			}
		}
		for (int vy = 9; vy <= 10; vy++) {
			this.placeBlock(random, new BlockPos(x + 3, y + vy, z + 3), this.block5);
			this.placeBlock(random, new BlockPos(x + 3, y + vy, z - 3), this.block5);
			this.placeBlock(random, new BlockPos(x - 3, y + vy, z + 3), this.block5);
			this.placeBlock(random, new BlockPos(x - 3, y + vy, z - 3), this.block5);
		}
		int vx1 = -3;
		int vx2 = 3;
		int vz1 = -3;
		int vz2 = 3;

		for (int vy = 11; vy <= 13; vy++) {
			for (int vx = vx1; vx <= vx2; vx++) {
				for (int vz = vz1; vz <= vz2; vz++) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block4);
				}
			}
			vx1++;
			vx2--;
			vz1++;
			vz2--;
		}
		IBlockState block;

		if (this.world.isAirBlock(new BlockPos(x + 4, y, z))) {
			if (this.world.getBlockState(new BlockPos(x + 4, y - 1, z)) != this.block3
					&& this.world.getBlockState(new BlockPos(x + 4, y - 1, z)) != this.block6) {
				block = this.block10;
			} else {
				block = Blocks.air.getDefaultState();
			}
			for (int vz = -1; vz <= 1; vz++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.placeBlock(random, new BlockPos(x + 3, y + vy, z + vz), block);
				}
			}
		}
		if (this.world.isAirBlock(new BlockPos(x - 4, y, z))) {
			if (this.world.getBlockState(new BlockPos(x - 4, y - 1, z)) != this.block3
					&& this.world.getBlockState(new BlockPos(x - 4, y - 1, z)) != this.block6) {
				block = this.block10;
			} else {
				block = Blocks.air.getDefaultState();
			}
			for (int vz = -1; vz <= 1; vz++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.placeBlock(random, new BlockPos(x - 3, y + vy, z + vz), block);
				}
			}
		}
		if (this.world.isAirBlock(new BlockPos(x, y, z + 4))) {
			if (this.world.getBlockState(new BlockPos(x, y - 1, z + 4)) != this.block3
					&& this.world.getBlockState(new BlockPos(x, y - 1, z + 4)) != this.block6) {
				block = this.block10;
			} else {
				block = Blocks.air.getDefaultState();
			}
			for (int vx = -1; vx <= 1; vx++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 3), block);
				}
			}
		}
		if (this.world.isAirBlock(new BlockPos(x, y, z - 4))) {
			if (this.world.getBlockState(new BlockPos(x, y - 1, z - 4)) != this.block3
					&& this.world.getBlockState(new BlockPos(x, y - 1, z - 4)) != this.block6) {
				block = this.block10;
			} else {
				block = Blocks.air.getDefaultState();
			}
			for (int vx = -1; vx <= 1; vx++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 3), block);
				}
			}
		}
	}
}
