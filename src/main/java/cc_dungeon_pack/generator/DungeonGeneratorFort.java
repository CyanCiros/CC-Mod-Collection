package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DungeonGeneratorFort extends DungeonGenerator {
	private final World world;

	private IBlockState block1;
	private final IBlockState block2;
	private final IBlockState block3;
	private final IBlockState block4;

	private static BlockPlanks.EnumType plankType;
	private static IBlockState fenceType;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	private ArrayList<Block> groundBlock;

	public DungeonGeneratorFort(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);
		this.block4 = blocks.get(3);

		this.mobs = mobs;

		this.items = items;
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log)) {
			this.block1 = random.nextInt(3) == 0 ? Blocks.log2.getDefaultState() : Blocks.log.getDefaultState();
		}
		if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log)) {
			final int r = random.nextInt(4);

			switch (r) {
			case 0:
				DungeonGeneratorFort.plankType = BlockPlanks.EnumType.OAK;
				DungeonGeneratorFort.fenceType = Blocks.oak_fence.getDefaultState();
				break;
			case 1:
				DungeonGeneratorFort.plankType = BlockPlanks.EnumType.SPRUCE;
				DungeonGeneratorFort.fenceType = Blocks.spruce_fence.getDefaultState();
				break;
			case 2:
				DungeonGeneratorFort.plankType = BlockPlanks.EnumType.BIRCH;
				DungeonGeneratorFort.fenceType = Blocks.birch_fence.getDefaultState();
				break;
			case 3:
				DungeonGeneratorFort.plankType = BlockPlanks.EnumType.JUNGLE;
				DungeonGeneratorFort.fenceType = Blocks.jungle_fence.getDefaultState();
				break;
			default:
				DungeonGeneratorFort.plankType = BlockPlanks.EnumType.OAK;
				DungeonGeneratorFort.fenceType = Blocks.oak_fence.getDefaultState();
				break;
			}
		} else if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log2)) {
			final int r = random.nextInt(2);

			switch (r) {
			case 0:
				DungeonGeneratorFort.plankType = BlockPlanks.EnumType.ACACIA;
				DungeonGeneratorFort.fenceType = Blocks.acacia_fence.getDefaultState();
				break;
			case 1:
				DungeonGeneratorFort.plankType = BlockPlanks.EnumType.DARK_OAK;
				DungeonGeneratorFort.fenceType = Blocks.dark_oak_fence.getDefaultState();
				break;
			default:
				DungeonGeneratorFort.plankType = BlockPlanks.EnumType.ACACIA;
				DungeonGeneratorFort.fenceType = Blocks.acacia_fence.getDefaultState();
				break;
			}
		} else {
			DungeonGeneratorFort.plankType = BlockPlanks.EnumType.OAK;
			DungeonGeneratorFort.fenceType = Blocks.oak_fence.getDefaultState();
		}

		final ArrayList<Integer> ax = new ArrayList<Integer>();
		final ArrayList<Integer> ay = new ArrayList<Integer>();
		final ArrayList<Integer> az = new ArrayList<Integer>();

		final ArrayList<Integer> avc1 = new ArrayList<Integer>();
		final ArrayList<Integer> avc2 = new ArrayList<Integer>();
		final ArrayList<Integer> avx1 = new ArrayList<Integer>();
		final ArrayList<Integer> avx2 = new ArrayList<Integer>();
		final ArrayList<Integer> avz1 = new ArrayList<Integer>();
		final ArrayList<Integer> avz2 = new ArrayList<Integer>();

		final ArrayList<Integer> avyc = new ArrayList<Integer>();

		final int forts = 2 + random.nextInt(4);

		int vy = y;

		this.groundBlock = new ArrayList<Block>();
		this.groundBlock.add(Blocks.clay);
		this.groundBlock.add(Blocks.dirt);
		this.groundBlock.add(Blocks.gravel);
		this.groundBlock.add(Blocks.grass);
		this.groundBlock.add(Blocks.lava);
		this.groundBlock.add(Blocks.sand);
		this.groundBlock.add(Blocks.stone);
		this.groundBlock.add(Blocks.water);

		for (int f = 0; f <= forts; f++) {
			final int fx = random.nextInt(11) * 5 - 25;
			final int fz = random.nextInt(11) * 5 - 25;

			int tx = 0;
			int tz = 0;

			if (f == 0) {
				tx = x + fx;
				tz = z + fz;
			} else {
				final int t = random.nextInt(ax.size());
				tx = ax.get(t) + fx;
				tz = az.get(t) + fz;
			}
			final int tw = random.nextInt(5) + 3;

			final int vc1 = (int) (Math.floor(tw / 2) * 5) * -1;
			int vc2 = (int) (Math.floor(tw / 2) * 5);
			final int vx1 = vc1 - 2;
			final int vx2;
			final int vz1 = vc1 - 2;
			final int vz2;

			int vyc = random.nextInt(3) + 2;

			if (f > 0) {
				vy = this.surfaceSpawn(this.world, tx, vy, tz);
			} else {
				if (!this.groundBlock.contains(this.world.getBlockState(new BlockPos(tx, vy - 1, tz)))) {
					for (int vys = vy; vys >= 0; vys--) {
						if (this.groundBlock.contains(this.world.getBlockState(new BlockPos(tx, vys - 1, tz)))) {
							vy = vys;
							break;
						}
					}
				}
			}
			vyc *= 4;

			if (tw % 2 == 0) {
				vx2 = vc2 - 3;
				vz2 = vc2 - 3;
				vc2 -= 5;
			} else {
				vx2 = vc2 + 2;
				vz2 = vc2 + 2;
			}

			ax.add(tx);
			ay.add(vy);
			az.add(tz);

			avc1.add(vc1);
			avc2.add(vc2);
			avx1.add(vx1);
			avx2.add(vx2);
			avz1.add(vz1);
			avz2.add(vz2);

			avyc.add(vyc);
		}
		for (int f = 0; f <= forts; f++) {
			this.generateFortGround1(random, ax.get(f), ay.get(f), az.get(f), avc1.get(f), avc2.get(f), avx1.get(f),
					avx2.get(f), avz1.get(f), avz2.get(f), avyc.get(f));
		}
		for (int f = 0; f <= forts; f++) {
			this.generateFortWall(random, ax.get(f), ay.get(f), az.get(f), avc1.get(f), avc2.get(f), avx1.get(f),
					avx2.get(f), avz1.get(f), avz2.get(f), avyc.get(f));
		}
		for (int f = 0; f <= forts; f++) {
			this.generateFortTower(random, ax.get(f), ay.get(f), az.get(f), avc1.get(f), avc2.get(f), avx1.get(f),
					avx2.get(f), avz1.get(f), avz2.get(f), avyc.get(f));
		}
		for (int f = 0; f <= forts; f++) {
			this.generateFortGround2(random, ax.get(f), ay.get(f), az.get(f), avc1.get(f), avc2.get(f), avx1.get(f),
					avx2.get(f), avz1.get(f), avz2.get(f), avyc.get(f));
		}
		for (int f = 0; f <= forts; f++) {
			this.placeOpenings(random, ax.get(f), ay.get(f), az.get(f), avc1.get(f), avc2.get(f), avx1.get(f),
					avx2.get(f), avz1.get(f), avz2.get(f), avyc.get(f));
		}
		for (int f = 0; f <= forts; f++) {
			this.placeObjects(random, ax.get(f), ay.get(f), az.get(f), avc1.get(f), avc2.get(f), avx1.get(f),
					avx2.get(f), avz1.get(f), avz2.get(f), avyc.get(f));
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	private int surfaceSpawn(final World world, final int x, final int y, final int z) {
		int ys = 0;
		int vy = y;

		for (int yt = y + 6 * 4; yt >= y; yt -= 4) {
			if ((world.isAirBlock(new BlockPos(x, yt, z))
					|| this.getEquals(world, new BlockPos(x, yt, z), this.block1.getBlock())
					|| this.getEquals(world, new BlockPos(x, yt, z), this.block2.getBlock()))
					&& this.groundBlock.contains(world.getBlockState(new BlockPos(x, yt - 4, z)))) {
				ys = yt;
				break;
			}
		}
		if (ys == 0) {
			for (int yt = y; yt >= y - 6 * 4; yt -= 4) {
				if ((world.isAirBlock(new BlockPos(x, yt, z))
						|| this.getEquals(world, new BlockPos(x, yt, z), this.block1.getBlock())
						|| this.getEquals(world, new BlockPos(x, yt, z), this.block2.getBlock()))
						&& this.groundBlock.contains(world.getBlockState(new BlockPos(x, yt - 4, z)))) {
					ys = yt;
					break;
				}
			}
		}
		if (ys != 0) {
			vy = ys;
		}
		return vy;
	}

	@SuppressWarnings("unused")
	public void generateFortGround1(final Random random, final int x, final int y, final int z, final int vc1,
			final int vc2, final int vx1, final int vx2, final int vz1, final int vz2, final int vyc) {
		// Ground
		for (int vx = vx1; vx <= vx2; vx++) {
			for (int vz = vz1; vz <= vz2; vz++) {
				for (int vy = -5; vy <= -1; vy++) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
				}
				// for (int vys = y - 6; vys >= 0; vys--) {
				// if (this.world.isAirBlock(new BlockPos(x + vx, vys, z + vz)))
				// {
				// this.placeBlock(random, new BlockPos(x + vx, vys, z + vz),
				// this.block1);
				// } else {
				// break;
				// }
				// }
			}
		}
	}

	public void generateFortWall(final Random random, final int x, final int y, final int z, final int vc1,
			final int vc2, final int vx1, final int vx2, final int vz1, final int vz2, final int vyc) {
		this.generateWallPartX(random, x + vc2, y, z, vz1, vz2, vyc);
		this.generateWallPartX(random, x + vc1, y, z, vz1, vz2, vyc);
		this.generateWallPartZ(random, x, y, z + vc2, vx1, vx2, vyc);
		this.generateWallPartZ(random, x, y, z + vc1, vx1, vx2, vyc);
	}

	@SuppressWarnings("unused")
	public void generateFortTower(final Random random, final int x, final int y, final int z, final int vc1,
			final int vc2, final int vx1, final int vx2, final int vz1, final int vz2, final int vyc) {
		this.generateTower(random, x + vc2, y, z + vc2, vyc);
		this.generateTower(random, x + vc1, y, z + vc2, vyc);
		this.generateTower(random, x + vc2, y, z + vc1, vyc);
		this.generateTower(random, x + vc1, y, z + vc1, vyc);
	}

	@SuppressWarnings("unused")
	public void generateFortGround2(final Random random, final int x, final int y, final int z, final int vc1,
			final int vc2, final int vx1, final int vx2, final int vz1, final int vz2, final int vyc) {
		// Ground
		for (int vx = vx1; vx <= vx2; vx++) {
			for (int vz = vz1; vz <= vz2; vz++) {
				if (!this.world.isAirBlock(new BlockPos(x + vx, y - 1, z + vz))) {
					if (this.getEquals(this.world, new BlockPos(x + vx, y, z + vz), this.block1.getBlock())) {
						this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block1);
					} else {
						this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);
					}
				}
			}
		}
	}

	public void generateWallPartX(final Random random, final int x, final int y, final int z, final int vz1,
			final int vz2, final int vyc) {
		final int height = vyc - 3;

		for (int vz = vz1 + 5; vz <= vz2 - 5; vz++) {
			// No existing part
			if (!this.getEquals(this.world, new BlockPos(x, y + vyc - 5, z + vz), this.block1.getBlock())
					&& !this.getEquals(this.world, new BlockPos(x, y + vyc - 5, z + vz), this.block2.getBlock())) {
				// Air
				for (int vy = 0; vy <= height; vy++) {
					for (int vx = -1; vx <= 1; vx++) {
						this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
					}
				}
				for (int vy = -1; vy <= height; vy++) {
					// Wall -x
					if (vy < height || vy == height && vz % 2 == 0) {
						this.placeBlock(random, new BlockPos(x - 2, y + vy, z + vz), this.block1);
					}
					// Floor
					if (vy == -1 || vy == 3 || vy == 7 || vy == 11) {
						this.placeBlock(random, new BlockPos(x - 1, y + vy, z + vz), this.block2);
						this.placeBlock(random, new BlockPos(x, y + vy, z + vz), this.block2);
						this.placeBlock(random, new BlockPos(x + 1, y + vy, z + vz), this.block2);
					}
					// Wall +x
					if (vy < height || vy == height && vz % 2 == 0) {
						this.placeBlock(random, new BlockPos(x + 2, y + vy, z + vz), this.block1);
					}
				}
			}
		}
	}

	public void generateWallPartZ(final Random random, final int x, final int y, final int z, final int vx1,
			final int vx2, final int vyc) {
		final int height = vyc - 3;

		for (int vx = vx1 + 5; vx <= vx2 - 5; vx++) {
			// No existing part
			if (!this.getEquals(this.world, new BlockPos(x + vx, y + vyc - 5, z), this.block1.getBlock())
					&& !this.getEquals(this.world, new BlockPos(x + vx, y + vyc - 5, z), this.block2.getBlock())) {
				// Air
				for (int vy = 0; vy <= height; vy++) {
					for (int vz = -1; vz <= 1; vz++) {
						this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
					}
				}
				for (int vy = -1; vy <= height; vy++) {
					// Wall -x
					if (vy < height || vy == height && vx % 2 == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 2), this.block1);
					}
					// Floor
					if (vy == -1 || vy == 3 || vy == 7 || vy == 11) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 1), this.block2);
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z), this.block2);
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 1), this.block2);
					}
					// Wall +x
					if (vy < height || vy == height && vx % 2 == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 2), this.block1);
					}
				}
			}
		}
	}

	public void generateTower(final Random random, final int x, final int y, final int z, final int vyc) {
		final int height = vyc + 1;

		if (!this.getEquals(this.world, new BlockPos(x, y + vyc - 1, z), this.block1.getBlock())
				&& !this.getEquals(this.world, new BlockPos(x, y + vyc - 1, z), this.block2.getBlock())) {
			// Air
			for (int vx = -1; vx <= 1; vx++) {
				for (int vz = -1; vz <= 1; vz++) {
					for (int vy = 0; vy <= height; vy++) {
						this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
					}
				}
			}
			// Wall
			for (int vx = -2; vx <= 2; vx++) {
				for (int vy = -1; vy <= height; vy++) {
					if (vy == height && vx % 2 == 0 || vy < height) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 2), this.block1);
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 2), this.block1);
					}
				}
			}
			// Wall
			for (int vz = -1; vz <= 1; vz++) {
				for (int vy = -1; vy <= height; vy++) {
					if (vy == height && vz % 2 == 0 || vy < height) {
						this.placeBlock(random, new BlockPos(x - 2, y + vy, z + vz), this.block1);
						this.placeBlock(random, new BlockPos(x + 2, y + vy, z + vz), this.block1);
					}
				}
			}
			// Floor
			for (int vy = -1; vy <= height; vy += 4) {
				for (int vx = -1; vx <= 1; vx++) {
					for (int vz = -1; vz <= 1; vz++) {
						this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block2);
					}
				}
			}
		}
	}

	private void placeOpenings(final Random random, final int x, final int y, final int z, final int vc1, final int vc2,
			final int vx1, final int vx2, final int vz1, final int vz2, final int vyc) {
		this.generateWallPartXOpenings(random, x + vc2, y, z, vz1, vz2, vyc);
		this.generateWallPartXOpenings(random, x + vc1, y, z, vz1, vz2, vyc);
		this.generateWallPartZOpenings(random, x, y, z + vc2, vx1, vx2, vyc);
		this.generateWallPartZOpenings(random, x, y, z + vc1, vx1, vx2, vyc);

		this.generateTowerOpenings(random, x + vc2, y, z + vc2, vyc);
		this.generateTowerOpenings(random, x + vc1, y, z + vc2, vyc);
		this.generateTowerOpenings(random, x + vc2, y, z + vc1, vyc);
		this.generateTowerOpenings(random, x + vc1, y, z + vc1, vyc);
	}

	private void generateWallPartXOpenings(final Random random, final int x, final int y, final int z, final int vz1,
			final int vz2, final int vyc) {
		final int height = vyc - 3;

		// Wall hallway
		for (int vz = vz1 + 7; vz <= vz2 - 7; vz += 5) {
			for (int vy = 1; vy <= height; vy += 4) {
				if (this.getEquals(this.world, new BlockPos(x + 5, y + vy - 2, z + vz), this.block2.getBlock())) {
					if (this.world.isAirBlock(new BlockPos(x + 5, y + vy + 2, z + vz)) && vy <= height - 4) {
						if (this.world.isAirBlock(new BlockPos(x + 3, y + vy - 1, z + vz)) && vy != 1) {
							this.placeDoor(random, x + 2, y + vy, z + vz);
						} else {
							this.placeOpening(random, x + 2, y + vy, z + vz);
						}
					} else {
						this.placeDoor(random, x + 2, y + vy, z + vz);
					}
				} else if (this.world.isAirBlock(new BlockPos(x + 3, y + vy + 1, z + vz))
						&& this.world.isAirBlock(new BlockPos(x + 3, y + vy, z + vz))
						&& this.world.isAirBlock(new BlockPos(x + 3, y + vy - 1, z + vz))) {
					if (!this.world.isAirBlock(new BlockPos(x + 3, y + vy - 2, z + vz))) {
						this.placeOpening(random, x + 2, y + vy, z + vz);
					} else {
						this.placeWindow(random, x + 2, y + vy, z + vz);
					}
				}
				if (this.getEquals(this.world, new BlockPos(x - 5, y + vy - 2, z + vz), this.block2.getBlock())) {
					if (this.world.isAirBlock(new BlockPos(x - 5, y + vy + 2, z + vz)) && vy <= height - 4) {
						if (this.world.isAirBlock(new BlockPos(x - 3, y + vy - 1, z + vz)) && vy != 1) {
							this.placeDoor(random, x - 2, y + vy, z + vz);
						} else {
							this.placeOpening(random, x - 2, y + vy, z + vz);
						}
					} else {
						this.placeDoor(random, x - 2, y + vy, z + vz);
					}
				} else if (this.world.isAirBlock(new BlockPos(x - 3, y + vy + 1, z + vz))
						&& this.world.isAirBlock(new BlockPos(x - 3, y + vy, z + vz))
						&& this.world.isAirBlock(new BlockPos(x - 3, y + vy - 1, z + vz))) {
					if (!this.world.isAirBlock(new BlockPos(x - 3, y + vy - 2, z + vz))) {
						this.placeOpening(random, x - 2, y + vy, z + vz);
					} else {
						this.placeWindow(random, x - 2, y + vy, z + vz);
					}
				}
			}
		}
	}

	private void generateWallPartZOpenings(final Random random, final int x, final int y, final int z, final int vx1,
			final int vx2, final int vyc) {
		final int height = vyc - 3;

		// Wall hallway
		for (int vx = vx1 + 7; vx <= vx2 - 7; vx += 5) {
			for (int vy = 1; vy <= height; vy += 4) {
				if (this.getEquals(this.world, new BlockPos(x + vx, y + vy - 2, z + 5), this.block2.getBlock())) {
					if (this.world.isAirBlock(new BlockPos(x + vx, y + vy + 2, z + 5)) && vy <= height - 4) {
						if (this.world.isAirBlock(new BlockPos(x + vx, y + vy - 1, z + 3)) && vy != 1) {
							this.placeDoor(random, x + vx, y + vy, z + 2);
						} else {
							this.placeOpening(random, x + vx, y + vy, z + 2);
						}
					} else {
						this.placeDoor(random, x + vx, y + vy, z + 2);
					}
				} else if (this.world.isAirBlock(new BlockPos(x + vx, y + vy + 1, z + 3))
						&& this.world.isAirBlock(new BlockPos(x + vx, y + vy, z + 3))
						&& this.world.isAirBlock(new BlockPos(x + vx, y + vy - 1, z + 3))) {
					if (!this.world.isAirBlock(new BlockPos(x + vx, y + vy - 2, z + 3))) {
						this.placeOpening(random, x + vx, y + vy, z + 2);
					} else {
						this.placeWindow(random, x + vx, y + vy, z + 2);
					}
				}
				if (this.getEquals(this.world, new BlockPos(x + vx, y + vy - 2, z - 5), this.block2.getBlock())) {
					if (this.world.isAirBlock(new BlockPos(x + vx, y + vy + 2, z - 5)) && vy <= height - 4) {
						if (this.world.isAirBlock(new BlockPos(x + vx, y + vy - 1, z - 3)) && vy != 1) {
							this.placeDoor(random, x + vx, y + vy, z - 2);
						} else {
							this.placeOpening(random, x + vx, y + vy, z - 2);
						}
					} else {
						this.placeDoor(random, x + vx, y + vy, z - 2);
					}
				} else if (this.world.isAirBlock(new BlockPos(x + vx, y + vy + 1, z - 3))
						&& this.world.isAirBlock(new BlockPos(x + vx, y + vy, z - 3))
						&& this.world.isAirBlock(new BlockPos(x + vx, y + vy - 1, z - 3))) {
					if (!this.world.isAirBlock(new BlockPos(x + vx, y + vy - 2, z - 3))) {
						this.placeOpening(random, x + vx, y + vy, z - 2);
					} else {
						this.placeWindow(random, x + vx, y + vy, z - 2);
					}
				}
			}
		}
	}

	private void generateTowerOpenings(final Random random, final int x, final int y, final int z, final int vyc) {
		final int height = vyc + 1;

		for (int vy = 1; vy <= height; vy += 4) {
			if (this.getEquals(this.world, new BlockPos(x + 5, y + vy - 2, z), this.block2.getBlock())
					&& this.getEquals(this.world, new BlockPos(x + 2, y + vy, z), this.block1.getBlock())) {
				this.placeDoor(random, x + 2, y + vy, z);
			} else {
				this.placeWindow(random, x + 2, y + vy, z);
			}
			if (this.getEquals(this.world, new BlockPos(x - 5, y + vy - 2, z), this.block2.getBlock())
					&& this.getEquals(this.world, new BlockPos(x - 2, y + vy, z), this.block1.getBlock())) {
				this.placeDoor(random, x - 2, y + vy, z);
			} else {
				this.placeWindow(random, x - 2, y + vy, z);
			}
			if (this.getEquals(this.world, new BlockPos(x, y + vy - 2, z + 5), this.block2.getBlock())
					&& this.getEquals(this.world, new BlockPos(x, y + vy, z + 2), this.block1.getBlock())) {
				this.placeDoor(random, x, y + vy, z + 2);
			} else {
				this.placeWindow(random, x, y + vy, z + 2);
			}
			if (this.getEquals(this.world, new BlockPos(x, y + vy - 2, z - 5), this.block2.getBlock())
					&& this.getEquals(this.world, new BlockPos(x, y + vy, z - 2), this.block1.getBlock())) {
				this.placeDoor(random, x, y + vy, z - 2);
			} else {
				this.placeWindow(random, x, y + vy, z - 2);
			}
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	private void placeDoor(final Random random, final int x, final int y, final int z) {
		if (this.block1.equals(Blocks.nether_brick)) {
			this.world.setBlockToAir(new BlockPos(x, y + 1, z));
		} else if (this.getEquals(this.world, new BlockPos(x, y + 1, z), this.block4.getBlock())) {
			this.placeBlock(random, new BlockPos(x, y + 1, z), this.block1);
		}
		this.world.setBlockToAir(new BlockPos(x, y, z));
		this.world.setBlockToAir(new BlockPos(x, y - 1, z));
		this.placeBlock(random, new BlockPos(x, y - 2, z), this.block2);
	}

	private void placeWindow(final Random random, final int x, final int y, final int z) {
		if (this.getEquals(this.world, new BlockPos(x, y + 2, z), this.block1.getBlock())
				&& this.getEquals(this.world, new BlockPos(x, y, z), this.block1.getBlock())
				&& (this.world.isAirBlock(new BlockPos(x - 1, y, z)) && this.world.isAirBlock(new BlockPos(x + 1, y, z))
						|| this.world.isAirBlock(new BlockPos(x, y, z - 1))
								&& this.world.isAirBlock(new BlockPos(x, y, z + 1)))) {
			this.placeBlock(random, new BlockPos(x, y + 1, z), this.block4);
			this.placeBlock(random, new BlockPos(x, y, z), this.block4);
			this.placeBlock(random, new BlockPos(x, y - 1, z), this.block1);
		}
	}

	private void placeOpening(final Random random, final int x, final int y, final int z) {
		if (random.nextBoolean()) {
			this.placeDoor(random, x, y, z);
		} else {
			this.placeWindow(random, x, y, z);
		}
	}

	private void placeObjects(final Random random, final int x, final int y, final int z, final int vc1, final int vc2,
			final int vx1, final int vx2, final int vz1, final int vz2, final int vyc) {
		for (int vx = vx1; vx <= vx2; vx++) {
			for (int vz = vz1; vz <= vz2; vz++) {
				this.placeObject(random, x + vx, y, z + vz);
			}
		}
		this.generateWallPartXObjects(random, x + vc2, y, z, vz1, vz2, vyc);
		this.generateWallPartXObjects(random, x + vc1, y, z, vz1, vz2, vyc);
		this.generateWallPartZObjects(random, x, y, z + vc2, vx1, vx2, vyc);
		this.generateWallPartZObjects(random, x, y, z + vc1, vx1, vx2, vyc);

		this.generateTowerObjects(random, x, y, z, vc2, vc2, vyc);
		this.generateTowerObjects(random, x, y, z, vc1, vc2, vyc);
		this.generateTowerObjects(random, x, y, z, vc2, vc1, vyc);
		this.generateTowerObjects(random, x, y, z, vc1, vc1, vyc);
	}

	private void generateWallPartXObjects(final Random random, final int x, final int y, final int z, final int vz1,
			final int vz2, final int vyc) {
		final int height = vyc - 3;

		for (int vz = vz1 + 5; vz <= vz2 - 5; vz++) {
			for (int vy = 0; vy <= height; vy += 4) {
				this.placeObject(random, x, y + vy, z + vz);
			}
		}
	}

	private void generateWallPartZObjects(final Random random, final int x, final int y, final int z, final int vx1,
			final int vx2, final int vyc) {
		final int height = vyc - 3;

		for (int vx = vx1 + 5; vx <= vx2 - 5; vx++) {
			for (int vy = 0; vy <= height; vy += 4) {
				this.placeObject(random, x + vx, y + vy, z);
			}
		}
	}

	private void generateTowerObjects(final Random random, final int x, final int y, final int z, final int vcx,
			final int vcz, final int vyc) {
		final int height = vyc + 1;
		final int vtx = x + vcx;
		final int vtz = z + vcz;
		final int lx = vcx < 0 ? 1 : -1;
		final int lz = vcz < 0 ? 1 : -1;
		final EnumFacing facing = vcz < 0 ? EnumFacing.NORTH : EnumFacing.SOUTH;

		for (int vy = 0; vy <= vyc; vy++) {
			if (this.getEquals(this.world, new BlockPos(vtx + lx * 2, y + vy, vtz + lz), this.block1.getBlock())) {
				this.placeBlock(random, new BlockPos(vtx + lx, y + vy, vtz + lz),
						Blocks.ladder.getBlockState().getBaseState().withProperty(BlockLadder.FACING, facing));
			} else {
				break;
			}
		}
		for (int vy = 0; vy <= height; vy += 4) {
			for (int vx = -1; vx <= 1; vx++) {
				for (int vz = -1; vz <= 1; vz++) {
					if (vx == 0 && vz == 0) {
						if (!this.world.isAirBlock(new BlockPos(vtx + vx, y + vy - 1, vtz + vz))) {
							if (this.block3.getBlock() instanceof BlockTorch) {
								this.placeBlock(random, new BlockPos(vtx + vx, y + vy, vtz + vz), this.block3);
							} else {
								this.placeBlock(random, new BlockPos(vtx + vx, y + vy - 1, vtz + vz), this.block3);
							}
						}
					} else {
						this.placeObject(random, vtx + vx, y + vy, vtz + vz);
					}
				}
			}
		}
	}

	private void placeObject(final Random random, final int x, final int y, final int z) {
		if (!this.world.isAirBlock(new BlockPos(x, y - 1, z)) && this.world.isAirBlock(new BlockPos(x, y, z))) {
			if (random.nextInt(60) == 0) {
				if (random.nextInt(3) == 0) {
					this.addChestWithCustomItemsLoot(this.world, random, x, y, z, this.items);
				} else {
					String mob = this.mobs.get(random.nextInt(this.mobs.size()));

					if (mob == "Ghast" && random.nextInt(4) == 0) {
						this.addMobSpawner(this.world, x, y, z, mob);
					} else {
						mob = this.mobs.get(random.nextInt(this.mobs.size()));

						this.addMobSpawner(this.world, x, y, z, mob);
					}
				}
			}
		}
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockOldLog || state.getBlock() instanceof BlockNewLog) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorFort.plankType.ordinal() % 4));
		} else if (state.getBlock() instanceof BlockPlanks) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(DungeonGeneratorFort.plankType.ordinal()));
		} else if (state.getBlock() instanceof BlockStoneBrick) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(random.nextInt(3)));
		} else if (state.getBlock() instanceof BlockSandStone) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(0));
		} else if (state.getBlock() instanceof BlockFence) {
			this.world.setBlockState(pos, DungeonGeneratorFort.fenceType);
		} else if (state.getBlock() instanceof BlockTorch) {
			this.placeBlockTorch(this.world, random, pos, state.getBlock());
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
