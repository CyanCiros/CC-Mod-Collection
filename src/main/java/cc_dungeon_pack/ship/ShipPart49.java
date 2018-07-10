package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ShipPart49 extends Ship {
	public ShipPart49(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 129, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 129, y + 22, z + 24), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 129, y + 26, z + 10), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 129, y + 26, z + 20), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 132, y + 26, z + 10), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 132, y + 26, z + 20), this.block10.getBlock());

		this.placeBlockDoor(this.world, random, new BlockPos(x + 134, y + 21, z + 15), Blocks.oak_door);
	}
}
