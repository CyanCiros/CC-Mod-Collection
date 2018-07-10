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

public class TemplePQ2Part13 extends TemplePQ2 {
	public TemplePQ2Part13(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, mobs, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlock(random, new BlockPos(x + 18, y + 0, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 18, y + 0, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 18, y + 0, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 18, y + 0, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 18, y + 1, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 18, y + 1, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 18, y + 2, z + 9), this.block1);

		this.placeBlock(random, new BlockPos(x + 18, y + 2, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 18, y + 3, z + 9), this.block1);

		this.placeBlock(random, new BlockPos(x + 18, y + 3, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 18, y + 4, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 18, y + 4, z + 11), this.block1);

		this.placeBlock(random, new BlockPos(x + 1, y + 2, z + 10), Blocks.redstone_torch.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 1, y + 4, z + 10), Blocks.unlit_redstone_torch.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 1, y + 6, z + 10), Blocks.redstone_torch.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 2, y + 1, z + 10), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 2, y + 6, z + 6), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 2, y + 6, z + 7), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 2, y + 6, z + 14), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 2, y + 6, z + 15), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 2, y + 7, z + 8), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 2, y + 7, z + 9), Blocks.redstone_wire.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 2, y + 7, z + 10), Blocks.unlit_redstone_torch.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 2, y + 7, z + 11), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 2, y + 7, z + 12), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 2, y + 7, z + 13), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 9), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 10), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 11), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 12), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 6), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 7), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 8), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 9), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 12), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 13), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 14), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 3, z + 15), Blocks.stone_pressure_plate.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 10), Blocks.unpowered_repeater.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 7, z + 11), Blocks.unpowered_repeater.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 3, y + 21, z + 9), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 21, z + 10), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 21, z + 11), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 21, z + 12), Blocks.redstone_wire.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 9), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 10), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 11), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 12), Blocks.redstone_wire.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 7), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 8), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 9), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 10), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 11), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 12), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 13), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 3, z + 14), Blocks.stone_pressure_plate.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 4, y + 21, z + 8), Blocks.redstone_torch.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 21, z + 13), Blocks.redstone_torch.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 23, z + 8), Blocks.unlit_redstone_torch.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 23, z + 13), Blocks.unlit_redstone_torch.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 5, y + 1, z + 10), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 5, y + 1, z + 11), Blocks.redstone_wire.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 5, y + 3, z + 9), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 5, y + 3, z + 10), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 5, y + 3, z + 11), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 5, y + 3, z + 12), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 5, y + 10, z + 10), Blocks.stone_pressure_plate.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 5, y + 13, z + 10),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 5, y + 13, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 5, y + 14, z + 10),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 5, y + 14, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 5, y + 15, z + 10),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 5, y + 15, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 5, y + 16, z + 10),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 5, y + 16, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 5, y + 17, z + 10),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 5, y + 17, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));

		this.placeBlock(random, new BlockPos(x + 5, y + 20, z + 8), this.block10);
		this.placeBlock(random, new BlockPos(x + 5, y + 20, z + 13), this.block10);
		this.placeBlock(random, new BlockPos(x + 5, y + 21, z + 7), this.block10);
		this.placeBlock(random, new BlockPos(x + 5, y + 21, z + 9), this.block10);
		this.placeBlock(random, new BlockPos(x + 5, y + 21, z + 10), Blocks.stone_button.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 5, y + 21, z + 11), Blocks.stone_button.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 5, y + 21, z + 12), this.block10);
		this.placeBlock(random, new BlockPos(x + 5, y + 21, z + 14), this.block10);

		this.placeBlock(random, new BlockPos(x + 5, y + 23, z + 8), Blocks.redstone_wire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 5, y + 23, z + 13), Blocks.redstone_wire.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 6, y + 3, z + 9), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 6, y + 3, z + 10), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 6, y + 3, z + 11), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 6, y + 3, z + 12), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 6, y + 13, z + 9), Blocks.stone_pressure_plate.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 6, y + 35, z + 10),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 6, y + 35, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
		this.placeBlock(random, new BlockPos(x + 6, y + 37, z + 11),
				Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, EnumFacing.EAST));

		this.placeBlock(random, new BlockPos(x + 7, y + 13, z + 3), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 7, y + 14, z + 6), Blocks.stone_pressure_plate.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 8, y + 11, z + 12), Blocks.stone_pressure_plate.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 9, y + 0, z + 2), this.block12);
		this.placeBlock(random, new BlockPos(x + 9, y + 0, z + 19), this.block11);
		this.placeBlock(random, new BlockPos(x + 9, y + 1, z + 2), this.block12);
	}
}
