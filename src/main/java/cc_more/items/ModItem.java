package cc_more.items;

import cc_more.CCMore;
import net.minecraft.item.Item;

public class ModItem extends Item {
	public ModItem(final String name) {
		this.setUnlocalizedName(name);
		this.setMaxStackSize(64);
		this.setCreativeTab(CCMore.creativeTab);
	}

	public ModItem(final String name, final int stackSize) {
		this.setUnlocalizedName(name);
		this.setMaxStackSize(stackSize);
		this.setCreativeTab(CCMore.creativeTab);
	}
}
