package cc_mod_collection;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CCModCollection.MODID, name = CCModCollection.MODNAME, version = CCModCollection.ACCEPTED)
public class CCModCollection {
	public static final String MODID = "cc_mod_collection";
	public static final String MODNAME = "CC Mod Collection Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED = "[1.8]";

	@Mod.Instance(CCModCollection.MODID)
	public static CCModCollection instance = new CCModCollection();

	// @SidedProxy(clientSide = CCModCollection.MODID + ".ClientProxy",
	// serverSide = CCModCollection.MODID
	// + ".ServerProxy")
	// public static CommonProxy proxy;

	@SuppressWarnings("unused")
	@EventHandler
	public void preInit(final FMLPreInitializationEvent e) {
		// CCCustomOreGeneration.proxy.preInit(e);
		// CCCyanWeapons.proxy.preInit(e);
		// CCDungeonPack.proxy.preInit(e);
		// CCEmerald.proxy.preInit(e);
		// CCHarvest.proxy.preInit(e);
		// CCMobDrops.proxy.preInit(e);
		// CCMore.proxy.preInit(e);
		// CCMoreCraftingRecipes.proxy.preInit(e);
	}

	@SuppressWarnings("unused")
	@EventHandler
	public void init(final FMLInitializationEvent e) {
		// CCCustomOreGeneration.proxy.init(e);
		// CCCyanWeapons.proxy.init(e);
		// CCDungeonPack.proxy.init(e);
		// CCEmerald.proxy.init(e);
		// CCHarvest.proxy.init(e);
		// CCMobDrops.proxy.init(e);
		// CCMore.proxy.init(e);
		// CCMoreCraftingRecipes.proxy.init(e);
	}

	@SuppressWarnings("unused")
	@EventHandler
	public void postInit(final FMLPostInitializationEvent e) {
		// CCCustomOreGeneration.proxy.postInit(e);
		// CCCyanWeapons.proxy.postInit(e);
		// CCDungeonPack.proxy.postInit(e);
		// CCEmerald.proxy.postInit(e);
		// CCHarvest.proxy.postInit(e);
		// CCMobDrops.proxy.postInit(e);
		// CCMore.proxy.postInit(e);
		// CCMoreCraftingRecipes.proxy.postInit(e);
	}
}
