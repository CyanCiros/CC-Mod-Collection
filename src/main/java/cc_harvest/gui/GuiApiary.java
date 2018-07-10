package cc_harvest.gui;

import org.lwjgl.opengl.GL11;

import cc_harvest.CCHarvest;
import cc_harvest.container.ContainerApiary;
import cc_harvest.entity.TileEntityApiary;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GuiApiary extends GuiContainer {
	private static final ResourceLocation resourceLocation = new ResourceLocation(CCHarvest.MODID,
			"textures/gui/apiary.png");

	public GuiApiary(final InventoryPlayer inventoryPlayer, final TileEntityApiary tileEntityApiary) {
		super(new ContainerApiary(inventoryPlayer, tileEntityApiary));
	}

	@Override
	protected void drawGuiContainerForegroundLayer(final int param1, final int param2) {
		this.fontRendererObj.drawString("Apiary", 8 + 5, 8, 4210752);

		this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, 74, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		this.mc.getTextureManager().bindTexture(resourceLocation);

		final int x = (this.width - this.xSize) / 2;
		final int y = (this.height - this.ySize) / 2;

		this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
	}
}
