package cc_mob_drops;

import cc_mob_drops.event.ModLivingDropsEvent;
import cc_mob_drops.items.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(final FMLPreInitializationEvent e) {
		this.loadConfiguration(new Configuration(e.getSuggestedConfigurationFile()));

		ModItems.main();
	}

	private void loadConfiguration(final Configuration config) {
		config.load();
		Config.main(config);
		config.save();
	}

	@SuppressWarnings("unused")
	public void init(final FMLInitializationEvent e) {
		ModCrafting.main();

		MinecraftForge.EVENT_BUS.register(new ModLivingDropsEvent());
	}

	@SuppressWarnings("unused")
	public void postInit(final FMLPostInitializationEvent e) {

	}
}
