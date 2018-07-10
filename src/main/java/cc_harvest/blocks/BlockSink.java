package cc_harvest.blocks;

import cc_harvest.CCHarvest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockSink extends Block {
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public BlockSink(final String name) {
		super(Material.wood);
		this.setUnlocalizedName(name);
		this.setHardness(1.0F);
		this.setStepSound(Block.soundTypeWood);
		this.setCreativeTab(CCHarvest.creativeTab);
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { FACING });
	}

	@Override
	public IBlockState getStateFromMeta(final int meta) {
		EnumFacing enumfacing = EnumFacing.getFront(meta);

		if (enumfacing.getAxis() == EnumFacing.Axis.Y) {
			enumfacing = EnumFacing.NORTH;
		}

		return this.getDefaultState().withProperty(FACING, enumfacing);
	}

	@Override
	public int getMetaFromState(final IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getIndex();
	}

	@Override
	public boolean onBlockActivated(final World world, final BlockPos blockPos, final IBlockState state,
			final EntityPlayer entityPlayer, final EnumFacing side, final float hitX, final float hitY,
			final float hitZ) {
		if (world.isRemote) {
			return true;
		}
		final ItemStack itemstack = entityPlayer.inventory.getCurrentItem();

		if (itemstack == null) {
			return true;
		}
		if (itemstack.getItem() == Items.bucket) {
			final ItemStack itemstack1 = new ItemStack(Items.water_bucket, 1, 0);

			if (!entityPlayer.inventory.addItemStackToInventory(itemstack1)) {
				world.spawnEntityInWorld(new EntityItem(world, blockPos.getX() + 0.5D, blockPos.getY() + 1.5D,
						blockPos.getZ() + 0.5D, itemstack1));
			} else if (entityPlayer instanceof EntityPlayerMP) {
				((EntityPlayerMP) entityPlayer).sendContainerToPlayer(entityPlayer.inventoryContainer);
			}

			itemstack.stackSize -= 1;

			if (itemstack.stackSize <= 0) {
				entityPlayer.inventory.setInventorySlotContents(entityPlayer.inventory.currentItem, (ItemStack) null);
			}
		}
		if (itemstack.getItem() == Items.glass_bottle) {
			final ItemStack itemstack1 = new ItemStack(Items.potionitem, 1, 0);

			if (!entityPlayer.inventory.addItemStackToInventory(itemstack1)) {
				world.spawnEntityInWorld(new EntityItem(world, blockPos.getX() + 0.5D, blockPos.getY() + 1.5D,
						blockPos.getZ() + 0.5D, itemstack1));
			} else if (entityPlayer instanceof EntityPlayerMP) {
				((EntityPlayerMP) entityPlayer).sendContainerToPlayer(entityPlayer.inventoryContainer);
			}

			itemstack.stackSize -= 1;

			if (itemstack.stackSize <= 0) {
				entityPlayer.inventory.setInventorySlotContents(entityPlayer.inventory.currentItem, (ItemStack) null);
			}
		} else if (itemstack.getItem() instanceof ItemArmor
				&& ((ItemArmor) itemstack.getItem()).getArmorMaterial() == ItemArmor.ArmorMaterial.LEATHER) {
			final ItemArmor itemarmor = (ItemArmor) itemstack.getItem();

			itemarmor.removeColor(itemstack);

			return true;
		}
		return true;
	}

	@Override
	public void onBlockAdded(final World worldIn, final BlockPos pos, final IBlockState state) {
		this.setDefaultFacing(worldIn, pos, state);
	}

	private void setDefaultFacing(final World worldIn, final BlockPos pos, final IBlockState state) {
		if (!worldIn.isRemote) {
			final Block block = worldIn.getBlockState(pos.north()).getBlock();
			final Block block1 = worldIn.getBlockState(pos.south()).getBlock();
			final Block block2 = worldIn.getBlockState(pos.west()).getBlock();
			final Block block3 = worldIn.getBlockState(pos.east()).getBlock();
			EnumFacing enumfacing = (EnumFacing) state.getValue(FACING);

			if (enumfacing == EnumFacing.NORTH && block.isFullBlock() && !block1.isFullBlock()) {
				enumfacing = EnumFacing.SOUTH;
			} else if (enumfacing == EnumFacing.SOUTH && block1.isFullBlock() && !block.isFullBlock()) {
				enumfacing = EnumFacing.NORTH;
			} else if (enumfacing == EnumFacing.WEST && block2.isFullBlock() && !block3.isFullBlock()) {
				enumfacing = EnumFacing.EAST;
			} else if (enumfacing == EnumFacing.EAST && block3.isFullBlock() && !block2.isFullBlock()) {
				enumfacing = EnumFacing.WEST;
			}

			worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
		}
	}

	@Override
	public IBlockState onBlockPlaced(final World worldIn, final BlockPos pos, final EnumFacing facing, final float hitX,
			final float hitY, final float hitZ, final int meta, final EntityLivingBase placer) {
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	@Override
	public void onBlockPlacedBy(final World worldIn, final BlockPos pos, final IBlockState state,
			final EntityLivingBase placer, final ItemStack stack) {
		worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
	}

	@Override
	public int getRenderType() {
		return 3;
	}
}
