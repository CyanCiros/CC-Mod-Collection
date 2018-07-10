package cc_more_crafting_recipes;

import cc_more_crafting_recipes.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	@SuppressWarnings("unused")
	public void preInit(final FMLPreInitializationEvent e) {
		ModItems.main();
	}

	@SuppressWarnings("unused")
	public void init(final FMLInitializationEvent e) {
		ModCrafting.main();
	}

	@SuppressWarnings("unused")
	public void postInit(final FMLPostInitializationEvent e) {

	}
}
