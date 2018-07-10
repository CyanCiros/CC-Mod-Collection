package cc_harvest;

import cc_harvest.blocks.ModBlocks;
import cc_harvest.entity.ModTileEntities;
import cc_harvest.event.ModLivingDropsEvent;
import cc_harvest.gui.GuiHandler;
import cc_harvest.items.ModItems;
import cc_harvest.world.ModBeeGenerator;
import cc_harvest.world.ModBoxGenerator;
import cc_harvest.world.ModFarmGenerator;
import cc_harvest.world.ModGardenGenerator;
import cc_harvest.world.ModSaltGenerator;
import cc_harvest.world.ModTreeGenerator;
import cc_mod_collection.CCModCollection;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void preInit(final FMLPreInitializationEvent e) {
		this.loadConfiguration(new Configuration(e.getSuggestedConfigurationFile()));

		ModBlocks.main();
		ModItems.main();
		ModTileEntities.main();
	}

	private void loadConfiguration(final Configuration config) {
		config.load();
		Config.main(config);
		config.save();
	}

	@SuppressWarnings("unused")
	public void init(final FMLInitializationEvent e) {
		ModCrafting.main();
		ModDictionary.main();

		NetworkRegistry.INSTANCE.registerGuiHandler(CCModCollection.instance, new GuiHandler());

		MinecraftForge.EVENT_BUS.register(new ModLivingDropsEvent());
	}

	@SuppressWarnings("unused")
	public void postInit(final FMLPostInitializationEvent e) {
		if (Config.enableSaltGeneration) {
			GameRegistry.registerWorldGenerator(new ModSaltGenerator(), 0);
		}
		if (Config.enableBeehiveGeneration) {
			GameRegistry.registerWorldGenerator(new ModBeeGenerator(), 0);
		}
		if (Config.enableGardenGeneration) {
			GameRegistry.registerWorldGenerator(new ModGardenGenerator(), 0);
		}
		if (Config.enableFruitTreeGeneration) {
			GameRegistry.registerWorldGenerator(new ModTreeGenerator(), 0);
		}
		if (Config.enableBoxGeneration) {
			GameRegistry.registerWorldGenerator(new ModBoxGenerator(), 0);
		}
		if (Config.enableFarmGeneration) {
			GameRegistry.registerWorldGenerator(new ModFarmGenerator(), 0);
		}
	}
}
