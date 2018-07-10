package cc_more_crafting_recipes.items;

import cc_more_crafting_recipes.CCMoreCraftingRecipes;
import net.minecraft.item.Item;

public class ModItem extends Item {
	public ModItem(final String name) {
		this.setCreativeTab(CCMoreCraftingRecipes.creativeTab);
		this.setMaxStackSize(64);
		this.setUnlocalizedName(name);
	}
}
