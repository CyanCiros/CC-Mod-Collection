package cc_more_crafting_recipes;

import cc_more_crafting_recipes.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {

	public CreativeTab(final String name) {
		super(name);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.appleStack;
	}
}
