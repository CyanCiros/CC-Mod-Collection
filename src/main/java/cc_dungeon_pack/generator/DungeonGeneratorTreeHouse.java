package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorTreeHouse extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;

	private static EnumType plankType;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorTreeHouse(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		if (this.getEquals(this.world, this.block1.getBlock(), Blocks.planks)) {
			final int r = random.nextInt(6);

			switch (r) {
			case 0:
				DungeonGeneratorTreeHouse.plankType = BlockPlanks.EnumType.OAK;
				break;
			case 1:
				DungeonGeneratorTreeHouse.plankType = BlockPlanks.EnumType.SPRUCE;
				break;
			case 2:
				DungeonGeneratorTreeHouse.plankType = BlockPlanks.EnumType.BIRCH;
				break;
			case 3:
				DungeonGeneratorTreeHouse.plankType = BlockPlanks.EnumType.JUNGLE;
				break;
			case 4:
				DungeonGeneratorTreeHouse.plankType = BlockPlanks.EnumType.ACACIA;
				break;
			case 5:
				DungeonGeneratorTreeHouse.plankType = BlockPlanks.EnumType.DARK_OAK;
				break;
			default:
				DungeonGeneratorTreeHouse.plankType = BlockPlanks.EnumType.OAK;
				break;
			}
		}

		final int by = this.getTop(this.world, x, z);

		for (int vx = -2; vx <= 2; vx++) {
			for (int vz = -2; vz <= 2; vz++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, by + vy, z + vz));
				}
			}
		}
		for (int vx = -3; vx <= 3; vx++) {
			for (int vz = -3; vz <= 3; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, by - 1, z + vz), this.block1);
			}
		}

		int vx1 = -4;
		int vx2 = 4;
		int vz1 = -4;
		int vz2 = 4;

		for (int vy = 3; vy <= 7; vy++) {
			for (int vx = vx1; vx <= vx2; vx++) {
				for (int vz = vz1; vz <= vz2; vz++) {
					if (!(vx >= vx1 + 1 && vx <= vx2 - 1 && vz >= vz1 + 1 && vz <= vz2 - 1)) {
						if (random.nextInt(4) == 0) {
							this.world.setBlockToAir(new BlockPos(x + vx, by + vy, z + vz));
						} else {
							this.placeBlock(random, new BlockPos(x + vx, by + vy, z + vz), this.block1);
						}
					} else {
						this.world.setBlockToAir(new BlockPos(x + vx, by + vy, z + vz));
					}
				}
			}
			vx1++;
			vx2--;
			vz1++;
			vz2--;
		}
		for (int vy = 0; vy <= 3; vy++) {
			for (int vz = -3; vz <= 3; vz++) {
				if (random.nextInt(4) == 0) {
					this.world.setBlockToAir(new BlockPos(x + 3, by + vy, z + vz));
				} else {
					this.placeBlock(random, new BlockPos(x + 3, by + vy, z + vz), this.block1);
				}
				if (random.nextInt(4) == 0) {
					this.world.setBlockToAir(new BlockPos(x - 3, by + vy, z + vz));
				} else {
					this.placeBlock(random, new BlockPos(x - 3, by + vy, z + vz), this.block1);
				}
			}
			for (int vx = -3; vx <= 3; vx++) {
				if (random.nextInt(4) == 0) {
					this.world.setBlockToAir(new BlockPos(x + vx, by + vy, z + 3));
				} else {
					this.placeBlock(random, new BlockPos(x + vx, by + vy, z + 3), this.block1);
				}
				if (random.nextInt(4) == 0) {
					this.world.setBlockToAir(new BlockPos(x + vx, by + vy, z - 3));
				} else {
					this.placeBlock(random, new BlockPos(x + vx, by + vy, z - 3), this.block1);
				}
			}
		}
		this.addMobSpawner(this.world, x, by, z, this.mobs.get(random.nextInt(this.mobs.size())));

		for (int i = 0; i <= 1; i++) {
			final int r = random.nextInt(3);

			if (r == 0) {
				final int kor = random.nextInt(2) - 1;
				final int rx = x + 2;
				final int ry = by;
				final int rz = z + kor;

				if (this.world.isAirBlock(new BlockPos(rx, ry, rz))) {
					this.addChestWithCustomItemsLoot(this.world, random, rx, ry, rz, this.items);
				}
			}
			if (r == 1) {
				final int kor = random.nextInt(2) - 1;
				final int rx = x - 2;
				final int ry = by;
				final int rz = z + kor;

				if (this.world.isAirBlock(new BlockPos(rx, ry, rz))) {
					this.addChestWithCustomItemsLoot(this.world, random, rx, ry, rz, this.items);
				}
			}
			if (r == 2) {
				final int kor = random.nextInt(2) - 1;
				final int rx = x + kor;
				final int ry = by;
				final int rz = z + 2;

				if (this.world.isAirBlock(new BlockPos(rx, ry, rz))) {
					this.addChestWithCustomItemsLoot(this.world, random, rx, ry, rz, this.items);
				}
			}
			if (r == 3) {
				final int kor = random.nextInt(2) - 1;
				final int rx = x + kor;
				final int ry = by;
				final int rz = z - 2;

				if (this.world.isAirBlock(new BlockPos(rx, ry, rz))) {
					this.addChestWithCustomItemsLoot(this.world, random, rx, ry, rz, this.items);
				}
			}
		}
		if (this.world.isAirBlock(new BlockPos(x, by - 2, z))) {
			for (int vy = by - 1; vy >= 0; vy--) {
				if (vy < by - 1 && !(this.world.isAirBlock(new BlockPos(x, vy, z))
						&& this.world.getBlockState(new BlockPos(x, vy, z)) == Blocks.log.getDefaultState()
						&& this.world.getBlockState(new BlockPos(x, vy, z)) == Blocks.log2.getDefaultState()
						&& this.world.getBlockState(new BlockPos(x, vy, z)) == Blocks.leaves.getDefaultState()
						&& this.world.getBlockState(new BlockPos(x, vy, z)) == Blocks.leaves2.getDefaultState()
						&& this.world.getBlockState(new BlockPos(x, vy, z)) == Blocks.tallgrass.getDefaultState()
						&& this.world.getBlockState(new BlockPos(x, vy, z)) == Blocks.double_plant.getDefaultState()
						&& this.world.getBlockState(new BlockPos(x, vy, z)) == Blocks.yellow_flower.getDefaultState()
						&& this.world.getBlockState(new BlockPos(x, vy, z)) == Blocks.red_flower.getDefaultState())) {
					break;
				}
				this.placeBlock(random, new BlockPos(x, vy, z), this.block1);
				this.placeBlock(random, new BlockPos(x - 1, vy, z), Blocks.ladder.getDefaultState());
			}
		}
	}

	@SuppressWarnings("unused")
	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockPlanks) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorTreeHouse.plankType.ordinal()));
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
