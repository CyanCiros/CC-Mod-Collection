package cc_harvest.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import cc_harvest.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingManagerCuttingBoard {
	private static final CraftingManagerCuttingBoard instance = new CraftingManagerCuttingBoard();
	private List<IRecipe> recipes = new ArrayList<IRecipe>();

	public static final CraftingManagerCuttingBoard getInstance() {
		return instance;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private CraftingManagerCuttingBoard() {
		this.recipes = new ArrayList();

		// Salad
		this.addRecipe(ModItems.citrusSaladItem,
				new Object[] { "listAllCitrus", ModItems.lettuceItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.cucumberSaladItem, new Object[] { ModItems.cucumberItem, ModItems.springSaladItem });
		this.addRecipe(ModItems.eggSaladItem,
				new Object[] { ModItems.boiledEggItem, ModItems.mayoItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.fruitSaladItem,
				new Object[] { "listAllFruit", "listAllFruit", ModItems.mixingBowlItem });
		this.addRecipe(ModItems.mixedSaladItem,
				new Object[] { ModItems.mixingBowlItem, "listAllVeggie", "listAllVeggie", ModItems.saladDressingItem });
		this.addRecipe(ModItems.potatoSaladItem,
				new Object[] { Items.baked_potato, ModItems.mayoItem, ModItems.mixingBowlItem });

		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, Items.carrot, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.onionItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.radishItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.cucumberItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.bellpepperItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.spiceleafItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.zucchiniItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.asparagusItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.broccoliItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.peasItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.tomatoItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, Items.carrot, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.walnutItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.cauliflowerItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.springSaladItem,
				new Object[] { ModItems.lettuceItem, ModItems.rhubarbItem, ModItems.mixingBowlItem });

		this.addRecipe(ModItems.porkLettuceWrapItem, new Object[] { ModItems.lettuceItem, "listAllPorkCooked" });
		this.addRecipe(ModItems.fishLettuceWrapItem, new Object[] { ModItems.lettuceItem, "listAllFishCooked" });
		this.addRecipe(ModItems.bltItem,
				new Object[] { ModItems.lettuceItem, ModItems.tomatoItem, "listAllPorkCooked", ModItems.toastItem });
		this.addRecipe(ModItems.nachoesItem, new Object[] { ModItems.tortillaItem, ModItems.cheeseItem });
		this.addRecipe(ModItems.PBAndJItem,
				new Object[] { ModItems.peanutButterItem, ModItems.grapeJellyItem, Items.bread });
		this.addRecipe(ModItems.vegetarianLettuceWrapItem,
				new Object[] { ModItems.cucumberItem, ModItems.lettuceItem, ModItems.tomatoItem });
		this.addRecipe(ModItems.grilledSkewersItem,
				new Object[] { ModItems.bellpepperItem, ModItems.onionItem, Items.carrot, Items.stick });
		this.addRecipe(ModItems.supremePizzaItem, new Object[] { ModItems.pizzaItem, ModItems.bellpepperItem,
				ModItems.onionItem, ModItems.spiceleafItem });
		this.addRecipe(ModItems.guacamoleItem, new Object[] { ModItems.mixingBowlItem, ModItems.avocadoItem,
				ModItems.chilipepperItem, ModItems.tomatoItem, ModItems.onionItem, ModItems.spiceleafItem });
		this.addRecipe(ModItems.avocadoBurritoItem, new Object[] { ModItems.avocadoItem, ModItems.tortillaItem,
				ModItems.cheeseItem, Items.cooked_chicken });
		this.addRecipe(ModItems.avocadoBurritoItem, new Object[] { ModItems.avocadoItem, ModItems.tortillaItem,
				ModItems.cheeseItem, Items.cooked_porkchop });
		this.addRecipe(ModItems.footlongItem, new Object[] { Items.bread, "listAllMeatCooked", ModItems.lettuceItem,
				ModItems.tomatoItem, ModItems.mayoItem });
		this.addRecipe(ModItems.sushiItem, new Object[] { "listAllFishRaw", ModItems.seaweedItem, ModItems.riceItem });

		// Jelly Sandwich
		this.addRecipe(ModItems.appleJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.appleJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.apricotJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.apricotJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.blackberryJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.blackberryJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.blueberryJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.blueberryJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.cherryJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.cherryJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.cranberryJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.cranberryJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.figJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.figJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.grapefruitJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.grapefruitJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.kiwiJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.kiwiJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.lemonJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.lemonJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.limeJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.limeJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.mangoJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.mangoJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.orangeJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.orangeJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.papayaJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.papayaJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.peachJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.peachJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.persimmonJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.persimmonJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.pomegranateJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.pomegranateJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.raspberryJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.raspberryJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.starfruitJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.starfruitJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.strawberryJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.strawberryJellyItem, ModItems.toastSandwichItem });
		this.addRecipe(ModItems.watermelonJellySandwichItem,
				new Object[] { ModItems.peanutButterItem, ModItems.watermelonJellyItem, ModItems.toastSandwichItem });

		this.addRecipe(ModItems.edibleRootItem, new Object[] { ModItems.spiceleafItem });

		Collections.sort(this.recipes, new RecipeSorterCuttingBoard(this));
	}

	private void addRecipe(final Item item, final Object[] objects) {
		this.recipes.add(new ShapelessOreRecipe(item, objects));
	}

	public ItemStack findMatchingRecipe(final InventoryCrafting inventoryCrafting, final World world) {
		int i = 0;

		ItemStack itemStack1 = null;
		ItemStack itemStack2 = null;

		for (int j = 0; j < inventoryCrafting.getSizeInventory(); j++) {
			final ItemStack itemstack2 = inventoryCrafting.getStackInSlot(j);

			if (itemstack2 != null) {
				if (i == 0) {
					itemStack1 = itemstack2;
				}
				if (i == 1) {
					itemStack2 = itemstack2;
				}
				i++;
			}
		}
		if (itemStack1 != null && itemStack2 != null) {
			if (i == 2 && itemStack1.getItem() == itemStack2.getItem() && itemStack1.stackSize == 1
					&& itemStack2.stackSize == 1 && itemStack1.getItem().isRepairable()) {
				final Item item = itemStack1.getItem();

				final int j1 = item.getMaxDamage() - itemStack1.getItemDamage();
				final int k = item.getMaxDamage() - itemStack2.getItemDamage();
				final int l = j1 + k + item.getMaxDamage() * 5 / 100;

				int i1 = item.getMaxDamage() - l;

				if (i1 < 0) {
					i1 = 0;
				}
				return new ItemStack(itemStack1.getItem(), 1, i1);
			}
			for (int j = 0; j < this.recipes.size(); j++) {
				final IRecipe irecipe = this.recipes.get(j);

				if (irecipe.matches(inventoryCrafting, world)) {
					return irecipe.getCraftingResult(inventoryCrafting);
				}
			}
		}
		return null;
	}

	public ItemStack[] func_180303_b(final InventoryCrafting inventoryCrafting, final World world) {
		final Iterator<IRecipe> iterator = this.recipes.iterator();

		while (iterator.hasNext()) {
			final IRecipe irecipe = iterator.next();

			if (irecipe.matches(inventoryCrafting, world)) {
				return irecipe.getRemainingItems(inventoryCrafting);
			}
		}

		final ItemStack[] aitemstack = new ItemStack[inventoryCrafting.getSizeInventory()];

		for (int i = 0; i < aitemstack.length; ++i) {
			aitemstack[i] = inventoryCrafting.getStackInSlot(i);
		}

		return aitemstack;
	}
}
