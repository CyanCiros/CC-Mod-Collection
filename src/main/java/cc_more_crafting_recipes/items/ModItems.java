package cc_more_crafting_recipes.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item appleStack;
	public static Item arrowStack;
	public static Item blazeRodStack;
	public static Item boneStack;
	public static Item breadStack;
	public static Item enderPearlStack;
	public static Item featherStack;
	public static Item leatherStack;
	public static Item magmaCreamStack;
	public static Item rottenFleshStack;
	public static Item slimeballStack;
	public static Item snowballStack;
	public static Item spiderEyeStack;
	public static Item stringStack;

	public static void main() {
		appleStack = new ModItem("appleStack");
		arrowStack = new ModItem("arrowStack");
		blazeRodStack = new ModItem("blazeRodStack");
		boneStack = new ModItem("boneStack");
		breadStack = new ModItem("breadStack");
		enderPearlStack = new ModItem("enderPearlStack");
		featherStack = new ModItem("featherStack");
		leatherStack = new ModItem("leatherStack");
		magmaCreamStack = new ModItem("magmaCreamStack");
		rottenFleshStack = new ModItem("rottenFleshStack");
		slimeballStack = new ModItem("slimeballStack");
		snowballStack = new ModItem("snowballStack");
		spiderEyeStack = new ModItem("spiderEyeStack");
		stringStack = new ModItem("stringStack");

		ModItems.registerItem(appleStack);
		ModItems.registerItem(arrowStack);
		ModItems.registerItem(blazeRodStack);
		ModItems.registerItem(boneStack);
		ModItems.registerItem(breadStack);
		ModItems.registerItem(enderPearlStack);
		ModItems.registerItem(featherStack);
		ModItems.registerItem(leatherStack);
		ModItems.registerItem(magmaCreamStack);
		ModItems.registerItem(rottenFleshStack);
		ModItems.registerItem(slimeballStack);
		ModItems.registerItem(snowballStack);
		ModItems.registerItem(spiderEyeStack);
		ModItems.registerItem(stringStack);
	}

	public static void registerItem(final Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
}
