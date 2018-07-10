package cc_harvest.entity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {
	public static void main() {
		GameRegistry.registerTileEntity(TileEntityApiary.class, "apiary");
		GameRegistry.registerTileEntity(TileEntityChurn.class, "churn");
		GameRegistry.registerTileEntity(TileEntityCuttingBoard.class, "cuttingBoard");
		GameRegistry.registerTileEntity(TileEntityPot.class, "pot");
		GameRegistry.registerTileEntity(TileEntityPresser.class, "presser");
		GameRegistry.registerTileEntity(TileEntityQuern.class, "quern");
		GameRegistry.registerTileEntity(TileEntityStorageBox.class, "storageBox");
	}
}
