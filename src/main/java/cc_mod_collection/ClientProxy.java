package cc_mod_collection;

import cc_more.CommonProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(final FMLPreInitializationEvent e) {
		// CC M-Ore
		// this.loadConfiguration(new
		// Configuration(e.getSuggestedConfigurationFile()));

		super.preInit(e);
	}

	// private void loadConfiguration(final Configuration config) {
	// config.load();
	// Config.main(config);
	// config.save();
	// }

	@Override
	public void init(final FMLInitializationEvent e) {
		super.init(e);

		// CC M-Ore
		// BlockRenderRegister.registerBlockRenderer();
		// ItemRenderRegister.registerItemRenderer();
	}

	@Override
	public void postInit(final FMLPostInitializationEvent e) {
		super.postInit(e);
	}
}
