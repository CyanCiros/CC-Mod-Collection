package cc_harvest;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CCHarvest.MODID, name = CCHarvest.MODNAME, version = CCHarvest.VERSION, acceptedMinecraftVersions = CCHarvest.ACCEPTED)
public class CCHarvest {
	public static final String MODID = "cc_harvest";
	public static final String MODNAME = "CC Harvest Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED = "[1.8]";

	// @Mod.Instance(CCHarvest.MODID)
	// public static CCHarvest instance = new CCHarvest();

	@SidedProxy(clientSide = CCHarvest.MODID + ".ClientProxy", serverSide = CCHarvest.MODID + ".ServerProxy")
	public static CommonProxy proxy;

	public static CreativeTabs creativeTab = new CreativeTab(CCHarvest.MODID);

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
