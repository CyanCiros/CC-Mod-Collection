package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ShipPart40 extends Ship {
	public ShipPart40(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 48, y + 22, z + 5), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 48, y + 22, z + 8), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 48, y + 22, z + 22), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 48, y + 22, z + 25), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 49, y + 18, z + 15), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 51, y + 22, z + 12), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 51, y + 22, z + 18), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 56, y + 22, z + 12), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 56, y + 22, z + 18), this.block10.getBlock());
	}
}
