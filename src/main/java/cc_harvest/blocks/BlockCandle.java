package cc_harvest.blocks;

import cc_harvest.CCHarvest;
import net.minecraft.block.BlockTorch;

public class BlockCandle extends BlockTorch {
	protected BlockCandle(final String name, final float light) {
		this.setUnlocalizedName(name);
		this.setLightLevel(light);
		this.setCreativeTab(CCHarvest.creativeTab);
	}
}
