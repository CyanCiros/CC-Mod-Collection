package cc_harvest.gui;

import org.lwjgl.opengl.GL11;

import cc_harvest.CCHarvest;
import cc_harvest.container.ContainerPresser;
import cc_harvest.entity.TileEntityPresser;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiPresser extends GuiContainer {
	private final TileEntityPresser combPresserInventory;
	private static final ResourceLocation resourceLocation = new ResourceLocation(CCHarvest.MODID,
			"textures/gui/presser.png");

	public GuiPresser(final InventoryPlayer inventoryPlayer, final TileEntityPresser tileEntityPresser) {
		super(new ContainerPresser(inventoryPlayer, tileEntityPresser));

		this.combPresserInventory = tileEntityPresser;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
		this.fontRendererObj.drawString(I18n.format("Presser", new Object[0]), 28, 6, 4210752);

		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, 72, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(final float par1, final int par2, final int par3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		this.mc.getTextureManager().bindTexture(resourceLocation);

		final int xCorner = (this.width - this.xSize) / 2;
		final int yCorner = (this.height - this.ySize) / 2;

		this.drawTexturedModalRect(xCorner, yCorner, 0, 0, this.xSize, this.ySize);

		final int xTimer = this.combPresserInventory.getCookProgressScaled(24);

		this.drawTexturedModalRect(xCorner + 76, yCorner + 8, 176, 18, xTimer + 1, 16);
	}
}
