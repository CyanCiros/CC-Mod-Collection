package cc_dungeon_pack.temple;

import java.util.ArrayList;
import java.util.Random;

import cc_dungeon_pack.generator.DungeonGenerator;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class TemplePQ2 extends DungeonGenerator {
	protected World world;

	protected ArrayList<IBlockState> blocks;

	protected IBlockState block1;
	protected IBlockState block2;
	protected IBlockState block3;
	protected IBlockState block4;
	protected IBlockState block5;
	protected IBlockState block6;
	protected IBlockState block7;
	protected IBlockState block8;
	protected IBlockState block9;
	protected IBlockState block10;
	protected IBlockState block11;
	protected IBlockState block12;

	protected ArrayList<String> mobs;

	protected ArrayList<ArrayList<Item>> items;

	public TemplePQ2(final World world, final ArrayList<IBlockState> blocks2, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.blocks = blocks2;

		this.block1 = blocks2.get(0);
		this.block2 = blocks2.get(1);
		this.block3 = blocks2.get(2);
		this.block4 = blocks2.get(3);
		this.block5 = blocks2.get(4);
		this.block6 = blocks2.get(5);
		this.block7 = blocks2.get(6);
		this.block8 = blocks2.get(7);
		this.block9 = blocks2.get(8);
		this.block10 = blocks2.get(9);
		this.block11 = blocks2.get(10);
		this.block12 = blocks2.get(11);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		final TemplePQ2Part1 part1 = new TemplePQ2Part1(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part2 part2 = new TemplePQ2Part2(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part3 part3 = new TemplePQ2Part3(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part4 part4 = new TemplePQ2Part4(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part5 part5 = new TemplePQ2Part5(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part6 part6 = new TemplePQ2Part6(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part7 part7 = new TemplePQ2Part7(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part8 part8 = new TemplePQ2Part8(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part9 part9 = new TemplePQ2Part9(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part10 part10 = new TemplePQ2Part10(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part11 part11 = new TemplePQ2Part11(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part12 part12 = new TemplePQ2Part12(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part13 part13 = new TemplePQ2Part13(this.world, this.blocks, this.mobs, this.items);
		final TemplePQ2Part14 part14 = new TemplePQ2Part14(this.world, this.blocks, this.mobs, this.items);

		part1.generate(random, x, y, z);
		part2.generate(random, x, y, z);
		part3.generate(random, x, y, z);
		part4.generate(random, x, y, z);
		part5.generate(random, x, y, z);
		part6.generate(random, x, y, z);
		part7.generate(random, x, y, z);
		part8.generate(random, x, y, z);
		part9.generate(random, x, y, z);
		part10.generate(random, x, y, z);
		part11.generate(random, x, y, z);
		part12.generate(random, x, y, z);
		part13.generate(random, x, y, z);
		part14.generate(random, x, y, z);

		this.addMobSpawner(this.world, x + 10, y + 25, z + 6, this.mobs.get(random.nextInt(this.mobs.size())));
		this.addMobSpawner(this.world, x + 10, y + 25, z + 15, this.mobs.get(random.nextInt(this.mobs.size())));
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(3)));
		} else if (state.getBlock() instanceof BlockTorch) {
			System.out.println(state.getBlock().getUnlocalizedName());
			this.placeBlockTorch(this.world, random, pos, state.getBlock());
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
