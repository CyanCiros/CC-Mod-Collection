package cc_harvest.entity;

import cc_harvest.recipes.RecipesPresser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityPresser extends TileEntity implements IUpdatePlayerListBox, ISidedInventory {
	private ItemStack[] presserItemStacks = new ItemStack[3];

	public int presserBurnTime;
	public int presserCookTime;
	public int currentPresserBurnTime;

	private String presserCustomName;

	public final int presserSlotCount = 2;
	public final int inventorySlotCount = 36;
	public int totalSlotCount = this.presserSlotCount + this.inventorySlotCount;

	private static final int[] slotsTop = { 0 };
	private static final int[] slotsBottom = { 1 };

	@Override
	public int getSizeInventory() {
		return this.presserItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(final int index) {
		return this.presserItemStacks[index];
	}

	@Override
	public ItemStack decrStackSize(final int slot, final int amount) {
		if (this.presserItemStacks[slot] != null) {
			if (this.presserItemStacks[slot].stackSize <= amount) {
				final ItemStack itemStack1 = this.presserItemStacks[slot];
				this.presserItemStacks[slot] = null;

				return itemStack1;
			}
			final ItemStack itemStack2 = this.presserItemStacks[slot].splitStack(amount);

			if (this.presserItemStacks[slot].stackSize == 0) {
				this.presserItemStacks[slot] = null;
			}
			return itemStack2;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(final int index) {
		if (this.presserItemStacks[index] != null) {
			final ItemStack itemstack = this.presserItemStacks[index];
			this.presserItemStacks[index] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(final int index, final ItemStack itemStack) {
		final boolean flag = itemStack != null && itemStack.isItemEqual(this.presserItemStacks[index])
				&& ItemStack.areItemStackTagsEqual(itemStack, this.presserItemStacks[index]);
		this.presserItemStacks[index] = itemStack;

		if (itemStack != null && itemStack.stackSize > this.getInventoryStackLimit()) {
			itemStack.stackSize = this.getInventoryStackLimit();
		}

		if (index == 0 && !flag) {
			this.presserCookTime = 0;
			this.markDirty();
		}
	}

	@Override
	public boolean isUseableByPlayer(final EntityPlayer entityPlayer) {
		return this.worldObj.getTileEntity(this.pos) == this;
	}

	@Override
	public boolean isItemValidForSlot(final int index, final ItemStack itemStack) {
		return index == 0 ? true : false;
	}

	@Override
	public boolean canInsertItem(final int index, final ItemStack itemStackIn, final EnumFacing direction) {
		return this.isItemValidForSlot(index, itemStackIn);
	}

	@Override
	public void readFromNBT(final NBTTagCompound compound) {
		super.readFromNBT(compound);
		final NBTTagList nbttaglist = compound.getTagList("Items", 10);
		this.presserItemStacks = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < nbttaglist.tagCount(); ++i) {
			final NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			final byte b0 = nbttagcompound1.getByte("Slot");

			if (b0 >= 0 && b0 < this.presserItemStacks.length) {
				this.presserItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		this.presserBurnTime = compound.getShort("BurnTime");
		this.presserCookTime = compound.getShort("CookTime");
		this.currentPresserBurnTime = this.getItemBurnTime(this.presserItemStacks[1]);

		if (compound.hasKey("CustomName", 8)) {
			this.presserCustomName = compound.getString("CustomName");
		}
	}

	@Override
	public void writeToNBT(final NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setShort("BurnTime", (short) this.presserBurnTime);
		compound.setShort("CookTime", (short) this.presserCookTime);
		final NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < this.presserItemStacks.length; ++i) {
			if (this.presserItemStacks[i] != null) {
				final NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				this.presserItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		compound.setTag("Items", nbttaglist);

		if (this.hasCustomName()) {
			compound.setString("CustomName", this.presserCustomName);
		}
	}

	@Override
	public void update() {
		boolean var2 = false;

		if (this.isBurning()) {
			this.presserBurnTime -= 1;
		}
		if (!this.worldObj.isRemote) {
			if (this.presserBurnTime == 0 && this.canRun()) {
				this.currentPresserBurnTime = this.presserBurnTime = this.getItemBurnTime(this.presserItemStacks[1]);
			}
			if (this.canRun()) {
				// BlockPresser.updateBlockState(true, this.worldObj, this.pos);
				this.presserCookTime += 1;

				if (this.presserCookTime == 125) {
					this.presserCookTime = 0;
					this.pressComb();

					var2 = true;
				}
			} else {
				// BlockPresser.updateBlockState(false, this.worldObj,
				// this.pos);
				this.presserCookTime = 0;
			}
			if (var2 != this.presserBurnTime > 0) {
				var2 = true;
			}
		}
		if (var2) {
			this.markDirty();
		}
	}

	@SuppressWarnings("unused")
	private int getItemBurnTime(final ItemStack itemStack) {
		return 300;
	}

	@Override
	public Packet getDescriptionPacket() {
		final NBTTagCompound tag = new NBTTagCompound();
		this.writeToNBT(tag);

		return new S35PacketUpdateTileEntity(this.pos, 1, tag);
	}

	// @Override
	// public void onDataPacket(final NetworkManager net, final
	// S35PacketUpdateTileEntity packet) {
	// this.readFromNBT(packet.func_148857_g());
	// }

	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(final int par1) {
		return this.presserCookTime * par1 / 125;
	}

	public boolean isBurning() {
		return this.presserBurnTime > 0;
	}

	public int getDamage(final ItemStack itemStack) {
		return itemStack.getItemDamage();
	}

	private boolean canRun() {
		if (this.presserItemStacks[0] == null) {
			return false;
		}
		final ItemStack itemstack = RecipesPresser.smelting().getSmeltingResult(this.presserItemStacks[0]);

		if (itemstack == null) {
			return false;
		}
		if (this.presserItemStacks[1] == null) {
			return true;
		}
		if (!this.presserItemStacks[1].isItemEqual(itemstack)) {
			return false;
		}
		final int result = this.presserItemStacks[1].stackSize + itemstack.stackSize;

		return result <= this.getInventoryStackLimit() && result <= this.presserItemStacks[1].getMaxStackSize();
	}

	public void pressComb() {
		if (this.canRun()) {
			final ItemStack itemstack = RecipesPresser.smelting().getSmeltingResult(this.presserItemStacks[0]);

			if (this.presserItemStacks[1] == null) {
				this.presserItemStacks[1] = itemstack.copy();
			} else if (this.presserItemStacks[1].getItem() == itemstack.getItem()) {
				this.presserItemStacks[1].stackSize += itemstack.stackSize;
			}
			this.presserItemStacks[0].stackSize -= 1;

			if (this.presserItemStacks[0].stackSize <= 0) {
				this.presserItemStacks[0] = null;
			}
		}
	}

	public void openChest() {
	}

	public void closeChest() {
	}

	public boolean isInvNameLocalized() {
		return false;
	}

	@SuppressWarnings("unused")
	public boolean isStackValidForSlot(final int i, final ItemStack itemstack) {
		return true;
	}

	@Override
	public void openInventory(final EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeInventory(final EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getField(final int id) {
		switch (id) {
		case 0:
			return this.presserBurnTime;
		case 1:
			return this.presserCookTime;
		case 2:
			return this.currentPresserBurnTime;
		default:
			return 0;
		}
	}

	@Override
	public void setField(final int id, final int value) {
		switch (id) {
		case 0:
			this.presserBurnTime = value;
			break;
		case 1:
			this.presserCookTime = value;
			break;
		case 2:
			this.currentPresserBurnTime = value;
			break;
		default:
			break;
		}
	}

	@Override
	public int getFieldCount() {
		return this.presserSlotCount;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.presserItemStacks.length; ++i) {
			this.presserItemStacks[i] = null;
		}
	}

	@Override
	public String getName() {
		return this.hasCustomName() ? this.presserCustomName : "container.presser";
	}

	@Override
	public boolean hasCustomName() {
		return this.presserCustomName != null && this.presserCustomName.length() > 0;
	}

	@Override
	public IChatComponent getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getSlotsForFace(final EnumFacing side) {
		return side == EnumFacing.DOWN ? slotsBottom : side == EnumFacing.UP ? slotsTop : null;
	}

	@Override
	public boolean canExtractItem(final int index, final ItemStack stack, final EnumFacing direction) {
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
}
