package cc_harvest.blocks;

import java.util.Random;

import cc_harvest.CCHarvest;
import cc_harvest.items.ModItems;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class BlockSalt extends BlockOre {
	private final Random rand = new Random();

	public BlockSalt(final String name) {
		this.setUnlocalizedName(name);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setCreativeTab(CCHarvest.creativeTab);
	}

	@Override
	public int quantityDropped(final Random random) {
		return this == ModBlocks.salt ? 1 + random.nextInt(3) : 1;
	}

	@Override
	public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
		return ModItems.saltItem;
	}

	@Override
	public int getExpDrop(final IBlockAccess world, final BlockPos pos, final int fortune) {
		if (this.getItemDropped(world.getBlockState(pos), this.rand, fortune) != Item.getItemFromBlock(this)) {
			int j1 = 0;
			if (this == ModBlocks.salt) {
				j1 = MathHelper.getRandomIntegerInRange(this.rand, 0, 2);
			}
			return j1;
		}
		return 0;
	}
}
