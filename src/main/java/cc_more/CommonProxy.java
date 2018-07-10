package cc_more;

import cc_more.achievements.Achievements;
import cc_more.blocks.ModBlocks;
import cc_more.items.ModItems;
import cc_more.world.BlockGenerator;
import cc_more.world.MinersDimension;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	@SuppressWarnings("unused")
	public void preInit(final FMLPreInitializationEvent e) {
		this.loadConfiguration(new Configuration(e.getSuggestedConfigurationFile()));

		ModBlocks.main();
		ModItems.main();

		MinersDimension.registerItemAndBlocks();
		MinersDimension.registerDimension();
	}

	private void loadConfiguration(final Configuration config) {
		config.load();
		Config.main(config);
		config.save();
	}

	@SuppressWarnings("unused")
	public void init(final FMLInitializationEvent e) {
		Achievements.main();
		ModCrafting.main();
	}

	@SuppressWarnings("unused")
	public void postInit(final FMLPostInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new BlockGenerator(), 0);
	}
}
