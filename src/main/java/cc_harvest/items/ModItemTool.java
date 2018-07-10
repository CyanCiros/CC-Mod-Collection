package cc_harvest.items;

import cc_harvest.CCHarvest;
import net.minecraft.item.Item;

public class ModItemTool extends Item {
	public ModItemTool(final String name) {
		this.setUnlocalizedName(name);
		this.setContainerItem(this);
		this.setMaxStackSize(1);
		this.setCreativeTab(CCHarvest.creativeTab);
	}
}
