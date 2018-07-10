package cc_mod_collection;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	@SuppressWarnings("unused")
	public void preInit(final FMLPreInitializationEvent e) {
		// // CC M-Ore
		// ModBlocks.main();
		// ModItems.main();
		//
		// MinersDimension.registerItemAndBlocks();
		// MinersDimension.registerDimension();
	}

	@SuppressWarnings("unused")
	public void init(final FMLInitializationEvent e) {
		// // CC M-Ore
		// Achievements.main();
		// ModCrafting.main();
	}

	@SuppressWarnings("unused")
	public void postInit(final FMLPostInitializationEvent e) {
		// // CC M-Ore
		// GameRegistry.registerWorldGenerator(new BlockGenerator(), 0);
	}
}
