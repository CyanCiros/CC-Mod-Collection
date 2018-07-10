package cc_harvest.manager;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

@SuppressWarnings("rawtypes")
class RecipeSorterCuttingBoard implements Comparator {
	final CraftingManagerCuttingBoard craftingManangerCuttingBoard;

	RecipeSorterCuttingBoard(final CraftingManagerCuttingBoard craftingManangerCuttingBoard) {
		this.craftingManangerCuttingBoard = craftingManangerCuttingBoard;
	}

	public int compareRecipes(final IRecipe iRecipe1, final IRecipe iRecipe2) {
		return iRecipe2.getRecipeSize() > iRecipe1.getRecipeSize() ? 1
				: iRecipe2.getRecipeSize() < iRecipe1.getRecipeSize() ? -1
						: iRecipe2 instanceof ShapelessRecipes && iRecipe1 instanceof ShapedRecipes ? -1
								: iRecipe1 instanceof ShapelessRecipes && iRecipe2 instanceof ShapedRecipes ? 1 : 0;
	}

	@Override
	public int compare(final Object object1, final Object object2) {
		return this.compareRecipes((IRecipe) object1, (IRecipe) object2);
	}
}
