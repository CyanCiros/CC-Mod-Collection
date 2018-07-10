package cc_harvest.blocks;

import java.util.Random;

import cc_harvest.CCHarvest;
import cc_harvest.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockBeehive extends Block {
	public BlockBeehive(final Material material, final String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setHardness(1.0F);
		this.setStepSound(Block.soundTypeWood);
		this.setCreativeTab(CCHarvest.creativeTab);
	}

	@Override
	public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
		return ModItems.queenBeeItem;
	}

	@Override
	public int getRenderType() {
		return 3;
	}
}
