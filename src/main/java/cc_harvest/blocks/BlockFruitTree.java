package cc_harvest.blocks;

import java.util.List;
import java.util.Random;

import cc_harvest.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFruitTree extends BlockCrops {
	public int ages = 7;
	public int light = 9;
	public int speed = 18;
	public BlockFruitTree block;

	public BlockFruitTree(final String name) {
		this.setUnlocalizedName(name);
		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
		this.block = this;
	}

	@Override
	public void updateTick(final World world, final BlockPos pos, final IBlockState state, final Random rand) {
		super.updateTick(world, pos, state, rand);

		if (!this.canBlockStay(world, pos, state)) {
			world.destroyBlock(pos, false);
		}

		final int i = ((Integer) state.getValue(AGE)).intValue();

		if (i < this.ages) {
			if (rand.nextInt(this.speed) == 0) {
				world.setBlockState(pos, state.cycleProperty(AGE));
			}
		}
	}

	@Override
	public void grow(final World worldIn, final Random random, final BlockPos pos, final IBlockState state) {
		int i = ((Integer) state.getValue(AGE)).intValue() + MathHelper.getRandomIntegerInRange(worldIn.rand, 2, 5);

		if (i > this.ages) {
			i = this.ages;
		}

		worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i)));
	}

	@Override
	public List<ItemStack> getDrops(final IBlockAccess world, final BlockPos pos, final IBlockState state,
			final int fortune) {
		final List<ItemStack> ret = new java.util.ArrayList<ItemStack>();

		final Random rand = world instanceof World ? ((World) world).rand : RANDOM;

		final int count = this.quantityDropped(state, fortune, rand);

		for (int i = 0; i < count; i++) {
			final Item item = this.getItemDropped(state, rand, fortune);

			if (item != null) {
				ret.add(new ItemStack(item, 1, this.damageDropped(state)));
			}
		}
		return ret;
	}

	@Override
	public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
		if (this == ModBlocks.cinnamon) {
			return ModItems.cinnamonItem;
		} else if (this == ModBlocks.maple) {
			return ModItems.mapleSyrupItem;
		} else if (this == ModBlocks.paperbark) {
			return Items.paper;
		}
		return Items.wheat;
	}

	@Override
	public int quantityDropped(final Random random) {
		return 1;
	}

	@Override
	public boolean canBlockStay(final World world, final BlockPos pos, final IBlockState state) {
		return world.getLight(pos) >= this.light;
	}

	@Override
	public float getBlockHardness(final World world, final BlockPos pos) {
		if (world.getBlockState(pos).getBlock() == this.block) {
			if (((Integer) world.getBlockState(pos).getValue(AGE)).intValue() < this.ages) {
				return 3.0F;
			}
		}
		return 0.0f;
	}

	@Override
	public boolean canGrow(final World worldIn, final BlockPos pos, final IBlockState state, final boolean isClient) {
		return ((Integer) state.getValue(AGE)).intValue() < this.ages;
	}

	@Override
	public boolean canUseBonemeal(final World worldIn, final Random rand, final BlockPos pos, final IBlockState state) {
		return false;
	}

	@Override
	public void breakBlock(final World world, final BlockPos pos, final IBlockState state) {
		if (((Integer) state.getValue(AGE)).intValue() == this.ages) {
			world.setBlockState(pos, this.block.getDefaultState().withProperty(AGE, 0));

			final EntityItem entity = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(),
					new ItemStack(this.getItemDropped(state, null, 0)));
			world.spawnEntityInWorld(entity);
		}
	}

	@Override
	public void onNeighborBlockChange(final World world, final BlockPos pos, final IBlockState state,
			final Block neighborBlock) {
		if (!this.canBlockStay(world, pos, state)) {
			world.destroyBlock(pos, false);

			if (!this.canBlockStay(world, pos, state)) {
				world.destroyBlock(pos, false);
			}
		}
	}
}
