package cc_harvest.items;

import cc_harvest.CCHarvest;
import net.minecraft.item.Item;

public class ModItem extends Item {
	public ModItem(final String name) {
		this.setUnlocalizedName(name);
		this.setMaxStackSize(64);
		this.setCreativeTab(CCHarvest.creativeTab);
	}

	public ModItem(final String name, final int stackSize) {
		this.setUnlocalizedName(name);
		this.setMaxStackSize(stackSize);
		this.setCreativeTab(CCHarvest.creativeTab);
	}
}
