package cc_harvest.items;

import cc_harvest.CCHarvest;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ModItemSeeds extends ItemSeeds {
	public ModItemSeeds(final String name, final Block crop, final Block soil) {
		super(crop, soil);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCHarvest.creativeTab);
	}
}
