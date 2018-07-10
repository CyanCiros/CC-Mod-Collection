package cc_custom_ore_generation;

import cc_custom_ore_generation.world.BlockGenerator;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void preInit(final FMLPreInitializationEvent e) {
		this.loadConfiguration(new Configuration(e.getSuggestedConfigurationFile()));
	}

	private void loadConfiguration(final Configuration config) {
		config.load();
		Config.main(config);
		config.save();
	}

	@SuppressWarnings("unused")
	public void init(final FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new BlockGenerator(), 0);
	}

	@SuppressWarnings("unused")
	public void postInit(final FMLPostInitializationEvent e) {

	}
}
