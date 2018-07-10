package cc_harvest.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import cc_harvest.Config;
import cc_harvest.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingManagerPot {
	private static final CraftingManagerPot instance = new CraftingManagerPot();
	private List<IRecipe> recipes = new ArrayList<IRecipe>();

	public static final CraftingManagerPot getInstance() {
		return instance;
	}

	private CraftingManagerPot() {
		this.recipes = new ArrayList<IRecipe>();

		if (Config.enableSaltFromWaterBucketRecipe) {
			this.addRecipe(ModItems.saltItem, new Object[] { ModItems.freshWaterItem });
		}
		this.addRecipe(Items.sugar, new Object[] { ModItems.honeyItem });

		this.addRecipe(ModItems.waxItem, new Object[] { ModItems.candleberryItem, ModItems.candleberryItem,
				ModItems.candleberryItem, ModItems.candleberryItem });

		this.addRecipe(ModItems.cheeseItem, new Object[] { "listAllMilk", ModItems.saltItem });
		this.addRecipe(ModItems.iceCreamItem,
				new Object[] { "listAllMilk", ModItems.saltItem, Items.snowball, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.appleSauceItem, new Object[] { Items.apple, ModItems.mixingBowlItem });

		this.addRecipe(new ItemStack(ModItems.stockItem, 3), new Object[] { Items.bone, ModItems.mixingBowlItem });
		this.addRecipe(new ItemStack(ModItems.stockItem, 3),
				new Object[] { "listAllMeatRaw", ModItems.mixingBowlItem });
		this.addRecipe(new ItemStack(ModItems.stockItem, 3), new Object[] { "listAllVeggie", ModItems.mixingBowlItem });

		this.addRecipe(ModItems.bambooSteamedRiceItem, new Object[] { ModItems.riceItem, ModItems.bambooShootItem });

		// Soup
		this.addRecipe(ModItems.asparagusSoupItem,
				new Object[] { ModItems.asparagusItem, ModItems.onionItem, ModItems.butterItem, ModItems.stockItem });
		this.addRecipe(ModItems.beetSoupItem, new Object[] { ModItems.mixingBowlItem, ModItems.beetItem,
				ModItems.onionItem, ModItems.blackPepperItem, "listAllMilk" });
		this.addRecipe(ModItems.cactusSoupItem, new Object[] { Blocks.cactus, ModItems.stockItem });
		this.addRecipe(ModItems.carrotSoupItem,
				new Object[] { Items.carrot, "listAllReplaceHeavyCream", ModItems.stockItem });
		this.addRecipe(ModItems.celerySoupItem,
				new Object[] { ModItems.celeryItem, ModItems.onionItem, Items.carrot, ModItems.stockItem });
		this.addRecipe(ModItems.chickenNoodleSoupItem,
				new Object[] { "listAllChickenRaw", Items.carrot, ModItems.pastaItem, ModItems.stockItem });
		this.addRecipe(ModItems.creamedBroccoliSoupItem, new Object[] { ModItems.broccoliItem, Items.carrot,
				ModItems.flourItem, ModItems.blackPepperItem, ModItems.stockItem });
		this.addRecipe(ModItems.creamOfAvocadoSoupItem, new Object[] { ModItems.avocadoItem, "listAllReplaceHeavyCream",
				ModItems.limeItem, ModItems.spiceleafItem, ModItems.stockItem });
		this.addRecipe(ModItems.cucumberSoupItem,
				new Object[] { ModItems.cucumberItem, ModItems.stockItem, "listAllReplaceHeavyCream" });
		this.addRecipe(ModItems.gardenSoupItem,
				new Object[] { ModItems.mixingBowlItem, ModItems.stockItem, "listAllVeggie", "listAllVeggie" });
		this.addRecipe(ModItems.lambBarleySoupItem, new Object[] { ModItems.stockItem, "listAllMuttonRaw",
				ModItems.onionItem, Items.carrot, ModItems.barleyItem });
		this.addRecipe(ModItems.leekBaconSoupItem,
				new Object[] { ModItems.leekItem, "listAllPorkCooked", Items.potato, "listAllReplaceHeavyCream" });
		this.addRecipe(ModItems.oldWorldVeggieSoupItem,
				new Object[] { ModItems.stockItem, ModItems.onionItem, ModItems.peasItem, ModItems.barleyItem });
		this.addRecipe(ModItems.onionSoupItem,
				new Object[] { ModItems.onionItem, ModItems.stockItem, ModItems.grilledCheeseItem });
		this.addRecipe(ModItems.pumpkinSoupItem, new Object[] { Blocks.pumpkin, "listAllReplaceHeavyCream",
				ModItems.stockItem, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.potatoSoupItem, new Object[] { Items.potato, ModItems.saltItem, ModItems.stockItem });
		this.addRecipe(ModItems.riceSoupItem, new Object[] { ModItems.riceItem, ModItems.stockItem });
		this.addRecipe(ModItems.seedSoupItem, new Object[] { "listAllSeed", ModItems.stockItem });
		this.addRecipe(ModItems.spiderEyeSoupItem, new Object[] { Items.spider_eye, ModItems.stockItem });
		this.addRecipe(ModItems.splitPeaSoupItem,
				new Object[] { ModItems.peasItem, "listAllPorkCooked", ModItems.blackPepperItem, ModItems.stockItem });
		this.addRecipe(ModItems.tomatoSoupItem, new Object[] { ModItems.tomatoItem, ModItems.stockItem });
		this.addRecipe(ModItems.turnipSoupItem,
				new Object[] { ModItems.turnipItem, Blocks.pumpkin, ModItems.butterItem, ModItems.stockItem });
		this.addRecipe(ModItems.vegetableSoupItem,
				new Object[] { Items.potato, Items.carrot, "listAllMushroom", ModItems.stockItem });

		this.addRecipe(ModItems.hotdogItem, new Object[] { "listAllPorkRaw", Items.bread });
		this.addRecipe(ModItems.potRoastItem,
				new Object[] { "listAllBeefRaw", Items.potato, Items.carrot, ModItems.stockItem });
		this.addRecipe(ModItems.boiledEggItem, new Object[] { "listAllEgg" });
		this.addRecipe(ModItems.vinegarItem, new Object[] { ModItems.grapeJuiceItem });
		this.addRecipe(ModItems.picklesItem,
				new Object[] { ModItems.cucumberItem, ModItems.saltItem, ModItems.vinegarItem });
		this.addRecipe(ModItems.marinatedCucumbersItem,
				new Object[] { ModItems.cucumberItem, ModItems.onionItem, Items.sugar, ModItems.vinegarItem });
		this.addRecipe(ModItems.bakedBeansItem,
				new Object[] { ModItems.beanItem, "listAllPorkCooked", Items.sugar, ModItems.mixingBowlItem });
		this.addRecipe(ModItems.beansAndRiceItem, new Object[] { ModItems.beanItem, ModItems.riceItem,
				ModItems.onionItem, "listAllPorkCooked", ModItems.mixingBowlItem });
		this.addRecipe(ModItems.beansAndRiceItem, new Object[] { ModItems.beanItem, ModItems.riceItem,
				ModItems.bellpepperItem, "listAllPorkCooked", ModItems.mixingBowlItem });
		this.addRecipe(ModItems.beansAndRiceItem, new Object[] { ModItems.beanItem, ModItems.riceItem,
				ModItems.chilipepperItem, "listAllPorkCooked", ModItems.mixingBowlItem });
		this.addRecipe(ModItems.chiliItem,
				new Object[] { ModItems.beanItem, ModItems.onionItem, "listAllBeefCooked", ModItems.mixingBowlItem });
		this.addRecipe(ModItems.chiliItem, new Object[] { ModItems.beanItem, ModItems.bellpepperItem,
				"listAllBeefCooked", ModItems.mixingBowlItem });
		this.addRecipe(ModItems.chiliItem, new Object[] { ModItems.beanItem, ModItems.chilipepperItem,
				"listAllBeefCooked", ModItems.mixingBowlItem });
		this.addRecipe(ModItems.pickledBeetsItem,
				new Object[] { ModItems.beetItem, ModItems.vinegarItem, ModItems.saltItem });
		this.addRecipe(ModItems.broccoliMacItem, new Object[] { ModItems.mixingBowlItem, ModItems.broccoliItem,
				ModItems.pastaItem, ModItems.cheeseItem });
		this.addRecipe(ModItems.steamedPeasItem,
				new Object[] { ModItems.peasItem, ModItems.freshWaterItem, ModItems.saltItem });
		this.addRecipe(ModItems.chickenCurryItem,
				new Object[] { ModItems.coconutItem, ModItems.plainYogurtItem, "listAllChickenRaw",
						ModItems.spiceleafItem, ModItems.chilipepperItem, ModItems.riceItem,
						ModItems.groundCinnamonItem, ModItems.garlicItem });
		this.addRecipe(ModItems.marshmellowsItem, new Object[] { Items.sugar, ModItems.freshWaterItem, "listAllEgg" });
		this.addRecipe(ModItems.donutItem, new Object[] { ModItems.doughItem, ModItems.oliveOilItem });
		this.addRecipe(ModItems.friedChickenItem, new Object[] { "listAllChickenRaw", ModItems.flourItem,
				ModItems.spiceleafItem, ModItems.blackPepperItem, ModItems.oliveOilItem });
		this.addRecipe(ModItems.meatyStewItem,
				new Object[] { ModItems.mixingBowlItem, "listAllMeatRaw", ModItems.flourItem, ModItems.stockItem });

		// Soda
		this.addRecipe(ModItems.cherrySodaItem,
				new Object[] { ModItems.bubblyWaterItem, Items.sugar, ModItems.cherryJuiceItem });
		this.addRecipe(ModItems.colaSodaItem,
				new Object[] { ModItems.bubblyWaterItem, Items.sugar, ModItems.spiceleafItem });
		this.addRecipe(ModItems.gingerSodaItem,
				new Object[] { ModItems.bubblyWaterItem, Items.sugar, ModItems.gingerItem });
		this.addRecipe(ModItems.grapefruitSodaItem,
				new Object[] { ModItems.bubblyWaterItem, Items.sugar, ModItems.grapefruitJuiceItem });
		this.addRecipe(ModItems.grapeSodaItem,
				new Object[] { ModItems.bubblyWaterItem, Items.sugar, ModItems.grapeJuiceItem });
		this.addRecipe(ModItems.lemonLimeSodaItem,
				new Object[] { ModItems.bubblyWaterItem, Items.sugar, ModItems.lemonItem, ModItems.limeJuiceItem });
		this.addRecipe(ModItems.orangeSodaItem,
				new Object[] { ModItems.bubblyWaterItem, Items.sugar, ModItems.orangeJuiceItem });
		this.addRecipe(ModItems.rootbeerSodaItem,
				new Object[] { ModItems.bubblyWaterItem, Items.sugar, ModItems.edibleRootItem });
		this.addRecipe(ModItems.strawberrySodaItem,
				new Object[] { ModItems.bubblyWaterItem, Items.sugar, ModItems.strawberryJuiceItem });

		Collections.sort(this.recipes, new RecipeSorterPot(this));
	}

	private void addRecipe(final ItemStack itemStack, final Object[] objects) {
		this.recipes.add(new ShapelessOreRecipe(itemStack, objects));
	}

	private void addRecipe(final Item item, final Object[] objects) {
		this.recipes.add(new ShapelessOreRecipe(item, objects));
	}

	@SuppressWarnings("null")
	public ItemStack findMatchingRecipe(final InventoryCrafting inventoryCrafting, final World world) {
		int i = 0;
		ItemStack itemstack = null;
		ItemStack itemstack1 = null;

		for (int j = 0; j < inventoryCrafting.getSizeInventory(); j++) {
			final ItemStack itemstack2 = inventoryCrafting.getStackInSlot(j);

			if (itemstack2 != null) {
				if (i == 0) {
					itemstack = itemstack2;
				}
				if (i == 1) {
					itemstack1 = itemstack2;
				}
				i++;
			}
		}
		if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1
				&& itemstack1.stackSize == 1 && itemstack.getItem().isRepairable()) {
			final Item item = itemstack.getItem();

			final int j1 = item.getMaxDamage() - itemstack.getItemDamage();
			final int k = item.getMaxDamage() - itemstack1.getItemDamage();
			final int l = j1 + k + item.getMaxDamage() * 5 / 100;

			int i1 = item.getMaxDamage() - l;

			if (i1 < 0) {
				i1 = 0;
			}
			return new ItemStack(itemstack.getItem(), 1, i1);
		}
		for (int j = 0; j < this.recipes.size(); j++) {
			final IRecipe irecipe = this.recipes.get(j);

			if (irecipe.matches(inventoryCrafting, world)) {
				return irecipe.getCraftingResult(inventoryCrafting);
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
