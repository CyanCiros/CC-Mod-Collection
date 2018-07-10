package cc_more.blocks;

import java.util.Random;

import cc_more.Config;
import cc_more.world.MinersTeleporter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockModPortal extends BlockBreakable {
	public static final PropertyEnum AXIS = PropertyEnum.create("axis", EnumFacing.Axis.class,
			new EnumFacing.Axis[] { EnumFacing.Axis.X, EnumFacing.Axis.Z });

	public BlockModPortal(final String name) {
		super(Material.portal, false);
		this.setUnlocalizedName(name);
		this.setLightLevel(1.0F);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
		super.updateTick(worldIn, pos, state, rand);

		if (worldIn.provider.isSurfaceWorld() && worldIn.getGameRules().getGameRuleBooleanValue("doMobSpawning")
				&& rand.nextInt(2000) < worldIn.getDifficulty().getDifficultyId()) {
			final int i = pos.getY();
			BlockPos blockpos1;

			for (blockpos1 = pos; !World.doesBlockHaveSolidTopSurface(worldIn, blockpos1)
					&& blockpos1.getY() > 0; blockpos1 = blockpos1.down()) {
				// ;
			}

			if (i > 0 && !worldIn.getBlockState(blockpos1.up()).getBlock().isNormalCube()) {
				final Entity entity = ItemMonsterPlacer.spawnCreature(worldIn, 57, blockpos1.getX() + 0.5D,
						blockpos1.getY() + 1.1D, blockpos1.getZ() + 0.5D);

				if (entity != null) {
					entity.timeUntilPortal = entity.getPortalCooldown();
				}
			}
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(final World worldIn, final BlockPos pos, final IBlockState state) {
		return null;
	}

	@Override
	public void setBlockBoundsBasedOnState(final IBlockAccess worldIn, final BlockPos pos) {
		final EnumFacing.Axis axis = (EnumFacing.Axis) worldIn.getBlockState(pos).getValue(AXIS);
		float f = 0.125F;
		float f1 = 0.125F;

		if (axis == EnumFacing.Axis.X) {
			f = 0.5F;
		}

		if (axis == EnumFacing.Axis.Z) {
			f1 = 0.5F;
		}

		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, 1.0F, 0.5F + f1);
	}

	public static int getMetaForAxis(final EnumFacing.Axis axis) {
		return axis == EnumFacing.Axis.X ? 1 : axis == EnumFacing.Axis.Z ? 2 : 0;
	}

	@Override
	public boolean isFullCube() {
		return false;
	}

	/**
	 * Called when a neighboring block changes.
	 */
	@Override
	public void onNeighborBlockChange(final World worldIn, final BlockPos pos, final IBlockState state,
			final Block neighborBlock) {
		super.onNeighborBlockChange(worldIn, pos, state, neighborBlock);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(final IBlockAccess worldIn, final BlockPos pos, final EnumFacing side) {
		EnumFacing.Axis axis = null;
		final IBlockState iblockstate = worldIn.getBlockState(pos);

		if (worldIn.getBlockState(pos).getBlock() == this) {
			axis = (EnumFacing.Axis) iblockstate.getValue(AXIS);

			if (axis == null) {
				return false;
			}

			if (axis == EnumFacing.Axis.Z && side != EnumFacing.EAST && side != EnumFacing.WEST) {
				return false;
			}

			if (axis == EnumFacing.Axis.X && side != EnumFacing.SOUTH && side != EnumFacing.NORTH) {
				return false;
			}
		}

		final boolean flag = worldIn.getBlockState(pos.west()).getBlock() == this
				&& worldIn.getBlockState(pos.west(2)).getBlock() != this;
		final boolean flag1 = worldIn.getBlockState(pos.east()).getBlock() == this
				&& worldIn.getBlockState(pos.east(2)).getBlock() != this;
		final boolean flag2 = worldIn.getBlockState(pos.north()).getBlock() == this
				&& worldIn.getBlockState(pos.north(2)).getBlock() != this;
		final boolean flag3 = worldIn.getBlockState(pos.south()).getBlock() == this
				&& worldIn.getBlockState(pos.south(2)).getBlock() != this;
		final boolean flag4 = flag || flag1 || axis == EnumFacing.Axis.X;
		final boolean flag5 = flag2 || flag3 || axis == EnumFacing.Axis.Z;
		return flag4 && side == EnumFacing.WEST ? true
				: flag4 && side == EnumFacing.EAST ? true
						: flag5 && side == EnumFacing.NORTH ? true : flag5 && side == EnumFacing.SOUTH;
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(final Random random) {
		return 0;
	}

	@Override
	public void onEntityCollidedWithBlock(final World worldIn, final BlockPos pos, final IBlockState state,
			final Entity entityIn) {
		if (entityIn.ridingEntity == null && entityIn.riddenByEntity == null && entityIn instanceof EntityPlayerMP) {
			final EntityPlayerMP player = (EntityPlayerMP) entityIn;
			FMLCommonHandler.instance().getMinecraftServerInstance();
			final MinecraftServer server = MinecraftServer.getServer();

			if (player.timeUntilPortal > 0) {
				player.timeUntilPortal = 10;
			} else if (player.dimension != Config.minersDimension) {
				player.timeUntilPortal = 10;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, Config.minersDimension,
						new MinersTeleporter(server.worldServerForDimension(Config.minersDimension)));
			} else {
				player.timeUntilPortal = 10;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0,
						new MinersTeleporter(server.worldServerForDimension(0)));
			}
		}
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	@Override
	public IBlockState getStateFromMeta(final int meta) {
		return this.getDefaultState().withProperty(AXIS, (meta & 3) == 2 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.TRANSLUCENT;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
		if (rand.nextInt(100) == 0) {
			worldIn.playSound(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D, "portal.portal", 0.5F,
					rand.nextFloat() * 0.4F + 0.8F, false);
		}

		for (int i = 0; i < 4; ++i) {
			double d0 = pos.getX() + rand.nextFloat();
			final double d1 = pos.getY() + rand.nextFloat();
			double d2 = pos.getZ() + rand.nextFloat();
			double d3 = (rand.nextFloat() - 0.5D) * 0.5D;
			final double d4 = (rand.nextFloat() - 0.5D) * 0.5D;
			double d5 = (rand.nextFloat() - 0.5D) * 0.5D;
			final int j = rand.nextInt(2) * 2 - 1;

			if (worldIn.getBlockState(pos.west()).getBlock() != this
					&& worldIn.getBlockState(pos.east()).getBlock() != this) {
				d0 = pos.getX() + 0.5D + 0.25D * j;
				d3 = rand.nextFloat() * 2.0F * j;
			} else {
				d2 = pos.getZ() + 0.5D + 0.25D * j;
				d5 = rand.nextFloat() * 2.0F * j;
			}

			worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5, new int[0]);
		}
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	@Override
	public int getMetaFromState(final IBlockState state) {
		return getMetaForAxis((EnumFacing.Axis) state.getValue(AXIS));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(final World worldIn, final BlockPos pos) {
		return null;
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { AXIS });
	}

	@SuppressWarnings("unused")
	public static class Size {
		private final World world;
		private final EnumFacing.Axis axis;
		private final EnumFacing field_150866_c;
		private final EnumFacing field_150863_d;
		private int field_150864_e = 0;
		private BlockPos field_150861_f;
		private int field_150862_g;
		private int field_150868_h;
		private static final String __OBFID = "CL_00000285";

		public Size(final World worldIn, final BlockPos p_i45694_2_, final EnumFacing.Axis p_i45694_3_) {
			this.world = worldIn;
			this.axis = p_i45694_3_;

			if (p_i45694_3_ == EnumFacing.Axis.X) {
				this.field_150863_d = EnumFacing.EAST;
				this.field_150866_c = EnumFacing.WEST;
			} else {
				this.field_150863_d = EnumFacing.NORTH;
				this.field_150866_c = EnumFacing.SOUTH;
			}

			// for (final BlockPos blockpos1 = p_i45694_2_; p_i45694_2_.getY() >
			// blockpos1.getY() - 21
			// && p_i45694_2_.getY() > 0 && this.func_150857_a(
			// worldIn.getBlockState(p_i45694_2_.down()).getBlock()); p_i45694_2_ =
			// p_i45694_2_.down()) {
			// ;
			// }

			final int i = this.func_180120_a(p_i45694_2_, this.field_150863_d) - 1;

			if (i >= 0) {
				this.field_150861_f = p_i45694_2_.offset(this.field_150863_d, i);
				this.field_150868_h = this.func_180120_a(this.field_150861_f, this.field_150866_c);

				if (this.field_150868_h < 2 || this.field_150868_h > 21) {
					this.field_150861_f = null;
					this.field_150868_h = 0;
				}
			}

			if (this.field_150861_f != null) {
				this.field_150862_g = this.func_150858_a();
			}
		}

		protected int func_180120_a(final BlockPos p_180120_1_, final EnumFacing p_180120_2_) {
			int i;

			for (i = 0; i < 22; ++i) {
				final BlockPos blockpos1 = p_180120_1_.offset(p_180120_2_, i);

				if (!this.func_150857_a(this.world.getBlockState(blockpos1).getBlock())
						|| this.world.getBlockState(blockpos1.down()).getBlock() != Blocks.obsidian) {
					break;
				}
			}

			final Block block = this.world.getBlockState(p_180120_1_.offset(p_180120_2_, i)).getBlock();
			return block == Blocks.obsidian ? i : 0;
		}

		protected int func_150858_a() {
			int i;
			label56:

			for (this.field_150862_g = 0; this.field_150862_g < 21; ++this.field_150862_g) {
				for (i = 0; i < this.field_150868_h; ++i) {
					final BlockPos blockpos = this.field_150861_f.offset(this.field_150866_c, i)
							.up(this.field_150862_g);
					Block block = this.world.getBlockState(blockpos).getBlock();

					if (!this.func_150857_a(block)) {
						break label56;
					}

					if (block == Blocks.portal) {
						++this.field_150864_e;
					}

					if (i == 0) {
						block = this.world.getBlockState(blockpos.offset(this.field_150863_d)).getBlock();

						if (block != Blocks.obsidian) {
							break label56;
						}
					} else if (i == this.field_150868_h - 1) {
						block = this.world.getBlockState(blockpos.offset(this.field_150866_c)).getBlock();

						if (block != Blocks.obsidian) {
							break label56;
						}
					}
				}
			}

			for (i = 0; i < this.field_150868_h; ++i) {
				if (this.world.getBlockState(this.field_150861_f.offset(this.field_150866_c, i).up(this.field_150862_g))
						.getBlock() != Blocks.obsidian) {
					this.field_150862_g = 0;
					break;
				}
			}

			if (this.field_150862_g <= 21 && this.field_150862_g >= 3) {
				return this.field_150862_g;
			}
			this.field_150861_f = null;
			this.field_150868_h = 0;
			this.field_150862_g = 0;
			return 0;
		}

		protected boolean func_150857_a(final Block p_150857_1_) {
			return p_150857_1_.getMaterial() == Material.air || p_150857_1_ == Blocks.fire
					|| p_150857_1_ == Blocks.portal;
		}

		public boolean func_150860_b() {
			return this.field_150861_f != null && this.field_150868_h >= 2 && this.field_150868_h <= 21
					&& this.field_150862_g >= 3 && this.field_150862_g <= 21;
		}

		public void func_150859_c() {
			for (int i = 0; i < this.field_150868_h; ++i) {
				final BlockPos blockpos = this.field_150861_f.offset(this.field_150866_c, i);

				for (int j = 0; j < this.field_150862_g; ++j) {
					this.world.setBlockState(blockpos.up(j),
							Blocks.portal.getDefaultState().withProperty(BlockPortal.AXIS, this.axis), 2);
				}
			}
		}
	}
}
