package cc_cyan_weapons;

import cc_cyan_weapons.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {
	public CreativeTab(final String name) {
		super(name);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.essenceMixed;
	}
}
