package cc_harvest.gui;

import org.lwjgl.opengl.GL11;

import cc_harvest.CCHarvest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiBook extends GuiScreen {
	public static GuiBook currentBook = new GuiBook();
	static final ResourceLocation resourceLocation = new ResourceLocation(CCHarvest.MODID, "textures/gui/book.png");
	String title;
	private final int bookImageWidth;
	private final int bookImageHeight;
	int left;
	int top;
	int posX;
	int posY;
	@SuppressWarnings("unused")
	private NextPageButton buttonNextPage;
	@SuppressWarnings("unused")
	private NextPageButton buttonPreviousPage;

	public GuiBook() {
		this.bookImageWidth = 192;
		this.bookImageHeight = 192;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void initGui() {
		this.buttonList.clear();

		final int i = (this.width - this.bookImageWidth) / 2;
		final byte b0 = 2;

		this.buttonList.add(this.buttonNextPage = new NextPageButton(1, i + 120, b0 + 154, true));
		this.buttonList.add(this.buttonPreviousPage = new NextPageButton(2, i + 38, b0 + 154, false));
	}

	@SideOnly(Side.CLIENT)
	static class NextPageButton extends GuiButton {
		private final boolean field_146151_o;

		public NextPageButton(final int par1, final int par2, final int par3, final boolean par4) {
			super(par1, par2, par3, 23, 13, "");
			this.field_146151_o = par4;
		}

		@Override
		public void drawButton(final Minecraft p_146112_1_, final int p_146112_2_, final int p_146112_3_) {
			if (this.visible) {
				final boolean flag = p_146112_2_ >= this.xPosition && p_146112_3_ >= this.yPosition
						&& p_146112_2_ < this.xPosition + this.width && p_146112_3_ < this.yPosition + this.height;
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				p_146112_1_.getTextureManager().bindTexture(GuiBook.resourceLocation);
				int k = 0;
				int l = 192;
				if (flag) {
					k += 23;
				}
				if (!this.field_146151_o) {
					l += 13;
				}
				this.drawTexturedModalRect(this.xPosition, this.yPosition, k, l, 23, 13);
			}
		}
	}

	@Override
	public void drawScreen(final int par1, final int par2, final float par3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(resourceLocation);
		final int k = (this.width - this.bookImageWidth) / 2;
		final byte b0 = 2;
		this.drawTexturedModalRect(k, b0, 0, 0, this.bookImageWidth, this.bookImageHeight);
		super.drawScreen(par1, par2, par3);
	}

	@Override
	public void actionPerformed(final GuiButton button) {
		switch (button.id) {
		default:
			break;
		}
	}
}
