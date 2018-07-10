package cc_custom_ore_generation;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CCCustomOreGeneration.MODID, name = CCCustomOreGeneration.MODNAME, version = CCCustomOreGeneration.VERSION, acceptedMinecraftVersions = CCCustomOreGeneration.ACCEPTED)
public class CCCustomOreGeneration {
	public static final String MODID = "cc_custom_ore_generation";
	public static final String MODNAME = "CC Custom Ore Generation Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED = "[1.8]";

	// @Instance
	// public static CCCustomOreGeneration instance = new
	// CCCustomOreGeneration();

	@SidedProxy(clientSide = CCCustomOreGeneration.MODID + ".ClientProxy", serverSide = CCCustomOreGeneration.MODID
			+ ".ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(final FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(final FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(final FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}