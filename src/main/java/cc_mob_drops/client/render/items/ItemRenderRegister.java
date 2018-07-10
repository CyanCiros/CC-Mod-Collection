package cc_mob_drops.client.render.items;

import cc_mob_drops.CCMobDrops;
import cc_mob_drops.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	public static void registerItemRenderer() {
		// Armor
		ItemRenderRegister.registerItemRender(ModItems.creeperHelmet);
		ItemRenderRegister.registerItemRender(ModItems.creeperChestplate);
		ItemRenderRegister.registerItemRender(ModItems.creeperLeggings);
		ItemRenderRegister.registerItemRender(ModItems.creeperBoots);

		ItemRenderRegister.registerItemRender(ModItems.enderHelmet);
		ItemRenderRegister.registerItemRender(ModItems.enderChestplate);
		ItemRenderRegister.registerItemRender(ModItems.enderLeggings);
		ItemRenderRegister.registerItemRender(ModItems.enderBoots);

		ItemRenderRegister.registerItemRender(ModItems.wolfHelmet);
		ItemRenderRegister.registerItemRender(ModItems.wolfChestplate);
		ItemRenderRegister.registerItemRender(ModItems.wolfLeggings);
		ItemRenderRegister.registerItemRender(ModItems.wolfBoots);

		// Items
		ItemRenderRegister.registerItemRender(ModItems.batEars);
		ItemRenderRegister.registerItemRender(ModItems.batEyes);
		ItemRenderRegister.registerItemRender(ModItems.batFur);
		ItemRenderRegister.registerItemRender(ModItems.batWings);
		ItemRenderRegister.registerItemRender(ModItems.cowHorn);
		ItemRenderRegister.registerItemRender(ModItems.creeperEye);
		ItemRenderRegister.registerItemRender(ModItems.creeperSkin);
		ItemRenderRegister.registerItemRender(ModItems.enderJewel);
		ItemRenderRegister.registerItemRender(ModItems.enderSkin);
		ItemRenderRegister.registerItemRender(ModItems.enderTear);
		ItemRenderRegister.registerItemRender(ModItems.goo);
		ItemRenderRegister.registerItemRender(ModItems.horseHoof);
		ItemRenderRegister.registerItemRender(ModItems.horseShoe);
		ItemRenderRegister.registerItemRender(ModItems.horseSkin);
		ItemRenderRegister.registerItemRender(ModItems.magmaGoo);
		ItemRenderRegister.registerItemRender(ModItems.squidEye);
		ItemRenderRegister.registerItemRender(ModItems.squidTentacle);
		ItemRenderRegister.registerItemRender(ModItems.wolfSkin);

		// Food
		ItemRenderRegister.registerItemRender(ModItems.bacon);
		ItemRenderRegister.registerItemRender(ModItems.calamari);
		ItemRenderRegister.registerItemRender(ModItems.chickenLegs);
		ItemRenderRegister.registerItemRender(ModItems.cookedCarrot);
		ItemRenderRegister.registerItemRender(ModItems.cookedCalamari);
		ItemRenderRegister.registerItemRender(ModItems.cookedChickenLeg);
		ItemRenderRegister.registerItemRender(ModItems.cookedLambchop);
		ItemRenderRegister.registerItemRender(ModItems.cookedSquid);
		ItemRenderRegister.registerItemRender(ModItems.friedEggs);
		ItemRenderRegister.registerItemRender(ModItems.ham);
		ItemRenderRegister.registerItemRender(ModItems.pigmanMeat);
		ItemRenderRegister.registerItemRender(ModItems.rawLambchop);
		ItemRenderRegister.registerItemRender(ModItems.rawRibs);
		ItemRenderRegister.registerItemRender(ModItems.ribs);
		ItemRenderRegister.registerItemRender(ModItems.squid);
		ItemRenderRegister.registerItemRender(ModItems.zombieBrain);

		// Weapon
		ItemRenderRegister.registerItemRender(ModItems.gooSword);
		ItemRenderRegister.registerItemRender(ModItems.magmaGooSword);
		ItemRenderRegister.registerItemRender(ModItems.spiderLeg);
		ItemRenderRegister.registerItemRender(ModItems.zombieArm);
	}

	public static void registerItemRender(final Item item) {
		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		itemModelMesher.register(item, 0, new ModelResourceLocation(
				CCMobDrops.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
