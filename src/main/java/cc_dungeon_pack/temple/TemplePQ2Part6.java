package cc_dungeon_pack.temple;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class TemplePQ2Part6 extends TemplePQ2 {
	public TemplePQ2Part6(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, mobs, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlock(random, new BlockPos(x + 7, y + 17, z + 16), this.block7);
		this.placeBlock(random, new BlockPos(x + 7, y + 17, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 18, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 18, z + 5), this.block8);

		this.placeBlock(random, new BlockPos(x + 7, y + 18, z + 16), this.block8);
		this.placeBlock(random, new BlockPos(x + 7, y + 18, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 19, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 19, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 20, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 20, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 21, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 21, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 22, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 22, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 23, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 23, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 24, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 25, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 25, z + 7), this.block7);

		this.placeBlock(random, new BlockPos(x + 7, y + 25, z + 14), this.block7);
		this.placeBlock(random, new BlockPos(x + 7, y + 25, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 26, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 26, z + 7), this.block8);

		this.placeBlock(random, new BlockPos(x + 7, y + 26, z + 14), this.block8);
		this.placeBlock(random, new BlockPos(x + 7, y + 26, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 27, z + 6), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 27, z + 14), this.block6);
		this.placeBlock(random, new BlockPos(x + 7, y + 27, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 28, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 28, z + 7), this.block3);

		this.placeBlock(random, new BlockPos(x + 7, y + 28, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 29, z + 6), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 29, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 30, z + 6), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 30, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 31, z + 6), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 31, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 32, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 32, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 32, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 32, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 32, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 32, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 32, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 32, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 33, z + 8), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 33, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 34, z + 8), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 34, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 35, z + 8), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 35, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 36, z + 8), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 36, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 37, z + 8), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 37, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 38, z + 8), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 38, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 39, z + 8), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 39, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 40, z + 8), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 40, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 41, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 41, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 41, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 41, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 42, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 42, z + 10), this.block9);
		this.placeBlock(random, new BlockPos(x + 7, y + 42, z + 11), this.block9);
		this.placeBlock(random, new BlockPos(x + 7, y + 42, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 43, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 43, z + 10), this.block9);
		this.placeBlock(random, new BlockPos(x + 7, y + 43, z + 11), this.block9);
		this.placeBlock(random, new BlockPos(x + 7, y + 43, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 7, y + 44, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 44, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 44, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 7, y + 44, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 0), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 1), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 2), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 18), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 19), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 20), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 0, z + 21), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 1, z + 0), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 1, z + 21), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 2, z + 0), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 2, z + 21), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 3, z + 0), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 3, z + 21), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 4, z + 0), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 4, z + 21), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 5, z + 0), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 5, z + 21), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 6, z + 0), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 6, z + 21), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 7, z + 0), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 7, z + 21), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 1), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 2), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 18), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 19), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 8, z + 20), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 9, z + 1), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 9, z + 20), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 10, z + 1), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 10, z + 12), this.block4);

		this.placeBlock(random, new BlockPos(x + 8, y + 10, z + 20), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 11, z + 1), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 11, z + 20), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 12, z + 1), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 12, z + 20), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 13, z + 1), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 13, z + 20), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 14, z + 1), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 14, z + 20), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 15, z + 1), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 15, z + 20), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 2), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 18), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 16, z + 19), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 17, z + 3), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 17, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 18, z + 3), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 18, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 19, z + 3), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 19, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 20, z + 3), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 20, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 21, z + 3), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 21, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 22, z + 3), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 22, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 23, z + 3), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 23, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 24, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 25, z + 5), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 25, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 26, z + 5), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 26, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 27, z + 5), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 27, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 28, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 28, z + 6), this.block6);

		this.placeBlock(random, new BlockPos(x + 8, y + 28, z + 15), this.block3);
		this.placeBlock(random, new BlockPos(x + 8, y + 28, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 29, z + 5), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 29, z + 9), this.block6);

		this.placeBlock(random, new BlockPos(x + 8, y + 29, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 30, z + 5), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 30, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 31, z + 5), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 31, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 32, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 33, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 33, z + 8), this.block7);

		this.placeBlock(random, new BlockPos(x + 8, y + 33, z + 13), this.block7);
		this.placeBlock(random, new BlockPos(x + 8, y + 33, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 34, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 8, y + 34, z + 8), this.block8);

		this.placeBlock(random, new BlockPos(x + 8, y + 34, z + 13), this.block8);
		this.placeBlock(random, new BlockPos(x + 8, y + 34, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 35, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 35, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 36, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 36, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 37, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 37, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 38, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 38, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 39, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 8, y + 39, z + 14), this.block1);
	}
}
