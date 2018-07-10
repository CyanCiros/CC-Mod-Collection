package cc_harvest.gui;

import org.lwjgl.opengl.GL11;

import cc_harvest.CCHarvest;
import cc_harvest.container.ContainerPot;
import cc_harvest.entity.TileEntityPot;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@SuppressWarnings("unused")
public class GuiPot extends GuiContainer {
	private static final ResourceLocation resourceLocation = new ResourceLocation(CCHarvest.MODID, "textures/gui/pot.png");
	private final IInventory tileTable;
	private final InventoryPlayer playerInventory;

	public GuiPot(final InventoryPlayer inventoryPlayer, final TileEntityPot tileEntityPot, final World world) {
		super(new ContainerPot(inventoryPlayer, tileEntityPot, world));

		this.playerInventory = inventoryPlayer;
		this.tileTable = tileEntityPot;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
		this.fontRendererObj.drawString(I18n.format("Pot", new Object[0]), 28 + 12, 6, 4210752);

		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, 72, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(final float par1, final int par2, final int par3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		this.mc.getTextureManager().bindTexture(resourceLocation);

		final int k = (this.width - this.xSize) / 2;
		final int l = (this.height - this.ySize) / 2;

		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}
}
