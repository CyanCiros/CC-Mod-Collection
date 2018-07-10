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

public class ShipPart36 extends Ship {
	public ShipPart36(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 5, y + 26, z + 9), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 5, y + 26, z + 21), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 8, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 8, y + 22, z + 24), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 12, y + 18, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 12, y + 22, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 12, y + 26, z + 7), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 12, y + 26, z + 14), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 12, y + 26, z + 16), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 12, y + 26, z + 23), this.block10.getBlock());

		this.world.setBlockState(new BlockPos(x + 12, y + 33, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 34, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 35, z + 14), this.block10);
		this.world.setBlockState(new BlockPos(x + 12, y + 35, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 35, z + 16), this.block10);
		this.world.setBlockState(new BlockPos(x + 12, y + 36, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 37, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 38, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 39, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 40, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 41, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 42, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 43, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 44, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 45, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 46, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 47, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 48, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 49, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 50, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 51, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 52, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 53, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 12, y + 54, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));

		this.placeBlockTorch(this.world, random, new BlockPos(x + 13, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 13, y + 22, z + 24), this.block10.getBlock());

		this.placeBlockDoor(this.world, random, new BlockPos(x + 13, y + 25, z + 15), Blocks.oak_door);
	}
}
