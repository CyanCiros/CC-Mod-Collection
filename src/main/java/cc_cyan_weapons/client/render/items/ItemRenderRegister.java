package cc_cyan_weapons.client.render.items;

import cc_cyan_weapons.CCCyanWeapons;
import cc_cyan_weapons.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	public static void registerItemRenderer() {
		// Essence
		registerItemRender(ModItems.essenceBeast);
		registerItemRender(ModItems.essenceDark);
		registerItemRender(ModItems.essenceEarth);
		registerItemRender(ModItems.essenceEnder);
		registerItemRender(ModItems.essenceFire);
		registerItemRender(ModItems.essenceLight);
		registerItemRender(ModItems.essenceThunder);
		registerItemRender(ModItems.essenceWater);
		registerItemRender(ModItems.essenceWind);
		registerItemRender(ModItems.essenceMixed);

		// Swords - Light
		registerItemRender(ModItems.beastSword);
		registerItemRender(ModItems.darkSword);
		registerItemRender(ModItems.earthSword);
		registerItemRender(ModItems.enderSword);
		registerItemRender(ModItems.fireSword);
		registerItemRender(ModItems.lightSword);
		registerItemRender(ModItems.thunderShockSword);
		registerItemRender(ModItems.waterSword);
		registerItemRender(ModItems.windSword);
		registerItemRender(ModItems.wolfSword);

		// Swords - Medium
		registerItemRender(ModItems.darkNetherSword);
		registerItemRender(ModItems.enderPortalSword);
		registerItemRender(ModItems.iceSword);
		registerItemRender(ModItems.lightNetherSword);
		registerItemRender(ModItems.meteorSword);
		registerItemRender(ModItems.peacefulNatureSword);
		registerItemRender(ModItems.steamSword);
		registerItemRender(ModItems.thunderSword);
		registerItemRender(ModItems.timeSword);
		registerItemRender(ModItems.windBlastSword);

		// Swords - Strong
		registerItemRender(ModItems.blizzardSword);
		registerItemRender(ModItems.enderFireSword);
		registerItemRender(ModItems.enderThunderSword);
		registerItemRender(ModItems.enderWindSword);
		registerItemRender(ModItems.meteoricThunderstormSword);
		registerItemRender(ModItems.thunderstormSword);
		registerItemRender(ModItems.wildNatureSword);
		registerItemRender(ModItems.windWhirlSword);

		// Swords - Super
		registerItemRender(ModItems.cyanSword);
		registerItemRender(ModItems.triEnderSword);

		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		// Bows - Light
		ModItems.darkBow.registerBowRender(itemModelMesher);
		ModItems.fireBow.registerBowRender(itemModelMesher);
		ModItems.lightBow.registerBowRender(itemModelMesher);
		ModItems.windBow.registerBowRender(itemModelMesher);

		// Bows - Medium
		ModItems.darkNetherBow.registerBowRender(itemModelMesher);
		ModItems.enderPortalBow.registerBowRender(itemModelMesher);
		ModItems.iceBow.registerBowRender(itemModelMesher);
		ModItems.lightNetherBow.registerBowRender(itemModelMesher);
		ModItems.meteorBow.registerBowRender(itemModelMesher);
		ModItems.peacefulNatureBow.registerBowRender(itemModelMesher);
		ModItems.steamBow.registerBowRender(itemModelMesher);
		ModItems.timeBow.registerBowRender(itemModelMesher);
		ModItems.windBlastBow.registerBowRender(itemModelMesher);

		// Bows - Strong
		ModItems.blizzardBow.registerBowRender(itemModelMesher);
		ModItems.enderFireBow.registerBowRender(itemModelMesher);
		ModItems.enderWindBow.registerBowRender(itemModelMesher);
		ModItems.meteoricThunderstormBow.registerBowRender(itemModelMesher);
		ModItems.wildNatureBow.registerBowRender(itemModelMesher);
		ModItems.windWhirlBow.registerBowRender(itemModelMesher);

		// Bows - Super
		ModItems.cyanBow.registerBowRender(itemModelMesher);
		ModItems.triEnderBow.registerBowRender(itemModelMesher);

		// Arrows - Light
		registerItemRender(ModItems.darkArrow);
		registerItemRender(ModItems.fireArrow);
		registerItemRender(ModItems.lightArrow);
		registerItemRender(ModItems.windArrow);

		// Arrows - Medium
		registerItemRender(ModItems.darkNetherArrow);
		registerItemRender(ModItems.enderPortalArrow);
		registerItemRender(ModItems.iceArrow);
		registerItemRender(ModItems.lightNetherArrow);
		registerItemRender(ModItems.meteorArrow);
		registerItemRender(ModItems.peacefulNatureArrow);
		registerItemRender(ModItems.steamArrow);
		registerItemRender(ModItems.timeArrow);
		registerItemRender(ModItems.windBlastArrow);

		// Arrows - Strong
		registerItemRender(ModItems.blizzardArrow);
		registerItemRender(ModItems.enderFireArrow);
		registerItemRender(ModItems.enderWindArrow);
		registerItemRender(ModItems.meteoricThunderstormArrow);
		registerItemRender(ModItems.wildNatureArrow);
		registerItemRender(ModItems.windWhirlArrow);

		// Arrows - Super
		registerItemRender(ModItems.cyanArrow);
		registerItemRender(ModItems.triEnderArrow);
	}

	public static void registerItemRender(final Item item) {
		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		itemModelMesher.register(item, 0,
				new ModelResourceLocation(CCCyanWeapons.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
