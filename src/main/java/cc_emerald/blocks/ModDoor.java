package cc_emerald.blocks;

import java.util.Random;

import cc_emerald.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModDoor extends BlockDoor {
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	public static final PropertyBool OPEN = PropertyBool.create("open");
	public static final PropertyEnum HINGE = PropertyEnum.create("hinge", BlockDoor.EnumHingePosition.class);
	public static final PropertyBool POWERED = PropertyBool.create("powered");
	public static final PropertyEnum HALF = PropertyEnum.create("half", BlockDoor.EnumDoorHalf.class);

	public ModDoor(final Material material) {
		super(material);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)
				.withProperty(OPEN, Boolean.valueOf(false)).withProperty(HINGE, BlockDoor.EnumHingePosition.LEFT)
				.withProperty(POWERED, Boolean.valueOf(false)).withProperty(HALF, BlockDoor.EnumDoorHalf.LOWER));
		// this.setCreativeTab(Main.creativeTab);
		this.disableStats();
	}

	public ModDoor(final Material material, final String name, final float hardness, final float resistance,
			final SoundType soundType) {
		super(material);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)
				.withProperty(OPEN, Boolean.valueOf(false)).withProperty(HINGE, BlockDoor.EnumHingePosition.LEFT)
				.withProperty(POWERED, Boolean.valueOf(false)).withProperty(HALF, BlockDoor.EnumDoorHalf.LOWER));
		this.setUnlocalizedName(name);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(soundType);
		// this.setCreativeTab(Main.creativeTab);
		this.disableStats();
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean isPassable(final IBlockAccess worldIn, final BlockPos pos) {
		return isOpen(combineMetadata(worldIn, pos));
	}

	@Override
	public boolean isFullCube() {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBox(final World worldIn, final BlockPos pos) {
		this.setBlockBoundsBasedOnState(worldIn, pos);
		return super.getSelectedBoundingBox(worldIn, pos);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(final World worldIn, final BlockPos pos, final IBlockState state) {
		this.setBlockBoundsBasedOnState(worldIn, pos);
		return super.getCollisionBoundingBox(worldIn, pos, state);
	}

	@Override
	public void setBlockBoundsBasedOnState(final IBlockAccess worldIn, final BlockPos pos) {
		this.setBoundBasedOnMeta(combineMetadata(worldIn, pos));
	}

	private void setBoundBasedOnMeta(final int combinedMeta) {
		final float f = 0.1875F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
		final EnumFacing enumfacing = getFacing(combinedMeta);
		final boolean flag = isOpen(combinedMeta);
		final boolean flag1 = isHingeLeft(combinedMeta);

		if (flag) {
			if (enumfacing == EnumFacing.EAST) {
				if (!flag1) {
					this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
				} else {
					this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
				}
			} else if (enumfacing == EnumFacing.SOUTH) {
				if (!flag1) {
					this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
				} else {
					this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
				}
			} else if (enumfacing == EnumFacing.WEST) {
				if (!flag1) {
					this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
				} else {
					this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
				}
			} else if (enumfacing == EnumFacing.NORTH) {
				if (!flag1) {
					this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
				} else {
					this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
				}
			}
		} else if (enumfacing == EnumFacing.EAST) {
			this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
		} else if (enumfacing == EnumFacing.SOUTH) {
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
		} else if (enumfacing == EnumFacing.WEST) {
			this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else if (enumfacing == EnumFacing.NORTH) {
			this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
		}
	}

	@Override
	public boolean onBlockActivated(final World worldIn, final BlockPos pos, final IBlockState state,
			final EntityPlayer playerIn, final EnumFacing side, final float hitX, final float hitY, final float hitZ) {
		if (this.blockMaterial == Material.iron) {
			return false; // Allow items to interact with the door
		}
		final BlockPos blockpos1 = state.getValue(HALF) == BlockDoor.EnumDoorHalf.LOWER ? pos : pos.down();
		final IBlockState iblockstate1 = pos.equals(blockpos1) ? state : worldIn.getBlockState(blockpos1);

		if (iblockstate1.getBlock() != this) {
			return false;
		}
		final IBlockState newState = iblockstate1.cycleProperty(OPEN);
		worldIn.setBlockState(blockpos1, newState, 2);
		worldIn.markBlockRangeForRenderUpdate(blockpos1, pos);
		worldIn.playAuxSFXAtEntity(playerIn, ((Boolean) newState.getValue(OPEN)).booleanValue() ? 1003 : 1006, pos, 0);
		return true;
	}

	@Override
	public void toggleDoor(final World worldIn, final BlockPos pos, final boolean open) {
		final IBlockState iblockstate = worldIn.getBlockState(pos);

		if (iblockstate.getBlock() == this) {
			final BlockPos blockpos1 = iblockstate.getValue(HALF) == BlockDoor.EnumDoorHalf.LOWER ? pos : pos.down();
			final IBlockState iblockstate1 = pos == blockpos1 ? iblockstate : worldIn.getBlockState(blockpos1);

			if (iblockstate1.getBlock() == this && ((Boolean) iblockstate1.getValue(OPEN)).booleanValue() != open) {
				worldIn.setBlockState(blockpos1, iblockstate1.withProperty(OPEN, Boolean.valueOf(open)), 2);
				worldIn.markBlockRangeForRenderUpdate(blockpos1, pos);
				worldIn.playAuxSFXAtEntity((EntityPlayer) null, open ? 1003 : 1006, pos, 0);
			}
		}
	}

	@Override
	public void onNeighborBlockChange(final World worldIn, final BlockPos pos, final IBlockState state,
			final Block neighborBlock) {
		if (state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER) {
			final BlockPos blockpos1 = pos.down();
			final IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);

			if (iblockstate1.getBlock() != this) {
				worldIn.setBlockToAir(pos);
			} else if (neighborBlock != this) {
				this.onNeighborBlockChange(worldIn, blockpos1, iblockstate1, neighborBlock);
			}
		} else {
			boolean flag1 = false;
			final BlockPos blockpos2 = pos.up();
			final IBlockState iblockstate2 = worldIn.getBlockState(blockpos2);

			if (iblockstate2.getBlock() != this) {
				worldIn.setBlockToAir(pos);
				flag1 = true;
			}

			if (!World.doesBlockHaveSolidTopSurface(worldIn, pos.down())) {
				worldIn.setBlockToAir(pos);
				flag1 = true;

				if (iblockstate2.getBlock() == this) {
					worldIn.setBlockToAir(blockpos2);
				}
			}

			if (flag1) {
				if (!worldIn.isRemote) {
					this.dropBlockAsItem(worldIn, pos, state, 0);
				}
			} else {
				final boolean flag = worldIn.isBlockPowered(pos) || worldIn.isBlockPowered(blockpos2);

				if ((flag || neighborBlock.canProvidePower()) && neighborBlock != this
						&& flag != ((Boolean) iblockstate2.getValue(POWERED)).booleanValue()) {
					worldIn.setBlockState(blockpos2, iblockstate2.withProperty(POWERED, Boolean.valueOf(flag)), 2);

					if (flag != ((Boolean) state.getValue(OPEN)).booleanValue()) {
						worldIn.setBlockState(pos, state.withProperty(OPEN, Boolean.valueOf(flag)), 2);
						worldIn.markBlockRangeForRenderUpdate(pos, pos);
						worldIn.playAuxSFXAtEntity((EntityPlayer) null, flag ? 1003 : 1006, pos, 0);
					}
				}
			}
		}
	}

	@Override
	public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
		return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? null : this.getItem();
	}

	@Override
	public MovingObjectPosition collisionRayTrace(final World worldIn, final BlockPos pos, final Vec3 start,
			final Vec3 end) {
		this.setBlockBoundsBasedOnState(worldIn, pos);
		return super.collisionRayTrace(worldIn, pos, start, end);
	}

	@Override
	public boolean canPlaceBlockAt(final World worldIn, final BlockPos pos) {
		return super.canPlaceBlockAt(worldIn, pos);
	}

	@Override
	public int getMobilityFlag() {
		return 1;
	}

	public static int combineMetadata(final IBlockAccess worldIn, final BlockPos pos) {
		final IBlockState iblockstate = worldIn.getBlockState(pos);
		final int i = iblockstate.getBlock().getMetaFromState(iblockstate);
		final boolean flag = isTop(i);
		final IBlockState iblockstate1 = worldIn.getBlockState(pos.down());
		final int j = iblockstate1.getBlock().getMetaFromState(iblockstate1);
		final int k = flag ? j : i;
		final IBlockState iblockstate2 = worldIn.getBlockState(pos.up());
		final int l = iblockstate2.getBlock().getMetaFromState(iblockstate2);
		final int i1 = flag ? i : l;
		final boolean flag1 = (i1 & 1) != 0;
		final boolean flag2 = (i1 & 2) != 0;
		return removeHalfBit(k) | (flag ? 8 : 0) | (flag1 ? 16 : 0) | (flag2 ? 32 : 0);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(final World worldIn, final BlockPos pos) {
		return this.getItem();
	}

	private Item getItem() {
		if (this == ModBlocks.doorBlock) {
			return ModItems.doorItem;
		} else if (this == ModBlocks.doorBlockObsidian) {
			return ModItems.doorItemObsidian;
		}
		return null;
	}

	@Override
	public void onBlockHarvested(final World worldIn, final BlockPos pos, final IBlockState state,
			final EntityPlayer player) {
		final BlockPos blockpos1 = pos.down();

		if (player.capabilities.isCreativeMode && state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER
				&& worldIn.getBlockState(blockpos1).getBlock() == this) {
			worldIn.setBlockToAir(blockpos1);
		}
	}

	@Override
	public IBlockState getActualState(final IBlockState state, final IBlockAccess worldIn, final BlockPos pos) {
		IBlockState iblockstate1;
		IBlockState newState = state;

		if (state.getValue(HALF) == BlockDoor.EnumDoorHalf.LOWER) {
			iblockstate1 = worldIn.getBlockState(pos.up());

			if (iblockstate1.getBlock() == this) {
				newState = state.withProperty(HINGE, iblockstate1.getValue(HINGE)).withProperty(POWERED,
						iblockstate1.getValue(POWERED));
			}
		} else {
			iblockstate1 = worldIn.getBlockState(pos.down());

			if (iblockstate1.getBlock() == this) {
				newState = state.withProperty(FACING, iblockstate1.getValue(FACING)).withProperty(OPEN,
						iblockstate1.getValue(OPEN));
			}
		}

		return newState;
	}

	@Override
	public IBlockState getStateFromMeta(final int meta) {
		return (meta & 8) > 0
				? this.getDefaultState().withProperty(HALF, BlockDoor.EnumDoorHalf.UPPER)
						.withProperty(HINGE,
								(meta & 1) > 0 ? BlockDoor.EnumHingePosition.RIGHT : BlockDoor.EnumHingePosition.LEFT)
						.withProperty(POWERED, Boolean.valueOf((meta & 2) > 0))
				: this.getDefaultState().withProperty(HALF, BlockDoor.EnumDoorHalf.LOWER)
						.withProperty(FACING, EnumFacing.getHorizontal(meta & 3).rotateYCCW())
						.withProperty(OPEN, Boolean.valueOf((meta & 4) > 0));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT;
	}

	@Override
	public int getMetaFromState(final IBlockState state) {
		final byte b0 = 0;
		int i;

		if (state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER) {
			i = b0 | 8;

			if (state.getValue(HINGE) == BlockDoor.EnumHingePosition.RIGHT) {
				i |= 1;
			}

			if (((Boolean) state.getValue(POWERED)).booleanValue()) {
				i |= 2;
			}
		} else {
			i = b0 | ((EnumFacing) state.getValue(FACING)).rotateY().getHorizontalIndex();

			if (((Boolean) state.getValue(OPEN)).booleanValue()) {
				i |= 4;
			}
		}

		return i;
	}

	protected static int removeHalfBit(final int meta) {
		return meta & 7;
	}

	public static boolean isOpen(final IBlockAccess worldIn, final BlockPos pos) {
		return isOpen(combineMetadata(worldIn, pos));
	}

	public static EnumFacing getFacing(final IBlockAccess worldIn, final BlockPos pos) {
		return getFacing(combineMetadata(worldIn, pos));
	}

	public static EnumFacing getFacing(final int combinedMeta) {
		return EnumFacing.getHorizontal(combinedMeta & 3).rotateYCCW();
	}

	protected static boolean isOpen(final int combinedMeta) {
		return (combinedMeta & 4) != 0;
	}

	protected static boolean isTop(final int meta) {
		return (meta & 8) != 0;
	}

	protected static boolean isHingeLeft(final int combinedMeta) {
		return (combinedMeta & 16) != 0;
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { HALF, FACING, OPEN, HINGE, POWERED });
	}

	public static enum EnumDoorHalf implements IStringSerializable {
		UPPER, LOWER;

		@Override
		public String toString() {
			return this.getName();
		}

		@Override
		public String getName() {
			return this == UPPER ? "upper" : "lower";
		}
	}

	public static enum EnumHingePosition implements IStringSerializable {
		LEFT, RIGHT;

		@Override
		public String toString() {
			return this.getName();
		}

		@Override
		public String getName() {
			return this == LEFT ? "left" : "right";
		}
	}
}
