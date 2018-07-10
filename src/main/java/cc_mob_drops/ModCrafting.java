package cc_mob_drops;

import cc_mob_drops.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void main() {
		GameRegistry.addRecipe(new ItemStack(ModItems.enderJewel, 1),
				new Object[] { "XTX", "TXT", "XTX", 'X', ModItems.enderSkin, 'T', ModItems.enderTear });

		GameRegistry.addRecipe(new ItemStack(ModItems.creeperHelmet, 1),
				new Object[] { "XXX", "X X", 'X', ModItems.creeperSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.creeperChestplate, 1),
				new Object[] { "X X", "XXX", "XXX", 'X', ModItems.creeperSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.creeperLeggings, 1),
				new Object[] { "XXX", "X X", "X X", 'X', ModItems.creeperSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.creeperBoots, 1),
				new Object[] { "X X", "X X", 'X', ModItems.creeperSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.wolfHelmet, 1),
				new Object[] { "XXX", "X X", 'X', ModItems.wolfSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.wolfChestplate, 1),
				new Object[] { "X X", "XXX", "XXX", 'X', ModItems.wolfSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.wolfLeggings, 1),
				new Object[] { "XXX", "X X", "X X", 'X', ModItems.wolfSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.wolfBoots, 1),
				new Object[] { "X X", "X X", 'X', ModItems.wolfSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.magmaGooSword, 1),
				new Object[] { "X", "X", "I", 'X', ModItems.magmaGoo, 'I', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.gooSword, 1),
				new Object[] { "X", "X", "L", 'X', ModItems.goo, 'L', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderHelmet, 1),
				new Object[] { "EEE", "E E", 'E', ModItems.enderSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderChestplate, 1),
				new Object[] { "E E", "EEE", "EEE", 'E', ModItems.enderSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderLeggings, 1),
				new Object[] { "EEE", "E E", "E E", 'E', ModItems.enderSkin });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderBoots, 1),
				new Object[] { "E E", "E E", 'E', ModItems.enderSkin });

		GameRegistry.addSmelting(Items.carrot, new ItemStack(ModItems.cookedCarrot, 1), 0.5F);

		GameRegistry.addSmelting(ModItems.calamari, new ItemStack(ModItems.cookedCalamari, 1), 1.0F);

		GameRegistry.addSmelting(ModItems.squid, new ItemStack(ModItems.cookedSquid, 1), 1.0F);

		GameRegistry.addSmelting(ModItems.rawRibs, new ItemStack(ModItems.ribs, 1), 1.0F);

		GameRegistry.addSmelting(ModItems.rawLambchop, new ItemStack(ModItems.cookedLambchop, 1), 1.0F);

		GameRegistry.addSmelting(ModItems.ham, new ItemStack(ModItems.bacon, 2), 1.0F);

		GameRegistry.addSmelting(ModItems.chickenLegs, new ItemStack(ModItems.cookedChickenLeg, 1), 1.0F);

		GameRegistry.addSmelting(Items.egg, new ItemStack(ModItems.friedEggs, 1), 0.5F);
	}
}
