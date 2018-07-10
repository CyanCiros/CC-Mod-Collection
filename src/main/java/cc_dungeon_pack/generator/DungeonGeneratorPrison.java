package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorPrison extends DungeonGenerator {
	private final World world;

	private IBlockState block1;
	private final IBlockState block2;
	private final IBlockState block3;
	private final IBlockState block4;
	private final IBlockState block5;
	private final IBlockState block6;

	private static BlockPlanks.EnumType plankType;
	private static IBlockState fenceType;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorPrison(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
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
				DungeonGeneratorPrison.plankType = BlockPlanks.EnumType.OAK;
				DungeonGeneratorPrison.fenceType = Blocks.oak_fence.getDefaultState();
				break;
			case 1:
				DungeonGeneratorPrison.plankType = BlockPlanks.EnumType.SPRUCE;
				DungeonGeneratorPrison.fenceType = Blocks.spruce_fence.getDefaultState();
				break;
			case 2:
				DungeonGeneratorPrison.plankType = BlockPlanks.EnumType.BIRCH;
				DungeonGeneratorPrison.fenceType = Blocks.birch_fence.getDefaultState();
				break;
			case 3:
				DungeonGeneratorPrison.plankType = BlockPlanks.EnumType.JUNGLE;
				DungeonGeneratorPrison.fenceType = Blocks.jungle_fence.getDefaultState();
				break;
			default:
				DungeonGeneratorPrison.plankType = BlockPlanks.EnumType.OAK;
				DungeonGeneratorPrison.fenceType = Blocks.oak_fence.getDefaultState();
				break;
			}
		} else if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log2)) {
			final int r = random.nextInt(2);

			switch (r) {
			case 0:
				DungeonGeneratorPrison.plankType = BlockPlanks.EnumType.ACACIA;
				DungeonGeneratorPrison.fenceType = Blocks.acacia_fence.getDefaultState();
				break;
			case 1:
				DungeonGeneratorPrison.plankType = BlockPlanks.EnumType.DARK_OAK;
				DungeonGeneratorPrison.fenceType = Blocks.dark_oak_fence.getDefaultState();
				break;
			default:
				DungeonGeneratorPrison.plankType = BlockPlanks.EnumType.ACACIA;
				DungeonGeneratorPrison.fenceType = Blocks.acacia_fence.getDefaultState();
				break;
			}
		} else {
			DungeonGeneratorPrison.plankType = BlockPlanks.EnumType.OAK;
			DungeonGeneratorPrison.fenceType = Blocks.oak_fence.getDefaultState();
		}

		for (int vx = -5; vx <= 5; vx++) {
			for (int vz = -5; vz <= 5; vz++) {
				for (int vy = 0; vy <= 8; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
				if (random.nextInt(3) == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block5);
				} else {
					this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block4);
				}
				// for (int vy = y - 2; vy >= 0; vy--) {
				// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz)))
				// {
				// if (random.nextInt(3) == 0) {
				// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
				// this.block5);
				// } else {
				// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
				// this.block4);
				// }
				// } else {
				// break;
				// }
				// }
			}
		}
		for (int vx = -4; vx <= 4; vx++) {
			for (int vy = 0; vy <= 5; vy++) {
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 5), this.block2);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 5), this.block2);
			}
		}
		for (int vz = -4; vz <= 4; vz++) {
			for (int vy = 0; vy <= 5; vy++) {
				this.placeBlock(random, new BlockPos(x + 5, y + vy, z + vz), this.block2);
				this.placeBlock(random, new BlockPos(x - 5, y + vy, z + vz), this.block2);
			}
		}
		for (int vy = 0; vy <= 8; vy++) {
			if (vy < 8) {
				this.placeBlock(random, new BlockPos(x + 5, y + vy, z + 5), this.block1);
				this.placeBlock(random, new BlockPos(x - 5, y + vy, z - 5), this.block1);
				this.placeBlock(random, new BlockPos(x + 5, y + vy, z - 5), this.block1);
				this.placeBlock(random, new BlockPos(x - 5, y + vy, z + 5), this.block1);
			} else {
				this.placeBlock(random, new BlockPos(x + 5, y + vy, z + 5), this.block6);
				this.placeBlock(random, new BlockPos(x - 5, y + vy, z - 5), this.block6);
				this.placeBlock(random, new BlockPos(x + 5, y + vy, z - 5), this.block6);
				this.placeBlock(random, new BlockPos(x - 5, y + vy, z + 5), this.block6);
			}
		}
		for (int vx = -3; vx <= 3; vx += 2) {
			this.placeBlock(random, new BlockPos(x + vx, y + 6, z + 5), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 6, z - 5), this.block1);
		}
		for (int vz = -3; vz <= 3; vz += 2) {
			this.placeBlock(random, new BlockPos(x + 5, y + 6, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 5, y + 6, z + vz), this.block1);
		}

		for (int vx = -1; vx <= 1; vx++) {
			this.placeBlock(random, new BlockPos(x + 2 + vx, y + 3, z + 5), this.block3);
			this.placeBlock(random, new BlockPos(x + 2 + vx, y + 3, z - 5), this.block3);
		}
		for (int vy = -1; vy <= 1; vy++) {
			this.placeBlock(random, new BlockPos(x + 2, y + 3 + vy, z + 5), this.block3);
			this.placeBlock(random, new BlockPos(x + 2, y + 3 + vy, z - 5), this.block3);
		}
		for (int vz = -1; vz <= 1; vz++) {
			for (int vy = 0; vy <= 2; vy++) {
				this.placeBlock(random, new BlockPos(x + 5, y + vy, z + vz), this.block3);
			}
		}
		for (int vz = -4; vz <= 4; vz++) {
			this.placeBlock(random, new BlockPos(x - 4, y + 3, z + vz), this.block2);
			this.placeBlock(random, new BlockPos(x - 3, y + 3, z + vz), this.block2);
		}
		for (int vx = -1; vx <= 1; vx++) {
			this.placeBlock(random, new BlockPos(x - 1 + vx, y + 3, z + 4), this.block2);
			this.placeBlock(random, new BlockPos(x - 1 + vx, y + 3, z - 4), this.block2);
		}
		for (int vz = -1; vz <= 1; vz++) {
			this.placeBlock(random, new BlockPos(x - 2, y + 3, z + vz + 3), this.block2);
			this.placeBlock(random, new BlockPos(x - 2, y + 3, z + vz - 3), this.block2);
		}
		this.placeBlock(random, new BlockPos(x - 1, y + 3, z + 3), this.block2);
		this.placeBlock(random, new BlockPos(x - 1, y + 3, z - 3), this.block2);

		this.addMobSpawner(this.world, x - 3, y, z + 3, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x - 3, y, z - 3, this.mobs.get(random.nextInt(this.mobs.size())));

		this.addChestWithCustomItemsLoot(this.world, random, x - 4, y + 4, z, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x - 4, y, z, this.items);
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockOldLog || state.getBlock() instanceof BlockNewLog) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorPrison.plankType.ordinal() % 4));
		} else if (state.getBlock() instanceof BlockPlanks) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorPrison.plankType.ordinal()));
		} else if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(3)));
		} else if (state.getBlock() instanceof BlockSandStone) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(0));
		} else if (state.getBlock() instanceof BlockFence) {
			this.world.setBlockState(pos, DungeonGeneratorPrison.fenceType);
		} else if (state.getBlock() instanceof BlockTorch) {
			this.placeBlockTorch(this.world, random, pos, state.getBlock());
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
