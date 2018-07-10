package cc_dungeon_pack;

import cc_dungeon_pack.world.GeneratorRegistry;
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
		GameRegistry.registerWorldGenerator(new GeneratorRegistry(), 0);
	}

	@SuppressWarnings("unused")
	public void postInit(final FMLPostInitializationEvent e) {

	}
}
