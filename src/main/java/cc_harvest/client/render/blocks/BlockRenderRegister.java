package cc_harvest.client.render.blocks;

import cc_harvest.CCHarvest;
import cc_harvest.ModCrafting;
import cc_harvest.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	public static void registerBlockRenderer() {
		// Tools
		BlockRenderRegister.registerBlockRender(ModBlocks.cuttingBoard);
		BlockRenderRegister.registerBlockRender(ModBlocks.pot);
		BlockRenderRegister.registerBlockRender(ModBlocks.apiary);
		BlockRenderRegister.registerBlockRender(ModBlocks.presser);
		BlockRenderRegister.registerBlockRender(ModBlocks.churn);
		BlockRenderRegister.registerBlockRender(ModBlocks.quern);
		BlockRenderRegister.registerBlockRender(ModBlocks.sinkWood);
		BlockRenderRegister.registerBlockRender(ModBlocks.sinkStone);
		BlockRenderRegister.registerBlockRender(ModBlocks.sinkClay);
		BlockRenderRegister.registerBlockRender(ModBlocks.sinkBrick);

		// Storage
		BlockRenderRegister.registerBlockRender(ModBlocks.storageCropsBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageSeedsBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageTemperateFruitsBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageWarmFruitsBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageLogFruitsBox);

		BlockRenderRegister.registerBlockRender(ModBlocks.storageCakeBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageHoneyBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageJellyBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageJuiceBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storagePieBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageSaladBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageSandwichBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageSmoothieBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageSodaBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageSoupBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageToolsBox);
		BlockRenderRegister.registerBlockRender(ModBlocks.storageYogurtBox);

		// Ground
		BlockRenderRegister.registerBlockRender(ModBlocks.salt);
		BlockRenderRegister.registerBlockRender(ModBlocks.beehive);

		// Garden
		BlockRenderRegister.registerBlockRender(ModBlocks.berryGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.desertGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.grassGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.gourdGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.groundGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.herbGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.leafyGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.mushroomGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.stalkGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.textileGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.tropicalGarden);
		BlockRenderRegister.registerBlockRender(ModBlocks.waterGarden);

		// Food
		BlockRenderRegister.registerBlockRender(ModBlocks.apple);
		BlockRenderRegister.registerBlockRender(ModBlocks.almond);
		BlockRenderRegister.registerBlockRender(ModBlocks.apricot);
		BlockRenderRegister.registerBlockRender(ModBlocks.avocado);
		BlockRenderRegister.registerBlockRender(ModBlocks.banana);
		BlockRenderRegister.registerBlockRender(ModBlocks.cashew);
		BlockRenderRegister.registerBlockRender(ModBlocks.cherry);
		BlockRenderRegister.registerBlockRender(ModBlocks.chestnut);
		BlockRenderRegister.registerBlockRender(ModBlocks.cinnamon);
		BlockRenderRegister.registerBlockRender(ModBlocks.coconut);
		BlockRenderRegister.registerBlockRender(ModBlocks.date);
		BlockRenderRegister.registerBlockRender(ModBlocks.dragonfruit);
		BlockRenderRegister.registerBlockRender(ModBlocks.durian);
		BlockRenderRegister.registerBlockRender(ModBlocks.fig);
		BlockRenderRegister.registerBlockRender(ModBlocks.grapefruit);
		BlockRenderRegister.registerBlockRender(ModBlocks.lemon);
		BlockRenderRegister.registerBlockRender(ModBlocks.lime);
		BlockRenderRegister.registerBlockRender(ModBlocks.maple);
		BlockRenderRegister.registerBlockRender(ModBlocks.mango);
		BlockRenderRegister.registerBlockRender(ModBlocks.nutmeg);
		BlockRenderRegister.registerBlockRender(ModBlocks.olive);
		BlockRenderRegister.registerBlockRender(ModBlocks.orange);
		BlockRenderRegister.registerBlockRender(ModBlocks.papaya);
		BlockRenderRegister.registerBlockRender(ModBlocks.paperbark);
		BlockRenderRegister.registerBlockRender(ModBlocks.peach);
		BlockRenderRegister.registerBlockRender(ModBlocks.pear);
		BlockRenderRegister.registerBlockRender(ModBlocks.pecan);
		BlockRenderRegister.registerBlockRender(ModBlocks.peppercorn);
		BlockRenderRegister.registerBlockRender(ModBlocks.persimmon);
		BlockRenderRegister.registerBlockRender(ModBlocks.pistachio);
		BlockRenderRegister.registerBlockRender(ModBlocks.plum);
		BlockRenderRegister.registerBlockRender(ModBlocks.pomegranate);
		BlockRenderRegister.registerBlockRender(ModBlocks.starfruit);
		BlockRenderRegister.registerBlockRender(ModBlocks.vanillaBean);
		BlockRenderRegister.registerBlockRender(ModBlocks.walnut);

		// Sapling
		BlockRenderRegister.registerBlockRender(ModBlocks.appleSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.almondSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.apricotSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.avocadoSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.bananaSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.cashewSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.cherrySapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.chestnutSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.cinnamonSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.coconutSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.dateSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.dragonfruitSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.durianSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.figSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.grapefruitSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.lemonSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.limeSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.mapleSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.mangoSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.nutmegSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.oliveSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.orangeSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.papayaSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.paperbarkSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.peachSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.pearSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.pecanSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.peppercornSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.persimmonSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.pistachioSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.plumSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.pomegranateSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.starfruitSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.vanillaBeanSapling);
		BlockRenderRegister.registerBlockRender(ModBlocks.walnutSapling);

		// Crop
		BlockRenderRegister.registerBlockRender(ModBlocks.artichokeCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.asparagusCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.bambooShootCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.barleyCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.beanCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.beetCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.bellpepperCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.blackberryCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.blueberryCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.broccoliCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.brusselSproutCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.cabbageCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.cactusFruitCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.candleberryCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.cantaloupeCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.cauliflowerCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.celeryCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.chilipepperCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.coffeeBeanCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.cornCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.cottonCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.cranberryCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.cucumberCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.eggplantCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.garlicCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.gingerCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.grapeCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.kiwiCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.leekCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.lettuceCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.mustardSeedsCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.oatsCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.okraCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.onionCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.parsnipCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.peanutCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.peasCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.pineappleCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.radishCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.raspberryCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.rhubarbCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.riceCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.rutabagaCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.ryeCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.scallionCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.seaweedCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.soybeanCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.spiceLeafCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.strawberryCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.sweetPotatoCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.teaLeafCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.tomatoCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.turnipCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.whiteMushroomCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.winterSquashCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.zucchiniCrop);

		// Candle
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_0);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_1);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_2);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_3);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_4);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_5);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_6);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_7);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_8);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_9);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_10);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_11);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_12);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_13);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_14);
		BlockRenderRegister.registerBlockRender(ModBlocks.candle_15);

		BlockRenderRegister.registerBlockRender(ModCrafting.luckyCropsBox);
		BlockRenderRegister.registerBlockRender(ModCrafting.luckySeedsBox);
		BlockRenderRegister.registerBlockRender(ModCrafting.luckyTemperateFruitsBox);
		BlockRenderRegister.registerBlockRender(ModCrafting.luckyWarmFruitsBox);
		BlockRenderRegister.registerBlockRender(ModCrafting.luckyLogFruitsBox);
	}

	public static void registerBlockRender(final Block block) {
		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		itemModelMesher.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
				CCHarvest.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
