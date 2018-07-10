package cc_harvest.container;

import cc_harvest.entity.TileEntityPresser;
import cc_harvest.slot.SlotPresser;
import cc_harvest.slot.SlotResult;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerPresser extends Container {
	private final TileEntityPresser tileEntityPresser;
	private int lastCookTime = 0;
	private int lastBurnTime = 0;
	private int lastPresserBurnTime = 0;

	public ContainerPresser(final InventoryPlayer inventoryPlayer, final TileEntityPresser tileEntityPresser) {
		this.tileEntityPresser = tileEntityPresser;

		this.addSlotToContainer(new SlotPresser(inventoryPlayer.player, tileEntityPresser, 0, 80, 23));
		this.addSlotToContainer(new SlotResult(inventoryPlayer.player, tileEntityPresser, 1, 80, 51));

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
		return this.tileEntityPresser.isUseableByPlayer(entityPlayer);
	}

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		for (int i = 0; i < this.crafters.size(); i++) {
			final ICrafting iCrafting = (ICrafting) this.crafters.get(i);

			if (this.lastCookTime != this.tileEntityPresser.presserCookTime) {
				iCrafting.sendProgressBarUpdate(this, 0, this.tileEntityPresser.presserCookTime);
			}
			if (this.lastBurnTime != this.tileEntityPresser.presserBurnTime) {
				iCrafting.sendProgressBarUpdate(this, 1, this.tileEntityPresser.presserBurnTime);
			}
			if (this.lastPresserBurnTime != this.tileEntityPresser.currentPresserBurnTime) {
				iCrafting.sendProgressBarUpdate(this, 2, this.tileEntityPresser.currentPresserBurnTime);
			}
		}
		this.lastCookTime = this.tileEntityPresser.presserCookTime;
		this.lastBurnTime = this.tileEntityPresser.presserBurnTime;
		this.lastPresserBurnTime = this.tileEntityPresser.currentPresserBurnTime;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(final int side, final int meta) {
		if (side == 0) {
			this.tileEntityPresser.presserCookTime = meta;
		}
		if (side == 1) {
			this.tileEntityPresser.presserBurnTime = meta;
		}
		if (side == 2) {
			this.tileEntityPresser.currentPresserBurnTime = meta;
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
				if (!this.mergeItemStack(itemstack1, this.tileEntityPresser.presserSlotCount,
						this.tileEntityPresser.totalSlotCount, true)) {
					return null;
				}

				slot.onSlotChange(itemstack1, itemstack);
			} else if (!this.mergeItemStack(itemstack1, this.tileEntityPresser.presserSlotCount,
					this.tileEntityPresser.totalSlotCount, false)) {
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
