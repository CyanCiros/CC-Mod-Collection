package cc_harvest.recipes;

import cc_harvest.items.ModItems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesChurn {
	private static final RecipesChurn smeltingBase = new RecipesChurn();
	private final Map<ItemStack, ItemStack> smeltingList = new HashMap<ItemStack, ItemStack>();
	private final Map<ItemStack, Float> experienceList = new HashMap<ItemStack, Float>();

	private RecipesChurn() {
		this.addRecipeItem(ModItems.freshMilkItem, new ItemStack(
				ModItems.butterItem, 1, 0), 0.0F);
		this.addRecipeItem(ModItems.heavyCreamItem, new ItemStack(
				ModItems.butterItem, 1, 0), 0.0F);
		this.addRecipeItem(ModItems.silkenTofuItem, new ItemStack(
				ModItems.butterItem, 1, 0), 0.0F);
	}

	public static RecipesChurn smelting() {
		return smeltingBase;
	}

	public void addRecipeBlock(final Block block, final ItemStack itemStack,
			final float experience) {
		this.addRecipeItem(Item.getItemFromBlock(block), itemStack, experience);
	}

	public void addRecipeItem(final Item item, final ItemStack itemStack,
			final float experience) {
		this.addRecipeToList(new ItemStack(item, 1, 32767), itemStack,
				experience);
	}

	public void addRecipeToList(final ItemStack itemStack1,
			final ItemStack itemStack2, final float experience) {
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

	private boolean func_151397_a(final ItemStack itemStack1,
			final ItemStack itemStack2) {
		return itemStack2.getItem() == itemStack1.getItem()
				&& (itemStack2.getItemDamage() == 32767 || itemStack2
						.getItemDamage() == itemStack1.getItemDamage());
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
