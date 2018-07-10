package cc_harvest.gui;

import org.lwjgl.opengl.GL11;

import cc_harvest.CCHarvest;
import cc_harvest.container.ContainerQuern;
import cc_harvest.entity.TileEntityQuern;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiQuern extends GuiContainer {
	private final TileEntityQuern quernInventory;
	private static final ResourceLocation resourceLocation = new ResourceLocation(CCHarvest.MODID, "textures/gui/quern.png");

	public GuiQuern(final InventoryPlayer inventoryPlayer, final TileEntityQuern tileEntityQuern) {
		super(new ContainerQuern(inventoryPlayer, tileEntityQuern));

		this.quernInventory = tileEntityQuern;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
		this.fontRendererObj.drawString(I18n.format("Quern", new Object[0]), 66, 6, 4210752);

		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, 72, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(final float par1, final int par2, final int par3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		this.mc.getTextureManager().bindTexture(resourceLocation);

		final int xCorner = (this.width - this.xSize) / 2;
		final int yCorner = (this.height - this.ySize) / 2;

		this.drawTexturedModalRect(xCorner, yCorner, 0, 0, this.xSize, this.ySize);

		final int xTimer = this.quernInventory.getCookProgressScaled(24);

		this.drawTexturedModalRect(xCorner + 79, yCorner + 34, 176, 14, xTimer + 1, 16);
	}
}
