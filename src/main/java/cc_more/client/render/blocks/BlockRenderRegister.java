package cc_more.client.render.blocks;

import cc_more.CCMore;
import cc_more.blocks.ModBlocks;
import cc_more.world.MinersDimension;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {
	public static void registerBlockRenderer() {
		BlockRenderRegister.registerBlockRender(ModBlocks.amethystBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.amethystOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.bauxiteBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.bauxiteOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.bronzeBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.chromeBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.chromeOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.copperBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.copperOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.fluoriteBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.fluoriteOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.jadeBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.jadeOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.leadBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.leadOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.meteoriteBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.meteoriteOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.minersGlowstone);
		BlockRenderRegister.registerBlockRender(ModBlocks.platinumBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.platinumOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.rubyBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.rubyOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.sapphireBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.sapphireOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.silverBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.silverOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.stainlessBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.stainlessOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.tinBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.tinOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.titaniumBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.titaniumOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.uraniumBlock);
		BlockRenderRegister.registerBlockRender(ModBlocks.uraniumOre);
		BlockRenderRegister.registerBlockRender(ModBlocks.uraniumTNT);

		BlockRenderRegister.registerBlockRender(MinersDimension.minersPortal);
	}

	public static void registerBlockRender(final Block block) {
		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		itemModelMesher.register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(CCMore.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
