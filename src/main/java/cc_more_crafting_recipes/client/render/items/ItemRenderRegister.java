package cc_more_crafting_recipes.client.render.items;

import cc_more_crafting_recipes.CCMoreCraftingRecipes;
import cc_more_crafting_recipes.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	public static void registerItemRenderer() {
		ItemRenderRegister.registerItemRender(ModItems.appleStack);
		ItemRenderRegister.registerItemRender(ModItems.arrowStack);
		ItemRenderRegister.registerItemRender(ModItems.blazeRodStack);
		ItemRenderRegister.registerItemRender(ModItems.boneStack);
		ItemRenderRegister.registerItemRender(ModItems.breadStack);
		ItemRenderRegister.registerItemRender(ModItems.enderPearlStack);
		ItemRenderRegister.registerItemRender(ModItems.featherStack);
		ItemRenderRegister.registerItemRender(ModItems.leatherStack);
		ItemRenderRegister.registerItemRender(ModItems.magmaCreamStack);
		ItemRenderRegister.registerItemRender(ModItems.rottenFleshStack);
		ItemRenderRegister.registerItemRender(ModItems.slimeballStack);
		ItemRenderRegister.registerItemRender(ModItems.snowballStack);
		ItemRenderRegister.registerItemRender(ModItems.spiderEyeStack);
		ItemRenderRegister.registerItemRender(ModItems.stringStack);
	}

	public static void registerItemRender(final Item item) {
		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		itemModelMesher.register(item, 0,
				new ModelResourceLocation(CCMoreCraftingRecipes.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
