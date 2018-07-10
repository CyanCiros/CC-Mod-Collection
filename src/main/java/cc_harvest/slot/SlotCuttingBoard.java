package cc_harvest.slot;

import cc_harvest.manager.CraftingManagerCuttingBoard;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotCuttingBoard extends Slot {
	private final InventoryCrafting craftMatrix;
	private final EntityPlayer thePlayer;
	private int amountCrafted;

	public SlotCuttingBoard(final EntityPlayer player, final InventoryCrafting craftingInventory,
			final IInventory inventory, final int slotIndex, final int xPosition, final int yPosition) {
		super(inventory, slotIndex, xPosition, yPosition);
		this.thePlayer = player;
		this.craftMatrix = craftingInventory;
	}

	@Override
	public boolean isItemValid(final ItemStack itemStack) {
		return false;
	}

	@Override
	public ItemStack decrStackSize(final int amount) {
		if (this.getHasStack()) {
			this.amountCrafted += Math.min(amount, this.getStack().stackSize);
		}

		return super.decrStackSize(amount);
	}

	@Override
	protected void onCrafting(final ItemStack stack, final int amount) {
		this.amountCrafted += amount;
		this.onCrafting(stack);
	}

	@Override
	protected void onCrafting(final ItemStack stack) {
		if (this.amountCrafted > 0) {
			stack.onCrafting(this.thePlayer.worldObj, this.thePlayer, this.amountCrafted);
		}

		this.amountCrafted = 0;
	}

	@Override
	public void onPickupFromSlot(final EntityPlayer player, final ItemStack stack) {
		net.minecraftforge.fml.common.FMLCommonHandler.instance().firePlayerCraftingEvent(player, stack,
				this.craftMatrix);
		this.onCrafting(stack);
		net.minecraftforge.common.ForgeHooks.setCraftingPlayer(player);
		final ItemStack[] aitemstack = CraftingManagerCuttingBoard.getInstance().func_180303_b(this.craftMatrix,
				player.worldObj);
		net.minecraftforge.common.ForgeHooks.setCraftingPlayer(null);

		for (int i = 0; i < aitemstack.length; ++i) {
			final ItemStack itemstack1 = this.craftMatrix.getStackInSlot(i);
			final ItemStack itemstack2 = aitemstack[i];

			if (itemstack1 != null) {
				this.craftMatrix.decrStackSize(i, 1);
			}

			if (itemstack2 != null) {
				if (this.craftMatrix.getStackInSlot(i) == null) {
					this.craftMatrix.setInventorySlotContents(i, itemstack2);
				} else if (!this.thePlayer.inventory.addItemStackToInventory(itemstack2)) {
					this.thePlayer.dropPlayerItemWithRandomChoice(itemstack2, false);
				}
			}
		}
	}
}
