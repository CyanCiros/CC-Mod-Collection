package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import cc_dungeon_pack.generator.DungeonGenerator;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Ship extends DungeonGenerator {
	protected final World world;

	private final ArrayList<IBlockState> blocks;

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

	protected ArrayList<ArrayList<Item>> items;

	public Ship(final World world, final ArrayList<IBlockState> blocks2, final ArrayList<ArrayList<Item>> items) {
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

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		final int sy = y - 20;

		final ShipPart1 part1 = new ShipPart1(this.world, this.blocks, this.items);
		final ShipPart2 part2 = new ShipPart2(this.world, this.blocks, this.items);
		final ShipPart3 part3 = new ShipPart3(this.world, this.blocks, this.items);
		final ShipPart4 part4 = new ShipPart4(this.world, this.blocks, this.items);
		final ShipPart5 part5 = new ShipPart5(this.world, this.blocks, this.items);
		final ShipPart6 part6 = new ShipPart6(this.world, this.blocks, this.items);
		final ShipPart7 part7 = new ShipPart7(this.world, this.blocks, this.items);
		final ShipPart8 part8 = new ShipPart8(this.world, this.blocks, this.items);
		final ShipPart9 part9 = new ShipPart9(this.world, this.blocks, this.items);
		final ShipPart10 part10 = new ShipPart10(this.world, this.blocks, this.items);
		final ShipPart11 part11 = new ShipPart11(this.world, this.blocks, this.items);
		final ShipPart12 part12 = new ShipPart12(this.world, this.blocks, this.items);
		final ShipPart13 part13 = new ShipPart13(this.world, this.blocks, this.items);
		final ShipPart14 part14 = new ShipPart14(this.world, this.blocks, this.items);
		final ShipPart15 part15 = new ShipPart15(this.world, this.blocks, this.items);
		final ShipPart16 part16 = new ShipPart16(this.world, this.blocks, this.items);
		final ShipPart17 part17 = new ShipPart17(this.world, this.blocks, this.items);
		final ShipPart18 part18 = new ShipPart18(this.world, this.blocks, this.items);
		final ShipPart19 part19 = new ShipPart19(this.world, this.blocks, this.items);
		final ShipPart20 part20 = new ShipPart20(this.world, this.blocks, this.items);
		final ShipPart21 part21 = new ShipPart21(this.world, this.blocks, this.items);
		final ShipPart22 part22 = new ShipPart22(this.world, this.blocks, this.items);
		final ShipPart23 part23 = new ShipPart23(this.world, this.blocks, this.items);
		final ShipPart24 part24 = new ShipPart24(this.world, this.blocks, this.items);
		final ShipPart25 part25 = new ShipPart25(this.world, this.blocks, this.items);
		final ShipPart26 part26 = new ShipPart26(this.world, this.blocks, this.items);
		final ShipPart27 part27 = new ShipPart27(this.world, this.blocks, this.items);
		final ShipPart28 part28 = new ShipPart28(this.world, this.blocks, this.items);
		final ShipPart29 part29 = new ShipPart29(this.world, this.blocks, this.items);
		final ShipPart30 part30 = new ShipPart30(this.world, this.blocks, this.items);
		final ShipPart31 part31 = new ShipPart31(this.world, this.blocks, this.items);
		final ShipPart32 part32 = new ShipPart32(this.world, this.blocks, this.items);
		final ShipPart33 part33 = new ShipPart33(this.world, this.blocks, this.items);
		final ShipPart34 part34 = new ShipPart34(this.world, this.blocks, this.items);
		final ShipPart35 part35 = new ShipPart35(this.world, this.blocks, this.items);
		final ShipPart36 part36 = new ShipPart36(this.world, this.blocks, this.items);
		final ShipPart37 part37 = new ShipPart37(this.world, this.blocks, this.items);
		final ShipPart38 part38 = new ShipPart38(this.world, this.blocks, this.items);
		final ShipPart39 part39 = new ShipPart39(this.world, this.blocks, this.items);
		final ShipPart40 part40 = new ShipPart40(this.world, this.blocks, this.items);
		final ShipPart41 part41 = new ShipPart41(this.world, this.blocks, this.items);
		final ShipPart42 part42 = new ShipPart42(this.world, this.blocks, this.items);
		final ShipPart43 part43 = new ShipPart43(this.world, this.blocks, this.items);
		final ShipPart44 part44 = new ShipPart44(this.world, this.blocks, this.items);
		final ShipPart45 part45 = new ShipPart45(this.world, this.blocks, this.items);
		final ShipPart46 part46 = new ShipPart46(this.world, this.blocks, this.items);
		final ShipPart47 part47 = new ShipPart47(this.world, this.blocks, this.items);
		final ShipPart48 part48 = new ShipPart48(this.world, this.blocks, this.items);
		final ShipPart49 part49 = new ShipPart49(this.world, this.blocks, this.items);
		final ShipPart50 part50 = new ShipPart50(this.world, this.blocks, this.items);
		final ShipPart51 part51 = new ShipPart51(this.world, this.blocks, this.items);
		final ShipPart52 part52 = new ShipPart52(this.world, this.blocks, this.items);
		final ShipPart53 part53 = new ShipPart53(this.world, this.blocks, this.items);
		final ShipPart54 part54 = new ShipPart54(this.world, this.blocks, this.items);
		final ShipPart55 part55 = new ShipPart55(this.world, this.blocks, this.items);
		final ShipPart56 part56 = new ShipPart56(this.world, this.blocks, this.items);
		final ShipPart57 part57 = new ShipPart57(this.world, this.blocks, this.items);

		part1.generate(random, x, sy, z);
		part2.generate(random, x, sy, z);
		part3.generate(random, x, sy, z);
		part4.generate(random, x, sy, z);
		part5.generate(random, x, sy, z);
		part6.generate(random, x, sy, z);
		part7.generate(random, x, sy, z);
		part8.generate(random, x, sy, z);
		part9.generate(random, x, sy, z);
		part10.generate(random, x, sy, z);
		part11.generate(random, x, sy, z);
		part12.generate(random, x, sy, z);
		part13.generate(random, x, sy, z);
		part14.generate(random, x, sy, z);
		part15.generate(random, x, sy, z);
		part16.generate(random, x, sy, z);
		part17.generate(random, x, sy, z);
		part18.generate(random, x, sy, z);
		part19.generate(random, x, sy, z);
		part20.generate(random, x, sy, z);
		part21.generate(random, x, sy, z);
		part22.generate(random, x, sy, z);
		part23.generate(random, x, sy, z);
		part24.generate(random, x, sy, z);
		part25.generate(random, x, sy, z);
		part26.generate(random, x, sy, z);
		part27.generate(random, x, sy, z);
		part28.generate(random, x, sy, z);
		part29.generate(random, x, sy, z);
		part30.generate(random, x, sy, z);
		part31.generate(random, x, sy, z);
		part32.generate(random, x, sy, z);
		part33.generate(random, x, sy, z);
		part34.generate(random, x, sy, z);
		part35.generate(random, x, sy, z);
		part36.generate(random, x, sy, z);
		part37.generate(random, x, sy, z);
		part38.generate(random, x, sy, z);
		part39.generate(random, x, sy, z);
		part40.generate(random, x, sy, z);
		part41.generate(random, x, sy, z);
		part42.generate(random, x, sy, z);
		part43.generate(random, x, sy, z);
		part44.generate(random, x, sy, z);
		part45.generate(random, x, sy, z);
		part46.generate(random, x, sy, z);
		part47.generate(random, x, sy, z);
		part48.generate(random, x, sy, z);
		part49.generate(random, x, sy, z);
		part50.generate(random, x, sy, z);
		part51.generate(random, x, sy, z);
		part52.generate(random, x, sy, z);
		part53.generate(random, x, sy, z);
		part54.generate(random, x, sy, z);
		part55.generate(random, x, sy, z);
		part56.generate(random, x, sy, z);
		part57.generate(random, x, sy, z);
	}
}
