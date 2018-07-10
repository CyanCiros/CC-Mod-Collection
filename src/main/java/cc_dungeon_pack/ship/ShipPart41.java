package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockLadder;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ShipPart41 extends Ship {
	public ShipPart41(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 62, y + 27, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 62, y + 27, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 62, y + 43, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 62, y + 43, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 62, y + 55, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 62, y + 55, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 62, y + 71, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 62, y + 71, z + 17), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 63, y + 18, z + 15), this.block10.getBlock());

		this.world.setBlockState(new BlockPos(x + 63, y + 21, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 22, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));

		this.placeBlockTorch(this.world, random, new BlockPos(x + 63, y + 23, z + 14), this.block10.getBlock());

		this.world.setBlockState(new BlockPos(x + 63, y + 23, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));

		this.placeBlockTorch(this.world, random, new BlockPos(x + 63, y + 23, z + 16), this.block10.getBlock());

		this.world.setBlockState(new BlockPos(x + 63, y + 24, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 25, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 26, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 27, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 28, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 29, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 30, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 31, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 32, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 33, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 34, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 35, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 36, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 37, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 38, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 39, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 40, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 41, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 42, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 43, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 44, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 45, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 46, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 47, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 48, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 49, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 50, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 51, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 52, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 53, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 54, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 55, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 56, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 57, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 58, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 59, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 60, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 61, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 62, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 63, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 64, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 65, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 66, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 67, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 68, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 69, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 70, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 63, y + 71, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));

		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 18, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 23, z + 14), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 23, z + 16), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 27, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 27, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 43, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 43, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 55, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 55, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 71, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 65, y + 71, z + 17), this.block10.getBlock());
	}
}
