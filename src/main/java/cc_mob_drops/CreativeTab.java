package cc_mob_drops;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cc_mob_drops.items.ModItems;

public class CreativeTab extends CreativeTabs {

	public CreativeTab(final String name) {
		super(name);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.magmaGoo;
	}
}
