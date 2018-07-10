package cc_harvest.entity;

import java.util.Random;

import cc_harvest.items.ModItems;
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

public class TileEntityApiary extends TileEntity implements IUpdatePlayerListBox, ISidedInventory {
	private ItemStack[] apiaryItemStacks = new ItemStack[19];
	public int apiaryRunTime = 0;
	public int apiaryProduceTime = 0;
	public int currentBeeRunTime = 0;

	private String apiaryCustomName;

	public final int apiarySlotCount = 19;
	public final int inventorySlotCount = 36;
	public int totalSlotCount = this.apiarySlotCount + this.inventorySlotCount;

	@Override
	public int getSizeInventory() {
		return this.apiaryItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(final int slot) {
		return this.apiaryItemStacks[slot];
	}

	@Override
	public ItemStack decrStackSize(final int slot, final int amount) {
		if (this.apiaryItemStacks[slot] != null) {
			if (this.apiaryItemStacks[slot].stackSize <= amount) {
				final ItemStack itemStack1 = this.apiaryItemStacks[slot];
				this.apiaryItemStacks[slot] = null;

				return itemStack1;
			}
			final ItemStack itemStack2 = this.apiaryItemStacks[slot].splitStack(amount);

			if (this.apiaryItemStacks[slot].stackSize == 0) {
				this.apiaryItemStacks[slot] = null;
			}
			return itemStack2;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(final int index) {
		if (this.apiaryItemStacks[index] != null) {
			final ItemStack itemstack = this.apiaryItemStacks[index];
			this.apiaryItemStacks[index] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(final int index, final ItemStack itemStack) {
		final boolean flag = itemStack != null && itemStack.isItemEqual(this.apiaryItemStacks[index])
				&& ItemStack.areItemStackTagsEqual(itemStack, this.apiaryItemStacks[index]);
		this.apiaryItemStacks[index] = itemStack;

		if (itemStack != null && itemStack.stackSize > this.getInventoryStackLimit()) {
			itemStack.stackSize = this.getInventoryStackLimit();
		}

		if (index == 0 && !flag) {
			this.apiaryProduceTime = 0;
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
		this.apiaryItemStacks = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < nbttaglist.tagCount(); ++i) {
			final NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			final byte b0 = nbttagcompound1.getByte("Slot");

			if (b0 >= 0 && b0 < this.apiaryItemStacks.length) {
				this.apiaryItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		this.apiaryRunTime = compound.getShort("RunTime");
		this.apiaryProduceTime = compound.getShort("ProduceTime");
		this.currentBeeRunTime = this.getRunTime(this.apiaryItemStacks[1]);

		if (compound.hasKey("CustomName", 8)) {
			this.apiaryCustomName = compound.getString("CustomName");
		}
	}

	@Override
	public void writeToNBT(final NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setShort("RunTime", (short) this.apiaryRunTime);
		compound.setShort("ProduceTime", (short) this.apiaryProduceTime);
		final NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < this.apiaryItemStacks.length; ++i) {
			if (this.apiaryItemStacks[i] != null) {
				final NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				this.apiaryItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		compound.setTag("Items", nbttaglist);

		if (this.hasCustomName()) {
			compound.setString("CustomName", this.apiaryCustomName);
		}
	}

	@Override
	public void update() {
		boolean var2 = false;

		if (this.apiaryRunTime > 0) {
			this.apiaryRunTime -= 1;
		}
		if (!this.worldObj.isRemote) {
			if (this.apiaryRunTime == 0 && this.canRun()) {
				this.currentBeeRunTime = this.apiaryRunTime = this.getRunTime(this.apiaryItemStacks[18]);

				if (this.apiaryRunTime > 0) {
					var2 = true;

					if (this.apiaryItemStacks[18] != null) {
						if (this.apiaryItemStacks[18].getItem().getContainerItem() != null) {
							this.apiaryItemStacks[18] = new ItemStack(this.apiaryItemStacks[18].getItem().setFull3D());
						} else {
							this.apiaryItemStacks[18].stackSize -= 0;
						}
						if (this.apiaryItemStacks[18].stackSize == 0) {
							this.apiaryItemStacks[18] = null;
						}
					}
				}
			}
			if (this.canRun()) {
				this.apiaryProduceTime += 1;

				if (this.apiaryProduceTime >= Math.floor(this.getRunTime(this.apiaryItemStacks[18]))) {
					this.apiaryProduceTime = 0;
					this.run();
					var2 = true;
				}
			} else {
				this.apiaryProduceTime = 0;
			}
			if (var2 != this.apiaryRunTime > 0) {
				var2 = true;
			}
		}
		if (var2) {
			this.markDirty();
		}
	}

	private boolean canRun() {
		if (this.apiaryItemStacks[18] != null) {
			if (this.apiaryItemStacks[18].getItem() == ModItems.queenBeeItem) {
				if (this.apiaryItemStacks[18].getItemDamage() != 18) {
					return true;
				}
			}
		}

		return false;
	}

	public void run() {
		this.apiaryItemStacks[18].attemptDamageItem(1, null);
		final ItemStack itemStack = this.getComb();

		for (int index = 0; index < 18; index++) {
			if (this.apiaryItemStacks[index] == null) {
				this.apiaryItemStacks[index] = itemStack.copy();
				break;
			}
		}
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

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	public void onInventoryChanged() {
	}

	public ItemStack getComb() {
		final Random random = new Random();
		final int chance = random.nextInt(100);

		if (chance < 50) {
			return new ItemStack(ModItems.honeycombItem);
		} else if (chance >= 50 && chance < 90) {
			return new ItemStack(ModItems.waxcombItem);
		}
		return new ItemStack(ModItems.grubItem);

	}

	public int getRunTime(final ItemStack itemStack) {
		if (itemStack != null) {
			return itemStack.getItem() == ModItems.queenBeeItem ? 3200 : 0;
		}
		return 0;
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
	public String getName() {
		return this.hasCustomName() ? this.apiaryCustomName : "container.apiary";
	}

	@Override
	public boolean hasCustomName() {
		return this.apiaryCustomName != null && this.apiaryCustomName.length() > 0;
	}

	@Override
	public IChatComponent getDisplayName() {
		// TODO Auto-generated method stub
		return null;
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
			return this.apiaryRunTime;
		case 1:
			return this.apiaryProduceTime;
		case 2:
			return this.currentBeeRunTime;
		default:
			return 0;
		}
	}

	@Override
	public void setField(final int id, final int value) {
		switch (id) {
		case 0:
			this.apiaryRunTime = value;
			break;
		case 1:
			this.apiaryProduceTime = value;
			break;
		case 2:
			this.currentBeeRunTime = value;
			break;
		default:
			break;
		}
	}

	@Override
	public int getFieldCount() {
		return this.apiarySlotCount - 1;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.apiaryItemStacks.length; ++i) {
			this.apiaryItemStacks[i] = null;
		}
	}

	@Override
	public int[] getSlotsForFace(final EnumFacing side) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canExtractItem(final int index, final ItemStack stack, final EnumFacing direction) {
		return true;
	}
}
