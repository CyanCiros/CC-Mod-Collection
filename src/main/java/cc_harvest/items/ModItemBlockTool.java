package cc_harvest.items;

import cc_harvest.CCHarvest;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ModItemBlockTool extends Item {
	public final Block spawnID;

	public ModItemBlockTool(final String name, final Block block) {
		this.setUnlocalizedName(name);
		this.setContainerItem(this);
		this.setMaxStackSize(1);
		this.setCreativeTab(CCHarvest.creativeTab);
		this.spawnID = block;
	}

	// @Override
	// public boolean doesContainerItemLeaveCraftingGrid(final ItemStack
	// itemStack) {
	// return false;
	// }

	@SuppressWarnings("unused")
	public boolean placeBlockAt(final ItemStack itemStack, final EntityPlayer entityPlayer, final World world,
			final int x, final int y, final int z, final int side, final float hitX, final float hitY, final float hitZ,
			final int metadata) {
		if (!world.setBlockState(new BlockPos(x, y, z), this.spawnID.getDefaultState(), 0)) {
			return false;
		}
		if (world.getBlockState(new BlockPos(x, y, z)) == this.spawnID) {
			this.spawnID.onBlockPlacedBy(world, new BlockPos(x, y, z), this.spawnID.getDefaultState(), entityPlayer,
					itemStack);
			// this.spawnID.onPostBlockPlaced(world, new BlockPos(x, y, z),
			// metadata);
		}
		return true;
	}

	// @Override
	// public boolean onItemUse(ItemStack stack, EntityPlayer player, World
	// world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	// {
	// final IBlockState block = world.getBlockState(pos);
	// int x1 = pos.getX();
	// int y1 = pos.getY();
	// int z1 = pos.getZ();
	// EnumFacing side1 = side;
	//
	// if (block == Blocks.snow_layer
	// && (world.getBlockMetadata(x1, y1, z1) & 0x7) < 1) {
	// side1 = 1;
	// } else if (block != Blocks.vine && block != Blocks.tallgrass
	// && block != Blocks.deadbush
	// && !block.isReplaceable(world, x1, y1, z1)) {
	// if (side1 == 0) {
	// y1--;
	// }
	// if (side1 == 1) {
	// y1++;
	// }
	// if (side1 == 2) {
	// z1--;
	// }
	// if (side1 == 3) {
	// z1++;
	// }
	// if (side1 == 4) {
	// x1--;
	// }
	// if (side1 == 5) {
	// x1++;
	// }
	// }
	// if (itemStack.stackSize == 0) {
	// return false;
	// }
	// if (!entityPlayer.canPlayerEdit(x1, y1, z1, side1, itemStack)) {
	// return false;
	// }
	// if (y1 == 255 && this.spawnID.getMaterial().isSolid()) {
	// return false;
	// }
	// if (world.canPlaceEntityOnSide(this.spawnID, x1, y1, z1, false, side1,
	// entityPlayer, itemStack)) {
	// final int meta1 = this.getMetadata(itemStack.getItemDamage());
	// final int meta2 = this.spawnID.onBlockPlaced(world, x1, y1, z1, side1,
	// par8, par9, par10, meta1);
	//
	// if (this.placeBlockAt(itemStack, entityPlayer, world, x1, y1, z1,
	// side1, par8, par9, par10, meta2)) {
	// world.playSoundEffect(x1 + 0.5F, y1 + 0.5F, z1 + 0.5F,
	// this.spawnID.stepSound.func_150496_b(),
	// (this.spawnID.stepSound.getVolume() + 1.0F) / 2.0F,
	// this.spawnID.stepSound.getPitch() * 0.8F);
	// itemStack.stackSize -= 1;
	// }
	// return true;
	// }
	// return false;
	// }
}
