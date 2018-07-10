package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ShipPart50 extends Ship {
	public ShipPart50(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 135, y + 26, z + 10), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 135, y + 26, z + 20), this.block10.getBlock());

		this.placeBlockDoor(this.world, random, new BlockPos(x + 139, y + 25, z + 15), Blocks.oak_door);
	}
}
