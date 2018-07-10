package cc_harvest.blocks;

import java.util.Random;

import cc_harvest.CCHarvest;
import cc_harvest.entity.TileEntityApiary;
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
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockApiary extends BlockContainer {
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	private final Random random = new Random();

	private static boolean field_149934_M;

	public BlockApiary(final String name) {
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
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void breakBlock(final World world, final BlockPos blockPos, final IBlockState blockState) {
		if (!field_149934_M) {
			final TileEntityApiary tileentitypamapiary = (TileEntityApiary) world.getTileEntity(blockPos);

			if (tileentitypamapiary != null) {
				for (int i1 = 0; i1 < tileentitypamapiary.getSizeInventory(); i1++) {
					final ItemStack itemstack = tileentitypamapiary.getStackInSlot(i1);

					if (itemstack != null) {
						final float f = this.random.nextFloat() * 0.8F + 0.1F;
						final float f1 = this.random.nextFloat() * 0.8F + 0.1F;
						final float f2 = this.random.nextFloat() * 0.8F + 0.1F;

						while (itemstack.stackSize > 0) {
							int j1 = this.random.nextInt(21) + 10;

							if (j1 > itemstack.stackSize) {
								j1 = itemstack.stackSize;
							}
							itemstack.stackSize -= j1;

							final EntityItem entityitem = new EntityItem(world, blockPos.getX() + f,
									blockPos.getY() + f1, blockPos.getZ() + f2,
									new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

							if (itemstack.hasTagCompound()) {
								entityitem.getEntityItem()
										.setTagCompound((NBTTagCompound) itemstack.getTagCompound().copy());
							}
							final float f3 = 0.05F;

							entityitem.motionX = (float) this.random.nextGaussian() * f3;
							entityitem.motionY = (float) this.random.nextGaussian() * f3 + 0.2F;
							entityitem.motionZ = (float) this.random.nextGaussian() * f3;

							world.spawnEntityInWorld(entityitem);
						}
					}
				}
			}
		}
		super.breakBlock(world, blockPos, blockState);
	}

	@Override
	public boolean onBlockActivated(final World world, final BlockPos pos, final IBlockState state,
			final EntityPlayer player, final EnumFacing side, final float hitX, final float hitY, final float hitZ) {
		if (world.isRemote) {
			return true;
		}
		final TileEntity tileentity = world.getTileEntity(pos);

		if (tileentity instanceof TileEntityApiary) {
			player.openGui(CCModCollection.instance, GuiHandler.GuiApiary, world, pos.getX(), pos.getY(), pos.getZ());
		}

		return true;
	}

	@Override
	public TileEntity createNewTileEntity(final World world, final int var2) {
		return new TileEntityApiary();
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
	public void onBlockPlacedBy(final World world, final BlockPos pos, final IBlockState state,
			final EntityLivingBase placer, final ItemStack itemStack) {
		world.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
	}

	@Override
	public int getRenderType() {
		return 3;
	}
}
