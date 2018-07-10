package cc_more_crafting_recipes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CCMoreCraftingRecipes.MODID, name = CCMoreCraftingRecipes.MODNAME, version = CCMoreCraftingRecipes.VERSION, acceptedMinecraftVersions = CCMoreCraftingRecipes.ACCEPTED)
public class CCMoreCraftingRecipes {
	public static final String MODID = "cc_more_crafting_recipes";
	public static final String MODNAME = "CC More Crafting Recipes Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED = "[1.8]";

	// @Mod.Instance(CCMoreCraftingRecipes.MODID)
	// public static CCMoreCraftingRecipes instance = new
	// CCMoreCraftingRecipes();

	@SidedProxy(clientSide = CCMoreCraftingRecipes.MODID + ".ClientProxy", serverSide = CCMoreCraftingRecipes.MODID
			+ ".ServerProxy")
	public static CommonProxy proxy;

	public static CreativeTabs creativeTab = new CreativeTab(CCMoreCraftingRecipes.MODID);

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
