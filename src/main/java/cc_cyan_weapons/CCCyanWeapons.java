package cc_cyan_weapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CCCyanWeapons.MODID, name = CCCyanWeapons.MODNAME, version = CCCyanWeapons.VERSION, acceptedMinecraftVersions = CCCyanWeapons.ACCEPTED)
public class CCCyanWeapons {
	public static final String MODID = "cc_cyan_weapons";
	public static final String MODNAME = "CC Cyan Weapons Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED = "[1.8]";

	// @Instance
	// public static CCCyanWeapons instance = new CCCyanWeapons();

	@SidedProxy(clientSide = CCCyanWeapons.MODID + ".ClientProxy", serverSide = CCCyanWeapons.MODID + ".ServerProxy")
	public static CommonProxy proxy;

	public static CreativeTabs creativeTab = new CreativeTab(MODID);

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