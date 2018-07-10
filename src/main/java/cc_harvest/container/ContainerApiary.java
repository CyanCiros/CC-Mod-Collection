package cc_harvest.container;

import cc_harvest.entity.TileEntityApiary;
import cc_harvest.slot.SlotApiary;
import cc_harvest.slot.SlotResult;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerApiary extends Container {
	private final TileEntityApiary tileEntityApiary;
	private int lastProduceTime = 0;
	private int lastRunTime = 0;
	private int lastBeeRunTime = 0;

	public ContainerApiary(final InventoryPlayer inventoryPlayer, final TileEntityApiary tileEntityPamApiary) {
		this.tileEntityApiary = tileEntityPamApiary;

		int slotIndex = 0;

		for (int xDisplay = 0; xDisplay < 6; xDisplay++) {
			for (int yDisplay = 0; yDisplay < 3; yDisplay++) {
				this.addSlotToContainer(new SlotResult(inventoryPlayer.player, tileEntityPamApiary, slotIndex,
						62 + xDisplay * 18, 17 + yDisplay * 18));
				slotIndex++;
			}
		}

		this.addSlotToContainer(new SlotApiary(inventoryPlayer.player, tileEntityPamApiary, 18, 26, 35));

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
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		for (int i = 0; i < this.crafters.size(); i++) {
			final ICrafting iCrafting = (ICrafting) this.crafters.get(i);

			if (this.lastProduceTime != this.tileEntityApiary.apiaryProduceTime) {
				iCrafting.sendProgressBarUpdate(this, 18, this.tileEntityApiary.apiaryProduceTime);
			}
			if (this.lastRunTime != this.tileEntityApiary.apiaryRunTime) {
				iCrafting.sendProgressBarUpdate(this, 18, this.tileEntityApiary.apiaryRunTime);
			}
			if (this.lastBeeRunTime != this.tileEntityApiary.currentBeeRunTime) {
				iCrafting.sendProgressBarUpdate(this, 18, this.tileEntityApiary.currentBeeRunTime);
			}
		}
		this.lastProduceTime = this.tileEntityApiary.apiaryProduceTime;
		this.lastRunTime = this.tileEntityApiary.apiaryRunTime;
		this.lastBeeRunTime = this.tileEntityApiary.currentBeeRunTime;
	}

	@Override
	public void updateProgressBar(final int index, final int value) {
		if (index == 18) {
			this.tileEntityApiary.apiaryRunTime = value;
			this.tileEntityApiary.apiaryProduceTime = value;
			this.tileEntityApiary.currentBeeRunTime = value;
		}
	}

	@Override
	public boolean canInteractWith(final EntityPlayer entityPlayer) {
		return this.tileEntityApiary.isUseableByPlayer(entityPlayer);
	}

	@Override
	public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int index) {
		ItemStack itemstack = null;
		final Slot slot = (Slot) this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack()) {
			final ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (index == 1) {
				if (!this.mergeItemStack(itemstack1, this.tileEntityApiary.apiarySlotCount,
						this.tileEntityApiary.totalSlotCount, true)) {
					return null;
				}

				slot.onSlotChange(itemstack1, itemstack);
			} else if (!this.mergeItemStack(itemstack1, this.tileEntityApiary.apiarySlotCount,
					this.tileEntityApiary.totalSlotCount, false)) {
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
