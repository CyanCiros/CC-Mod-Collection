package cc_harvest.blocks;

import java.util.Random;

import cc_harvest.Config;
import cc_harvest.CCHarvest;
import cc_harvest.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockMushroomGarden extends BlockBush {
	Random random;

	public BlockMushroomGarden(final String name) {
		super(Material.plants);
		this.setUnlocalizedName(name);
		final float var4 = 0.2F;
		this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
		this.setStepSound(Block.soundTypeGrass);
		this.setCreativeTab(CCHarvest.creativeTab);

		this.random = new Random();
	}

	@Override
	protected boolean canPlaceBlockOn(final Block block) {
		return block == Blocks.log;
	}

	@Override
	public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
		final int i = rand.nextInt(3);

		switch (i) {
		case 0:
			return Item.getItemFromBlock(Blocks.brown_mushroom);
		case 1:
			return Item.getItemFromBlock(Blocks.red_mushroom);
		default:
			return ModItems.whiteMushroomItem;
		}
	}

	@Override
	public int quantityDropped(final Random random) {
		return Config.gardenDropAmount;
	}

	@Override
	public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {

	}

	@Override
	public void breakBlock(final World world, final BlockPos pos, final IBlockState state) {
		for (int i = 0; i < 3; i++) {
			final EntityItem entity = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(
					this.getItemDropped(state, this.random, 0), this.random.nextInt(Config.gardenDropAmount) + 1));

			world.spawnEntityInWorld(entity);
		}
	}
}
