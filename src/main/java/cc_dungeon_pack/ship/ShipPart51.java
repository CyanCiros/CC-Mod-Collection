package cc_dungeon_pack.ship;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ShipPart51 extends Ship {
	public ShipPart51(final World world, final ArrayList<IBlockState> blocks, final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlockTorch(this.world, random, new BlockPos(x + 141, y + 22, z + 15), this.block10.getBlock());

		this.placeBlockTorch(this.world, random, new BlockPos(x + 142, y + 26, z + 13), this.block10.getBlock());
		this.placeBlockTorch(this.world, random, new BlockPos(x + 142, y + 26, z + 17), this.block10.getBlock());
	}
}
