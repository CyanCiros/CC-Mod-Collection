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

public class DungeonGeneratorSpiderBox extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorSpiderBox(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = -4; vz <= 4; vz++) {
				for (int vy = -6; vy <= -2; vy++) {
					if (!(vx >= -3 && vx <= 3 && vz >= -3 && vz <= 3 && vy >= -5 && vy <= -3)) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
					} else if (random.nextInt(4) == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block2);
					} else {
						this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
					}
				}
			}
		}
		for (int vy = -2; vy <= 1; vy++) {
			for (int vx = -1; vx <= 1; vx++) {
				for (int vz = -1; vz <= 1; vz++) {
					if (vz == 0 && vx == 0) {
						this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
					} else {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
					}
				}
			}
		}
		for (int vx = -3; vx <= 3; vx++) {
			for (int vz = -3; vz <= 3; vz++) {
				if (!(vx == 0 && vz == 0) && this.world.isAirBlock(new BlockPos(x + vx, y - 1, z + vz))) {
					this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block1);
				}
			}
		}
		for (int vx = -2; vx <= 2; vx++) {
			for (int vz = -2; vz <= 2; vz++) {
				if (!(vx == 0 && vz == 0) && this.world.isAirBlock(new BlockPos(x + vx, y, z + vz))) {
					this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block1);
				}
			}
		}

		this.addMobSpawner(this.world, x - 3, y - 5, z + 3, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 3, y - 5, z - 3, this.mobs.get(random.nextInt(this.mobs.size())));

		this.addChestWithCustomItemsLoot(this.world, random, x + 3, y - 5, z + 3, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x - 3, y - 5, z - 3, this.items);
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
