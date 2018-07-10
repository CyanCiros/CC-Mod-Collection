package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorGraveyard extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	@SuppressWarnings("unused")
	private final IBlockState block2;
	private final IBlockState block3;
	private final IBlockState block4;
	private final IBlockState block5;
	private final IBlockState block6;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorGraveyard(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
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
		for (int vx = -6; vx <= 6; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				for (int vz = -6; vz <= 6; vz++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vx = -5; vx <= 5; vx++) {
			for (int vz = -5; vz <= 5; vz++) {
				this.world.setBlockState(new BlockPos(x + vx, y - 1, z + vz), this.block1);
			}
		}
		// for (int vx = -6; vx <= 6; vx++) {
		// for (int vz = -6; vz <= 6; vz++) {
		// for (int vy = y - 2; vy >= 0; vy--) {
		// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz))) {
		// this.world.setBlockState(new BlockPos(x + vx, vy, z + vz),
		// this.block2);
		// } else {
		// break;
		// }
		// }
		// }
		// }
		for (int vx = -6; vx <= 6; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y - 1, z + 6), this.block3);
			this.placeBlock(random, new BlockPos(x + vx, y - 1, z - 6), this.block3);

			if (vx == -6 || vx == -1 || vx == 1 || vx == 6) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + 6), this.block3);
				this.placeBlock(random, new BlockPos(x + vx, y, z - 6), this.block3);
				this.placeBlock(random, new BlockPos(x + vx, y + 1, z + 6), this.block3);
				this.placeBlock(random, new BlockPos(x + vx, y + 1, z - 6), this.block3);
			} else if (vx != 0) {
				this.world.setBlockState(new BlockPos(x + vx, y, z + 6), this.block4);
				this.world.setBlockState(new BlockPos(x + vx, y, z - 6), this.block4);
				this.world.setBlockState(new BlockPos(x + vx, y + 1, z + 6), this.block4);
				this.world.setBlockState(new BlockPos(x + vx, y + 1, z - 6), this.block4);
			}

			this.placeBlock(random, new BlockPos(x + vx, y + 2, z + 6), this.block3);
			this.placeBlock(random, new BlockPos(x + vx, y + 2, z - 6), this.block3);
		}
		for (int vz = -5; vz <= 5; vz++) {
			this.placeBlock(random, new BlockPos(x + 6, y - 1, z + vz), this.block3);
			this.placeBlock(random, new BlockPos(x - 6, y - 1, z + vz), this.block3);

			if (vz == -1 || vz == 1) {
				this.placeBlock(random, new BlockPos(x + 6, y, z + vz), this.block3);
				this.placeBlock(random, new BlockPos(x - 6, y, z + vz), this.block3);
				this.placeBlock(random, new BlockPos(x + 6, y + 1, z + vz), this.block3);
				this.placeBlock(random, new BlockPos(x - 6, y + 1, z + vz), this.block3);
			} else if (vz != 0) {
				this.world.setBlockState(new BlockPos(x + 6, y, z + vz), this.block4);
				this.world.setBlockState(new BlockPos(x - 6, y, z + vz), this.block4);
				this.world.setBlockState(new BlockPos(x + 6, y + 1, z + vz), this.block4);
				this.world.setBlockState(new BlockPos(x - 6, y + 1, z + vz), this.block4);
			}

			this.placeBlock(random, new BlockPos(x + 6, y + 2, z + vz), this.block3);
			this.placeBlock(random, new BlockPos(x - 6, y + 2, z + vz), this.block3);
		}
		final ArrayList<Integer> ax = new ArrayList<Integer>();
		final ArrayList<Integer> az = new ArrayList<Integer>();

		for (int vx = -3; vx <= 2; vx += 5) {
			for (int vz = -4; vz <= 4; vz += 2) {
				ax.add(vx);
				az.add(vz);
			}
		}
		for (int g = 0; g <= 4 + random.nextInt(6); g++) {
			final int r = random.nextInt(ax.size());
			final int vx = x + ax.get(r);
			final int vz = z + az.get(r);

			ax.remove(r);
			az.remove(r);

			this.world.setBlockState(new BlockPos(vx - 1, y, vz), this.block6);
			this.world.setBlockState(new BlockPos(vx, y - 1, vz), this.block5);
			this.world.setBlockState(new BlockPos(vx + 1, y - 1, vz), this.block5);

			if (random.nextInt(4) == 0) {
				this.addMobSpawner(this.world, vx - 1, y - 1, vz, this.mobs.get(random.nextInt(this.mobs.size())));

			} else if (random.nextInt(4) == 0) {
				this.addChestWithCustomItemsLoot(this.world, random, vx - 1, y - 1, vz, this.items);
			}
		}
		for (int vx = -5; vx <= 5; vx++) {
			for (int vz = -5; vz <= 5; vz++) {
				if (this.getEquals(this.world, new BlockPos(x + vx, y - 1, z + vz), Blocks.grass)
						&& this.world.isAirBlock(new BlockPos(x + vx, y, z + vz)) && random.nextInt(6) == 0) {
					if (random.nextBoolean()) {
						this.world.setBlockState(new BlockPos(x + vx, y, z + vz), Blocks.tallgrass.getDefaultState());
					} else {
						this.world.setBlockState(new BlockPos(x + vx, y, z + vz),
								Blocks.yellow_flower.getDefaultState());
					}
				}
			}
		}
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() == Blocks.stonebrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(3)));
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
