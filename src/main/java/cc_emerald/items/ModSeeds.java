package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

@SuppressWarnings("unused")
public class ModSeeds extends ItemSeeds implements IPlantable {
	private final Block crops;

	public ModSeeds(final String name, final Block crops, final Block soil) {
		super(crops, soil);
		this.crops = crops;
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	@Override
	public boolean onItemUse(final ItemStack stack, final EntityPlayer playerIn, final World worldIn,
			final BlockPos pos, final EnumFacing side, final float hitX, final float hitY, final float hitZ) {
		if (side != EnumFacing.UP) {
			return false;
		} else if (!playerIn.canPlayerEdit(pos.offset(side), side, stack)) {
			return false;
		} else if (worldIn.getBlockState(pos).getBlock().canSustainPlant(worldIn, pos, EnumFacing.UP, this)
				&& worldIn.isAirBlock(pos.up())) {
			worldIn.setBlockState(pos.up(), this.crops.getDefaultState());
			--stack.stackSize;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public EnumPlantType getPlantType(final IBlockAccess world, final BlockPos pos) {
		return EnumPlantType.Crop;
	}

	@Override
	public IBlockState getPlant(final IBlockAccess world, final BlockPos pos) {
		return this.crops.getDefaultState();
	}
}
