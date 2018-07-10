package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ShipPart39 extends Ship {
	public ShipPart39(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 38, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 38, y + 22, z + 24), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 39, y + 26, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 39, y + 26, z + 9), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 39, y + 26, z + 21), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 39, y + 26, z + 24), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 44, y + 26, z + 5), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 44, y + 26, z + 8), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 44, y + 26, z + 22), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 44, y + 26, z + 25), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 45, y + 22, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 45, y + 22, z + 17), this.block10.getBlock());
	}
}
