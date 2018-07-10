package cc_dungeon_pack.temple;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockLadder;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class TemplePQ2Part14 extends TemplePQ2 {
	public TemplePQ2Part14(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, mobs, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlock(random, new BlockPos(x + 9, y + 1, z + 19), this.block11);

		this.placeBlock(random, new BlockPos(x + 9, y + 2, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 9, y + 2, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 9, y + 3, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 9, y + 3, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 9, y + 4, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 9, y + 4, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 9, y + 5, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 9, y + 5, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 9, y + 6, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 9, y + 6, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 9, y + 7, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 9, y + 7, z + 19), this.block11);

		this.placeBlock(random, new BlockPos(x + 9, y + 8, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 9, y + 8, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 9, y + 12, z + 2), Blocks.stone_pressure_plate.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 9, y + 30, z + 9),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.placeBlock(random, new BlockPos(x + 9, y + 31, z + 9),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.placeBlock(random, new BlockPos(x + 9, y + 32, z + 9),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));

		this.placeBlock(random, new BlockPos(x + 10, y + 0, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 10, y + 0, z + 19), this.block11);

		this.placeBlock(random, new BlockPos(x + 10, y + 1, z + 2), this.block12);

		this.placeBlock(random, new BlockPos(x + 10, y + 1, z + 19), this.block11);

		this.placeBlock(random, new BlockPos(x + 10, y + 2, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 10, y + 2, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 10, y + 3, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 10, y + 3, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 10, y + 4, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 10, y + 4, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 10, y + 5, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 10, y + 5, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 10, y + 6, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 10, y + 6, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 10, y + 7, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 10, y + 7, z + 19), this.block11);

		this.placeBlock(random, new BlockPos(x + 10, y + 8, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 10, y + 8, z + 19), this.block11);

		this.placeBlock(random, new BlockPos(x + 10, y + 11, z + 2),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 10, y + 34, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.placeBlock(random, new BlockPos(x + 10, y + 38, z + 9),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));

		this.placeBlock(random, new BlockPos(x + 10, y + 39, z + 10),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.placeBlock(random, new BlockPos(x + 10, y + 39, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.placeBlock(random, new BlockPos(x + 10, y + 40, z + 10),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.placeBlock(random, new BlockPos(x + 10, y + 40, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));

		this.placeBlock(random, new BlockPos(x + 11, y + 12, z + 10), Blocks.stone_pressure_plate.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 13, y + 11, z + 6),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));

		this.placeBlock(random, new BlockPos(x + 13, y + 12, z + 5), Blocks.stone_pressure_plate.getDefaultState());
	}
}
