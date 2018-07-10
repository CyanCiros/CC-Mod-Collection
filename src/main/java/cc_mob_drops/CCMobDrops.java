package cc_mob_drops;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CCMobDrops.MODID, name = CCMobDrops.MODNAME, version = CCMobDrops.VERSION, acceptedMinecraftVersions = CCMobDrops.ACCEPTED)
public class CCMobDrops {
	public static final String MODID = "cc_mob_drops";
	public static final String MODNAME = "CC Mob Drops Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED = "[1.8]";

	@Mod.Instance(CCMobDrops.MODID)
	public static CCMobDrops instance = new CCMobDrops();

	@SidedProxy(clientSide = CCMobDrops.MODID + ".ClientProxy", serverSide = CCMobDrops.MODID + ".ServerProxy")
	public static CommonProxy proxy;

	public static CreativeTabs creativeTab = new CreativeTab(CCMobDrops.MODID);

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
