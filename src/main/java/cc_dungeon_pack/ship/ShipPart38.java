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

public class ShipPart38 extends Ship {
	public ShipPart38(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 26, y + 18, z + 12), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 26, y + 18, z + 18), this.block10.getBlock());

		this.placeBlockDoor(this.world, random, new BlockPos(x + 26, y + 29, z + 8), Blocks.oak_door);
		this.placeBlockDoor(this.world, random, new BlockPos(x + 26, y + 29, z + 9), Blocks.oak_door);
		this.placeBlockDoor(this.world, random, new BlockPos(x + 26, y + 29, z + 21), Blocks.oak_door);
		this.placeBlockDoor(this.world, random, new BlockPos(x + 26, y + 29, z + 22), Blocks.oak_door);

		this.placeBlockTorch(this.world, random, new BlockPos(x + 26, y + 34, z + 10), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 26, y + 34, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 26, y + 34, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 26, y + 34, z + 20), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 27, y + 26, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 27, y + 26, z + 24), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 28, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 28, y + 22, z + 24), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 29, y + 26, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 29, y + 26, z + 24), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 30, y + 30, z + 10), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 30, y + 30, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 30, y + 30, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 30, y + 30, z + 20), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 31, y + 34, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 31, y + 34, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 31, y + 47, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 31, y + 47, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 31, y + 58, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 31, y + 58, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 31, y + 72, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 31, y + 72, z + 17), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 32, y + 18, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 32, y + 22, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 32, y + 26, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 32, y + 26, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 32, y + 26, z + 24), this.block10.getBlock());

		this.world.setBlockState(new BlockPos(x + 32, y + 29, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 30, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 31, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 32, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 33, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 34, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 35, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 36, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 37, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 38, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 39, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 40, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 41, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 42, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 43, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 44, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 45, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 46, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 47, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 48, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 49, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 50, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 51, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 52, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 53, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 54, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 55, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 56, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 57, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 58, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 59, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 60, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 61, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 62, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 63, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 64, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 65, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 66, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 67, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 68, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 69, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 70, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 71, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
		this.world.setBlockState(new BlockPos(x + 32, y + 72, z + 15),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.WEST));

		this.placeBlockTorch(this.world, random, new BlockPos(x + 33, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 33, y + 22, z + 24), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 18, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 22, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 34, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 34, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 47, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 47, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 58, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 58, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 72, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 34, y + 72, z + 17), this.block10.getBlock());

		this.placeBlockDoor(this.world, random, new BlockPos(x + 35, y + 25, z + 10), Blocks.oak_door);
		this.placeBlockDoor(this.world, random, new BlockPos(x + 35, y + 25, z + 11), Blocks.oak_door);
		this.placeBlockDoor(this.world, random, new BlockPos(x + 35, y + 25, z + 19), Blocks.oak_door);
		this.placeBlockDoor(this.world, random, new BlockPos(x + 35, y + 25, z + 20), Blocks.oak_door);

		this.placeBlockTorch(this.world, random, new BlockPos(x + 35, y + 30, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 35, y + 30, z + 9), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 35, y + 30, z + 21), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 35, y + 30, z + 24), this.block10.getBlock());
	}
}
