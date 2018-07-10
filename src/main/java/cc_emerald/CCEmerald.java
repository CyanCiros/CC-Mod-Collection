package cc_emerald;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CCEmerald.MODID, name = CCEmerald.MODNAME, version = CCEmerald.VERSION, acceptedMinecraftVersions = CCEmerald.ACCEPTED)
public class CCEmerald {
	public static final String MODID = "cc_emerald";
	public static final String MODNAME = "CC Emerald Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED = "[1.8]";

	@Mod.Instance(CCEmerald.MODID)
	public static CCEmerald instance = new CCEmerald();

	@SidedProxy(clientSide = CCEmerald.MODID + ".ClientProxy", serverSide = CCEmerald.MODID + ".ServerProxy")
	public static CommonProxy proxy;

	public static CreativeTab creativeTab = new CreativeTab(CCEmerald.MODID);

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