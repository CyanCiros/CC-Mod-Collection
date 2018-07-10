package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockLadder;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DungeonGeneratorIgloo extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;
	private final IBlockState block3;
	private final IBlockState block4;
	private final IBlockState block5;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorIgloo(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);
		this.block4 = blocks.get(3);
		this.block5 = blocks.get(4);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		for (int vx = 0; vx <= 16; vx++) {
			for (int vy = 0; vy <= 16; vy++) {
				for (int vz = 0; vz <= 7; vz++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vz, z + vy));
				}
			}
		}
		for (int vy = 0; vy <= 3; vy++) {
			for (int vz = 6; vz <= 11; vz++) {
				this.world.setBlockState(new BlockPos(x, y + vy, z + vz), this.block1);
			}
		}
		for (int vz = 5; vz <= 12; vz++) {
			this.world.setBlockState(new BlockPos(x + 1, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 1, y + 1, z + 5), this.block1);
		this.addChestWithCustomItemsLoot(this.world, random, x + 1, y + 1, z + 7, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 1, y + 1, z + 8, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 1, y + 1, z + 10, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 1, y + 1, z + 11, this.items);
		this.world.setBlockState(new BlockPos(x + 1, y + 1, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 1, y + 2, z + 5), this.block1);
		this.addChestWithCustomItemsLoot(this.world, random, x + 1, y + 2, z + 7, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 1, y + 2, z + 8, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 1, y + 2, z + 10, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 1, y + 2, z + 11, this.items);
		this.world.setBlockState(new BlockPos(x + 1, y + 2, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 1, y + 3, z + 5), this.block1);

		this.world.setBlockState(new BlockPos(x + 1, y + 3, z + 12), this.block1);

		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 1, y + 4, z + vz), this.block1);
		}
		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 2, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 2, y + 1, z + 4), this.block1);
		this.addChestWithCustomItemsLoot(this.world, random, x + 2, y + 1, z + 5, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 2, y + 1, z + 12, this.items);
		this.world.setBlockState(new BlockPos(x + 2, y + 1, z + 13), this.block1);

		this.world.setBlockState(new BlockPos(x + 2, y + 2, z + 4), this.block1);
		this.world.setBlockState(new BlockPos(x + 2, y + 2, z + 13), this.block1);

		this.world.setBlockState(new BlockPos(x + 2, y + 3, z + 4), this.block1);
		this.world.setBlockState(new BlockPos(x + 2, y + 3, z + 13), this.block1);

		this.world.setBlockState(new BlockPos(x + 2, y + 4, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 2, y + 4, z + 12), this.block1);

		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 2, y + 5, z + vz), this.block1);
		}
		for (int vz = 3; vz <= 14; vz++) {
			this.world.setBlockState(new BlockPos(x + 3, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 3, y + 1, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 1, z + 4), this.block1);
		this.addChestWithCustomItemsLoot(this.world, random, x + 3, y + 1, z + 5, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 3, y + 1, z + 12, this.items);
		this.world.setBlockState(new BlockPos(x + 3, y + 1, z + 13), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 1, z + 14), this.block1);

		this.world.setBlockState(new BlockPos(x + 3, y + 2, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 2, z + 4), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 2, z + 13), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 2, z + 14), this.block1);

		this.world.setBlockState(new BlockPos(x + 3, y + 3, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 3, z + 4), this.block1);
		this.addChestWithCustomItemsLoot(this.world, random, x + 3, y + 2, z + 5, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 3, y + 2, z + 12, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 2, y + 2, z + 5, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 2, y + 2, z + 12, this.items);
		this.world.setBlockState(new BlockPos(x + 3, y + 3, z + 13), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 3, z + 14), this.block1);

		this.world.setBlockState(new BlockPos(x + 3, y + 4, z + 4), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 4, z + 13), this.block1);

		this.world.setBlockState(new BlockPos(x + 3, y + 5, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 5, z + 12), this.block1);

		this.world.setBlockState(new BlockPos(x + 3, y + 6, z + 6), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 6, z + 7), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 6, z + 8), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 6, z + 9), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 6, z + 10), this.block1);
		this.world.setBlockState(new BlockPos(x + 3, y + 6, z + 11), this.block1);

		for (int vz = 2; vz <= 15; vz++) {
			this.world.setBlockState(new BlockPos(x + 4, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 4, y + 1, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 1, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 1, z + 6), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 1, z + 8), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 1, z + 9), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 1, z + 10), this.block1);
		this.addMobSpawner(this.world, x + 4, y + 1, z + 11, this.mobs.get(random.nextInt(this.mobs.size())));
		this.world.setBlockState(new BlockPos(x + 4, y + 1, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 1, z + 15), this.block1);

		this.world.setBlockState(new BlockPos(x + 4, y + 2, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 2, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 2, z + 6), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 2, z + 8), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 2, z + 9), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 2, z + 10), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 2, z + 11), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 2, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 2, z + 15), this.block1);

		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 6), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 7), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 8), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 9), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 10), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 11), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 3, z + 15), this.block1);

		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 6), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 7), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 8), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 9), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 10), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 11), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 14), this.block1);

		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 4, y + 5, z + vz), this.block1);
		}
		for (int vz = 5; vz <= 12; vz++) {
			this.world.setBlockState(new BlockPos(x + 4, y + 6, z + vz), this.block1);
		}
		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 4, y + 7, z + vz), this.block1);
		}
		for (int vz = 1; vz <= 16; vz++) {
			this.world.setBlockState(new BlockPos(x + 5, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 5, y + 1, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 1, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 2, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 2, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 3, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 3, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 4, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 4, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 5, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 5, z + 14), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 6, z + 4), this.block1);
		this.world.setBlockState(new BlockPos(x + 5, y + 6, z + 13), this.block1);

		for (int vz = 5; vz <= 12; vz++) {
			this.world.setBlockState(new BlockPos(x + 5, y + 7, z + vz), this.block1);
		}
		for (int vz = 0; vz <= 17; vz++) {
			this.world.setBlockState(new BlockPos(x + 6, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 6, y + 1, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 1, z + 16), this.block3);
		this.world.setBlockState(new BlockPos(x + 6, y + 1, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 2, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 2, z + 16), this.block3);
		this.world.setBlockState(new BlockPos(x + 6, y + 2, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 3, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 3, z + 16), this.block4);
		this.world.setBlockState(new BlockPos(x + 6, y + 3, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 4, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 4, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 5, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 5, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 6, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 6, y + 6, z + 14), this.block1);

		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 6, y + 7, z + vz), this.block1);
		}
		for (int vz = 0; vz <= 17; vz++) {
			this.world.setBlockState(new BlockPos(x + 7, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 7, y + 1, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 1, z + 10), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 7, y + 1, z + 11), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 7, y + 1, z + 12), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 7, y + 1, z + 13), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 7, y + 1, z + 14), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 7, y + 1, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 2, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 2, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 3, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 3, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 4, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 4, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 5, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 5, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 6, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 7, y + 6, z + 14), this.block1);

		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 7, y + 7, z + vz), this.block1);
		}
		for (int vz = 0; vz <= 17; vz++) {
			this.world.setBlockState(new BlockPos(x + 8, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 8, y + 1, z + 10), this.block3);
		this.world.setBlockState(new BlockPos(x + 8, y + 1, z + 11), this.block3);
		this.world.setBlockState(new BlockPos(x + 8, y + 1, z + 12), this.block3);
		this.world.setBlockState(new BlockPos(x + 8, y + 1, z + 13), this.block3);
		this.world.setBlockState(new BlockPos(x + 8, y + 1, z + 14), this.block3);
		this.world.setBlockState(new BlockPos(x + 8, y + 1, z + 17), this.block1);

		this.world.setBlockState(new BlockPos(x + 8, y + 2, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 8, y + 3, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 8, y + 3, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 8, y + 4, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 8, y + 4, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 8, y + 5, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 8, y + 5, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 8, y + 6, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 8, y + 6, z + 14), this.block1);

		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 8, y + 7, z + vz), this.block1);
		}
		for (int vz = 0; vz <= 17; vz++) {
			this.world.setBlockState(new BlockPos(x + 9, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 10), this.block3);
		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 11), this.block3);
		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 12), this.block3);
		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 13), this.block3);
		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 14), this.block3);
		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 17), this.block1);

		this.world.setBlockState(new BlockPos(x + 9, y + 2, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 9, y + 3, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 9, y + 3, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 9, y + 4, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 9, y + 4, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 9, y + 5, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 9, y + 5, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 9, y + 6, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 9, y + 6, z + 14), this.block1);

		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 9, y + 7, z + vz), this.block1);
		}
		for (int vz = 0; vz <= 17; vz++) {
			this.world.setBlockState(new BlockPos(x + 10, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 10), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 11), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 12), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 13), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 14), Blocks.stone_slab.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 2, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 2, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 3, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 3, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 4, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 4, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 5, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 5, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 6, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 10, y + 6, z + 14), this.block1);

		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 10, y + 7, z + vz), this.block1);
		}
		for (int vz = 0; vz <= 17; vz++) {
			this.world.setBlockState(new BlockPos(x + 11, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 11, y + 1, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 1, z + 16), this.block3);
		this.world.setBlockState(new BlockPos(x + 11, y + 1, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 2, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 2, z + 16), this.block3);
		this.world.setBlockState(new BlockPos(x + 11, y + 2, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 3, z + 0), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 3, z + 16), this.block4);
		this.world.setBlockState(new BlockPos(x + 11, y + 3, z + 17), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 4, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 4, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 5, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 5, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 6, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 11, y + 6, z + 14), this.block1);

		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 11, y + 7, z + vz), this.block1);
		}
		for (int vz = 1; vz <= 16; vz++) {
			this.world.setBlockState(new BlockPos(x + 12, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 12, y + 1, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 1, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 2, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 2, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 3, z + 1), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 3, z + 16), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 4, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 4, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 5, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 5, z + 14), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 6, z + 4), this.block1);
		this.world.setBlockState(new BlockPos(x + 12, y + 6, z + 13), this.block1);

		for (int vz = 5; vz <= 12; vz++) {
			this.world.setBlockState(new BlockPos(x + 12, y + 7, z + vz), this.block1);
		}
		for (int vz = 2; vz <= 15; vz++) {
			this.world.setBlockState(new BlockPos(x + 13, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 13, y + 1, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 1, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 2, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 2, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 3, z + 2), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 3, z + 15), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 4, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 4, z + 14), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 5, z + 4), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 5, z + 13), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 6, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 13, y + 6, z + 12), this.block1);

		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 13, y + 7, z + vz), this.block1);
		}
		for (int vz = 3; vz <= 14; vz++) {
			this.world.setBlockState(new BlockPos(x + 14, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 14, y + 1, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 1, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 1, z + 6), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 1, z + 8), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 1, z + 9), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 1, z + 10), this.block1);
		this.addMobSpawner(this.world, x + 14, y + 1, z + 11, this.mobs.get(random.nextInt(this.mobs.size())));
		this.world.setBlockState(new BlockPos(x + 14, y + 1, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 1, z + 14), this.block1);

		this.world.setBlockState(new BlockPos(x + 14, y + 2, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 2, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 2, z + 6), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 2, z + 8), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 2, z + 9), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 2, z + 10), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 2, z + 11), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 2, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 2, z + 14), this.block1);

		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 3), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 6), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 7), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 8), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 9), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 10), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 11), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 14, y + 3, z + 14), this.block1);

		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 14, y + 4, z + vz), this.block1);
		}
		for (int vz = 5; vz <= 12; vz++) {
			this.world.setBlockState(new BlockPos(x + 14, y + 5, z + vz), this.block1);
		}
		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 14, y + 6, z + vz), this.block1);
		}
		for (int vz = 4; vz <= 13; vz++) {
			this.world.setBlockState(new BlockPos(x + 15, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 15, y + 1, z + 4), this.block1);
		this.addChestWithCustomItemsLoot(this.world, random, x + 15, y + 1, z + 5, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 15, y + 1, z + 12, this.items);
		this.world.setBlockState(new BlockPos(x + 15, y + 1, z + 13), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 2, z + 4), this.block1);
		this.addChestWithCustomItemsLoot(this.world, random, x + 15, y + 2, z + 5, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 15, y + 2, z + 12, this.items);
		this.world.setBlockState(new BlockPos(x + 15, y + 2, z + 13), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 3, z + 4), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 3, z + 13), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 4, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 4, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 5, z + 6), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 5, z + 7), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 5, z + 8), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 5, z + 9), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 5, z + 10), this.block1);
		this.world.setBlockState(new BlockPos(x + 15, y + 5, z + 11), this.block1);

		for (int vz = 5; vz <= 12; vz++) {
			this.world.setBlockState(new BlockPos(x + 16, y, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 16, y + 1, z + 5), this.block1);
		this.addChestWithCustomItemsLoot(this.world, random, x + 16, y + 1, z + 6, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 16, y + 1, z + 8, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 16, y + 1, z + 10, this.items);
		this.world.setBlockState(new BlockPos(x + 16, y + 1, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 16, y + 2, z + 5), this.block1);
		this.addChestWithCustomItemsLoot(this.world, random, x + 16, y + 2, z + 6, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 16, y + 2, z + 8, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 16, y + 2, z + 10, this.items);
		this.world.setBlockState(new BlockPos(x + 16, y + 2, z + 12), this.block1);
		this.world.setBlockState(new BlockPos(x + 16, y + 3, z + 5), this.block1);
		this.world.setBlockState(new BlockPos(x + 16, y + 3, z + 12), this.block1);

		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 16, y + 4, z + vz), this.block1);
		}
		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 17, y, z + vz), this.block1);
		}
		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 17, y + 1, z + vz), this.block1);
		}
		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 17, y + 2, z + vz), this.block1);
		}
		for (int vz = 6; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 17, y + 3, z + vz), this.block1);
		}

		this.world.setBlockState(new BlockPos(x + 1, y + 1, z + 6),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.world.setBlockState(new BlockPos(x + 1, y + 1, z + 9),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.world.setBlockState(new BlockPos(x + 1, y + 2, z + 6),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.world.setBlockState(new BlockPos(x + 1, y + 2, z + 9),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));

		this.world.setBlockState(new BlockPos(x + 5, y + 1, z + 5), this.block2);
		this.world.setBlockState(new BlockPos(x + 7, y + 1, z + 4), this.block2);

		for (int vz = 10; vz <= 14; vz++) {
			this.world.setBlockState(new BlockPos(x + 8, y + 2, z + vz), this.block5);
		}

		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 1), this.block2);
		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 4), this.block2);
		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 5), this.block2);
		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 7), this.block2);
		this.world.setBlockState(new BlockPos(x + 9, y + 1, z + 15), this.block2);
		this.world.setBlockState(new BlockPos(x + 9, y + 2, z + 10), this.block5);

		for (int vz = 11; vz <= 14; vz++) {
			this.world.setBlockState(new BlockPos(x + 9, y + 2, z + vz), this.block5);
		}

		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 2), this.block2);
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 3), this.block2);
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 7), this.block2);
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 9), this.block2);
		this.world.setBlockState(new BlockPos(x + 11, y + 1, z + 7), this.block2);
		this.world.setBlockState(new BlockPos(x + 11, y + 1, z + 10), this.block2);
		this.world.setBlockState(new BlockPos(x + 11, y + 1, z + 11), this.block2);
		this.world.setBlockState(new BlockPos(x + 11, y + 1, z + 12), this.block2);
		this.world.setBlockState(new BlockPos(x + 11, y + 1, z + 13), this.block2);
		this.world.setBlockState(new BlockPos(x + 11, y + 1, z + 14), this.block2);
		this.world.setBlockState(new BlockPos(x + 12, y + 1, z + 13), this.block2);

		this.world.setBlockState(new BlockPos(x + 16, y + 1, z + 7),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 16, y + 1, z + 9),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 16, y + 1, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 16, y + 2, z + 7),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 16, y + 2, z + 9),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 16, y + 2, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
	}
}
