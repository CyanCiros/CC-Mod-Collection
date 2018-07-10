package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorBarn extends DungeonGenerator {
	private final World world;

	private IBlockState block1;
	private final IBlockState block2;
	private IBlockState block3;
	private final IBlockState block4;
	private final IBlockState block5;
	private final IBlockState block6;

	private BlockPlanks.EnumType plankType;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorBarn(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);
		this.block4 = blocks.get(3);
		this.block5 = blocks.get(4);
		this.block6 = blocks.get(5);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log)) {
			this.block1 = random.nextInt(3) == 0 ? Blocks.log2.getDefaultState() : Blocks.log.getDefaultState();
		}
		if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log)) {
			final int r = random.nextInt(4);

			switch (r) {
			case 0:
				this.plankType = BlockPlanks.EnumType.OAK;

				this.block3 = Blocks.oak_fence.getDefaultState();
				break;
			case 1:
				this.plankType = BlockPlanks.EnumType.SPRUCE;

				this.block3 = Blocks.spruce_fence.getDefaultState();
				break;
			case 2:
				this.plankType = BlockPlanks.EnumType.BIRCH;

				this.block3 = Blocks.birch_fence.getDefaultState();
				break;
			case 3:
				this.plankType = BlockPlanks.EnumType.JUNGLE;

				this.block3 = Blocks.jungle_fence.getDefaultState();
				break;
			default:
				this.plankType = BlockPlanks.EnumType.OAK;

				this.block3 = Blocks.oak_fence.getDefaultState();
				break;
			}
		} else if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log2)) {
			final int r = random.nextInt(2);

			switch (r) {
			case 0:
				this.plankType = BlockPlanks.EnumType.ACACIA;

				this.block3 = Blocks.acacia_fence.getDefaultState();
				break;
			case 1:
				this.plankType = BlockPlanks.EnumType.DARK_OAK;

				this.block3 = Blocks.dark_oak_fence.getDefaultState();
				break;
			default:
				this.plankType = BlockPlanks.EnumType.ACACIA;

				this.block3 = Blocks.acacia_fence.getDefaultState();
				break;
			}
		}

		for (int vx = -9; vx <= 9; vx++) {
			for (int vz = -9; vz <= 9; vz++) {
				for (int vy = 0; vy <= 3; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vx = -10; vx <= 10; vx++) {
			for (int vz = 0; vz <= 10; vz++) {
				final int vyt = 14 - vz;

				for (int vy = 4; vy <= vyt; vy++) {
					if (vy == vyt) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z - vz), this.block1);
					} else {
						if (vx != -10 && vx != 10) {
							this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
							this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z - vz));
						}
					}
				}
			}
		}
		for (int vx = -9; vx <= 9; vx++) {
			for (int vz = -9; vz <= 9; vz++) {
				if (random.nextInt(3) == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block4);
				} else {
					this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block5);
				}
				// for (int vy = y - 2; vy >= 0; vy--) {
				// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz)))
				// {
				// if (random.nextInt(3) == 0) {
				// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
				// this.block4);
				// } else {
				// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
				// this.block5);
				// }
				// } else {
				// break;
				// }
				// }
			}
		}
		for (int vz = -9; vz <= 9; vz++) {
			this.placeBlock(random, new BlockPos(x + 9, y + 5, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 9, y + 5, z + vz), this.block1);
		}
		for (int vx = -9; vx <= 9; vx++) {
			for (int vy = 0; vy <= 4; vy++) {
				if (vx == -9 || vx == -3 || vx == 3 || vx == 9) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 9), this.block1);
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 9), this.block1);
				} else {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 9), this.block2);
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 9), this.block2);
				}
			}
		}
		for (int vz = -9; vz <= 9; vz++) {
			for (int vy = 0; vy <= 4; vy++) {
				if (vz == -9 || vz == -3 || vz == 3 || vz == 9) {
					this.placeBlock(random, new BlockPos(x + 9, y + vy, z + vz), this.block1);
					this.placeBlock(random, new BlockPos(x - 9, y + vy, z + vz), this.block1);
				} else if (vz < -3 || vz > 3) {
					this.placeBlock(random, new BlockPos(x + 9, y + vy, z + vz), this.block2);
					this.placeBlock(random, new BlockPos(x - 9, y + vy, z + vz), this.block2);
				}
			}
		}
		for (int vz = 0; vz <= 7; vz++) {
			final int vyt = 13 - vz;

			for (int vy = 6; vy <= vyt; vy++) {
				if (!(vz >= 1 && vz <= 2 && (vy >= 6 && vy <= 7 || vy >= 9 && vy <= 10))) {
					this.placeBlock(random, new BlockPos(x + 9, y + vy, z + vz), this.block1);
					this.placeBlock(random, new BlockPos(x + 9, y + vy, z - vz), this.block1);
					this.placeBlock(random, new BlockPos(x - 9, y + vy, z + vz), this.block1);
					this.placeBlock(random, new BlockPos(x - 9, y + vy, z - vz), this.block1);
				}
			}
		}
		for (int vy = 0; vy <= 10; vy++) {
			this.placeBlock(random, new BlockPos(x + 3, y + vy, z + 3), this.block3);
			this.placeBlock(random, new BlockPos(x + 3, y + vy, z - 3), this.block3);
			this.placeBlock(random, new BlockPos(x - 3, y + vy, z + 3), this.block3);
			this.placeBlock(random, new BlockPos(x - 3, y + vy, z - 3), this.block3);
		}
		for (int v = 1; v <= 2; v++) {
			this.placeBlock(random, new BlockPos(x + 3, y, z + 3 + v), this.block3);
			this.placeBlock(random, new BlockPos(x + 3, y, z - 3 - v), this.block3);

			this.placeBlock(random, new BlockPos(x - 3, y, z + 3 + v), this.block3);
			this.placeBlock(random, new BlockPos(x - 3, y, z - 3 - v), this.block3);

			this.placeBlock(random, new BlockPos(x + 3 + v, y, z + 3), this.block3);
			this.placeBlock(random, new BlockPos(x - 3 - v, y, z + 3), this.block3);

			this.placeBlock(random, new BlockPos(x + 3 + v, y, z - 3), this.block3);
			this.placeBlock(random, new BlockPos(x - 3 - v, y, z - 3), this.block3);

			this.placeBlock(random, new BlockPos(x + 3, y + 8, z + v), this.block3);
			this.placeBlock(random, new BlockPos(x + 3, y + 8, z - v), this.block3);

			this.placeBlock(random, new BlockPos(x - 3, y + 8, z + v), this.block3);
			this.placeBlock(random, new BlockPos(x - 3, y + 8, z - v), this.block3);
		}
		for (int vy = 1; vy <= 5; vy++) {
			this.placeBlock(random, new BlockPos(x - 3, y + 8 + vy, z), this.block3);
			this.placeBlock(random, new BlockPos(x + 3, y + 8 + vy, z), this.block3);
		}
		for (int vx = -8; vx <= 8; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 8, z), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 5, z + 3), this.block3);
			this.placeBlock(random, new BlockPos(x + vx, y + 5, z - 3), this.block3);

			if (vx == -6 || vx == 0 || vx == 6) {
				this.placeBlock(random, new BlockPos(x + vx, y + 6, z + 3), this.block6);
				this.placeBlock(random, new BlockPos(x + vx, y + 6, z - 3), this.block6);
			}
		}
		this.addMobSpawner(this.world, x + 6, y, z + 6, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 6, y, z - 6, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x - 6, y, z + 6, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x - 6, y, z - 6, this.mobs.get(random.nextInt(this.mobs.size())));

		this.addChestWithCustomItemsLoot(this.world, random, x, y, z + 8, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x, y, z - 8, this.items);
	}

	@SuppressWarnings("unused")
	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockOldLog || state.getBlock() instanceof BlockNewLog) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(this.plankType.ordinal() % 4));
		} else if (state.getBlock() instanceof BlockPlanks) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(this.plankType.ordinal()));
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
