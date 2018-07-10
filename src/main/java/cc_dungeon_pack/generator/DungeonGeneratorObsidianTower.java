package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorObsidianTower extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorObsidianTower(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		for (int vy = 5; vy <= 79; vy++) {
			for (int vx = -2; vx <= 2; vx++) {
				for (int vz = -2; vz <= 2; vz++) {
					this.world.setBlockToAir(new BlockPos(x + vx, vy, z + vz));
				}
			}
			this.placeBlock(random, new BlockPos(x + 3, vy, z), this.block1);
			this.placeBlock(random, new BlockPos(x - 3, vy, z), this.block1);
			this.placeBlock(random, new BlockPos(x, vy, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x, vy, z - 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, vy, z + 1), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, vy, z - 1), this.block1);
			this.placeBlock(random, new BlockPos(x - 3, vy, z + 1), this.block1);
			this.placeBlock(random, new BlockPos(x - 3, vy, z - 1), this.block1);
			this.placeBlock(random, new BlockPos(x + 1, vy, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x - 1, vy, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 1, vy, z - 3), this.block1);
			this.placeBlock(random, new BlockPos(x - 1, vy, z - 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, vy, z + 2), this.block1);
			this.placeBlock(random, new BlockPos(x - 2, vy, z - 2), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, vy, z - 2), this.block1);
			this.placeBlock(random, new BlockPos(x - 2, vy, z + 2), this.block1);

			if (vy >= 6) {
				this.placeBlock(random, new BlockPos(x + 2, vy, z), Blocks.ladder.getDefaultState());
			}
		}
		for (int vx = -2; vx <= 2; vx++) {
			for (int vz = -2; vz <= 2; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, 5, z + vz), this.block1);
			}
		}
		this.addChestWithCustomItemsLoot(this.world, random, x, 6, z, this.items);

		this.addMobSpawner(this.world, x, 7, z, "CaveSpider");

		for (int vx = -2; vx < 3; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, 6, z), this.block1);
		}

		this.addMobSpawner(this.world, x, 27, z, "CaveSpider");

		for (int vx = -2; vx < 3; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, 26, z), this.block1);
		}

		this.addMobSpawner(this.world, x, 47, z, "CaveSpider");

		for (int vx = -2; vx < 3; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, 46, z), this.block1);
		}

		this.addMobSpawner(this.world, x, 67, z, "CaveSpider");
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(3)));
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
