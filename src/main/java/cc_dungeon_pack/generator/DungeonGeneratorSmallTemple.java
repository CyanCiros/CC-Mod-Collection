package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorSmallTemple extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorSmallTemple(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		for (int vx = -5; vx <= 5; vx++) {
			for (int vz = -5; vz <= 5; vz++) {
				for (int vy = 1; vy <= 5; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}

		for (int vx = -6; vx <= 6; vx++) {
			for (int vz = -6; vz <= 6; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block1);
				if (!(vx >= -1 && vx <= 1 && vz == 6) && !(vx >= -1 && vx <= 1 && vz == 0)
						&& !(vz >= -1 && vz <= 1 && vx == 0)) {
					this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block1);
				} else {
					if (!(vz == 0 && vx == 0)) {
						this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block2);
					}
				}

				if (vx >= -5 && vx <= 5 && vz >= -5 && vz <= 5) {
					this.placeBlock(random, new BlockPos(x + vx, y + 6, z + vz), this.block1);
				}
			}
		}
		for (int vy = 1; vy <= 5; vy++) {
			this.placeBlock(random, new BlockPos(x + -2, y + vy, z + 6), this.block1);
			this.placeBlock(random, new BlockPos(x + -2, y + vy, z + 5), this.block1);
			this.placeBlock(random, new BlockPos(x + -2, y + vy, z + 4), this.block1);
			this.placeBlock(random, new BlockPos(x + -3, y + vy, z + 6), this.block1);
			this.placeBlock(random, new BlockPos(x + -3, y + vy, z + 5), this.block1);
			this.placeBlock(random, new BlockPos(x + -4, y + vy, z + 5), this.block1);
			this.placeBlock(random, new BlockPos(x + -5, y + vy, z + 5), this.block1);
			this.placeBlock(random, new BlockPos(x + -5, y + vy, z + 4), this.block1);
			this.placeBlock(random, new BlockPos(x + -6, y + vy, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x + -5, y + vy, z + 2), this.block1);
			this.placeBlock(random, new BlockPos(x + -6, y + vy, z + 1), this.block1);
			this.placeBlock(random, new BlockPos(x + -5, y + vy, z + 0), this.block1);
			this.placeBlock(random, new BlockPos(x + -6, y + vy, z + -1), this.block1);
			this.placeBlock(random, new BlockPos(x + -5, y + vy, z + -2), this.block1);
			this.placeBlock(random, new BlockPos(x + -6, y + vy, z + -3), this.block1);
			this.placeBlock(random, new BlockPos(x + -5, y + vy, z + -4), this.block1);
			this.placeBlock(random, new BlockPos(x + -5, y + vy, z + -5), this.block1);
			this.placeBlock(random, new BlockPos(x + -4, y + vy, z + -5), this.block1);
			this.placeBlock(random, new BlockPos(x + -3, y + vy, z + -6), this.block1);
			this.placeBlock(random, new BlockPos(x + -2, y + vy, z + -5), this.block1);
			this.placeBlock(random, new BlockPos(x + -1, y + vy, z + -6), this.block1);
			this.placeBlock(random, new BlockPos(x + 0, y + vy, z + -5), this.block1);
			this.placeBlock(random, new BlockPos(x + 1, y + vy, z + -6), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z + -5), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vy, z + -6), this.block1);
			this.placeBlock(random, new BlockPos(x + 4, y + vy, z + -5), this.block1);
			this.placeBlock(random, new BlockPos(x + 5, y + vy, z + -5), this.block1);
			this.placeBlock(random, new BlockPos(x + 5, y + vy, z + -4), this.block1);
			this.placeBlock(random, new BlockPos(x + 6, y + vy, z + -3), this.block1);
			this.placeBlock(random, new BlockPos(x + 5, y + vy, z + -2), this.block1);
			this.placeBlock(random, new BlockPos(x + 6, y + vy, z + -1), this.block1);
			this.placeBlock(random, new BlockPos(x + 5, y + vy, z + 0), this.block1);
			this.placeBlock(random, new BlockPos(x + 6, y + vy, z + 1), this.block1);
			this.placeBlock(random, new BlockPos(x + 5, y + vy, z + 2), this.block1);
			this.placeBlock(random, new BlockPos(x + 6, y + vy, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 5, y + vy, z + 4), this.block1);
			this.placeBlock(random, new BlockPos(x + 5, y + vy, z + 5), this.block1);
			this.placeBlock(random, new BlockPos(x + 4, y + vy, z + 5), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vy, z + 5), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vy, z + 6), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z + 4), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z + 5), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z + 6), this.block1);
		}
		for (int vx = -6; vx <= 6; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 5, z - 6), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 5, z + 6), this.block1);
		}
		for (int vz = -5; vz <= 5; vz++) {
			this.placeBlock(random, new BlockPos(x - 6, y + 5, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 6, y + 5, z + vz), this.block1);
		}
		for (int vx = -1; vx <= 1; vx++) {
			for (int vz = 5; vz <= 6; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 4, z + vz), this.block1);
			}
			this.placeBlock(random, new BlockPos(x + vx, y + 5, z + 4), this.block1);
		}
		this.placeBlock(random, new BlockPos(x + -1, y + 1, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 1, y + 1, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + -1, y + 3, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 1, y + 3, z + 5), this.block1);

		for (int vz = 7; vz <= 8; vz++) {
			this.placeBlock(random, new BlockPos(x - 2, y, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x - 2, y - 1, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y - 1, z + vz), this.block1);
		}

		this.addChestWithCustomItemsLoot(this.world, random, x, y, z, this.items);

		this.addMobSpawner(this.world, x + 2, y + 1, z + 2, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 2, y + 1, z - 2, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x - 2, y + 1, z - 2, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x - 2, y + 1, z + 2, this.mobs.get(random.nextInt(this.mobs.size())));
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(3)));
		} else if (state.getBlock() instanceof BlockSlab) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(3));
		} else if (state.getBlock() == Blocks.cobblestone) {
			if (random.nextBoolean()) {
				this.world.setBlockState(pos, state);
			} else {
				this.world.setBlockState(pos, Blocks.mossy_cobblestone.getDefaultState());
			}
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
