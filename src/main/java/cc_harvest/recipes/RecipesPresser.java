package cc_harvest.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import cc_harvest.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesPresser {
	public static final RecipesPresser smeltingBase = new RecipesPresser();
	private final Map<ItemStack, ItemStack> smeltingList = new HashMap<ItemStack, ItemStack>();
	private final Map<ItemStack, Float> experienceList = new HashMap<ItemStack, Float>();

	private RecipesPresser() {
		this.addRecipeItem(ModItems.waxcombItem, new ItemStack(ModItems.beeswaxItem, 1, 0), 0.0F);
		this.addRecipeItem(ModItems.honeycombItem, new ItemStack(ModItems.honeyItem, 1, 0), 0.0F);

		this.addRecipeItem(Items.reeds, new ItemStack(Items.sugar), 0.0F);
		this.addRecipeBlock(Blocks.log, new ItemStack(Items.paper), 0.0F);

		this.addRecipeItem(Items.apple, new ItemStack(ModItems.appleJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.apricotItem, new ItemStack(ModItems.apricotJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.blackberryItem, new ItemStack(ModItems.blackberryJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.blueberryItem, new ItemStack(ModItems.blueberryJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.cactusFruitItem, new ItemStack(ModItems.cactusFruitJuiceItem), 0.0F);
		this.addRecipeItem(Items.carrot, new ItemStack(ModItems.carrotJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.cherryItem, new ItemStack(ModItems.cherryJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.cranberryItem, new ItemStack(ModItems.cranberryJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.figItem, new ItemStack(ModItems.figJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.grapefruitItem, new ItemStack(ModItems.grapefruitJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.grapeItem, new ItemStack(ModItems.grapeJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.kiwiItem, new ItemStack(ModItems.kiwiJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.limeItem, new ItemStack(ModItems.limeJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.mangoItem, new ItemStack(ModItems.mangoJuiceItem), 0.0F);
		this.addRecipeItem(Items.melon, new ItemStack(ModItems.melonJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.orangeItem, new ItemStack(ModItems.orangeJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.papayaItem, new ItemStack(ModItems.papayaJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.peachItem, new ItemStack(ModItems.peachJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.pearItem, new ItemStack(ModItems.pearJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.persimmonItem, new ItemStack(ModItems.persimmonJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.plumItem, new ItemStack(ModItems.plumJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.pomegranateItem, new ItemStack(ModItems.pomegranateJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.raspberryItem, new ItemStack(ModItems.raspberryJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.starfruitItem, new ItemStack(ModItems.starfruitJuiceItem), 0.0F);
		this.addRecipeItem(ModItems.strawberryItem, new ItemStack(ModItems.strawberryJuiceItem), 0.0F);

		this.addRecipeItem(ModItems.oliveItem, new ItemStack(ModItems.oliveOilItem), 0.0F);
		this.addRecipeItem(ModItems.sunflowerSeedsItem, new ItemStack(ModItems.oliveOilItem), 0.0F);
		this.addRecipeItem(ModItems.walnutItem, new ItemStack(ModItems.oliveOilItem), 0.0F);

		this.addRecipeItem(Items.reeds, new ItemStack(Items.sugar), 0.0F);
		this.addRecipeItem(ModItems.beetItem, new ItemStack(Items.sugar), 0.0F);
		this.addRecipeBlock(Blocks.log, new ItemStack(Items.paper), 0.0F);

		this.addRecipeItem(ModItems.freshWaterItem, new ItemStack(ModItems.bubblyWaterItem), 0.0F);
		this.addRecipeItem(ModItems.soybeanItem, new ItemStack(ModItems.soyMilkItem), 0.0F);

		this.addRecipeItem(ModItems.soyMilkItem, new ItemStack(ModItems.silkenTofuItem), 0.0F);
		this.addRecipeItem(ModItems.silkenTofuItem, new ItemStack(ModItems.firmTofuItem), 0.0F);

		this.addRecipeItem(ModItems.almondItem, new ItemStack(ModItems.freshMilkItem), 0.0F);
	}

	public static RecipesPresser smelting() {
		return smeltingBase;
	}

	public void addRecipeBlock(final Block block, final ItemStack itemStack, final float experience) {
		this.addRecipeItem(Item.getItemFromBlock(block), itemStack, experience);
	}

	public void addRecipeItem(final Item item, final ItemStack itemStack, final float experience) {
		this.addRecipeToList(new ItemStack(item, 1, 32767), itemStack, experience);
	}

	public void addRecipeToList(final ItemStack itemStack1, final ItemStack itemStack2, final float experience) {
		this.smeltingList.put(itemStack1, itemStack2);
		this.experienceList.put(itemStack2, Float.valueOf(experience));
	}

	@SuppressWarnings("rawtypes")
	public ItemStack getSmeltingResult(final ItemStack itemStack) {
		final Iterator<?> iterator = this.smeltingList.entrySet().iterator();
		Map.Entry entry;

		do {
			if (!iterator.hasNext()) {
				return null;
			}
			entry = (Map.Entry) iterator.next();
		} while (!this.func_151397_a(itemStack, (ItemStack) entry.getKey()));

		return (ItemStack) entry.getValue();
	}

	private boolean func_151397_a(final ItemStack itemStack1, final ItemStack itemStack2) {
		return itemStack2.getItem() == itemStack1.getItem()
				&& (itemStack2.getItemDamage() == 32767 || itemStack2.getItemDamage() == itemStack1.getItemDamage());
	}

	public Map<ItemStack, ItemStack> getSmeltingList() {
		return this.smeltingList;
	}

	@SuppressWarnings("rawtypes")
	public float func_151398_b(final ItemStack itemStack) {
		final float ret = itemStack.getItem().getSmeltingExperience(itemStack);
		if (ret != -1.0F) {
			return ret;
		}
		final Iterator<?> iterator = this.experienceList.entrySet().iterator();
		Map.Entry entry;

		do {
			if (!iterator.hasNext()) {
				return 0.0F;
			}
			entry = (Map.Entry) iterator.next();
		} while (!this.func_151397_a(itemStack, (ItemStack) entry.getKey()));

		return ((Float) entry.getValue()).floatValue();
	}
}
