package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorMysteryRooms extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;
	private final IBlockState block3;
	private final IBlockState block4;

	private final ArrayList<String> mobs;
	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorMysteryRooms(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);
		this.block4 = blocks.get(3);

		this.mobs = mobs;
		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		final int sx = x - 6;
		final int sy = 30 + random.nextInt(13) - 6;
		final int sz = z - 6;

		for (int vz = -1; vz <= 27; vz++) {
			for (int vx = -1; vx <= 18; vx++) {
				for (int vy = -2; vy <= 8; vy++) {
					this.world.setBlockState(new BlockPos(sx + vx, sy + vy, sz + vz), this.block1);
				}
			}
		}
		for (int vx = 1; vx <= 3; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				for (int vz = 1; vz <= 3; vz++) {
					this.world.setBlockToAir(new BlockPos(sx + vx, sy + vy, sz + vz));
				}
			}
		}

		this.addChestWithCustomItemsLoot(this.world, random, sx + 2, sy + 1, sz + 4, this.items);
		this.world.setBlockToAir(new BlockPos(sx + 2, sy + 2, sz + 4));
		this.world.setBlockToAir(new BlockPos(sx + 4, sy + 1, sz + 2));
		this.world.setBlockToAir(new BlockPos(sx + 4, sy + 2, sz + 2));

		for (int vx = 5; vx <= 7; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				for (int vz = 1; vz <= 3; vz++) {
					this.world.setBlockToAir(new BlockPos(sx + vx, sy + vy, sz + vz));
				}
			}
		}
		for (int vx = 5; vx <= 7; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				for (int vz = 5; vz <= 7; vz++) {
					this.world.setBlockToAir(new BlockPos(sx + vx, sy + vy, sz + vz));
				}
			}
		}
		this.world.setBlockToAir(new BlockPos(sx + 6, sy + 1, sz + 4));
		this.world.setBlockToAir(new BlockPos(sx + 6, sy + 2, sz + 4));
		this.world.setBlockToAir(new BlockPos(sx + 8, sy + 1, sz + 6));
		this.world.setBlockToAir(new BlockPos(sx + 8, sy + 2, sz + 6));

		this.addMobSpawner(this.world, sx + 6, sy + 6, sz + 6, this.mobs.get(random.nextInt(this.mobs.size())));

		this.world.setBlockToAir(new BlockPos(sx + 6, sy + 5, sz + 6));
		this.world.setBlockToAir(new BlockPos(sx + 6, sy + 4, sz + 6));
		this.world.setBlockState(new BlockPos(sx + 8, sy + 1, sz + 6), Blocks.stone_pressure_plate.getDefaultState());
		this.world.setBlockState(new BlockPos(sx + 8, sy, sz + 7), Blocks.tnt.getDefaultState());
		this.world.setBlockState(new BlockPos(sx + 8, sy, sz + 5), Blocks.tnt.getDefaultState());
		this.world.setBlockState(new BlockPos(sx + 10, sy + 1, sz + 4), this.block2);
		this.world.setBlockState(new BlockPos(sx + 10, sy + 2, sz + 4), this.block3);
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 3, sz + 4));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 4, sz + 6));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 5, sz + 6));

		for (int vx = 9; vx <= 11; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				for (int vz = 5; vz <= 7; vz++) {
					this.world.setBlockToAir(new BlockPos(sx + vx, sy + vy, sz + vz));
				}
			}
		}
		this.addMobSpawner(this.world, sx + 2, sy, sz + 2, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, sx + 2, sy + 4, sz + 2, this.mobs.get(random.nextInt(this.mobs.size())));

		for (int vx = 14; vx <= 16; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				for (int vz = 5; vz <= 7; vz++) {
					this.world.setBlockToAir(new BlockPos(sx + vx, sy + vy, sz + vz));
				}
			}
		}
		this.world.setBlockToAir(new BlockPos(sx + 12, sy + 1, sz + 6));
		this.world.setBlockToAir(new BlockPos(sx + 12, sy + 2, sz + 6));
		this.world.setBlockToAir(new BlockPos(sx + 13, sy + 1, sz + 6));
		this.world.setBlockToAir(new BlockPos(sx + 13, sy + 2, sz + 6));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 1, sz + 8));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 2, sz + 8));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 1, sz + 9));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 2, sz + 9));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 1, sz + 10));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 2, sz + 10));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 1, sz + 11));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 2, sz + 11));

		for (int vx = 9; vx <= 11; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				for (int vz = 12; vz <= 14; vz++) {
					this.world.setBlockToAir(new BlockPos(sx + vx, sy + vy, sz + vz));
				}
			}
		}
		this.world.setBlockToAir(new BlockPos(sx + 12, sy + 1, sz + 13));
		this.world.setBlockToAir(new BlockPos(sx + 12, sy + 2, sz + 13));
		this.world.setBlockToAir(new BlockPos(sx + 13, sy + 1, sz + 13));
		this.world.setBlockToAir(new BlockPos(sx + 13, sy + 2, sz + 13));

		for (int vx = 14; vx <= 16; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				for (int vz = 12; vz <= 14; vz++) {
					this.world.setBlockToAir(new BlockPos(sx + vx, sy + vy, sz + vz));
				}
			}
		}
		this.addMobSpawner(this.world, sx + 17, sy + 2, sz + 13, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, sx + 15, sy + 2, sz + 11, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, sx + 15, sy + 2, sz + 15, this.mobs.get(random.nextInt(this.mobs.size())));

		this.addChestWithCustomItemsLoot(this.world, random, sx + 16, sy + 1, sz + 13, this.items);
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 1, sz + 15));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 2, sz + 15));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 1, sz + 16));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 2, sz + 16));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 1, sz + 17));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 2, sz + 17));

		for (int vx = 8; vx <= 12; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				for (int vz = 18; vz <= 22; vz++) {
					this.world.setBlockToAir(new BlockPos(sx + vx, sy + vy, sz + vz));
				}
			}
		}
		this.world.setBlockState(new BlockPos(sx + 12, sy + 1, sz + 20), this.block2);
		this.world.setBlockState(new BlockPos(sx + 12, sy + 2, sz + 20), this.block3);
		this.world.setBlockState(new BlockPos(sx + 11, sy + 1, sz + 20), this.block4);
		this.world.setBlockState(new BlockPos(sx + 11, sy + 1, sz + 19), this.block4);
		this.world.setBlockState(new BlockPos(sx + 11, sy + 1, sz + 21), this.block4);
		this.world.setBlockState(new BlockPos(sx + 12, sy + 1, sz + 19), this.block4);
		this.world.setBlockState(new BlockPos(sx + 12, sy + 1, sz + 21), this.block4);
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 1, sz + 23));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 2, sz + 23));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 1, sz + 24));
		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 2, sz + 24));

		this.addChestWithCustomItemsLoot(this.world, random, sx + 10, sy + 2, sz + 25, this.items);

		this.world.setBlockToAir(new BlockPos(sx + 10, sy + 3, sz + 25));
		this.world.setBlockToAir(new BlockPos(sx + 7, sy + 1, sz + 20));
		this.world.setBlockToAir(new BlockPos(sx + 7, sy + 2, sz + 20));
		this.world.setBlockToAir(new BlockPos(sx + 6, sy + 1, sz + 20));
		this.world.setBlockToAir(new BlockPos(sx + 6, sy + 2, sz + 20));
		this.world.setBlockToAir(new BlockPos(sx + 5, sy + 1, sz + 20));
		this.world.setBlockToAir(new BlockPos(sx + 5, sy + 2, sz + 20));

		for (int vx = 2; vx <= 4; vx++) {
			for (int vy = 1; vy <= 3; vy++) {
				for (int vz = 19; vz <= 21; vz++) {
					this.world.setBlockToAir(new BlockPos(sx + vx, sy + vy, sz + vz));
				}
			}
		}
		this.addMobSpawner(this.world, sx + 12 - 9, sy, sz + 20, this.mobs.get(random.nextInt(this.mobs.size())));
	}
}
