package cc_more.world;

import cc_more.Config;
import cc_more.blocks.BlockModPortal;
import cc_more.blocks.ModBlocks;
import cc_more.items.ItemIgniter;
import cc_more.items.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.common.DimensionManager;

public class MinersDimension {
	public static BlockModPortal minersPortal;
	// public static BlockPortalFire portalFire;
	public static Item portalIgniter;

	public static void registerItemAndBlocks() {
		minersPortal = new BlockModPortal("minersPortal");
		// portalFire = new BlockPortalFire("portalFire");
		portalIgniter = new ItemIgniter("portalIgniter");

		ModBlocks.registerBlock(minersPortal);
		// ModBlocks.registerBlock(portalFire);
		ModItems.registerItem(portalIgniter);
	}

	public static void registerDimension() {
		DimensionManager.registerProviderType(Config.minersDimension, MinersProvider.class, true);
		DimensionManager.registerDimension(Config.minersDimension, Config.minersDimension);
	}
}
