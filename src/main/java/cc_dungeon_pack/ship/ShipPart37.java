package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ShipPart37 extends Ship {
	public ShipPart37(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 14, y + 18, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 14, y + 22, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 14, y + 26, z + 7), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 14, y + 26, z + 14), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 14, y + 26, z + 16), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 14, y + 26, z + 23), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 14, y + 30, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 14, y + 35, z + 14), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 14, y + 35, z + 16), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 17, y + 26, z + 7), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 17, y + 26, z + 23), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 18, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 18, y + 22, z + 24), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 19, y + 26, z + 7), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 19, y + 26, z + 23), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 20, y + 18, z + 12), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 20, y + 18, z + 18), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 22, y + 22, z + 15), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 22, y + 26, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 22, y + 26, z + 24), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 23, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 23, y + 22, z + 24), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 24, y + 26, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 24, y + 26, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 24, y + 26, z + 17), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 24, y + 26, z + 24), this.block10.getBlock());
	}
}
