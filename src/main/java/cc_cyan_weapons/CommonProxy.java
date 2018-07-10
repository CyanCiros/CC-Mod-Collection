package cc_cyan_weapons;

import cc_cyan_weapons.items.ModItems;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(final FMLPreInitializationEvent e) {
		this.loadConfiguration(new Configuration(e.getSuggestedConfigurationFile()));

		ModItems.createItems();
	}

	private void loadConfiguration(final Configuration config) {
		config.load();
		Config.main(config);
		config.save();
	}

	@SuppressWarnings("unused")
	public void init(final FMLInitializationEvent e) {
		ModCrafting.initCrafting();
	}

	@SuppressWarnings("unused")
	public void postInit(final FMLPostInitializationEvent e) {

	}
}
