package cc_dungeon_pack.temple;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class TemplePQ2Part12 extends TemplePQ2 {
	public TemplePQ2Part12(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, mobs, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.placeBlock(random, new BlockPos(x + 17, y + 0, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 17, y + 0, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 17, y + 0, z + 11), this.block1);
		this.placeBlock(random, new BlockPos(x + 17, y + 0, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 17, y + 1, z + 9), this.block1);
		this.placeBlock(random, new BlockPos(x + 17, y + 1, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 17, y + 2, z + 9), this.block1);

		this.placeBlock(random, new BlockPos(x + 17, y + 2, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 17, y + 3, z + 9), this.block1);

		this.placeBlock(random, new BlockPos(x + 17, y + 3, z + 12), this.block1);

		this.placeBlock(random, new BlockPos(x + 17, y + 4, z + 10), this.block1);
		this.placeBlock(random, new BlockPos(x + 17, y + 4, z + 11), this.block1);
	}
}
