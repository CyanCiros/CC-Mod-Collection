package cc_emerald.blocks;

import java.util.Random;

import cc_emerald.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModCropGlowstone extends BlockCrops {
	@SuppressWarnings("unused")
	public ModCropGlowstone(final String name, final Item itemSeed, final Item itemDrop) {
		super();
		this.setUnlocalizedName(name);
		// this.setCreativeTab(Main.creativeTab);
	}

	@Override
	protected boolean canPlaceBlockOn(final Block ground) {
		return ground == Blocks.farmland;
	}

	@Override
	public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
		super.updateTick(worldIn, pos, state, rand);

		if (worldIn.getLightFromNeighbors(pos.up()) >= 9) {
			final int i = ((Integer) state.getValue(AGE)).intValue();

			if (i < 7) {
				final float f = getGrowthChance(this, worldIn, pos);

				if (rand.nextInt((int) (25.0F / f) + 1) == 0) {
					worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i + 1)), 2);
				}
			}
		}
	}

	@Override
	public void grow(final World worldIn, final BlockPos pos, final IBlockState state) {
		int i = ((Integer) state.getValue(AGE)).intValue() + MathHelper.getRandomIntegerInRange(worldIn.rand, 2, 5);

		if (i > 7) {
			i = 7;
		}

		worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i)), 2);
	}

	protected static float getGrowthChance(final Block blockIn, final World worldIn, final BlockPos pos) {
		float f = 1.0F;
		final BlockPos blockpos1 = pos.down();

		for (int i = -1; i <= 1; ++i) {
			for (int j = -1; j <= 1; ++j) {
				float f1 = 0.0F;
				final IBlockState iblockstate = worldIn.getBlockState(blockpos1.add(i, 0, j));

				if (iblockstate.getBlock().canSustainPlant(worldIn, blockpos1.add(i, 0, j),
						net.minecraft.util.EnumFacing.UP, (net.minecraftforge.common.IPlantable) blockIn)) {
					f1 = 1.0F;

					if (iblockstate.getBlock().isFertile(worldIn, blockpos1.add(i, 0, j))) {
						f1 = 3.0F;
					}
				}

				if (i != 0 || j != 0) {
					f1 /= 4.0F;
				}

				f += f1;
			}
		}

		final BlockPos blockpos2 = pos.north();
		final BlockPos blockpos3 = pos.south();
		final BlockPos blockpos4 = pos.west();
		final BlockPos blockpos5 = pos.east();
		final boolean flag = blockIn == worldIn.getBlockState(blockpos4).getBlock()
				|| blockIn == worldIn.getBlockState(blockpos5).getBlock();
		final boolean flag1 = blockIn == worldIn.getBlockState(blockpos2).getBlock()
				|| blockIn == worldIn.getBlockState(blockpos3).getBlock();

		if (flag && flag1) {
			f /= 2.0F;
		} else {
			final boolean flag2 = blockIn == worldIn.getBlockState(blockpos4.north()).getBlock()
					|| blockIn == worldIn.getBlockState(blockpos5.north()).getBlock()
					|| blockIn == worldIn.getBlockState(blockpos5.south()).getBlock()
					|| blockIn == worldIn.getBlockState(blockpos4.south()).getBlock();

			if (flag2) {
				f /= 2.0F;
			}
		}

		return f;
	}

	@Override
	public boolean canBlockStay(final World worldIn, final BlockPos pos, final IBlockState state) {
		return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && worldIn.getBlockState(pos.down()).getBlock()
				.canSustainPlant(worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
	}

	@Override
	protected Item getSeed() {
		return ModItems.glowstoneSeeds;
	}

	@Override
	protected Item getCrop() {
		return Items.glowstone_dust;
	}

	@Override
	public void dropBlockAsItemWithChance(final World worldIn, final BlockPos pos, final IBlockState state,
			final float chance, final int fortune) {
		super.dropBlockAsItemWithChance(worldIn, pos, state, chance, 0);
	}

	@Override
	public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
		return ((Integer) state.getValue(AGE)).intValue() == 7 ? this.getCrop() : this.getSeed();
	}

	@Override
	public boolean canGrow(final World worldIn, final BlockPos pos, final IBlockState state, final boolean isClient) {
		return ((Integer) state.getValue(AGE)).intValue() < 7;
	}

	@Override
	public boolean canUseBonemeal(final World worldIn, final Random rand, final BlockPos pos, final IBlockState state) {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(final World worldIn, final BlockPos pos) {
		return this.getSeed();
	}

	@Override
	public void grow(final World worldIn, final Random rand, final BlockPos pos, final IBlockState state) {
		this.grow(worldIn, pos, state);
	}

	@Override
	public IBlockState getStateFromMeta(final int meta) {
		return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	}

	@Override
	public int getMetaFromState(final IBlockState state) {
		return ((Integer) state.getValue(AGE)).intValue();
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { AGE });
	}

	@Override
	public java.util.List<ItemStack> getDrops(final net.minecraft.world.IBlockAccess world, final BlockPos pos,
			final IBlockState state, final int fortune) {
		final java.util.List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
		final int age = ((Integer) state.getValue(AGE)).intValue();
		final Random rand = world instanceof World ? ((World) world).rand : new Random();

		if (age >= 7) {
			for (int i = 0; i < 2 + fortune; ++i) {
				if (rand.nextInt(15) <= age) {
					ret.add(new ItemStack(this.getSeed(), 1, 0));
				}
			}
		}
		return ret;
	}
}
