package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorDeathTemple extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorDeathTemple(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		for (int vx = 0; vx <= 14; vx++) {
			for (int vz = 0; vz <= 7; vz++) {
				for (int vy = -4; vy <= 4; vy++) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
				}
				// for (int vy = y - 5; vy >= 0; vy--) {
				// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz)))
				// {
				// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
				// this.block1);
				// } else {
				// break;
				// }
				// }
			}
		}
		for (int vx = 1; vx <= 13; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				for (int vz = 1; vz <= 6; vz++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy - 3, z + vz));
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy + 1, z + vz));
				}
			}
		}
		for (int vx = 0; vx <= 1; vx++) {
			for (int vz = 0; vz <= 1; vz++) {
				this.world.setBlockToAir(new BlockPos(x + 10 + vx, y, z + 3 + vz));
			}
		}
		for (int vz = 0; vz <= 1; vz++) {
			for (int vy = 0; vy <= 2; vy++) {
				this.world.setBlockToAir(new BlockPos(x, y + vy + 1, z + 3 + vz));
			}
		}
		for (int vy = 0; vy <= 2; vy++) {
			for (int vz = 0; vz <= 1; vz++) {
				this.placeBlock(random, new BlockPos(x + 7, y + vy - 3, z + 1 + vz), this.block1);
				this.placeBlock(random, new BlockPos(x + 7, y + vy - 3, z + 5 + vz), this.block1);
			}
		}
		if (this.getEquals(this.world, this.block2.getBlock(), Blocks.glowstone)) {
			this.placeBlock(random, new BlockPos(x + 1, y - 1, z + 1), this.block2);
			this.placeBlock(random, new BlockPos(x + 1, y - 1, z + 6), this.block2);

		} else if (this.getEquals(this.world, this.block2.getBlock(), Blocks.torch)) {
			this.placeBlock(random, new BlockPos(x + 1, y - 2, z + 2), this.block2);
			this.placeBlock(random, new BlockPos(x + 1, y - 2, z + 5), this.block2);
		}

		this.addTrappedChestWithCustomItemsLoot(this.world, random, x + 1, y - 3, z + 3, this.items);
		this.addTrappedChestWithCustomItemsLoot(this.world, random, x + 1, y - 3, z + 4, this.items);
		this.addTrappedChestWithCustomItemsLoot(this.world, random, x + 3, y - 3, z + 1, this.items);
		this.addTrappedChestWithCustomItemsLoot(this.world, random, x + 4, y - 3, z + 1, this.items);
		this.addTrappedChestWithCustomItemsLoot(this.world, random, x + 3, y - 3, z + 6, this.items);
		this.addTrappedChestWithCustomItemsLoot(this.world, random, x + 4, y - 3, z + 6, this.items);

		this.addMobSpawner(this.world, x + 9, y + 1, z + 2, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 12, y + 1, z + 2, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 9, y + 1, z + 5, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 12, y + 1, z + 5, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 12, y - 3, z + 2, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 12, y - 3, z + 5, this.mobs.get(random.nextInt(this.mobs.size())));

		this.placeBlock(random, new BlockPos(x + 1, y - 5, z + 3), Blocks.tnt.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 1, y - 5, z + 4), Blocks.tnt.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y - 5, z + 1), Blocks.tnt.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y - 5, z + 1), Blocks.tnt.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y - 5, z + 6), Blocks.tnt.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y - 5, z + 6), Blocks.tnt.getDefaultState());
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(4)));
		} else if (state.getBlock() instanceof BlockSandStone) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(3)));
		} else if (state.getBlock() instanceof BlockTorch) {
			this.placeBlockTorch(this.world, random, pos, state.getBlock());
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
