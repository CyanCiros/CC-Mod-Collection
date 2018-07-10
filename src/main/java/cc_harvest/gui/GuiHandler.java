package cc_harvest.gui;

import cc_harvest.container.ContainerApiary;
import cc_harvest.container.ContainerChurn;
import cc_harvest.container.ContainerCuttingBoard;
import cc_harvest.container.ContainerPot;
import cc_harvest.container.ContainerPresser;
import cc_harvest.container.ContainerQuern;
import cc_harvest.container.ContainerStorageBox;
import cc_harvest.entity.TileEntityApiary;
import cc_harvest.entity.TileEntityChurn;
import cc_harvest.entity.TileEntityCuttingBoard;
import cc_harvest.entity.TileEntityPot;
import cc_harvest.entity.TileEntityPresser;
import cc_harvest.entity.TileEntityQuern;
import cc_harvest.entity.TileEntityStorageBox;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	public static final int GuiApiary = 0;
	public static final int GuiPresser = 1;
	public static final int GuiCuttingBoard = 2;
	public static final int GuiPot = 3;
	public static final int GuiChurn = 4;
	public static final int GuiQuern = 5;
	public static final int GuiStorageBox = 6;
	public static final int GuiBook = 7;

	@Override
	public Object getServerGuiElement(final int ID, final EntityPlayer player, final World world, final int x,
			final int y, final int z) {
		final TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

		switch (ID) {
		case 0:
			return new ContainerApiary(player.inventory, (TileEntityApiary) tileEntity);
		case 1:
			return new ContainerPresser(player.inventory, (TileEntityPresser) tileEntity);
		case 2:
			return new ContainerCuttingBoard(player.inventory, (TileEntityCuttingBoard) tileEntity, world);
		case 3:
			return new ContainerPot(player.inventory, (TileEntityPot) tileEntity, world);
		case 4:
			return new ContainerChurn(player.inventory, (TileEntityChurn) tileEntity);
		case 5:
			return new ContainerQuern(player.inventory, (TileEntityQuern) tileEntity);
		case 6:
			return new ContainerStorageBox(player.inventory, (TileEntityStorageBox) tileEntity);
		default:
			break;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x,
			final int y, final int z) {
		final TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

		switch (ID) {
		case 0:
			return new GuiApiary(player.inventory, (TileEntityApiary) tileEntity);
		case 1:
			return new GuiPresser(player.inventory, (TileEntityPresser) tileEntity);
		case 2:
			return new GuiCuttingBoard(player.inventory, (TileEntityCuttingBoard) tileEntity, world);
		case 3:
			return new GuiPot(player.inventory, (TileEntityPot) tileEntity, world);
		case 4:
			return new GuiChurn(player.inventory, (TileEntityChurn) tileEntity);
		case 5:
			return new GuiQuern(player.inventory, (TileEntityQuern) tileEntity);
		case 6:
			return new GuiStorageBox(player.inventory, (TileEntityStorageBox) tileEntity);
		case 7:
			return new GuiBook();
		default:
			break;
		}
		return null;
	}
}
