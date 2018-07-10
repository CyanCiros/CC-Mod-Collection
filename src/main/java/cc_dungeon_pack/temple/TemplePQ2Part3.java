package cc_dungeon_pack.temple;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class TemplePQ2Part3 extends TemplePQ2 {
	public TemplePQ2Part3(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, mobs, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 0, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 2, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 5), this.block1);

		this.addChestWithCustomItemsLoot(this.world, random, x + 3, y + 3, z + 10, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 3, y + 3, z + 11, this.items);

		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 4, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 4, z + 5), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 4, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 4, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 5), this.block1);
		this.addDispenserAndInv(this.world, random, x + 3, y + 5, z + 6, Items.lava_bucket, 1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 14), this.block1);
		this.addDispenserAndInv(this.world, random, x + 3, y + 5, z + 15, Items.lava_bucket, 1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 5, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 7), this.block1);
		this.addDispenserAndInv(this.world, random, x + 3, y + 6, z + 8, Items.lava_bucket, 1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 12), this.block1);
		this.addDispenserAndInv(this.world, random, x + 3, y + 6, z + 13, Items.lava_bucket, 1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 6, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 8, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 8, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 8, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 8, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 9, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 9, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 9, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 9, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 10, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 10, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 10, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 10, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 11, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 11, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 11, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 11, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 12, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 12, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 12, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 12, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 13, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 13, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 13, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 13, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 14, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 14, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 14, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 14, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 15, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 15, z + 7), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 15, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 15, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 16, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 16, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 16, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 16, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 16, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 16, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 16, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 16, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 17, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 17, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 17, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 17, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 17, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 17, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 18, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 18, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 18, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 18, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 18, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 18, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 19, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 19, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 19, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 19, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 19, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 19, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 20, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 20, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 20, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 20, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 20, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 20, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 21, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 21, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 22, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 22, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 22, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 22, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 22, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 22, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 23, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 23, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 23, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 23, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 23, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 23, z + 13), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 24, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 24, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 24, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 24, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 25, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 25, z + 11), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 26, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 26, z + 11), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 27, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 27, z + 11), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 28, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 28, z + 11), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 29, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 29, z + 11), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 30, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 30, z + 11), this.block1);

		this.placeBlock(random, new BlockPos(x + 3, y + 31, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 3, y + 31, z + 11), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 16), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 0, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 4), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 4, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 4, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 4, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 4, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 5, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 5, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 5, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 5, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 6, z + 3), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 6, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 6, z + 17), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 6, z + 18), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 7, z + 4), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 7, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 7, z + 10), this.block2);
		this.placeBlock(random, new BlockPos(x + 4, y + 7, z + 11), this.block2);
		this.placeBlock(random, new BlockPos(x + 4, y + 7, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 7, z + 17), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 8, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 9, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 10, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 11, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 12, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 13, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 14, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 5), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 15), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 15, z + 16), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 6), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 14), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 16, z + 15), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 17, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 17, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 17, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 17, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 17, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 17, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 17, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 17, z + 14), this.block1);

		this.placeBlock(random, new BlockPos(x + 4, y + 18, z + 7), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 18, z + 8), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 18, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 18, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 18, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 18, z + 12), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 18, z + 13), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 18, z + 14), this.block1);
	}
}
