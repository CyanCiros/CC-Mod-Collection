package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockSandStone.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorCreeperColoss extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;

	private EnumType block1Type;

	private final String mob1;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorCreeperColoss(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);

		this.mob1 = mobs.get(0);

		this.items = items;

		if (this.getEquals(world, this.block1.getBlock(), Blocks.sandstone)) {
			this.block1Type = BlockSandStone.EnumType.CHISELED;
		} else if (this.getEquals(world, this.block1.getBlock(), Blocks.stonebrick)) {
			this.block1Type = null;
		}
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		for (int vx = -3; vx <= 3; vx++) {
			for (int vz = -3; vz <= 3; vz++) {
				for (int vy = 0; vy <= 5; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy + 2, z + vz));
				}
			}
		}
		for (int vx = -2; vx <= 2; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				this.placeBlock(random, new BlockPos(x - 4, y + vy, z + vx), this.block1);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 4), this.block1);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 4), this.block1);
			}
			for (int vy = 3; vy <= 4; vy++) {
				this.placeBlock(random, new BlockPos(x - 3, y + vy, z + vx), this.block1);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 3), this.block1);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 3), this.block1);
			}
			for (int vy = 5; vy <= 6; vy++) {
				this.placeBlock(random, new BlockPos(x - 4, y + vy, z + vx), this.block1);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 4), this.block1);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 4), this.block1);
			}
			this.placeBlock(random, new BlockPos(x + 4, y, z + vx), this.block1);
			this.placeBlock(random, new BlockPos(x - 3, y + 7, z + vx), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + 7, z + vx), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 7, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 7, z - 3), this.block1);
		}
		for (int vx = 0; vx <= 2; vx++) {
			this.placeBlock(random, new BlockPos(x + 4, y + vx, z + 2), this.block1);
			this.placeBlock(random, new BlockPos(x + 4, y + vx, z - 2), this.block1);
			this.placeBlock(random, new BlockPos(x - 3, y + vx, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x - 3, y + vx, z - 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vx, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vx, z - 3), this.block1);
		}
		for (int vx = 3; vx <= 4; vx++) {
			this.placeBlock(random, new BlockPos(x + 4, y + vx, z - 1), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vx, z - 2), this.block1);
			this.placeBlock(random, new BlockPos(x + 4, y + vx, z + 1), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vx, z + 2), this.block1);
		}
		for (int vx = 5; vx <= 6; vx++) {
			this.placeBlock(random, new BlockPos(x + 4, y + vx, z + 2), this.block1);
			this.placeBlock(random, new BlockPos(x + 4, y + vx, z - 2), this.block1);
			this.placeBlock(random, new BlockPos(x - 3, y + vx, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x - 3, y + vx, z - 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vx, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vx, z - 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 4, y + vx, z), this.block1);
		}
		for (int vx = -1; vx <= 1; vx++) {
			this.placeBlock(random, new BlockPos(x - 2, y + 8, z + vx), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y + 8, z + vx), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 8, z - 2), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y + 8, z + 2), this.block1);

			for (int vz = -1; vz < 2; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + 8, z + vz), this.block1);
			}
		}
		for (int vx = -5; vx <= 5; vx++) {
			for (int vz = -5; vz <= 5; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);
			}
		}
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 4, z), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 6, z + 1), this.block1);
		this.placeBlock(random, new BlockPos(x + 4, y + 6, z - 1), this.block1);
		this.placeBlock(random, new BlockPos(x - 2, y + 7, z - 2), this.block1);
		this.placeBlock(random, new BlockPos(x + 2, y + 7, z - 2), this.block1);
		this.placeBlock(random, new BlockPos(x - 2, y + 7, z + 2), this.block1);
		this.placeBlock(random, new BlockPos(x + 2, y + 7, z + 2), this.block1);

		this.addChestWithCustomItemsLoot(this.world, random, x - 3, y, z, this.items);

		this.addMobSpawner(this.world, x, y, z, this.mob1);
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() == Blocks.sandstone) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(this.block1Type.ordinal()));
		} else if (state.getBlock() == Blocks.stonebrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(4)));
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
