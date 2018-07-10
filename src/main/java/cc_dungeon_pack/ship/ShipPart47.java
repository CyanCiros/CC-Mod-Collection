package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ShipPart47 extends Ship {
	public ShipPart47(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 115, y + 18, z + 12), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 115, y + 18, z + 18), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 117, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 117, y + 22, z + 24), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 117, y + 26, z + 10), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 117, y + 26, z + 20), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 120, y + 26, z + 10), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 120, y + 26, z + 20), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 121, y + 18, z + 12), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 121, y + 18, z + 18), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 121, y + 22, z + 6), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 121, y + 22, z + 24), this.block10.getBlock());
	}
}
