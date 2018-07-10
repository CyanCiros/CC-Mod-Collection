package cc_harvest.blocks;

import java.util.Random;

import cc_harvest.CCHarvest;
import cc_harvest.entity.TileEntityCuttingBoard;
import cc_harvest.gui.GuiHandler;
import cc_mod_collection.CCModCollection;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockCuttingBoard extends BlockContainer {
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	private final Random rand = new Random();

	public BlockCuttingBoard(final String name) {
		super(Material.wood);
		this.setUnlocalizedName(name);
		this.setHardness(1.0F);
		this.setStepSound(Block.soundTypeWood);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
		this.setTickRandomly(true);
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
	public boolean onBlockActivated(final World world, final BlockPos pos, final IBlockState state,
			final EntityPlayer player, final EnumFacing side, final float hitX, final float hitY, final float hitZ) {
		if (world.isRemote) {
			return true;
		}
		final TileEntity tileentity = world.getTileEntity(pos);

		if (tileentity instanceof TileEntityCuttingBoard) {
			player.openGui(CCModCollection.instance, GuiHandler.GuiCuttingBoard, world, pos.getX(), pos.getY(),
					pos.getZ());
		}

		return true;
	}

	@Override
	public void breakBlock(final World worldIn, final BlockPos pos, final IBlockState state) {
		this.dropInventory(worldIn, pos.getX(), pos.getY(), pos.getZ());
		super.breakBlock(worldIn, pos, state);
	}

	private void dropInventory(final World world, final int x, final int y, final int z) {
		final TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

		if (!(tileEntity instanceof IInventory)) {
			return;
		}
		final IInventory inventory = (IInventory) tileEntity;

		for (int i = 0; i < inventory.getSizeInventory(); i++) {
			final ItemStack itemStack = inventory.getStackInSlot(i);

			if (itemStack != null && itemStack.stackSize > 0) {
				final float dX = this.rand.nextFloat() * 0.8F + 0.1F;
				final float dY = this.rand.nextFloat() * 0.8F + 0.1F;
				final float dZ = this.rand.nextFloat() * 0.8F + 0.1F;
				final EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ,
						new ItemStack(itemStack.getItem(), itemStack.stackSize, itemStack.getItemDamage()));

				if (itemStack.hasTagCompound()) {
					entityItem.getEntityItem().setTagCompound((NBTTagCompound) itemStack.getTagCompound().copy());
				}
				final float factor = 0.05F;
				entityItem.motionX = this.rand.nextGaussian() * factor;
				entityItem.motionY = this.rand.nextGaussian() * factor + 0.2F;
				entityItem.motionZ = this.rand.nextGaussian() * factor;
				world.spawnEntityInWorld(entityItem);
				itemStack.stackSize = 0;
			}
		}
	}

	@Override
	public TileEntity createNewTileEntity(final World world, final int meta) {
		return new TileEntityCuttingBoard();
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean isFullCube() {
		return false;
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
