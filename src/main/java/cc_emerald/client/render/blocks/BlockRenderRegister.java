package cc_emerald.client.render.blocks;

import cc_emerald.CCEmerald;
import cc_emerald.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	public static void registerBlockRenderer() {
		BlockRenderRegister.registerBlockRender(ModBlocks.emeraldCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.ironCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.lapisCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.goldCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.diamondCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.redstoneCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.coalCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.glowstoneCrop);
		BlockRenderRegister.registerBlockRender(ModBlocks.quartzCrop);

		BlockRenderRegister.registerBlockRender(ModBlocks.glowstoneBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.quartzBlock);

		// BlockRenderRegister.registerBlockRender(ModBlocks.emeraldTnt);

		BlockRenderRegister.registerBlockRender(ModBlocks.emeraldObsidian);

		// BlockRenderRegister.registerBlockRender(ModBlocks.emeraldStairs);

		// BlockRenderRegister.register(ModBlocks.emeraldFire);

		BlockRenderRegister.registerBlockRender(ModBlocks.emeraldTorch);
		BlockRenderRegister.registerBlockRender(ModBlocks.diamondTorch);
		BlockRenderRegister.registerBlockRender(ModBlocks.redstoneTorch);
		BlockRenderRegister.registerBlockRender(ModBlocks.glowstoneTorch);
		BlockRenderRegister.registerBlockRender(ModBlocks.quartzTorch);
		BlockRenderRegister.registerBlockRender(ModBlocks.lapisTorch);
		BlockRenderRegister.registerBlockRender(ModBlocks.coalTorch);

		BlockRenderRegister.registerBlockRender(ModBlocks.emeraldLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.emeraldRedstoneLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.emeraldRedstoneLampActive);

		BlockRenderRegister.registerBlockRender(ModBlocks.diamondLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.diamondRedstoneLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.diamondRedstoneLampActive);

		BlockRenderRegister.registerBlockRender(ModBlocks.redstoneLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.redstoneRedstoneLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.redstoneRedstoneLampActive);

		BlockRenderRegister.registerBlockRender(ModBlocks.glowstoneLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.glowstoneRedstoneLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.glowstoneRedstoneLampActive);

		BlockRenderRegister.registerBlockRender(ModBlocks.quartzLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.quartzRedstoneLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.quartzRedstoneLampActive);

		BlockRenderRegister.registerBlockRender(ModBlocks.lapisLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.lapisRedstoneLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.lapisRedstoneLampActive);

		BlockRenderRegister.registerBlockRender(ModBlocks.coalLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.coalRedstoneLamp);
		BlockRenderRegister.registerBlockRender(ModBlocks.coalRedstoneLampActive);

		BlockRenderRegister.registerBlockRender(ModBlocks.doorBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.doorBlockObsidian);
	}

	public static void registerBlockRender(final Block block) {
		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		itemModelMesher.register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(CCEmerald.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
