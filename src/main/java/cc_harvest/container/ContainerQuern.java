package cc_harvest.container;

import cc_harvest.entity.TileEntityQuern;
import cc_harvest.slot.SlotQuern;
import cc_harvest.slot.SlotResult;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerQuern extends Container {
	private final TileEntityQuern tileEntityQuern;
	private int lastCookTime = 0;
	private int lastBurnTime = 0;
	private int lastQuernBurnTime = 0;

	public ContainerQuern(final InventoryPlayer inventoryPlayer, final TileEntityQuern tileEntityQuern) {
		this.tileEntityQuern = tileEntityQuern;

		this.addSlotToContainer(new SlotQuern(inventoryPlayer.player, tileEntityQuern, 0, 56, 17));
		this.addSlotToContainer(new SlotResult(inventoryPlayer.player, tileEntityQuern, 1, 116, 35));

		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 9; x++) {
				this.addSlotToContainer(new Slot(inventoryPlayer, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
			}
		}
		for (int x = 0; x < 9; x++) {
			this.addSlotToContainer(new Slot(inventoryPlayer, x, 8 + x * 18, 142));
		}
	}

	@Override
	public boolean canInteractWith(final EntityPlayer entityPlayer) {
		return this.tileEntityQuern.isUseableByPlayer(entityPlayer);
	}

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		for (int i = 0; i < this.crafters.size(); i++) {
			final ICrafting iCrafting = (ICrafting) this.crafters.get(i);

			if (this.lastCookTime != this.tileEntityQuern.quernCookTime) {
				iCrafting.sendProgressBarUpdate(this, 0, this.tileEntityQuern.quernCookTime);
			}
			if (this.lastBurnTime != this.tileEntityQuern.quernBurnTime) {
				iCrafting.sendProgressBarUpdate(this, 1, this.tileEntityQuern.quernBurnTime);
			}
			if (this.lastQuernBurnTime != this.tileEntityQuern.currentQuernBurnTime) {
				iCrafting.sendProgressBarUpdate(this, 2, this.tileEntityQuern.currentQuernBurnTime);
			}
		}
		this.lastCookTime = this.tileEntityQuern.quernCookTime;
		this.lastBurnTime = this.tileEntityQuern.quernBurnTime;
		this.lastQuernBurnTime = this.tileEntityQuern.currentQuernBurnTime;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(final int side, final int meta) {
		if (side == 0) {
			this.tileEntityQuern.quernCookTime = meta;
		}
		if (side == 1) {
			this.tileEntityQuern.quernBurnTime = meta;
		}
		if (side == 2) {
			this.tileEntityQuern.currentQuernBurnTime = meta;
		}
	}

	@Override
	public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int index) {
		ItemStack itemstack = null;
		final Slot slot = (Slot) this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack()) {
			final ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (index == 1) {
				if (!this.mergeItemStack(itemstack1, this.tileEntityQuern.quernSlotCount,
						this.tileEntityQuern.totalSlotCount, true)) {
					return null;
				}

				slot.onSlotChange(itemstack1, itemstack);
			} else if (!this.mergeItemStack(itemstack1, this.tileEntityQuern.quernSlotCount,
					this.tileEntityQuern.totalSlotCount, false)) {
				return null;
			}

			if (itemstack1.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}

			if (itemstack1.stackSize == itemstack.stackSize) {
				return null;
			}

			slot.onPickupFromSlot(entityPlayer, itemstack1);
		}

		return itemstack;
	}
}
