package cc_harvest.generator;

import java.util.ArrayList;
import java.util.Random;

import cc_harvest.blocks.ModBlocks;
import cc_harvest.entity.TileEntityStorageBox;
import cc_harvest.items.ModItemBox;
import cc_harvest.items.ModItemPacket;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class GeneratorFarm {
	private final World world;

	private IBlockState blockLogs;
	private IBlockState blockPlanks;
	private IBlockState blockSlabs;
	private IBlockState blockStairs;
	private IBlockState blockDoors;
	private IBlockState blockFences;

	private final ArrayList<Block> candles;
	private final ArrayList<Block> crops;
	private final ArrayList<Block> boxes;
	private final ArrayList<ArrayList<Item>> boxItems;

	private final ArrayList<Block> blocks;

	private final ArrayList<Integer> profession;

	public GeneratorFarm(final World world, final ArrayList<Block> candles, final ArrayList<Block> crops,
			final ArrayList<Block> boxes, final ArrayList<ArrayList<Item>> boxItems) {
		this.world = world;

		this.candles = candles;
		this.crops = crops;
		this.boxes = boxes;
		this.boxItems = boxItems;

		this.blocks = new ArrayList<Block>();
		this.blocks.add(ModBlocks.cuttingBoard);
		this.blocks.add(ModBlocks.pot);
		this.blocks.add(ModBlocks.apiary);
		this.blocks.add(ModBlocks.presser);
		this.blocks.add(ModBlocks.churn);
		this.blocks.add(ModBlocks.quern);
		this.blocks.add(ModBlocks.sinkWood);
		this.blocks.add(ModBlocks.sinkStone);
		this.blocks.add(ModBlocks.sinkClay);
		this.blocks.add(ModBlocks.sinkBrick);

		this.profession = new ArrayList<Integer>();
		this.profession.add(1);
		this.profession.add(2);
		this.profession.add(3);
		this.profession.add(7);
	}

	public void generate(final Random random, final int x, final int y, final int z) {
		switch (random.nextInt(6)) {
		case 0:
			this.blockDoors = Blocks.oak_door.getDefaultState();
			this.blockFences = Blocks.oak_fence.getDefaultState();
			this.blockLogs = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			this.blockPlanks = Blocks.planks.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.OAK);
			this.blockSlabs = Blocks.wooden_slab.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.OAK);
			this.blockStairs = Blocks.oak_stairs.getDefaultState();
			break;
		case 1:
			this.blockDoors = Blocks.spruce_door.getDefaultState();
			this.blockFences = Blocks.spruce_fence.getDefaultState();
			this.blockLogs = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.SPRUCE);
			this.blockPlanks = Blocks.planks.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.SPRUCE);
			this.blockSlabs = Blocks.wooden_slab.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.SPRUCE);
			this.blockStairs = Blocks.spruce_stairs.getDefaultState();
			break;
		case 2:
			this.blockDoors = Blocks.birch_door.getDefaultState();
			this.blockFences = Blocks.birch_fence.getDefaultState();
			this.blockLogs = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.BIRCH);
			this.blockPlanks = Blocks.planks.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.BIRCH);
			this.blockSlabs = Blocks.wooden_slab.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.BIRCH);
			this.blockStairs = Blocks.birch_stairs.getDefaultState();
			break;
		case 3:
			this.blockDoors = Blocks.jungle_door.getDefaultState();
			this.blockFences = Blocks.jungle_fence.getDefaultState();
			this.blockLogs = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.JUNGLE);
			this.blockPlanks = Blocks.planks.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.JUNGLE);
			this.blockSlabs = Blocks.wooden_slab.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.JUNGLE);
			this.blockStairs = Blocks.jungle_stairs.getDefaultState();
			break;
		case 4:
			this.blockDoors = Blocks.acacia_door.getDefaultState();
			this.blockFences = Blocks.acacia_fence.getDefaultState();
			this.blockLogs = Blocks.log2.getDefaultState().withProperty(BlockNewLog.VARIANT,
					BlockPlanks.EnumType.ACACIA);
			this.blockPlanks = Blocks.planks.getDefaultState().withProperty(BlockNewLog.VARIANT,
					BlockPlanks.EnumType.ACACIA);
			this.blockSlabs = Blocks.wooden_slab.getDefaultState().withProperty(BlockNewLog.VARIANT,
					BlockPlanks.EnumType.ACACIA);
			this.blockStairs = Blocks.acacia_stairs.getDefaultState();
			break;
		case 5:
			this.blockDoors = Blocks.dark_oak_door.getDefaultState();
			this.blockFences = Blocks.dark_oak_fence.getDefaultState();
			this.blockLogs = Blocks.log2.getDefaultState().withProperty(BlockNewLog.VARIANT,
					BlockPlanks.EnumType.DARK_OAK);
			this.blockPlanks = Blocks.planks.getDefaultState().withProperty(BlockNewLog.VARIANT,
					BlockPlanks.EnumType.DARK_OAK);
			this.blockSlabs = Blocks.wooden_slab.getDefaultState().withProperty(BlockNewLog.VARIANT,
					BlockPlanks.EnumType.DARK_OAK);
			this.blockStairs = Blocks.dark_oak_stairs.getDefaultState();
			break;
		default:
			this.blockDoors = Blocks.oak_door.getDefaultState();
			this.blockFences = Blocks.oak_fence.getDefaultState();
			this.blockLogs = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			this.blockPlanks = Blocks.planks.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.OAK);
			this.blockSlabs = Blocks.wooden_slab.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.OAK);
			this.blockStairs = Blocks.oak_stairs.getDefaultState();
			break;
		}

		// Air
		for (int vz = -4; vz <= 10; vz++) {
			for (int vx = 5; vx <= 11; vx++) {
				for (int vy = 0; vy <= 3; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
			for (int vx = -12; vx <= -6; vx++) {
				for (int vy = 0; vy <= 3; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vz = 1; vz <= 10; vz++) {
			for (int vx = -5; vx <= 4; vx++) {
				for (int vy = 0; vy <= 5; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vz = -4; vz <= 10; vz++) {
			for (int vy = 4; vy <= 8; vy++) {
				final int vyt = vy - 4;

				for (int vx = 4 + vyt; vx <= 12 - vyt; vx++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vz = -4; vz <= 10; vz++) {
			for (int vy = 4; vy <= 8; vy++) {
				final int vyt = vy - 4;

				for (int vx = -13 + vyt; vx <= -5 - vyt; vx++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vx = -9; vx <= 8; vx++) {
			for (int vy = 6; vy <= 10; vy++) {
				final int vyt = vy - 6;

				for (int vz = 0 + vyt; vz <= 9 - vyt; vz++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vz = -4; vz <= 0; vz++) {
			for (int vx = -5; vx <= 4; vx++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vz = -9; vz <= -5; vz++) {
			for (int vx = -12; vx <= 11; vx++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}

		// Ground
		// for (int vx = -13; vx <= 12; vx++) {
		// for (int vz = -9; vz <= 11; vz++) {
		// for (int vy = y - 1; vy >= 0; vy--) {
		// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz))) {
		// if (vy == y - 1) {
		// this.world.setBlockState(new BlockPos(x + vx, vy, z + vz),
		// Blocks.grass.getDefaultState());
		// } else {
		// this.world.setBlockState(new BlockPos(x + vx, vy, z + vz),
		// Blocks.dirt.getDefaultState());
		// }
		// } else {
		// break;
		// }
		// }
		// }
		// }

		// Road
		for (int vz = -9; vz <= 0; vz++) {
			for (int vx = -1; vx <= 0; vx++) {
				this.world.setBlockState(new BlockPos(x + vx, y - 1, z + vz), Blocks.gravel.getDefaultState());
			}
		}

		// Pillars
		for (int vx = -12; vx <= -6; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + -4), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + vx, y + 3, z + -4), this.blockLogs);
		}
		for (int vx = 5; vx <= 11; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + -4), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + vx, y + 3, z + -4), this.blockLogs);
		}
		for (int vz = -3; vz <= 1; vz++) {
			this.world.setBlockState(new BlockPos(x + 5, y - 1, z + vz), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + 5, y + 3, z + vz), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -6, y - 1, z + vz), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -6, y + 3, z + vz), this.blockLogs);
		}
		for (int vz = -3; vz <= 10; vz++) {
			this.world.setBlockState(new BlockPos(x + 11, y - 1, z + vz), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + 11, y + 3, z + vz), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -12, y - 1, z + vz), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -12, y + 3, z + vz), this.blockLogs);
		}
		for (int vx = -11; vx <= 10; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + 10), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + vx, y + 3, z + 10), this.blockLogs);
		}
		for (int vx = -5; vx <= 4; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + 1), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + vx, y + 3, z + 1), this.blockLogs);
		}
		for (int vy = 0; vy <= 2; vy++) {
			this.world.setBlockState(new BlockPos(x + 11, y + vy, z + 10), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + 11, y + vy, z + -4), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + 5, y + vy, z + -4), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + 5, y + vy, z + 1), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + 1, y + vy, z + 1), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -2, y + vy, z + 1), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -6, y + vy, z + 1), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -6, y + vy, z + -4), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -12, y + vy, z + -4), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -12, y + vy, z + 10), this.blockLogs);
		}

		// Floor
		for (int vx = -11; vx <= -7; vx++) {
			for (int vz = -3; vz <= 1; vz++) {
				this.world.setBlockState(new BlockPos(x + vx, y - 1, z + vz), this.blockPlanks);
				this.world.setBlockState(new BlockPos(x + vx, y + 3, z + vz), this.blockPlanks);
			}
		}
		for (int vx = 6; vx <= 10; vx++) {
			for (int vz = -3; vz <= 1; vz++) {
				this.world.setBlockState(new BlockPos(x + vx, y - 1, z + vz), this.blockPlanks);
				this.world.setBlockState(new BlockPos(x + vx, y + 3, z + vz), this.blockPlanks);
			}
		}
		for (int vx = -11; vx <= 10; vx++) {
			for (int vz = 2; vz <= 9; vz++) {
				this.world.setBlockState(new BlockPos(x + vx, y - 1, z + vz), this.blockPlanks);
				this.world.setBlockState(new BlockPos(x + vx, y + 3, z + vz), this.blockPlanks);
			}
		}

		// Pillars Inside
		for (int vy = -1; vy <= 2; vy++) {
			this.world.setBlockState(new BlockPos(x + 2, y + vy, z + 5), this.blockLogs);
			this.world.setBlockState(new BlockPos(x + -3, y + vy, z + 5), this.blockLogs);
		}

		// Torches
		this.world.setBlockState(new BlockPos(x + 0, y + 0, z + 7), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + 0, y + 1, z + 7),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + 6, y + 0, z + 0), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + 6, y + 1, z + 0),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + 3, y + 0, z + 6), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + 3, y + 1, z + 6),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + -4, y + 0, z + 6), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + -4, y + 1, z + 6),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + -7, y + 0, z + 0), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + -7, y + 1, z + 0),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + -7, y + 4, z + 9), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + -7, y + 5, z + 9),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + -7, y + 4, z + -3), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + -7, y + 5, z + -3),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + 6, y + 4, z + -3), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + 6, y + 5, z + -3),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + 6, y + 4, z + 9), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + 6, y + 5, z + 9),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + -11, y, z + 4), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + -11, y + 1, z + 4),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		this.world.setBlockState(new BlockPos(x + 10, y, z + 4), this.blockLogs);
		this.world.setBlockState(new BlockPos(x + 10, y + 1, z + 4),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		// Walls
		for (int vx = -11; vx <= -7; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vy == 1 && vx >= -10 && vx <= -8) {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + -4), Blocks.glass_pane.getDefaultState());
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + -4), this.blockPlanks);
				}
			}
		}
		for (int vx = 6; vx <= 10; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vy == 1 && vx >= 7 && vx <= 9) {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + -4), Blocks.glass_pane.getDefaultState());
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + -4), this.blockPlanks);
				}
			}
		}
		for (int vz = -3; vz <= 0; vz++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vy == 1 && vz >= -2 && vz <= -1) {
					this.world.setBlockState(new BlockPos(x + 5, y + vy, z + vz), Blocks.glass_pane.getDefaultState());
					this.world.setBlockState(new BlockPos(x + -6, y + vy, z + vz), Blocks.glass_pane.getDefaultState());
				} else {
					this.world.setBlockState(new BlockPos(x + 5, y + vy, z + vz), this.blockPlanks);
					this.world.setBlockState(new BlockPos(x + -6, y + vy, z + vz), this.blockPlanks);
				}
			}
		}
		for (int vx = -5; vx <= -3; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vy == 1 && vx >= -4 && vx <= -4) {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 1), Blocks.glass_pane.getDefaultState());
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 1), this.blockPlanks);
				}
			}
		}
		for (int vx = 2; vx <= 4; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vy == 1 && vx >= 3 && vx <= 3) {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 1), Blocks.glass_pane.getDefaultState());
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 1), this.blockPlanks);
				}
			}
		}
		this.world.setBlockState(new BlockPos(x + 0, y + 2, z + 1), this.blockPlanks);
		this.world.setBlockState(new BlockPos(x + -1, y + 2, z + 1), this.blockPlanks);

		for (int vz = -3; vz <= 9; vz++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vy == 1 && (vz >= -2 && vz <= -1 || vz >= 3 && vz <= 3 || vz >= 7 && vz <= 8)) {
					this.world.setBlockState(new BlockPos(x + -12, y + vy, z + vz),
							Blocks.glass_pane.getDefaultState());
					this.world.setBlockState(new BlockPos(x + 11, y + vy, z + vz), Blocks.glass_pane.getDefaultState());
				} else {
					this.world.setBlockState(new BlockPos(x + -12, y + vy, z + vz), this.blockPlanks);
					this.world.setBlockState(new BlockPos(x + 11, y + vy, z + vz), this.blockPlanks);
				}
			}
		}
		for (int vx = -11; vx <= 10; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vy == 1 && (vx >= -10 && vx <= -9 || vx >= -6 && vx <= -5 || vx >= 4 && vx <= 5
						|| vx >= 8 && vx <= 9)) {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 10), Blocks.glass_pane.getDefaultState());
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 10), this.blockPlanks);
				}
			}
		}

		for (int vx = -12; vx <= -6; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 4, z + -4), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + vx, y + 4, z + 10), this.blockPlanks);
		}
		for (int vx = -11; vx <= -7; vx++) {
			if (vx >= -10 && vx <= -8) {
				this.world.setBlockState(new BlockPos(x + vx, y + 5, z + -4), Blocks.glass_pane.getDefaultState());
				this.world.setBlockState(new BlockPos(x + vx, y + 5, z + 10), Blocks.glass_pane.getDefaultState());
			} else {
				this.world.setBlockState(new BlockPos(x + vx, y + 5, z + -4), this.blockPlanks);
				this.world.setBlockState(new BlockPos(x + vx, y + 5, z + 10), this.blockPlanks);
			}
		}
		for (int vx = -10; vx <= -8; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 6, z + -4), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + vx, y + 6, z + 10), this.blockPlanks);
		}
		this.world.setBlockState(new BlockPos(x + -9, y + 7, z + -4), this.blockPlanks);
		this.world.setBlockState(new BlockPos(x + -9, y + 7, z + 10), this.blockPlanks);

		for (int vx = 5; vx <= 11; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 4, z + -4), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + vx, y + 4, z + 10), this.blockPlanks);
		}
		for (int vx = 6; vx <= 10; vx++) {
			if (vx >= 7 && vx <= 9) {
				this.world.setBlockState(new BlockPos(x + vx, y + 5, z + -4), Blocks.glass_pane.getDefaultState());
				this.world.setBlockState(new BlockPos(x + vx, y + 5, z + 10), Blocks.glass_pane.getDefaultState());
			} else {
				this.world.setBlockState(new BlockPos(x + vx, y + 5, z + -4), this.blockPlanks);
				this.world.setBlockState(new BlockPos(x + vx, y + 5, z + 10), this.blockPlanks);
			}
		}
		for (int vx = 7; vx <= 9; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 6, z + -4), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + vx, y + 6, z + 10), this.blockPlanks);
		}
		this.world.setBlockState(new BlockPos(x + 8, y + 7, z + -4), this.blockPlanks);
		this.world.setBlockState(new BlockPos(x + 8, y + 7, z + 10), this.blockPlanks);

		// Walls Inside
		for (int vx = -11; vx <= -7; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vx == -9 && vy >= 0 && vy <= 1) {
					// Air
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 1), this.blockPlanks);
				}
			}
		}
		for (int vx = 6; vx <= 10; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vx == 8 && vy >= 0 && vy <= 1) {
					// Air
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 1), this.blockPlanks);
				}
			}
		}
		for (int vx = -11; vx <= -4; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vx == -6 && vy >= 0 && vy <= 1) {
					// Air
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 5), this.blockPlanks);
				}
			}
		}
		for (int vx = 3; vx <= 10; vx++) {
			for (int vy = 0; vy <= 2; vy++) {
				if (vx == 5 && vy >= 0 && vy <= 1) {
					// Air
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 5), this.blockPlanks);
				}
			}
		}
		for (int vz = 6; vz <= 9; vz++) {
			for (int vy = 0; vy <= 2; vy++) {
				this.world.setBlockState(new BlockPos(x + 2, y + vy, z + vz), this.blockPlanks);
				this.world.setBlockState(new BlockPos(x + -3, y + vy, z + vz), this.blockPlanks);
			}
		}

		// Roof Walls
		for (int vx = -6; vx <= 5; vx++) {
			for (int vy = 4; vy <= 6; vy++) {
				if (vy == 5 && (vx >= -4 && vx <= -3 || vx >= -1 && vx <= 0 || vx >= 2 && vx <= 3)) {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 1), Blocks.glass_pane.getDefaultState());
				} else {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + 1), this.blockPlanks);
				}
			}
		}
		for (int vz = -3; vz <= 0; vz++) {
			this.world.setBlockState(new BlockPos(x + 5, y + 4, z + vz), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + -6, y + 4, z + vz), this.blockPlanks);
		}
		for (int vz = -3; vz <= 9; vz++) {
			this.world.setBlockState(new BlockPos(x + 11, y + 4, z + vz), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + -12, y + 4, z + vz), this.blockPlanks);
		}
		for (int vx = -5; vx <= 4; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 4, z + 10), this.blockPlanks);
		}

		for (int vy = 4; vy <= 7; vy++) {
			this.world.setBlockState(new BlockPos(x + 5, y + vy, z + 2), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + -6, y + vy, z + 2), this.blockPlanks);
		}
		for (int vy = 6; vy <= 8; vy++) {
			this.world.setBlockState(new BlockPos(x + 5, y + vy, z + 3), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + -6, y + vy, z + 3), this.blockPlanks);
		}
		for (int vy = 4; vy <= 8; vy++) {
			for (int vz = 4; vz <= 6; vz++) {
				this.world.setBlockState(new BlockPos(x + 5, y + vy, z + vz), this.blockPlanks);
				this.world.setBlockState(new BlockPos(x + -6, y + vy, z + vz), this.blockPlanks);
			}
		}
		for (int vy = 4; vy <= 7; vy++) {
			this.world.setBlockState(new BlockPos(x + 5, y + vy, z + 7), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + -6, y + vy, z + 7), this.blockPlanks);
		}
		for (int vy = 4; vy <= 6; vy++) {
			this.world.setBlockState(new BlockPos(x + 5, y + vy, z + 8), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + -6, y + vy, z + 8), this.blockPlanks);
		}
		for (int vy = 4; vy <= 5; vy++) {
			this.world.setBlockState(new BlockPos(x + 5, y + vy, z + 9), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + -6, y + vy, z + 9), this.blockPlanks);
		}

		// Stairs
		for (int vz = 5; vz <= 9; vz++) {
			for (int vx = -2; vx <= 1; vx++) {
				this.world.setBlockToAir(new BlockPos(x + vx, y + 3, z + vz));
			}
		}
		for (int vx = -2; vx <= 1; vx++) {
			for (int vz = 8; vz <= 9; vz++) {
				for (int vy = 0; vy <= 1; vy++) {
					this.world.setBlockState(new BlockPos(x + vx, y + vy, z + vz), this.blockPlanks);
				}
			}
		}

		this.world.setBlockState(new BlockPos(x + -2, y + 0, z + 6),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.SOUTH).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));
		this.world.setBlockState(new BlockPos(x + -1, y + 0, z + 6),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.SOUTH).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));
		this.world.setBlockState(new BlockPos(x + -2, y + 0, z + 7), this.blockPlanks);
		this.world.setBlockState(new BlockPos(x + -1, y + 0, z + 7), this.blockPlanks);
		this.world.setBlockState(new BlockPos(x + -2, y + 1, z + 7),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.SOUTH).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));
		this.world.setBlockState(new BlockPos(x + -1, y + 1, z + 7),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.SOUTH).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));

		this.world.setBlockState(new BlockPos(x + 0, y + 2, z + 8),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));
		this.world.setBlockState(new BlockPos(x + 0, y + 2, z + 9),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));
		this.world.setBlockState(new BlockPos(x + 1, y + 2, z + 8), this.blockPlanks);
		this.world.setBlockState(new BlockPos(x + 1, y + 2, z + 9), this.blockPlanks);
		this.world.setBlockState(new BlockPos(x + 1, y + 3, z + 8),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));
		this.world.setBlockState(new BlockPos(x + 1, y + 3, z + 9),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));

		// Railing
		for (int vz = 4; vz <= 7; vz++) {
			this.world.setBlockState(new BlockPos(x + 2, y + 4, z + vz), this.blockFences);
		}
		for (int vz = 4; vz <= 9; vz++) {
			this.world.setBlockState(new BlockPos(x + -3, y + 4, z + vz), this.blockFences);
		}
		for (int vx = -2; vx <= 1; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 4, z + 4), this.blockFences);
		}

		this.world.setBlockState(new BlockPos(x + 2, y + 5, z + 4),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());
		this.world.setBlockState(new BlockPos(x + -3, y + 5, z + 4),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		// Roof - Left
		for (int vz = -5; vz <= 0; vz++) {
			this.world.setBlockState(new BlockPos(x + 4, y + 4, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		this.world.setBlockState(new BlockPos(x + 4, y + 4, z + 11),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));

		for (int vz = -5; vz <= -1; vz++) {
			this.world.setBlockState(new BlockPos(x + 5, y + 5, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		this.world.setBlockState(new BlockPos(x + 5, y + 5, z + 0), this.blockPlanks);

		for (int vz = 10; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 5, y + 5, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		for (int vz = -5; vz <= 0; vz++) {
			this.world.setBlockState(new BlockPos(x + 6, y + 6, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = 9; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 6, y + 6, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		for (int vz = -5; vz <= 1; vz++) {
			this.world.setBlockState(new BlockPos(x + 7, y + 7, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = 8; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 7, y + 7, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		for (int vz = -5; vz <= 1; vz++) {
			this.world.setBlockState(new BlockPos(x + 8, y + 8, z + vz), this.blockSlabs);
		}
		for (int vz = 8; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 8, y + 8, z + vz), this.blockSlabs);
		}

		for (int vz = -5; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 9, y + 7, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = -5; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 10, y + 6, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = -5; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 11, y + 5, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = -5; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + 12, y + 4, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		// Roof - Right
		for (int vz = -5; vz <= 0; vz++) {
			this.world.setBlockState(new BlockPos(x + -5, y + 4, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		this.world.setBlockState(new BlockPos(x + -5, y + 4, z + 11),
				this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
						BlockStairs.EnumHalf.BOTTOM));

		for (int vz = -5; vz <= -1; vz++) {
			this.world.setBlockState(new BlockPos(x + -6, y + 5, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		this.world.setBlockState(new BlockPos(x + -6, y + 5, z + 0), this.blockPlanks);

		for (int vz = 10; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + -6, y + 5, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		for (int vz = -5; vz <= 0; vz++) {
			this.world.setBlockState(new BlockPos(x + -7, y + 6, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = 9; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + -7, y + 6, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		for (int vz = -5; vz <= 1; vz++) {
			this.world.setBlockState(new BlockPos(x + -8, y + 7, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = 8; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + -8, y + 7, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		for (int vz = -5; vz <= 1; vz++) {
			this.world.setBlockState(new BlockPos(x + -9, y + 8, z + vz), this.blockSlabs);
		}
		for (int vz = 8; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + -9, y + 8, z + vz), this.blockSlabs);
		}

		for (int vz = -5; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + -10, y + 7, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = -5; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + -11, y + 6, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = -5; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + -12, y + 5, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = -5; vz <= 11; vz++) {
			this.world.setBlockState(new BlockPos(x + -13, y + 4, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		//
		// // Roof - Middle
		for (int vx = -6; vx <= 5; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 6, z + 0),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.SOUTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -7; vx <= 6; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 7, z + 1),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.SOUTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -8; vx <= 7; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 8, z + 2),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.SOUTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -7; vx <= 6; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 9, z + 3),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.SOUTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -6; vx <= 5; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 10, z + 4),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.SOUTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -6; vx <= 5; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 10, z + 5),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.NORTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -7; vx <= 6; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 9, z + 6),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.NORTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -8; vx <= 7; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 8, z + 7),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.NORTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -7; vx <= 6; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 7, z + 8),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.NORTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -6; vx <= 5; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 6, z + 9),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.NORTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -5; vx <= 4; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 5, z + 10),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.NORTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vx = -4; vx <= 3; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 4, z + 11),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.NORTH).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		for (int vz = 2; vz <= 7; vz++) {
			this.world.setBlockState(new BlockPos(x + 8, y + 8, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = 3; vz <= 6; vz++) {
			this.world.setBlockState(new BlockPos(x + 7, y + 9, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = 4; vz <= 5; vz++) {
			this.world.setBlockState(new BlockPos(x + 6, y + 10, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		for (int vz = 2; vz <= 7; vz++) {
			this.world.setBlockState(new BlockPos(x + -9, y + 8, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = 3; vz <= 6; vz++) {
			this.world.setBlockState(new BlockPos(x + -8, y + 9, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}
		for (int vz = 4; vz <= 5; vz++) {
			this.world.setBlockState(new BlockPos(x + -7, y + 10, z + vz),
					this.blockStairs.withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF,
							BlockStairs.EnumHalf.BOTTOM));
		}

		for (int vx = -7; vx <= 6; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y + 9, z + 4), this.blockPlanks);
			this.world.setBlockState(new BlockPos(x + vx, y + 9, z + 5), this.blockPlanks);
		}

		// Objects
		this.world.setBlockState(new BlockPos(x + 1, y + 0, z + 7), Blocks.bookshelf.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 1, y + 1, z + 7), Blocks.bookshelf.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 1, y + 2, z + 7), Blocks.bookshelf.getDefaultState());

		// Doors
		ItemDoor.placeDoor(this.world, new BlockPos(x, y, z + 1), EnumFacing.NORTH, this.blockDoors.getBlock());
		ItemDoor.placeDoor(this.world, new BlockPos(x + -1, y, z + 1), EnumFacing.NORTH, this.blockDoors.getBlock());

		ItemDoor.placeDoor(this.world, new BlockPos(x + 5, y, z + 5), EnumFacing.NORTH, this.blockDoors.getBlock());
		ItemDoor.placeDoor(this.world, new BlockPos(x + -6, y, z + 5), EnumFacing.NORTH, this.blockDoors.getBlock());
		ItemDoor.placeDoor(this.world, new BlockPos(x + -9, y, z + 1), EnumFacing.SOUTH, this.blockDoors.getBlock());
		ItemDoor.placeDoor(this.world, new BlockPos(x + 8, y, z + 1), EnumFacing.SOUTH, this.blockDoors.getBlock());

		ItemDoor.placeDoor(this.world, new BlockPos(x + 5, y + 4, z + 3), EnumFacing.WEST, this.blockDoors.getBlock());
		ItemDoor.placeDoor(this.world, new BlockPos(x + -6, y + 4, z + 3), EnumFacing.WEST, this.blockDoors.getBlock());

		// Fence
		for (int vx = -5; vx <= 4; vx++) {
			if (vx != -1 && vx != 0) {
				this.world.setBlockState(new BlockPos(x + vx, y, z + -4), this.blockFences);
			}
		}
		this.world.setBlockState(new BlockPos(x + -2, y + 1, z + -4),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());
		this.world.setBlockState(new BlockPos(x + 1, y + 1, z + -4),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		// Farm
		for (int vx = -12; vx <= -3; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + -6), Blocks.water.getDefaultState());
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + -7), Blocks.farmland.getDefaultState());
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + -8), Blocks.farmland.getDefaultState());

			this.addBlockAndMetadata(this.world, x + vx, y, z + -7, this.crops.get(random.nextInt(this.crops.size())),
					2);
			this.addBlockAndMetadata(this.world, x + vx, y, z + -8, this.crops.get(random.nextInt(this.crops.size())),
					2);
		}
		this.world.setBlockState(new BlockPos(x + -10, y, z + -9),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());
		this.world.setBlockState(new BlockPos(x + -5, y, z + -9),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		for (int vx = 2; vx <= 11; vx++) {
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + -6), Blocks.water.getDefaultState());
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + -7), Blocks.farmland.getDefaultState());
			this.world.setBlockState(new BlockPos(x + vx, y - 1, z + -8), Blocks.farmland.getDefaultState());

			this.addBlockAndMetadata(this.world, x + vx, y, z + -7, this.crops.get(random.nextInt(this.crops.size())),
					2);
			this.addBlockAndMetadata(this.world, x + vx, y, z + -8, this.crops.get(random.nextInt(this.crops.size())),
					2);
		}
		this.world.setBlockState(new BlockPos(x + 4, y, z + -9),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());
		this.world.setBlockState(new BlockPos(x + 9, y, z + -9),
				this.candles.get(random.nextInt(this.candles.size())).getDefaultState());

		// Decoration
		this.world.setBlockState(new BlockPos(x + 3, y, z + 9), Blocks.crafting_table.getDefaultState());
		this.world.setBlockState(new BlockPos(x + 10, y, z + 0), Blocks.crafting_table.getDefaultState());
		this.world.setBlockState(new BlockPos(x + -11, y, z + 0), Blocks.crafting_table.getDefaultState());
		this.world.setBlockState(new BlockPos(x + -4, y, z + 9), Blocks.crafting_table.getDefaultState());

		this.world.setBlockState(new BlockPos(x + 6, y + 4, z + 5), Blocks.crafting_table.getDefaultState());
		this.world.setBlockState(new BlockPos(x + -7, y + 4, z + 5), Blocks.crafting_table.getDefaultState());

		this.world.setBlockState(new BlockPos(x + 7, y + 4, z),
				Blocks.bed.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST)
						.withProperty(BlockBed.PART, BlockBed.EnumPartType.FOOT));
		this.world.setBlockState(new BlockPos(x + 6, y + 4, z),
				Blocks.bed.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST)
						.withProperty(BlockBed.PART, BlockBed.EnumPartType.HEAD));
		this.world.setBlockState(new BlockPos(x + -7, y + 4, z),
				Blocks.bed.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST)
						.withProperty(BlockBed.PART, BlockBed.EnumPartType.HEAD));
		this.world.setBlockState(new BlockPos(x + -8, y + 4, z),
				Blocks.bed.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST)
						.withProperty(BlockBed.PART, BlockBed.EnumPartType.FOOT));

		this.world.setBlockState(new BlockPos(x + 6, y + 4, z + -1), Blocks.bookshelf.getDefaultState());
		this.world.setBlockState(new BlockPos(x + -7, y + 4, z + -1), Blocks.bookshelf.getDefaultState());

		// Blocks
		for (int vz = 6; vz <= 9; vz++) {
			if (random.nextInt(2) == 0) {
				final int boxIndex = random.nextInt(this.boxes.size());

				this.addBoxWithCustomLoot(this.world, random, x + 10, y, z + vz, boxIndex);
			}
		}
		for (int vx = 6; vx <= 10; vx++) {
			if (random.nextInt(2) == 0) {
				final int boxIndex = random.nextInt(this.boxes.size());

				this.addBoxWithCustomLoot(this.world, random, x + vx, y, z + -3, boxIndex);
			}
		}
		for (int vx = -11; vx <= -7; vx++) {
			if (random.nextInt(2) == 0) {
				final int boxIndex = random.nextInt(this.boxes.size());

				this.addBoxWithCustomLoot(this.world, random, x + vx, y, z + -3, boxIndex);
			}
		}
		for (int vz = 6; vz <= 9; vz++) {
			if (random.nextInt(2) == 0) {
				final int boxIndex = random.nextInt(this.boxes.size());

				this.addBoxWithCustomLoot(this.world, random, x + -11, y, z + vz, boxIndex);
			}
		}

		for (int vz = -3; vz <= 9; vz++) {
			if (random.nextInt(4) == 0) {
				final int boxIndex = random.nextInt(this.boxes.size());

				this.addBoxWithCustomLoot(this.world, random, x + -11, y + 4, z + vz, boxIndex);
			}
		}
		for (int vz = -3; vz <= 9; vz++) {
			if (random.nextInt(4) == 0) {
				final int boxIndex = random.nextInt(this.boxes.size());

				this.addBoxWithCustomLoot(this.world, random, x + 10, y + 4, z + vz, boxIndex);
			}
		}

		for (int vz = 6; vz <= 8; vz++) {
			if (random.nextInt(2) == 0) {
				this.world.setBlockState(new BlockPos(x + 6, y + 4, z + vz),
						this.blocks.get(random.nextInt(this.blocks.size())).getDefaultState()
								.withProperty(BlockStairs.FACING, EnumFacing.EAST));
			}
		}
		for (int vz = 6; vz <= 8; vz++) {
			if (random.nextInt(2) == 0) {
				this.world.setBlockState(new BlockPos(x + -7, y + 4, z + vz),
						this.blocks.get(random.nextInt(this.blocks.size())).getDefaultState()
								.withProperty(BlockStairs.FACING, EnumFacing.WEST));
			}
		}
		for (int vx = -9; vx <= -5; vx++) {
			if (random.nextInt(2) == 0) {
				this.world.setBlockState(new BlockPos(x + vx, y, z + 9),
						this.blocks.get(random.nextInt(this.blocks.size())).getDefaultState()
								.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
			}
		}
		for (int vx = 4; vx <= 8; vx++) {
			if (random.nextInt(2) == 0) {
				this.world.setBlockState(new BlockPos(x + vx, y, z + 9),
						this.blocks.get(random.nextInt(this.blocks.size())).getDefaultState()
								.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
			}
		}

		// Villagers
		if (this.world.isAirBlock(new BlockPos(x, y, z + 3))) {
			this.spawnVillager(this.world, x, y, z + 3, this.profession.get(random.nextInt(this.profession.size())));
		}
		if (this.world.isAirBlock(new BlockPos(x + -1, y, z + 3))) {
			this.spawnVillager(this.world, x + -1, y, z + 3,
					this.profession.get(random.nextInt(this.profession.size())));
		}

		// Flowers
		for (int vx = -5; vx <= 4; vx++) {
			for (int vz = -3; vz <= 0; vz++) {
				if (this.world.getBlockState(new BlockPos(x + vx, y - 1, z + vz)) == Blocks.grass
						&& this.world.isAirBlock(new BlockPos(x + vx, y, z + vz)) && random.nextInt(2) == 0) {
					if (random.nextBoolean()) {
						this.addBlockAndMetadata(this.world, x + vx, y, z + vz, Blocks.tallgrass,
								random.nextInt(2) + 1);
					} else {
						if (random.nextInt(10) == 0) {
							this.world.setBlockState(new BlockPos(x + vx, y, z + vz),
									Blocks.yellow_flower.getDefaultState());
						} else {
							this.addBlockAndMetadata(this.world, x + vx, y, z + vz, Blocks.red_flower,
									random.nextInt(9));
						}
					}
				}
			}
		}
	}

	// private void placeBlock(final int x, final int y, final int z, final
	// Block block) {
	// if (block == Blocks.log || block == Blocks.log2) {
	// this.addBlockAndMetadata(this.world, x, y, z, block, this.blockLogsMeta);
	// } else if (block == Blocks.planks || block == Blocks.wooden_slab) {
	// this.addBlockAndMetadata(this.world, x, y, z, block,
	// this.blockPlanksMeta);
	// } else {
	// this.world.setBlockState(new BlockPos(x, y, z), block.getDefaultState());
	// }
	// }

	@SuppressWarnings("unused")
	public void addBlockAndMetadata(final World world, final int x, final int y, final int z, final Block block,
			final int meta) {
		world.setBlockState(new BlockPos(x, y, z), block.getDefaultState());
	}

	public void addBoxWithCustomLoot(final World world, final Random random, final int x, final int y, final int z,
			final int boxIndex) {
		world.setBlockState(new BlockPos(x, y, z), this.boxes.get(boxIndex).getDefaultState());

		final TileEntityStorageBox box = (TileEntityStorageBox) world.getTileEntity(new BlockPos(x, y, z));

		if (box != null) {
			final ArrayList<Item> boxItemsList = this.boxItems.get(boxIndex);
			final ArrayList<Item> boxContents = new ArrayList<Item>();

			for (int c = 0; c < 2 + random.nextInt(5); c++) {
				boxContents.add(boxItemsList.get(random.nextInt(boxItemsList.size())));
			}
			for (final Item item : boxContents) {
				ItemStack chestItem;

				if (item.getContainerItem() != null) {
					chestItem = new ItemStack(item, 1);
				} else {
					if (item instanceof ModItemBox) {
						chestItem = new ItemStack(item, random.nextInt(4) + 1);
					} else if (item instanceof ModItemPacket) {
						chestItem = new ItemStack(item, random.nextInt(6) + 1);
					} else {
						chestItem = new ItemStack(item, random.nextInt(8) + 1);
					}
				}

				box.setInventorySlotContents(random.nextInt(box.getSizeInventory()), chestItem);
			}
		}
	}

	public void spawnVillager(final World world, final int x, final int y, final int z, final int profession) {
		final EntityVillager entity = new EntityVillager(world, profession);

		entity.setPositionAndRotation(x + 0.5D, y, z + 0.5D, 0.0F, 0.0F);

		world.spawnEntityInWorld(entity);
	}
}
