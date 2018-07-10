package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorMystery extends DungeonGenerator {
	private final World world;

	private IBlockState block1;
	private final IBlockState block2;

	private static BlockPlanks.EnumType plankType;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorMystery(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);

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
				DungeonGeneratorMystery.plankType = BlockPlanks.EnumType.OAK;
				break;
			case 1:
				DungeonGeneratorMystery.plankType = BlockPlanks.EnumType.SPRUCE;
				break;
			case 2:
				DungeonGeneratorMystery.plankType = BlockPlanks.EnumType.BIRCH;
				break;
			case 3:
				DungeonGeneratorMystery.plankType = BlockPlanks.EnumType.JUNGLE;
				break;
			default:
				DungeonGeneratorMystery.plankType = BlockPlanks.EnumType.OAK;
				break;
			}
		} else if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log2)) {
			final int r = random.nextInt(2);

			switch (r) {
			case 0:
				DungeonGeneratorMystery.plankType = BlockPlanks.EnumType.ACACIA;
				break;
			case 1:
				DungeonGeneratorMystery.plankType = BlockPlanks.EnumType.DARK_OAK;
				break;
			default:
				DungeonGeneratorMystery.plankType = BlockPlanks.EnumType.ACACIA;
				break;
			}
		} else {
			DungeonGeneratorMystery.plankType = BlockPlanks.EnumType.OAK;
		}

		for (int vx = -7; vx <= 7; vx++) {
			for (int vz = -7; vz <= 7; vz++) {
				for (int vy = 0; vy <= 3; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vx = -5; vx <= 5; vx++) {
			for (int vz = -5; vz <= 5; vz++) {
				for (int vy = -6; vy <= -1; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = -4; vz <= 4; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + -6, z + vz), this.block2);
			}
		}
		for (int vy = -6; vy <= -2; vy++) {
			for (int vx = -5; vx <= 5; vx++) {
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 5), this.block1);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + -5), this.block1);
			}
		}
		for (int vy = -6; vy <= -2; vy++) {
			for (int vz = -4; vz <= 4; vz++) {
				this.placeBlock(random, new BlockPos(x + 5, y + vy, z + vz), this.block1);
				this.placeBlock(random, new BlockPos(x + -5, y + vy, z + vz), this.block1);
			}
		}
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = -4; vz <= 4; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);
			}
		}
		for (int vx = -7; vx <= -5; vx++) {
			for (int vz = -7; vz <= 7; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block1);
			}
		}
		for (int vx = 5; vx <= 7; vx++) {
			for (int vz = -7; vz <= 7; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block1);
			}
		}
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = -7; vz <= -5; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block1);
			}
		}
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = 5; vz <= 7; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block1);
			}
		}
		for (int vx = -6; vx <= -5; vx++) {
			for (int vz = -6; vz <= 6; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block2);
			}
		}
		for (int vx = 5; vx <= 6; vx++) {
			for (int vz = -6; vz <= 6; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block2);
			}
		}
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = -6; vz <= -5; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block2);
			}
		}
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = 5; vz <= 6; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block2);
			}
		}
		for (int vx = -7; vx <= 7; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y, z + 7), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y, z - 7), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 1, z + 7), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 1, z - 7), this.block1);

			if (vx % 2 != 0) {
				this.placeBlock(random, new BlockPos(x + vx, y + 2, z + 7), this.block1);
				this.placeBlock(random, new BlockPos(x + vx, y + 2, z - 7), this.block1);
			}
		}
		for (int vz = -6; vz <= 6; vz++) {
			this.placeBlock(random, new BlockPos(x + 7, y, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 7, y, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 7, y + 1, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 7, y + 1, z + vz), this.block1);

			if (vz % 2 != 0) {
				this.placeBlock(random, new BlockPos(x + 7, y + 2, z + vz), this.block1);
				this.placeBlock(random, new BlockPos(x - 7, y + 2, z + vz), this.block1);
			}
		}

		this.addMobSpawner(this.world, x - 5, y - 1, z - 5, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 5, y - 1, z + 5, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 5, y - 1, z - 5, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x - 5, y - 1, z + 5, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x - 3, y - 5, z - 3, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 3, y - 5, z + 3, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 3, y - 5, z - 3, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x - 3, y - 5, z + 3, this.mobs.get(random.nextInt(this.mobs.size())));

		this.addChestWithCustomItemsLoot(this.world, random, x, y - 5, z, this.items);
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockOldLog || state.getBlock() instanceof BlockNewLog) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorMystery.plankType.ordinal() % 4));
		} else if (state.getBlock() instanceof BlockPlanks) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorMystery.plankType.ordinal()));
		} else if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(3)));
		} else if (state.getBlock() instanceof BlockSandStone) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(0));
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
