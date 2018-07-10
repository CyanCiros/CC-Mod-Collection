package cc_more;

import cc_more.world.BiomeGenMine;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CCMore.MODID, name = CCMore.MODNAME, version = CCMore.VERSION, acceptedMinecraftVersions = CCMore.ACCEPTED)
public class CCMore {
	public static final String MODID = "cc_more";
	public static final String MODNAME = "CC M-Ore Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED = "[1.8]";

	// @Mod.Instance(CCMore.MODID)
	// public static CCMore instance = new CCMore();

	@SidedProxy(clientSide = CCMore.MODID + ".ClientProxy", serverSide = CCMore.MODID + ".ServerProxy")
	public static CommonProxy proxy;

	public static CreativeTabs creativeTab = new CreativeTab(CCMore.MODID);

	public static BiomeGenBase MineBiome = new BiomeGenMine(40, false);

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
