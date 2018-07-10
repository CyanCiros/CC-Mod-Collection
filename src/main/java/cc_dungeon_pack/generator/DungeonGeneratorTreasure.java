package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import cc_dungeon_pack.Config;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorTreasure extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;
	private final IBlockState block3;
	private final IBlockState block4;
	private final IBlockState block5;
	private final IBlockState block6;
	private final IBlockState block7;

	private static IBlockState fenceType;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	private int height;

	ArrayList<Integer> rx;
	ArrayList<Integer> rz;

	public DungeonGeneratorTreasure(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<String> mobs, final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);
		this.block4 = blocks.get(3);
		this.block5 = blocks.get(4);
		this.block6 = blocks.get(5);
		this.block7 = blocks.get(6);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		if (this.getEquals(this.world, this.block4.getBlock(), Blocks.oak_fence)) {
			final int r = random.nextInt(6);

			switch (r) {
			case 0:
				DungeonGeneratorTreasure.fenceType = Blocks.oak_fence.getDefaultState();
				break;
			case 1:
				DungeonGeneratorTreasure.fenceType = Blocks.spruce_fence.getDefaultState();
				break;
			case 2:
				DungeonGeneratorTreasure.fenceType = Blocks.birch_fence.getDefaultState();
				break;
			case 3:
				DungeonGeneratorTreasure.fenceType = Blocks.jungle_fence.getDefaultState();
				break;
			case 4:
				DungeonGeneratorTreasure.fenceType = Blocks.acacia_fence.getDefaultState();
				break;
			case 5:
				DungeonGeneratorTreasure.fenceType = Blocks.dark_oak_fence.getDefaultState();
				break;
			default:
				DungeonGeneratorTreasure.fenceType = Blocks.oak_fence.getDefaultState();
				break;
			}
		} else {
			DungeonGeneratorTreasure.fenceType = Blocks.nether_brick_fence.getDefaultState();
		}

		final int middle = (Config.treasureHeight - Config.treasureDepth) / 2;
		final int depth = random.nextInt(middle) + Config.treasureDepth;
		this.height = Config.treasureHeight - random.nextInt(middle);

		this.generateFloors(random, x, depth, z);
	}

	private void generateFloors(final Random random, final int x, final int y, final int z) {
		int vx = 0;
		int vz = 0;

		for (int by = y; by <= this.height; by += 5) {
			if (by == y) {
				vx = x;
				vz = z;
			} else {
				final int vs = random.nextInt(this.rx.size());

				vx = this.rx.get(vs);
				vz = this.rz.get(vs);

				if (by != y) {
					this.treasureEmpty(random, vx, by, vz);
					this.treasureLadder(random, vx, by - 5, vz);
				}
			}

			this.rx = new ArrayList<Integer>();
			this.rz = new ArrayList<Integer>();

			for (int br = 0; br <= Config.treasureSize; br++) {
				if (br != 0 || by != y) {
					final int r = random.nextInt(4);

					if (r == 0) {
						vx += 10;
					} else if (r == 1) {
						vx -= 10;
					} else if (r == 2) {
						vz += 10;
					} else if (r == 3) {
						vz -= 10;
					}
				}

				if (this.world.getBlockState(new BlockPos(vx, by + 3, vz)) != this.block1) {
					if (random.nextInt(3) == 0 || br == 0) {
						this.treasureEmpty(random, vx, by, vz);

						this.rx.add(vx);
						this.rz.add(vz);
					} else {
						this.treasureRoom(random, vx, by, vz);
					}
				}
			}
		}
	}

	private void treasureEmpty(final Random random, final int x, final int y, final int z) {
		for (int vx = -4; vx <= 4; vx++) {
			for (int vz = -4; vz <= 4; vz++) {
				for (int vy = 0; vy <= 3; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		this.placeBlock(random, new BlockPos(x, y + 3, z), this.block1);

		for (int vx = -5; vx <= 5; vx++) {
			for (int vz = -5; vz <= 5; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);
				this.placeBlock(random, new BlockPos(x + vx, y + 4, z + vz), this.block2);
			}
			for (int vy = -1; vy <= 4; vy++) {
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 5), this.block2);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 5), this.block2);
			}
		}
		for (int vz = -5; vz <= 5; vz++) {
			for (int vy = -1; vy <= 4; vy++) {
				this.placeBlock(random, new BlockPos(x + 5, y + vy, z + vz), this.block2);
				this.placeBlock(random, new BlockPos(x - 5, y + vy, z + vz), this.block2);
			}
		}
		if (this.world.getBlockState(new BlockPos(x + 10, y + 3, z)) == this.block1) {
			for (int vz = -1; vz <= 1; vz++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.world.setBlockToAir(new BlockPos(x + 5, y + vy, z + vz));
				}
			}
		}
		if (this.world.getBlockState(new BlockPos(x - 10, y + 3, z)) == this.block1) {
			for (int vz = -1; vz <= 1; vz++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.world.setBlockToAir(new BlockPos(x - 5, y + vy, z + vz));
				}
			}
		}
		if (this.world.getBlockState(new BlockPos(x, y + 3, z + 10)) == this.block1) {
			for (int vx = -1; vx <= 1; vx++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + 5));
				}
			}
		}
		if (this.world.getBlockState(new BlockPos(x, y + 3, z - 10)) == this.block1) {
			for (int vx = -1; vx <= 1; vx++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z - 5));
				}
			}
		}
	}

	private void treasureRoom(final Random random, final int x, final int y, final int z) {
		this.treasureEmpty(random, x, y, z);

		final int room = random.nextInt(13);

		if (room <= 2) {
			this.treasureMobSpawner(random, x, y, z);
		} else if (room <= 3) {
			this.treasureCake(random, x, y, z);
		} else if (room <= 6) {
			this.treasureChest(random, x, y, z);
		} else if (room <= 8) {
			this.treasureCrops(random, x, y, z);
		} else if (room <= 9) {
			this.treasureMagic(random, x, y, z);
		} else if (room <= 10) {
			this.treasureNether(random, x, y, z);
		} else if (room <= 12) {
			this.treasureOres(random, x, y, z);
		}
	}

	private void treasureOres(final Random random, final int x, final int y, final int z) {
		final int r = random.nextInt(9);
		Block block;

		if (r == 0) {
			block = Blocks.coal_ore;
		} else if (r == 1) {
			block = Blocks.iron_ore;
		} else if (r == 2) {
			block = Blocks.gold_ore;
		} else if (r == 3) {
			block = Blocks.diamond_ore;
		} else if (r == 4) {
			block = Blocks.redstone_ore;
		} else if (r == 5) {
			block = Blocks.lapis_ore;
		} else if (r == 6) {
			block = Blocks.emerald_ore;
		} else if (r == 7) {
			block = Blocks.quartz_ore;
		} else {
			block = Blocks.glowstone;
		}
		this.generateOres(random, x - 3, y, z - 3, block.getDefaultState());
		this.generateOres(random, x + 3, y, z - 3, block.getDefaultState());
		this.generateOres(random, x - 3, y, z + 3, block.getDefaultState());
		this.generateOres(random, x + 3, y, z + 3, block.getDefaultState());
	}

	public void generateOres(final Random random, final int x, final int y, final int z, final IBlockState block) {
		this.placeBlock(random, new BlockPos(x, y, z), block);
		this.placeBlock(random, new BlockPos(x + 1, y, z), block);
		this.placeBlock(random, new BlockPos(x - 1, y, z), block);
		this.placeBlock(random, new BlockPos(x, y, z + 1), block);
		this.placeBlock(random, new BlockPos(x, y, z - 1), block);
		this.placeBlock(random, new BlockPos(x, y + 1, z), block);
	}

	private void treasureNether(final Random random, final int x, final int y, final int z) {
		this.placeBlock(random, new BlockPos(x - 4, y, z - 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y, z + 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y, z - 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y, z + 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y + 1, z - 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y + 1, z + 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z - 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 4), Blocks.netherrack.getDefaultState());

		this.placeBlock(random, new BlockPos(x - 4, y + 2, z - 4), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y + 2, z + 4), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z - 4), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 2, z + 4), Blocks.fire.getDefaultState());

		this.placeBlock(random, new BlockPos(x - 3, y, z - 3), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y, z - 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y, z - 3), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y, z - 3), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y, z - 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y, z - 3), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y, z + 3), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y, z + 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y, z + 3), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y, z + 3), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y, z + 4), Blocks.netherrack.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y, z + 3), Blocks.netherrack.getDefaultState());

		this.placeBlock(random, new BlockPos(x - 3, y + 1, z - 3), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y + 1, z - 4), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y + 1, z - 3), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z - 3), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z - 4), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z - 3), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y + 1, z + 3), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y + 1, z + 4), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y + 1, z + 3), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 3), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 4), Blocks.fire.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 3), Blocks.fire.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 2, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 3, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z + 3), this.block2);
		this.placeBlock(random, new BlockPos(x + 4, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z + 4), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 3, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z + 3), this.block2);
		this.placeBlock(random, new BlockPos(x - 4, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z + 4), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 3, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z - 3), this.block2);
		this.placeBlock(random, new BlockPos(x + 4, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z - 4), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 3, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z - 3), this.block2);
		this.placeBlock(random, new BlockPos(x - 4, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z - 4), this.block2);

		if (Config.netherMobsInOverworld) {
			this.addMobSpawner(this.world, x, y, z, "Blaze");
		} else {
			this.placeMobSpawner(random, x, y, z);
		}
	}

	private void treasureMagic(final Random random, final int x, final int y, final int z) {
		this.placeBlock(random, new BlockPos(x + 4, y, z - 4), Blocks.cauldron.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 2, y, z - 4), Blocks.cauldron.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y, z - 2), Blocks.cauldron.getDefaultState());

		for (int vy = 0; vy <= 3; vy++) {
			this.placeBlock(random, new BlockPos(x - 4, y + vy, z - 4), Blocks.bookshelf.getDefaultState());
			this.placeBlock(random, new BlockPos(x - 4, y + vy, z - 3), Blocks.bookshelf.getDefaultState());
			this.placeBlock(random, new BlockPos(x - 3, y + vy, z - 4), Blocks.bookshelf.getDefaultState());

			this.placeBlock(random, new BlockPos(x - 4, y + vy, z - 2), this.block2);
			this.placeBlock(random, new BlockPos(x - 2, y + vy, z - 4), this.block2);
		}
		this.placeBlock(random, new BlockPos(x - 2, y, z - 2), Blocks.enchanting_table.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 4, y, z + 4), this.block7);
		this.placeBlock(random, new BlockPos(x + 3, y, z + 4), this.block7);
		this.placeBlock(random, new BlockPos(x + 4, y, z + 3), this.block7);
		this.placeBlock(random, new BlockPos(x + 3, y, z + 3), this.block7);

		this.placeBlock(random, new BlockPos(x + 4, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z + 4), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z + 3), this.block2);
		this.placeBlock(random, new BlockPos(x + 3, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z + 2), this.block2);

		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 4), Blocks.nether_wart.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 4), Blocks.nether_wart.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 3), Blocks.nether_wart.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 3), Blocks.nether_wart.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 2, y + 1, z + 2), Blocks.brewing_stand.getDefaultState());

		this.addChestWithCustomItemsLoot(this.world, random, x - 3, y, z + 3, this.items);
	}

	private void treasureCrops(final Random random, final int x, final int y, final int z) {
		this.placeBlock(random, new BlockPos(x - 4, y, z - 4), Blocks.flowing_water.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y, z + 4), Blocks.flowing_water.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y, z - 4), Blocks.flowing_water.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y, z + 4), Blocks.flowing_water.getDefaultState());

		this.placeBlock(random, new BlockPos(x - 3, y, z - 3), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y, z - 4), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y, z - 3), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y, z - 3), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y, z - 4), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y, z - 3), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y, z + 3), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y, z + 4), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y, z + 3), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y, z + 3), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y, z + 4), Blocks.farmland.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y, z + 3), Blocks.farmland.getDefaultState());

		this.placeBlock(random, new BlockPos(x - 3, y + 1, z - 3), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y + 1, z - 4), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y + 1, z - 3), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z - 3), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z - 4), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z - 3), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y + 1, z + 3), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 3, y + 1, z + 4), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x - 4, y + 1, z + 3), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 3), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 3, y + 1, z + 4), Blocks.wheat.getDefaultState());
		this.placeBlock(random, new BlockPos(x + 4, y + 1, z + 3), Blocks.wheat.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 2, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 3, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z + 3), this.block2);
		this.placeBlock(random, new BlockPos(x + 4, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z + 4), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 3, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z + 3), this.block2);
		this.placeBlock(random, new BlockPos(x - 4, y, z + 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z + 4), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 3, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z - 3), this.block2);
		this.placeBlock(random, new BlockPos(x + 4, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y, z - 4), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 3, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z - 3), this.block2);
		this.placeBlock(random, new BlockPos(x - 4, y, z - 2), this.block2);
		this.placeBlock(random, new BlockPos(x - 2, y, z - 4), this.block2);

		this.placeBlock(random, new BlockPos(x - 2, y + 1, z - 2), this.block6);
		this.placeBlock(random, new BlockPos(z - 2, y + 1, z + 2), this.block6);
		this.placeBlock(random, new BlockPos(z + 2, y + 1, z - 2), this.block6);
		this.placeBlock(random, new BlockPos(z + 2, y + 1, z + 2), this.block6);
	}

	private void treasureChest(final Random random, final int x, final int y, final int z) {
		for (int vx = -1; vx <= 1; vx++) {
			for (int vz = -1; vz <= 1; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block3);
			}
		}
		this.addChestWithCustomItemsLoot(this.world, random, x, y, z, this.items);
	}

	private void treasureCake(final Random random, final int x, final int y, final int z) {
		for (int vx = -1; vx <= 1; vx++) {
			for (int vz = -1; vz <= 1; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block3);
			}
		}
		this.placeBlock(random, new BlockPos(x, y, z), this.block4);
		this.placeBlock(random, new BlockPos(x, y + 1, z), this.block5);
	}

	private void treasureMobSpawner(final Random random, final int x, final int y, final int z) {
		this.placeMobSpawner(random, x, y, z);
	}

	private void treasureLadder(final Random random, final int x, final int y, final int z) {
		for (int vx = -1; vx <= 1; vx++) {
			for (int vz = -1; vz <= 1; vz++) {
				this.world.setBlockToAir(new BlockPos(x + vx, y + 4, z + vz));
			}
		}
		for (int vy = 0; vy <= 7; vy++) {
			this.placeBlock(random, new BlockPos(x, y + vy, z), this.block2);
		}
		int vy = 0;
		int vx = 1;
		int vz = 1;

		while (vy <= 4) {
			if (vx == 0 || vz == 0) {
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block2);
				vy++;
			} else {
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block3);
			}

			if (vx == 1 && vz > -1) {
				vz--;
			} else if (vz == -1 && vx > -1) {
				vx--;
			} else if (vx == -1 && vz < 1) {
				vz++;
			} else if (vz == 1 && vx < 1) {
				vx++;
			}
		}

		this.placeBlock(random, new BlockPos(x, y + 3, z), this.block1);
	}

	private void placeMobSpawner(final Random random, final int x, final int y, final int z) {
		this.addMobSpawner(this.world, x, y, z, this.mobs.get(random.nextInt(this.mobs.size())));
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(4)));
		} else if (state.getBlock() instanceof BlockSlab) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(6));
		} else if (state.getBlock() instanceof BlockFence) {
			this.world.setBlockState(pos, DungeonGeneratorTreasure.fenceType);
		} else if (state.getBlock() instanceof BlockTorch) {
			this.placeBlockTorch(this.world, random, pos, state.getBlock());
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
