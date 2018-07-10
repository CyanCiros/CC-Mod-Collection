package cc_dungeon_pack.npctown;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class NPCTownPlant extends NPCTownBase {
	public NPCTownPlant(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.getBlocks(random);

		this.generatePlant(random, x + 5, y, z + 5);
		this.generatePlant(random, x - 5, y, z - 5);
		this.generatePlant(random, x + 5, y, z - 5);
		this.generatePlant(random, x - 5, y, z + 5);
	}

	private void generatePlant(final Random random, final int x, final int y, final int z) {
		final int r = random.nextInt(3);
		IBlockState block = Blocks.wheat.getDefaultState();

		if (r == 1) {
			block = Blocks.carrots.getDefaultState();
		} else if (r == 2) {
			block = Blocks.potatoes.getDefaultState();
		}
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = -4; vz <= 4; vz++) {
				if (vx != 0) {
					this.placeBlock(random, new BlockPos(x + vx, y, z + vz), Blocks.farmland.getDefaultState());

					this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), block);
				} else {
					this.placeBlock(random, new BlockPos(x, y, z + vz), this.block2);
				}
			}
		}

		for (int vx = -5; vx <= 5; vx++) {
			if (this.world.getBlockState(new BlockPos(x + vx, y, z + 5)).getBlock() != this.block3) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + 5), this.block1);
			}
			if (this.world.getBlockState(new BlockPos(x + vx, y, z - 5)).getBlock() != this.block3) {
				this.placeBlock(random, new BlockPos(x + vx, y, z - 5), this.block1);
			}

			if (vx == -5 || vx == 0 || vx == 5) {
				if (this.world.getBlockState(new BlockPos(x + vx, y + 1, z + 5)).getBlock() != this.block3) {
					this.placeBlock(random, new BlockPos(x + vx, y + 1, z + 5), this.block14);
				}
				if (this.world.getBlockState(new BlockPos(x + vx, y + 1, z - 5)).getBlock() != this.block3) {
					this.placeBlock(random, new BlockPos(x + vx, y + 1, z - 5), this.block14);
				}
			}
		}
		for (int vz = -4; vz <= 4; vz++) {
			if (this.world.getBlockState(new BlockPos(x + 5, y, z + vz)).getBlock() != this.block3) {
				this.placeBlock(random, new BlockPos(x + 5, y, z + vz), this.block1);
			}
			if (this.world.getBlockState(new BlockPos(x - 5, y, z + vz)).getBlock() != this.block3) {
				this.placeBlock(random, new BlockPos(x - 5, y, z + vz), this.block1);
			}

			if (vz == 0) {
				if (this.world.getBlockState(new BlockPos(x + 5, y + 1, z)).getBlock() != this.block3) {
					this.placeBlock(random, new BlockPos(x + 5, y + 1, z), this.block14);
				}
				if (this.world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() != this.block3) {
					this.placeBlock(random, new BlockPos(x, y + 1, z), this.block14);
				}
				if (this.world.getBlockState(new BlockPos(x - 5, y + 1, z)).getBlock() != this.block3) {
					this.placeBlock(random, new BlockPos(x - 5, y + 1, z), this.block14);
				}
			}
		}
	}
}
