package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ModItemDoor extends ItemDoor {
	private final Block block;

	public ModItemDoor(final Block block) {
		super(block);
		this.block = block;
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModItemDoor(final Block block, final String name) {
		super(block);
		this.block = block;
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	@Override
	public boolean onItemUse(final ItemStack stack, final EntityPlayer playerIn, final World worldIn,
			final BlockPos pos, final EnumFacing side, final float hitX, final float hitY, final float hitZ) {
		if (side != EnumFacing.UP) {
			return false;
		}
		final IBlockState iblockstate = worldIn.getBlockState(pos);
		final Block block = iblockstate.getBlock();

		BlockPos posN = pos;

		if (!block.isReplaceable(worldIn, posN)) {
			posN = posN.offset(side);
		}

		if (!playerIn.canPlayerEdit(posN, side, stack)) {
			return false;
		} else if (!this.block.canPlaceBlockAt(worldIn, posN)) {
			return false;
		} else {
			placeDoor(worldIn, posN, EnumFacing.fromAngle(playerIn.rotationYaw), this.block);
			--stack.stackSize;
			return true;
		}
	}

	public static void placeDoor(final World worldIn, final BlockPos pos, final EnumFacing facing, final Block door) {
		final BlockPos blockpos1 = pos.offset(facing.rotateY());
		final BlockPos blockpos2 = pos.offset(facing.rotateYCCW());
		final int i = (worldIn.getBlockState(blockpos2).getBlock().isNormalCube() ? 1 : 0)
				+ (worldIn.getBlockState(blockpos2.up()).getBlock().isNormalCube() ? 1 : 0);
		final int j = (worldIn.getBlockState(blockpos1).getBlock().isNormalCube() ? 1 : 0)
				+ (worldIn.getBlockState(blockpos1.up()).getBlock().isNormalCube() ? 1 : 0);
		final boolean flag = worldIn.getBlockState(blockpos2).getBlock() == door
				|| worldIn.getBlockState(blockpos2.up()).getBlock() == door;
		final boolean flag1 = worldIn.getBlockState(blockpos1).getBlock() == door
				|| worldIn.getBlockState(blockpos1.up()).getBlock() == door;
		boolean flag2 = false;

		if (flag && !flag1 || j > i) {
			flag2 = true;
		}

		final BlockPos blockpos3 = pos.up();
		final IBlockState iblockstate = door.getDefaultState().withProperty(BlockDoor.FACING, facing).withProperty(
				BlockDoor.HINGE, flag2 ? BlockDoor.EnumHingePosition.RIGHT : BlockDoor.EnumHingePosition.LEFT);
		worldIn.setBlockState(pos, iblockstate.withProperty(BlockDoor.HALF, BlockDoor.EnumDoorHalf.LOWER), 2);
		worldIn.setBlockState(blockpos3, iblockstate.withProperty(BlockDoor.HALF, BlockDoor.EnumDoorHalf.UPPER), 2);
		worldIn.notifyNeighborsOfStateChange(pos, door);
		worldIn.notifyNeighborsOfStateChange(blockpos3, door);
	}
}
