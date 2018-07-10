package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ShipPart45 extends Ship {
	public ShipPart45(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 104, y + 22, z + 14), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 104, y + 22, z + 16), this.block10.getBlock());

		this.placeBlockDoor(this.world, random, new BlockPos(x + 105, y + 21, z + 15), Blocks.oak_door);

		this.placeBlockTorch(this.world, random, new BlockPos(x + 105, y + 26, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 105, y + 26, z + 9), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 105, y + 26, z + 21), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 105, y + 26, z + 24), this.block10.getBlock());
	}
}
