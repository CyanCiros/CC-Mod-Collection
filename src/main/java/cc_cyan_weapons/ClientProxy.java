package cc_cyan_weapons;

import cc_cyan_weapons.client.render.items.ItemRenderRegister;
import cc_cyan_weapons.event.ModLivingDropsEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(final FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	@Override
	public void init(final FMLInitializationEvent e) {
		super.init(e);

		ItemRenderRegister.registerItemRenderer();

		MinecraftForge.EVENT_BUS.register(new ModLivingDropsEvent());
	}

	@Override
	public void postInit(final FMLPostInitializationEvent e) {
		super.postInit(e);
	}
}
