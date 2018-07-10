package cc_dungeon_pack.npctown;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class NPCTownHouse2 extends NPCTownHouse1 {
	public NPCTownHouse2(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.getBlocks(random);

		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = -4; vz <= 4; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y + -1, z + vz), this.block9);
			}
		}
		for (int vy = 0; vy <= 4; vy++) {
			for (int vx = -4; vx <= 4; vx++) {
				if (!(vx >= -1 && vx <= 1 && vy >= 0 && vy <= 2)) {
					if (vy == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 4), this.block1);
					} else {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 4), this.block4);
					}
				}
				if (vy == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 4), this.block1);
				} else {
					if (vy >= 2 && vy <= 3 && vx >= -2 && vx <= 2) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 4), this.block7);
					} else {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 4), this.block4);
					}
				}
			}
		}
		for (int vy = 0; vy <= 4; vy++) {
			for (int vz = -3; vz <= 3; vz++) {
				if (vy == 0) {
					this.placeBlock(random, new BlockPos(x + 4, y + vy, z + vz), this.block1);
				} else {
					if (vy >= 2 && vy <= 3 && vz >= -2 && vz <= 2) {
						this.placeBlock(random, new BlockPos(x + 4, y + vy, z + vz), this.block7);
					} else {
						this.placeBlock(random, new BlockPos(x + 4, y + vy, z + vz), this.block4);
					}
				}
				if (vy == 0) {
					this.placeBlock(random, new BlockPos(x - 4, y + vy, z + vz), this.block1);
				} else {
					if (vy >= 2 && vy <= 3 && vz >= -2 && vz <= 2) {
						this.placeBlock(random, new BlockPos(x - 4, y + vy, z + vz), this.block7);
					} else {
						this.placeBlock(random, new BlockPos(x - 4, y + vy, z + vz), this.block4);
					}
				}
			}
		}
		int vx1 = -5;
		int vx2 = 5;
		int vz1 = -5;
		int vz2 = 5;

		for (int vy = 5; vy <= 9; vy++) {
			for (int vx = vx1; vx <= vx2; vx++) {
				for (int vz = vz1; vz <= vz2; vz++) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
				}
			}
			vx1++;
			vx2--;
			vz1++;
			vz2--;
		}

		for (int vz = -2; vz <= 2; vz += 2) {
			this.addChestWithCustomItemsLoot(this.world, random, x + 3, y, z + vz, this.items);
			this.addChestWithCustomItemsLoot(this.world, random, x - 3, y, z + vz, this.items);
		}

		this.placeBlock(random, new BlockPos(x, y, z), this.block14);

		new NPCTownHouse1(this.world, this.blocks, this.items).generate(random, x, y, z);
	}
}
