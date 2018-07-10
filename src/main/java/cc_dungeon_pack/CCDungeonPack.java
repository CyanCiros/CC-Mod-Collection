package cc_dungeon_pack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CCDungeonPack.MODID, name = CCDungeonPack.MODNAME, version = CCDungeonPack.VERSION, acceptedMinecraftVersions = CCDungeonPack.ACCEPTED)
public class CCDungeonPack {
	public static final String MODID = "cc_dungeon_pack";
	public static final String MODNAME = "CC Dungeon Pack Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED = "[1.8]";

	@Mod.Instance(CCDungeonPack.MODID)
	public static CCDungeonPack instance = new CCDungeonPack();

	@SidedProxy(clientSide = CCDungeonPack.MODID + ".ClientProxy", serverSide = CCDungeonPack.MODID + ".ServerProxy")
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