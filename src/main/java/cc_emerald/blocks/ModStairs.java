package cc_emerald.blocks;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import cc_emerald.CCEmerald;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModStairs extends BlockStairs {
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	public static final PropertyEnum HALF = PropertyEnum.create("half", BlockStairs.EnumHalf.class);
	public static final PropertyEnum SHAPE = PropertyEnum.create("shape", BlockStairs.EnumShape.class);
	private static final int[][] field_150150_a = new int[][] { { 4, 5 }, { 5, 7 }, { 6, 7 }, { 4, 6 }, { 0, 1 },
			{ 1, 3 }, { 2, 3 }, { 0, 2 } };
	private Block modelBlock;
	private IBlockState modelState;
	private boolean hasRaytraced;
	private int rayTracePass;

	public ModStairs(final IBlockState modelState) {
		super(modelState);
		this.setCreativeTab(CCEmerald.creativeTab);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)
				.withProperty(HALF, BlockStairs.EnumHalf.BOTTOM).withProperty(SHAPE, BlockStairs.EnumShape.STRAIGHT));
		this.setLightOpacity(255);
	}

	public ModStairs(final String name, final Block block) {
		this(block.getBlockState().getBaseState());
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)
				.withProperty(HALF, BlockStairs.EnumHalf.BOTTOM).withProperty(SHAPE, BlockStairs.EnumShape.STRAIGHT));
		this.modelBlock = block;
		this.modelState = block.getDefaultState();
		this.setStepSound(this.modelBlock.stepSound);
		this.setLightOpacity(255);
	}

	@Override
	public void setBlockBoundsBasedOnState(final IBlockAccess worldIn, final BlockPos pos) {
		if (this.hasRaytraced) {
			this.setBlockBounds(0.5F * (this.rayTracePass % 2), 0.5F * (this.rayTracePass / 4 % 2),
					0.5F * (this.rayTracePass / 2 % 2), 0.5F + 0.5F * (this.rayTracePass % 2),
					0.5F + 0.5F * (this.rayTracePass / 4 % 2), 0.5F + 0.5F * (this.rayTracePass / 2 % 2));
		} else {
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean isFullCube() {
		return false;
	}

	/**
	 * Set the block bounds as the collision bounds for the stairs at the given
	 * position
	 */
	@Override
	public void setBaseCollisionBounds(final IBlockAccess worldIn, final BlockPos pos) {
		if (worldIn.getBlockState(pos).getValue(HALF) == BlockStairs.EnumHalf.TOP) {
			this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else {
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
		}
	}

	/**
	 * Checks if a block is stairs
	 */
	public static boolean isBlockStairs(final Block p_150148_0_) {
		return p_150148_0_ instanceof BlockStairs;
	}

	/**
	 * Check whether there is a stair block at the given position and it has the
	 * same properties as the given BlockState
	 */
	public static boolean isSameStair(final IBlockAccess worldIn, final BlockPos pos, final IBlockState state) {
		final IBlockState iblockstate1 = worldIn.getBlockState(pos);
		final Block block = iblockstate1.getBlock();
		/**
		 * Checks if a block is stairs
		 */
		return isBlockStairs(block) && iblockstate1.getValue(HALF) == state.getValue(HALF)
				&& iblockstate1.getValue(FACING) == state.getValue(FACING);
	}

	@Override
	public int func_176307_f(final IBlockAccess p_176307_1_, final BlockPos p_176307_2_) {
		final IBlockState iblockstate = p_176307_1_.getBlockState(p_176307_2_);
		final EnumFacing enumfacing = (EnumFacing) iblockstate.getValue(FACING);
		final BlockStairs.EnumHalf enumhalf = (BlockStairs.EnumHalf) iblockstate.getValue(HALF);
		final boolean flag = enumhalf == BlockStairs.EnumHalf.TOP;
		IBlockState iblockstate1;
		Block block;
		EnumFacing enumfacing1;

		if (enumfacing == EnumFacing.EAST) {
			iblockstate1 = p_176307_1_.getBlockState(p_176307_2_.east());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.NORTH && !isSameStair(p_176307_1_, p_176307_2_.south(), iblockstate)) {
					return flag ? 1 : 2;
				}

				if (enumfacing1 == EnumFacing.SOUTH && !isSameStair(p_176307_1_, p_176307_2_.north(), iblockstate)) {
					return flag ? 2 : 1;
				}
			}
		} else if (enumfacing == EnumFacing.WEST) {
			iblockstate1 = p_176307_1_.getBlockState(p_176307_2_.west());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.NORTH && !isSameStair(p_176307_1_, p_176307_2_.south(), iblockstate)) {
					return flag ? 2 : 1;
				}

				if (enumfacing1 == EnumFacing.SOUTH && !isSameStair(p_176307_1_, p_176307_2_.north(), iblockstate)) {
					return flag ? 1 : 2;
				}
			}
		} else if (enumfacing == EnumFacing.SOUTH) {
			iblockstate1 = p_176307_1_.getBlockState(p_176307_2_.south());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.WEST && !isSameStair(p_176307_1_, p_176307_2_.east(), iblockstate)) {
					return flag ? 2 : 1;
				}

				if (enumfacing1 == EnumFacing.EAST && !isSameStair(p_176307_1_, p_176307_2_.west(), iblockstate)) {
					return flag ? 1 : 2;
				}
			}
		} else if (enumfacing == EnumFacing.NORTH) {
			iblockstate1 = p_176307_1_.getBlockState(p_176307_2_.north());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.WEST && !isSameStair(p_176307_1_, p_176307_2_.east(), iblockstate)) {
					return flag ? 1 : 2;
				}

				if (enumfacing1 == EnumFacing.EAST && !isSameStair(p_176307_1_, p_176307_2_.west(), iblockstate)) {
					return flag ? 2 : 1;
				}
			}
		}

		return 0;
	}

	@Override
	public int func_176305_g(final IBlockAccess p_176305_1_, final BlockPos p_176305_2_) {
		final IBlockState iblockstate = p_176305_1_.getBlockState(p_176305_2_);
		final EnumFacing enumfacing = (EnumFacing) iblockstate.getValue(FACING);
		final BlockStairs.EnumHalf enumhalf = (BlockStairs.EnumHalf) iblockstate.getValue(HALF);
		final boolean flag = enumhalf == BlockStairs.EnumHalf.TOP;
		IBlockState iblockstate1;
		Block block;
		EnumFacing enumfacing1;

		if (enumfacing == EnumFacing.EAST) {
			iblockstate1 = p_176305_1_.getBlockState(p_176305_2_.west());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.NORTH && !isSameStair(p_176305_1_, p_176305_2_.north(), iblockstate)) {
					return flag ? 1 : 2;
				}

				if (enumfacing1 == EnumFacing.SOUTH && !isSameStair(p_176305_1_, p_176305_2_.south(), iblockstate)) {
					return flag ? 2 : 1;
				}
			}
		} else if (enumfacing == EnumFacing.WEST) {
			iblockstate1 = p_176305_1_.getBlockState(p_176305_2_.east());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.NORTH && !isSameStair(p_176305_1_, p_176305_2_.north(), iblockstate)) {
					return flag ? 2 : 1;
				}

				if (enumfacing1 == EnumFacing.SOUTH && !isSameStair(p_176305_1_, p_176305_2_.south(), iblockstate)) {
					return flag ? 1 : 2;
				}
			}
		} else if (enumfacing == EnumFacing.SOUTH) {
			iblockstate1 = p_176305_1_.getBlockState(p_176305_2_.north());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.WEST && !isSameStair(p_176305_1_, p_176305_2_.west(), iblockstate)) {
					return flag ? 2 : 1;
				}

				if (enumfacing1 == EnumFacing.EAST && !isSameStair(p_176305_1_, p_176305_2_.east(), iblockstate)) {
					return flag ? 1 : 2;
				}
			}
		} else if (enumfacing == EnumFacing.NORTH) {
			iblockstate1 = p_176305_1_.getBlockState(p_176305_2_.south());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.WEST && !isSameStair(p_176305_1_, p_176305_2_.west(), iblockstate)) {
					return flag ? 1 : 2;
				}

				if (enumfacing1 == EnumFacing.EAST && !isSameStair(p_176305_1_, p_176305_2_.east(), iblockstate)) {
					return flag ? 2 : 1;
				}
			}
		}

		return 0;
	}

	@Override
	public boolean func_176306_h(final IBlockAccess p_176306_1_, final BlockPos p_176306_2_) {
		final IBlockState iblockstate = p_176306_1_.getBlockState(p_176306_2_);
		final EnumFacing enumfacing = (EnumFacing) iblockstate.getValue(FACING);
		final BlockStairs.EnumHalf enumhalf = (BlockStairs.EnumHalf) iblockstate.getValue(HALF);
		final boolean flag = enumhalf == BlockStairs.EnumHalf.TOP;
		float f = 0.5F;
		float f1 = 1.0F;

		if (flag) {
			f = 0.0F;
			f1 = 0.5F;
		}

		float f2 = 0.0F;
		float f3 = 1.0F;
		float f4 = 0.0F;
		float f5 = 0.5F;
		boolean flag1 = true;
		IBlockState iblockstate1;
		Block block;
		EnumFacing enumfacing1;

		if (enumfacing == EnumFacing.EAST) {
			f2 = 0.5F;
			f5 = 1.0F;
			iblockstate1 = p_176306_1_.getBlockState(p_176306_2_.east());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.NORTH && !isSameStair(p_176306_1_, p_176306_2_.south(), iblockstate)) {
					f5 = 0.5F;
					flag1 = false;
				} else if (enumfacing1 == EnumFacing.SOUTH
						&& !isSameStair(p_176306_1_, p_176306_2_.north(), iblockstate)) {
					f4 = 0.5F;
					flag1 = false;
				}
			}
		} else if (enumfacing == EnumFacing.WEST) {
			f3 = 0.5F;
			f5 = 1.0F;
			iblockstate1 = p_176306_1_.getBlockState(p_176306_2_.west());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.NORTH && !isSameStair(p_176306_1_, p_176306_2_.south(), iblockstate)) {
					f5 = 0.5F;
					flag1 = false;
				} else if (enumfacing1 == EnumFacing.SOUTH
						&& !isSameStair(p_176306_1_, p_176306_2_.north(), iblockstate)) {
					f4 = 0.5F;
					flag1 = false;
				}
			}
		} else if (enumfacing == EnumFacing.SOUTH) {
			f4 = 0.5F;
			f5 = 1.0F;
			iblockstate1 = p_176306_1_.getBlockState(p_176306_2_.south());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.WEST && !isSameStair(p_176306_1_, p_176306_2_.east(), iblockstate)) {
					f3 = 0.5F;
					flag1 = false;
				} else if (enumfacing1 == EnumFacing.EAST
						&& !isSameStair(p_176306_1_, p_176306_2_.west(), iblockstate)) {
					f2 = 0.5F;
					flag1 = false;
				}
			}
		} else if (enumfacing == EnumFacing.NORTH) {
			iblockstate1 = p_176306_1_.getBlockState(p_176306_2_.north());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.WEST && !isSameStair(p_176306_1_, p_176306_2_.east(), iblockstate)) {
					f3 = 0.5F;
					flag1 = false;
				} else if (enumfacing1 == EnumFacing.EAST
						&& !isSameStair(p_176306_1_, p_176306_2_.west(), iblockstate)) {
					f2 = 0.5F;
					flag1 = false;
				}
			}
		}

		this.setBlockBounds(f2, f, f4, f3, f1, f5);
		return flag1;
	}

	@Override
	public boolean func_176304_i(final IBlockAccess p_176304_1_, final BlockPos p_176304_2_) {
		final IBlockState iblockstate = p_176304_1_.getBlockState(p_176304_2_);
		final EnumFacing enumfacing = (EnumFacing) iblockstate.getValue(FACING);
		final BlockStairs.EnumHalf enumhalf = (BlockStairs.EnumHalf) iblockstate.getValue(HALF);
		final boolean flag = enumhalf == BlockStairs.EnumHalf.TOP;
		float f = 0.5F;
		float f1 = 1.0F;

		if (flag) {
			f = 0.0F;
			f1 = 0.5F;
		}

		float f2 = 0.0F;
		float f3 = 0.5F;
		float f4 = 0.5F;
		float f5 = 1.0F;
		boolean flag1 = false;
		IBlockState iblockstate1;
		Block block;
		EnumFacing enumfacing1;

		if (enumfacing == EnumFacing.EAST) {
			iblockstate1 = p_176304_1_.getBlockState(p_176304_2_.west());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.NORTH && !isSameStair(p_176304_1_, p_176304_2_.north(), iblockstate)) {
					f4 = 0.0F;
					f5 = 0.5F;
					flag1 = true;
				} else if (enumfacing1 == EnumFacing.SOUTH
						&& !isSameStair(p_176304_1_, p_176304_2_.south(), iblockstate)) {
					f4 = 0.5F;
					f5 = 1.0F;
					flag1 = true;
				}
			}
		} else if (enumfacing == EnumFacing.WEST) {
			iblockstate1 = p_176304_1_.getBlockState(p_176304_2_.east());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				f2 = 0.5F;
				f3 = 1.0F;
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.NORTH && !isSameStair(p_176304_1_, p_176304_2_.north(), iblockstate)) {
					f4 = 0.0F;
					f5 = 0.5F;
					flag1 = true;
				} else if (enumfacing1 == EnumFacing.SOUTH
						&& !isSameStair(p_176304_1_, p_176304_2_.south(), iblockstate)) {
					f4 = 0.5F;
					f5 = 1.0F;
					flag1 = true;
				}
			}
		} else if (enumfacing == EnumFacing.SOUTH) {
			iblockstate1 = p_176304_1_.getBlockState(p_176304_2_.north());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				f4 = 0.0F;
				f5 = 0.5F;
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.WEST && !isSameStair(p_176304_1_, p_176304_2_.west(), iblockstate)) {
					flag1 = true;
				} else if (enumfacing1 == EnumFacing.EAST
						&& !isSameStair(p_176304_1_, p_176304_2_.east(), iblockstate)) {
					f2 = 0.5F;
					f3 = 1.0F;
					flag1 = true;
				}
			}
		} else if (enumfacing == EnumFacing.NORTH) {
			iblockstate1 = p_176304_1_.getBlockState(p_176304_2_.south());
			block = iblockstate1.getBlock();

			if (isBlockStairs(block) && enumhalf == iblockstate1.getValue(HALF)) {
				enumfacing1 = (EnumFacing) iblockstate1.getValue(FACING);

				if (enumfacing1 == EnumFacing.WEST && !isSameStair(p_176304_1_, p_176304_2_.west(), iblockstate)) {
					flag1 = true;
				} else if (enumfacing1 == EnumFacing.EAST
						&& !isSameStair(p_176304_1_, p_176304_2_.east(), iblockstate)) {
					f2 = 0.5F;
					f3 = 1.0F;
					flag1 = true;
				}
			}
		}

		if (flag1) {
			this.setBlockBounds(f2, f, f4, f3, f1, f5);
		}

		return flag1;
	}

	/**
	 * Add all collision boxes of this Block to the list that intersect with the
	 * given mask.
	 *
	 * @param collidingEntity
	 *            the Entity colliding with this Block
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void addCollisionBoxesToList(final World worldIn, final BlockPos pos, final IBlockState state,
			final AxisAlignedBB mask, final List list, final Entity collidingEntity) {
		this.setBaseCollisionBounds(worldIn, pos);
		super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
		final boolean flag = this.func_176306_h(worldIn, pos);
		super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);

		if (flag && this.func_176304_i(worldIn, pos)) {
			super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
		}

		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	@Override
	public void onBlockClicked(final World worldIn, final BlockPos pos, final EntityPlayer playerIn) {
		this.modelBlock.onBlockClicked(worldIn, pos, playerIn);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
		this.modelBlock.randomDisplayTick(worldIn, pos, state, rand);
	}

	/**
	 * Called when a player destroys this Block
	 */
	@Override
	public void onBlockDestroyedByPlayer(final World worldIn, final BlockPos pos, final IBlockState state) {
		this.modelBlock.onBlockDestroyedByPlayer(worldIn, pos, state);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getMixedBrightnessForBlock(final IBlockAccess worldIn, final BlockPos pos) {
		return this.modelBlock.getMixedBrightnessForBlock(worldIn, pos);
	}

	/**
	 * Returns how much this block can resist explosions from the passed in entity.
	 */
	@Override
	public float getExplosionResistance(final Entity exploder) {
		return this.modelBlock.getExplosionResistance(exploder);
	}

	/**
	 * How many world ticks before ticking
	 */
	@Override
	public int tickRate(final World worldIn) {
		return this.modelBlock.tickRate(worldIn);
	}

	@Override
	public Vec3 modifyAcceleration(final World worldIn, final BlockPos pos, final Entity entityIn, final Vec3 motion) {
		return this.modelBlock.modifyAcceleration(worldIn, pos, entityIn, motion);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer() {
		return this.modelBlock.getBlockLayer();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBox(final World worldIn, final BlockPos pos) {
		return this.modelBlock.getSelectedBoundingBox(worldIn, pos);
	}

	/**
	 * Returns if this block is collidable (only used by Fire). Args: x, y, z
	 */
	@Override
	public boolean isCollidable() {
		return this.modelBlock.isCollidable();
	}

	@Override
	public boolean canCollideCheck(final IBlockState state, final boolean hitIfLiquid) {
		return this.modelBlock.canCollideCheck(state, hitIfLiquid);
	}

	@Override
	public boolean canPlaceBlockAt(final World worldIn, final BlockPos pos) {
		return this.modelBlock.canPlaceBlockAt(worldIn, pos);
	}

	@Override
	public void onBlockAdded(final World worldIn, final BlockPos pos, final IBlockState state) {
		this.onNeighborBlockChange(worldIn, pos, this.modelState, Blocks.air);
		this.modelBlock.onBlockAdded(worldIn, pos, this.modelState);
	}

	@Override
	public void breakBlock(final World worldIn, final BlockPos pos, final IBlockState state) {
		this.modelBlock.breakBlock(worldIn, pos, this.modelState);
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the block)
	 */
	@Override
	public void onEntityCollidedWithBlock(final World worldIn, final BlockPos pos, final Entity entityIn) {
		this.modelBlock.onEntityCollidedWithBlock(worldIn, pos, entityIn);
	}

	@Override
	public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
		this.modelBlock.updateTick(worldIn, pos, state, rand);
	}

	@Override
	public boolean onBlockActivated(final World worldIn, final BlockPos pos, final IBlockState state,
			final EntityPlayer playerIn, final EnumFacing side, final float hitX, final float hitY, final float hitZ) {
		return this.modelBlock.onBlockActivated(worldIn, pos, this.modelState, playerIn, EnumFacing.DOWN, 0.0F, 0.0F,
				0.0F);
	}

	/**
	 * Called when this Block is destroyed by an Explosion
	 */
	@Override
	public void onBlockDestroyedByExplosion(final World worldIn, final BlockPos pos, final Explosion explosionIn) {
		this.modelBlock.onBlockDestroyedByExplosion(worldIn, pos, explosionIn);
	}

	/**
	 * Get the MapColor for this Block and the given BlockState
	 */
	@Override
	public MapColor getMapColor(final IBlockState state) {
		return this.modelBlock.getMapColor(this.modelState);
	}

	@Override
	public IBlockState onBlockPlaced(final World worldIn, final BlockPos pos, final EnumFacing facing, final float hitX,
			final float hitY, final float hitZ, final int meta, final EntityLivingBase placer) {
		IBlockState iblockstate = super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
		iblockstate = iblockstate.withProperty(FACING, placer.getHorizontalFacing()).withProperty(SHAPE,
				BlockStairs.EnumShape.STRAIGHT);
		return facing != EnumFacing.DOWN && (facing == EnumFacing.UP || hitY <= 0.5D)
				? iblockstate.withProperty(HALF, BlockStairs.EnumHalf.BOTTOM)
				: iblockstate.withProperty(HALF, BlockStairs.EnumHalf.TOP);
	}

	/**
	 * Ray traces through the blocks collision from start vector to end vector
	 * returning a ray trace hit.
	 *
	 * @param start
	 *            The start vector
	 * @param end
	 *            The end vector
	 */
	@Override
	public MovingObjectPosition collisionRayTrace(final World worldIn, final BlockPos pos, final Vec3 start,
			final Vec3 end) {
		final MovingObjectPosition[] amovingobjectposition = new MovingObjectPosition[8];
		final IBlockState iblockstate = worldIn.getBlockState(pos);
		final int i = ((EnumFacing) iblockstate.getValue(FACING)).getHorizontalIndex();
		final boolean flag = iblockstate.getValue(HALF) == BlockStairs.EnumHalf.TOP;
		final int[] aint = field_150150_a[i + (flag ? 4 : 0)];
		this.hasRaytraced = true;

		for (int j = 0; j < 8; ++j) {
			this.rayTracePass = j;

			if (Arrays.binarySearch(aint, j) < 0) {
				amovingobjectposition[j] = super.collisionRayTrace(worldIn, pos, start, end);
			}
		}

		final int[] aint1 = aint;
		final int k = aint.length;

		for (int l = 0; l < k; ++l) {
			final int i1 = aint1[l];
			amovingobjectposition[i1] = null;
		}

		MovingObjectPosition movingobjectposition1 = null;
		double d1 = 0.0D;
		final MovingObjectPosition[] amovingobjectposition1 = amovingobjectposition;
		final int j1 = amovingobjectposition.length;

		for (int k1 = 0; k1 < j1; ++k1) {
			final MovingObjectPosition movingobjectposition = amovingobjectposition1[k1];

			if (movingobjectposition != null) {
				final double d0 = movingobjectposition.hitVec.squareDistanceTo(end);

				if (d0 > d1) {
					movingobjectposition1 = movingobjectposition;
					d1 = d0;
				}
			}
		}

		return movingobjectposition1;
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	@Override
	public IBlockState getStateFromMeta(final int meta) {
		IBlockState iblockstate = this.getDefaultState().withProperty(HALF,
				(meta & 4) > 0 ? BlockStairs.EnumHalf.TOP : BlockStairs.EnumHalf.BOTTOM);
		iblockstate = iblockstate.withProperty(FACING, EnumFacing.getFront(5 - (meta & 3)));
		return iblockstate;
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	@Override
	public int getMetaFromState(final IBlockState state) {
		int i = 0;

		if (state.getValue(HALF) == BlockStairs.EnumHalf.TOP) {
			i |= 4;
		}

		i |= 5 - ((EnumFacing) state.getValue(FACING)).getIndex();
		return i;
	}

	/**
	 * Get the actual Block state of this Block at the given position. This applies
	 * properties not visible in the metadata, such as fence connections.
	 */
	@Override
	public IBlockState getActualState(final IBlockState state, final IBlockAccess worldIn, final BlockPos pos) {
		IBlockState newState = state;
		if (this.func_176306_h(worldIn, pos)) {
			switch (this.func_176305_g(worldIn, pos)) {
			case 0:
				newState = state.withProperty(SHAPE, BlockStairs.EnumShape.STRAIGHT);
				break;
			case 1:
				newState = state.withProperty(SHAPE, BlockStairs.EnumShape.INNER_RIGHT);
				break;
			case 2:
				newState = state.withProperty(SHAPE, BlockStairs.EnumShape.INNER_LEFT);
				break;
			default:
				break;
			}
		} else {
			switch (this.func_176307_f(worldIn, pos)) {
			case 0:
				newState = state.withProperty(SHAPE, BlockStairs.EnumShape.STRAIGHT);
				break;
			case 1:
				newState = state.withProperty(SHAPE, BlockStairs.EnumShape.OUTER_RIGHT);
				break;
			case 2:
				newState = state.withProperty(SHAPE, BlockStairs.EnumShape.OUTER_LEFT);
				break;
			default:
				break;
			}
		}

		return newState;
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { FACING, HALF, SHAPE });
	}

	public static enum EnumHalf implements IStringSerializable {
		TOP("top"), BOTTOM("bottom");
		private final String name;

		private EnumHalf(final String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	public static enum EnumShape implements IStringSerializable {
		STRAIGHT("straight"), INNER_LEFT("inner_left"), INNER_RIGHT("inner_right"), OUTER_LEFT(
				"outer_left"), OUTER_RIGHT("outer_right");
		private final String name;

		private EnumShape(final String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}
}
