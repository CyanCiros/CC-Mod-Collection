package cc_more.client.render.items;

import cc_more.CCMore;
import cc_more.items.ModItems;
import cc_more.world.MinersDimension;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	public static void registerItemRenderer() {
		ItemRenderRegister.registerItemRender(ModItems.amethystHoe);
		ItemRenderRegister.registerItemRender(ModItems.amethystIngot);
		ItemRenderRegister.registerItemRender(ModItems.amethystAxe);
		ItemRenderRegister.registerItemRender(ModItems.amethystBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.amethystBigSword);
		ItemRenderRegister.registerItemRender(ModItems.amethystBoots);
		ItemRenderRegister.registerItemRender(ModItems.amethystBow);
		ItemRenderRegister.registerItemRender(ModItems.amethystChestplate);
		ItemRenderRegister.registerItemRender(ModItems.amethystHelmet);
		ItemRenderRegister.registerItemRender(ModItems.amethystKatana);
		ItemRenderRegister.registerItemRender(ModItems.amethystKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.amethystLeggings);
		ItemRenderRegister.registerItemRender(ModItems.amethystPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.amethystShovel);
		ItemRenderRegister.registerItemRender(ModItems.amethystStaff);
		ItemRenderRegister.registerItemRender(ModItems.amethystSword);

		ItemRenderRegister.registerItemRender(ModItems.bauxiteHoe);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteIngot);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteAxe);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteBigSword);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteBoots);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteBow);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteChestplate);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteHelmet);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteKatana);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteLeggings);
		ItemRenderRegister.registerItemRender(ModItems.bauxitePickaxe);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteShovel);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteStaff);
		ItemRenderRegister.registerItemRender(ModItems.bauxiteSword);

		ItemRenderRegister.registerItemRender(ModItems.bronzeHoe);
		ItemRenderRegister.registerItemRender(ModItems.bronzeIngot);
		ItemRenderRegister.registerItemRender(ModItems.bronzeAxe);
		ItemRenderRegister.registerItemRender(ModItems.bronzeBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.bronzeBigSword);
		ItemRenderRegister.registerItemRender(ModItems.bronzeBoots);
		ItemRenderRegister.registerItemRender(ModItems.bronzeBow);
		ItemRenderRegister.registerItemRender(ModItems.bronzeChestplate);
		ItemRenderRegister.registerItemRender(ModItems.bronzeHelmet);
		ItemRenderRegister.registerItemRender(ModItems.bronzeKatana);
		ItemRenderRegister.registerItemRender(ModItems.bronzeKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.bronzeLeggings);
		ItemRenderRegister.registerItemRender(ModItems.bronzePickaxe);
		ItemRenderRegister.registerItemRender(ModItems.bronzeShovel);
		ItemRenderRegister.registerItemRender(ModItems.bronzeStaff);
		ItemRenderRegister.registerItemRender(ModItems.bronzeSword);

		ItemRenderRegister.registerItemRender(ModItems.chromeHoe);
		ItemRenderRegister.registerItemRender(ModItems.chromeIngot);
		ItemRenderRegister.registerItemRender(ModItems.chromeAxe);
		ItemRenderRegister.registerItemRender(ModItems.chromeBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.chromeBigSword);
		ItemRenderRegister.registerItemRender(ModItems.chromeBoots);
		ItemRenderRegister.registerItemRender(ModItems.chromeBow);
		ItemRenderRegister.registerItemRender(ModItems.chromeChestplate);
		ItemRenderRegister.registerItemRender(ModItems.chromeHelmet);
		ItemRenderRegister.registerItemRender(ModItems.chromeKatana);
		ItemRenderRegister.registerItemRender(ModItems.chromeKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.chromeLeggings);
		ItemRenderRegister.registerItemRender(ModItems.chromePickaxe);
		ItemRenderRegister.registerItemRender(ModItems.chromeShovel);
		ItemRenderRegister.registerItemRender(ModItems.chromeStaff);
		ItemRenderRegister.registerItemRender(ModItems.chromeSword);

		ItemRenderRegister.registerItemRender(ModItems.copperHoe);
		ItemRenderRegister.registerItemRender(ModItems.copperIngot);
		ItemRenderRegister.registerItemRender(ModItems.copperAxe);
		ItemRenderRegister.registerItemRender(ModItems.copperBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.copperBigSword);
		ItemRenderRegister.registerItemRender(ModItems.copperBoots);
		ItemRenderRegister.registerItemRender(ModItems.copperBow);
		ItemRenderRegister.registerItemRender(ModItems.copperChestplate);
		ItemRenderRegister.registerItemRender(ModItems.copperHelmet);
		ItemRenderRegister.registerItemRender(ModItems.copperKatana);
		ItemRenderRegister.registerItemRender(ModItems.copperKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.copperLeggings);
		ItemRenderRegister.registerItemRender(ModItems.copperPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.copperShovel);
		ItemRenderRegister.registerItemRender(ModItems.copperStaff);
		ItemRenderRegister.registerItemRender(ModItems.copperSword);

		ItemRenderRegister.registerItemRender(ModItems.fluoriteHoe);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteIngot);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteAxe);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteBigSword);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteBoots);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteBow);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteChestplate);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteHelmet);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteKatana);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteLeggings);
		ItemRenderRegister.registerItemRender(ModItems.fluoritePickaxe);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteShovel);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteStaff);
		ItemRenderRegister.registerItemRender(ModItems.fluoriteSword);

		ItemRenderRegister.registerItemRender(ModItems.jadeHoe);
		ItemRenderRegister.registerItemRender(ModItems.jadeGem);
		ItemRenderRegister.registerItemRender(ModItems.jadeAxe);
		ItemRenderRegister.registerItemRender(ModItems.jadeBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.jadeBigSword);
		ItemRenderRegister.registerItemRender(ModItems.jadeBoots);
		ItemRenderRegister.registerItemRender(ModItems.jadeBow);
		ItemRenderRegister.registerItemRender(ModItems.jadeChestplate);
		ItemRenderRegister.registerItemRender(ModItems.jadeHelmet);
		ItemRenderRegister.registerItemRender(ModItems.jadeKatana);
		ItemRenderRegister.registerItemRender(ModItems.jadeKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.jadeLeggings);
		ItemRenderRegister.registerItemRender(ModItems.jadePickaxe);
		ItemRenderRegister.registerItemRender(ModItems.jadeShovel);
		ItemRenderRegister.registerItemRender(ModItems.jadeStaff);
		ItemRenderRegister.registerItemRender(ModItems.jadeSword);

		ItemRenderRegister.registerItemRender(ModItems.leadHoe);
		ItemRenderRegister.registerItemRender(ModItems.leadIngot);
		ItemRenderRegister.registerItemRender(ModItems.leadAxe);
		ItemRenderRegister.registerItemRender(ModItems.leadBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.leadBigSword);
		ItemRenderRegister.registerItemRender(ModItems.leadBoots);
		ItemRenderRegister.registerItemRender(ModItems.leadBow);
		ItemRenderRegister.registerItemRender(ModItems.leadChestplate);
		ItemRenderRegister.registerItemRender(ModItems.leadHelmet);
		ItemRenderRegister.registerItemRender(ModItems.leadKatana);
		ItemRenderRegister.registerItemRender(ModItems.leadKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.leadLeggings);
		ItemRenderRegister.registerItemRender(ModItems.leadPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.leadShovel);
		ItemRenderRegister.registerItemRender(ModItems.leadStaff);
		ItemRenderRegister.registerItemRender(ModItems.leadSword);

		ItemRenderRegister.registerItemRender(ModItems.meteoriteHoe);
		ItemRenderRegister.registerItemRender(ModItems.meteorite);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteAxe);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteBigSword);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteBoots);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteBow);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteChestplate);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteHelmet);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteKatana);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteLeggings);
		ItemRenderRegister.registerItemRender(ModItems.meteoritePickaxe);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteShovel);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteStaff);
		ItemRenderRegister.registerItemRender(ModItems.meteoriteSword);

		ItemRenderRegister.registerItemRender(ModItems.platinumHoe);
		ItemRenderRegister.registerItemRender(ModItems.platinumIngot);
		ItemRenderRegister.registerItemRender(ModItems.platinumAxe);
		ItemRenderRegister.registerItemRender(ModItems.platinumBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.platinumBigSword);
		ItemRenderRegister.registerItemRender(ModItems.platinumBoots);
		ItemRenderRegister.registerItemRender(ModItems.platinumBow);
		ItemRenderRegister.registerItemRender(ModItems.platinumChestplate);
		ItemRenderRegister.registerItemRender(ModItems.platinumHelmet);
		ItemRenderRegister.registerItemRender(ModItems.platinumKatana);
		ItemRenderRegister.registerItemRender(ModItems.platinumKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.platinumLeggings);
		ItemRenderRegister.registerItemRender(ModItems.platinumPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.platinumShovel);
		ItemRenderRegister.registerItemRender(ModItems.platinumStaff);
		ItemRenderRegister.registerItemRender(ModItems.platinumSword);

		ItemRenderRegister.registerItemRender(ModItems.rubyHoe);
		ItemRenderRegister.registerItemRender(ModItems.rubyGem);
		ItemRenderRegister.registerItemRender(ModItems.rubyAxe);
		ItemRenderRegister.registerItemRender(ModItems.rubyBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.rubyBigSword);
		ItemRenderRegister.registerItemRender(ModItems.rubyBoots);
		ItemRenderRegister.registerItemRender(ModItems.rubyBow);
		ItemRenderRegister.registerItemRender(ModItems.rubyChestplate);
		ItemRenderRegister.registerItemRender(ModItems.rubyHelmet);
		ItemRenderRegister.registerItemRender(ModItems.rubyKatana);
		ItemRenderRegister.registerItemRender(ModItems.rubyKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.rubyLeggings);
		ItemRenderRegister.registerItemRender(ModItems.rubyPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.rubyShovel);
		ItemRenderRegister.registerItemRender(ModItems.rubyStaff);
		ItemRenderRegister.registerItemRender(ModItems.rubySword);

		ItemRenderRegister.registerItemRender(ModItems.sapphireHoe);
		ItemRenderRegister.registerItemRender(ModItems.sapphireGem);
		ItemRenderRegister.registerItemRender(ModItems.sapphireAxe);
		ItemRenderRegister.registerItemRender(ModItems.sapphireBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.sapphireBigSword);
		ItemRenderRegister.registerItemRender(ModItems.sapphireBoots);
		ItemRenderRegister.registerItemRender(ModItems.sapphireBow);
		ItemRenderRegister.registerItemRender(ModItems.sapphireChestplate);
		ItemRenderRegister.registerItemRender(ModItems.sapphireHelmet);
		ItemRenderRegister.registerItemRender(ModItems.sapphireKatana);
		ItemRenderRegister.registerItemRender(ModItems.sapphireKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.sapphireLeggings);
		ItemRenderRegister.registerItemRender(ModItems.sapphirePickaxe);
		ItemRenderRegister.registerItemRender(ModItems.sapphireShovel);
		ItemRenderRegister.registerItemRender(ModItems.sapphireStaff);
		ItemRenderRegister.registerItemRender(ModItems.sapphireSword);

		ItemRenderRegister.registerItemRender(ModItems.silverHoe);
		ItemRenderRegister.registerItemRender(ModItems.silverIngot);
		ItemRenderRegister.registerItemRender(ModItems.silverAxe);
		ItemRenderRegister.registerItemRender(ModItems.silverBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.silverBigSword);
		ItemRenderRegister.registerItemRender(ModItems.silverBoots);
		ItemRenderRegister.registerItemRender(ModItems.silverBow);
		ItemRenderRegister.registerItemRender(ModItems.silverChestplate);
		ItemRenderRegister.registerItemRender(ModItems.silverHelmet);
		ItemRenderRegister.registerItemRender(ModItems.silverKatana);
		ItemRenderRegister.registerItemRender(ModItems.silverKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.silverLeggings);
		ItemRenderRegister.registerItemRender(ModItems.silverPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.silverShovel);
		ItemRenderRegister.registerItemRender(ModItems.silverStaff);
		ItemRenderRegister.registerItemRender(ModItems.silverSword);

		ItemRenderRegister.registerItemRender(ModItems.stainlessHoe);
		ItemRenderRegister.registerItemRender(ModItems.stainlessIngot);
		ItemRenderRegister.registerItemRender(ModItems.stainlessAxe);
		ItemRenderRegister.registerItemRender(ModItems.stainlessBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.stainlessBigSword);
		ItemRenderRegister.registerItemRender(ModItems.stainlessBoots);
		ItemRenderRegister.registerItemRender(ModItems.stainlessBow);
		ItemRenderRegister.registerItemRender(ModItems.stainlessChestplate);
		ItemRenderRegister.registerItemRender(ModItems.stainlessHelmet);
		ItemRenderRegister.registerItemRender(ModItems.stainlessKatana);
		ItemRenderRegister.registerItemRender(ModItems.stainlessKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.stainlessLeggings);
		ItemRenderRegister.registerItemRender(ModItems.stainlessPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.stainlessShovel);
		ItemRenderRegister.registerItemRender(ModItems.stainlessStaff);
		ItemRenderRegister.registerItemRender(ModItems.stainlessSword);

		ItemRenderRegister.registerItemRender(ModItems.tinHoe);
		ItemRenderRegister.registerItemRender(ModItems.tinIngot);
		ItemRenderRegister.registerItemRender(ModItems.tinAxe);
		ItemRenderRegister.registerItemRender(ModItems.tinBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.tinBigSword);
		ItemRenderRegister.registerItemRender(ModItems.tinBoots);
		ItemRenderRegister.registerItemRender(ModItems.tinBow);
		ItemRenderRegister.registerItemRender(ModItems.tinChestplate);
		ItemRenderRegister.registerItemRender(ModItems.tinHelmet);
		ItemRenderRegister.registerItemRender(ModItems.tinKatana);
		ItemRenderRegister.registerItemRender(ModItems.tinKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.tinLeggings);
		ItemRenderRegister.registerItemRender(ModItems.tinPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.tinShovel);
		ItemRenderRegister.registerItemRender(ModItems.tinStaff);
		ItemRenderRegister.registerItemRender(ModItems.tinSword);

		ItemRenderRegister.registerItemRender(ModItems.titaniumHoe);
		ItemRenderRegister.registerItemRender(ModItems.titaniumIngot);
		ItemRenderRegister.registerItemRender(ModItems.titaniumAxe);
		ItemRenderRegister.registerItemRender(ModItems.titaniumBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.titaniumBigSword);
		ItemRenderRegister.registerItemRender(ModItems.titaniumBoots);
		ItemRenderRegister.registerItemRender(ModItems.titaniumBow);
		ItemRenderRegister.registerItemRender(ModItems.titaniumChestplate);
		ItemRenderRegister.registerItemRender(ModItems.titaniumHelmet);
		ItemRenderRegister.registerItemRender(ModItems.titaniumKatana);
		ItemRenderRegister.registerItemRender(ModItems.titaniumKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.titaniumLeggings);
		ItemRenderRegister.registerItemRender(ModItems.titaniumPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.titaniumShovel);
		ItemRenderRegister.registerItemRender(ModItems.titaniumStaff);
		ItemRenderRegister.registerItemRender(ModItems.titaniumSword);

		ItemRenderRegister.registerItemRender(ModItems.uraniumHoe);
		ItemRenderRegister.registerItemRender(ModItems.uraniumIngot);
		ItemRenderRegister.registerItemRender(ModItems.uraniumAxe);
		ItemRenderRegister.registerItemRender(ModItems.uraniumBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.uraniumBigSword);
		ItemRenderRegister.registerItemRender(ModItems.uraniumBoots);
		ItemRenderRegister.registerItemRender(ModItems.uraniumBow);
		ItemRenderRegister.registerItemRender(ModItems.uraniumChestplate);
		ItemRenderRegister.registerItemRender(ModItems.uraniumHelmet);
		ItemRenderRegister.registerItemRender(ModItems.uraniumKatana);
		ItemRenderRegister.registerItemRender(ModItems.uraniumKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.uraniumLeggings);
		ItemRenderRegister.registerItemRender(ModItems.uraniumPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.uraniumShovel);
		ItemRenderRegister.registerItemRender(ModItems.uraniumStaff);
		ItemRenderRegister.registerItemRender(ModItems.uraniumSword);

		ItemRenderRegister.registerItemRender(ModItems.minersDream);
		ItemRenderRegister.registerItemRender(ModItems.minersShaft);

		ItemRenderRegister.registerItemRender(MinersDimension.portalIgniter);
	}

	public static void registerItemRender(final Item item) {
		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		itemModelMesher.register(item, 0,
				new ModelResourceLocation(CCMore.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}