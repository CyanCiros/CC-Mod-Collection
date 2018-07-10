package cc_dungeon_pack.npctown;

import java.util.ArrayList;
import java.util.Random;

import cc_dungeon_pack.generator.DungeonGenerator;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower.EnumFlowerType;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTallGrass.EnumType;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class NPCTownBase extends DungeonGenerator {
	public World world;

	protected final ArrayList<IBlockState> blocks;

	protected IBlockState block1;
	protected IBlockState block2;
	protected IBlockState block3;
	protected IBlockState block4;
	protected IBlockState block5;
	protected IBlockState block6;
	protected IBlockState block7;
	protected IBlockState block8;
	protected IBlockState block9;
	protected IBlockState block10;
	protected IBlockState block11;
	protected IBlockState block12;
	protected IBlockState block13;
	protected IBlockState block14;
	protected IBlockState block15;

	protected static BlockPlanks.EnumType plankType;
	protected static IBlockState doorType;
	protected static IBlockState fenceType;
	protected static IBlockState gateType;

	protected ArrayList<ArrayList<Item>> items;

	protected ArrayList<Integer> profession;

	public NPCTownBase(final World world, final ArrayList<IBlockState> blocks2,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.blocks = blocks2;

		this.block1 = blocks2.get(0);
		this.block2 = blocks2.get(1);
		this.block3 = blocks2.get(2);
		this.block4 = blocks2.get(3);
		this.block5 = blocks2.get(4);
		this.block6 = blocks2.get(5);
		this.block7 = blocks2.get(6);
		this.block8 = blocks2.get(7);
		this.block9 = blocks2.get(8);
		this.block10 = blocks2.get(9);
		this.block11 = blocks2.get(10);
		this.block12 = blocks2.get(11);
		this.block13 = blocks2.get(12);
		this.block14 = blocks2.get(13);
		this.block15 = blocks2.get(14);

		this.items = items;

		this.profession = new ArrayList<Integer>();
		this.profession.add(1);
		this.profession.add(2);
		this.profession.add(3);
		this.profession.add(7);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.getBlocks(random);

		this.generateWay(random, x, y, z);

		final NPCTownBaseWall walls = new NPCTownBaseWall(this.world, this.blocks, this.items);
		walls.generate(random, x, y, z);

		this.generatePart(random, x + 13, y, z + 13);
		this.generatePart(random, x - 13, y, z + 13);
		this.generatePart(random, x + 13, y, z - 13);
		this.generatePart(random, x - 13, y, z - 13);
		this.generatePart(random, x + 39, y, z + 13);
		this.generatePart(random, x - 39, y, z + 13);
		this.generatePart(random, x + 39, y, z - 13);
		this.generatePart(random, x - 39, y, z - 13);
		this.generatePart(random, x + 13, y, z + 39);
		this.generatePart(random, x - 13, y, z + 39);
		this.generatePart(random, x + 13, y, z - 39);
		this.generatePart(random, x - 13, y, z - 39);
		this.generatePart(random, x + 39, y, z + 39);
		this.generatePart(random, x - 39, y, z + 39);
		this.generatePart(random, x + 39, y, z - 39);
		this.generatePart(random, x - 39, y, z - 39);
	}

	private void generateWay(final Random random, final int x, final int y, final int z) {
		for (int vx = -50; vx <= 50; vx++) {
			for (int vz = -50; vz <= 50; vz++) {
				for (int vy = 0; vy <= 13; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
				if (vx >= -27 && vx <= -25 || vx >= -1 && vx <= 1 || vx >= 25 && vx <= 27 || vz >= -27 && vz <= -25
						|| vz >= -1 && vz <= 1 || vz >= 25 && vz <= 27) {
					if (this.world.getBlockState(new BlockPos(x + vx, y - 1, z + vz)) != this.block2) {
						this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block6);
						this.placeBlock(random, new BlockPos(x + vx, y - 2, z + vz), this.block11);
					}
				} else {
					this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block12);
					this.placeBlock(random, new BlockPos(x + vx, y - 2, z + vz), this.block11);

					if (vx == -28 && (vz == -28 || vz == -24 || vz == -2 || vz == 2 || vz == 24 || vz == 28)
							|| vx == -24 && (vz == -28 || vz == -24 || vz == -2 || vz == 2 || vz == 24 || vz == 28)
							|| vx == -2 && (vz == -28 || vz == -24 || vz == -2 || vz == 2 || vz == 24 || vz == 28)
							|| vx == 2 && (vz == -28 || vz == -24 || vz == -2 || vz == 2 || vz == 24 || vz == 28)
							|| vx == 24 && (vz == -28 || vz == -24 || vz == -2 || vz == 2 || vz == 24 || vz == 28)
							|| vx == 28 && (vz == -28 || vz == -24 || vz == -2 || vz == 2 || vz == 24 || vz == 28)) {
						if (this.world.isAirBlock(new BlockPos(x + vx, y, z + vz))
								&& this.world.isAirBlock(new BlockPos(x + vx, y + 1, z + vz))) {
							this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block15);
							this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), this.block14);
						}
					}
				}
				// if (this.world.isAirBlock(new BlockPos(x + vx, y - 3, z +
				// vz))) {
				// for (int vy = y - 3; vy >= 0; vy--) {
				// if (this.world.isAirBlock(new BlockPos(x + vx, vy, z + vz)))
				// {
				// this.placeBlock(random, new BlockPos(x + vx, vy, z + vz),
				// this.block11);
				// } else {
				// break;
				// }
				// }
				// }
			}
		}
	}

	private void generatePart(final Random random, final int x, final int y, final int z) {
		if (this.world.getBlockState(new BlockPos(x, y, z)).getBlock() != this.block1
				&& this.world.getBlockState(new BlockPos(x, y, z)).getBlock() != this.block2) {
			this.choosePart(random).generate(random, x, y, z);
		}
		for (int vx = x - 11; vx <= x + 11; vx++) {
			for (int vz = z - 11; vz <= z + 11; vz++) {
				if (this.world.getBlockState(new BlockPos(vx, y - 1, vz)).getBlock() == Blocks.grass
						&& this.world.isAirBlock(new BlockPos(vx, y, vz))
						&& this.world.isAirBlock(new BlockPos(vx + 1, y, vz))
						&& this.world.isAirBlock(new BlockPos(vx, y, vz + 1))
						&& this.world.isAirBlock(new BlockPos(vx - 1, y, vz))
						&& this.world.isAirBlock(new BlockPos(vx, y, vz - 1)) && random.nextInt(48) == 0) {
					this.placeBlock(random, new BlockPos(vx, y, vz), this.block15);
					this.placeBlock(random, new BlockPos(vx, y + 1, vz), this.block14);
				}
				if (this.world.getBlockState(new BlockPos(vx, y - 1, vz)).getBlock() == Blocks.grass
						&& this.world.isAirBlock(new BlockPos(vx, y, vz)) && random.nextInt(6) == 0) {
					if (random.nextBoolean()) {
						final EnumType grassType = BlockTallGrass.EnumType
								.values()[random.nextInt(BlockTallGrass.EnumType.values().length - 1) + 1];
						final IBlockState blockGrass = Blocks.tallgrass.getBlockState().getBaseState()
								.withProperty(BlockTallGrass.TYPE, grassType);
						this.placeBlock(random, new BlockPos(vx, y, vz), blockGrass);
					} else {
						final EnumFlowerType flowerType = BlockFlower.EnumFlowerType.values()[random
								.nextInt(BlockFlower.EnumFlowerType.values().length)];
						final IBlockState blockFlower = flowerType.getBlockType().getBlock()
								.getStateFromMeta(flowerType.getMeta());
						this.placeBlock(random, new BlockPos(vx, y, vz), blockFlower);
					}
				}
			}
		}
	}

	private NPCTownBase choosePart(final Random random) {
		final int v = random.nextInt(9);

		if (v <= 1) {
			return new NPCTownStable(this.world, this.blocks, this.items);
		} else if (v <= 3) {
			return new NPCTownPlant(this.world, this.blocks, this.items);
		} else if (v <= 5) {
			return new NPCTownHouse1(this.world, this.blocks, this.items);
		} else if (v == 6) {
			return new NPCTownHouse2(this.world, this.blocks, this.items);
		} else if (v == 7) {
			return new NPCTownHouse3(this.world, this.blocks, this.items);
		} else {
			return new NPCTownHouse4(this.world, this.blocks, this.items);
		}
	}

	public void getBlocks(final Random random) {
		if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log)) {
			this.block1 = random.nextInt(3) == 0 ? Blocks.log2.getDefaultState() : Blocks.log.getDefaultState();
		}
		if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log)) {
			final int r = random.nextInt(4);

			switch (r) {
			case 0:
				NPCTownBase.plankType = BlockPlanks.EnumType.OAK;
				NPCTownBase.doorType = Blocks.oak_door.getDefaultState();
				NPCTownBase.fenceType = Blocks.oak_fence.getDefaultState();
				NPCTownBase.gateType = Blocks.oak_fence_gate.getDefaultState();
				break;
			case 1:
				NPCTownBase.plankType = BlockPlanks.EnumType.SPRUCE;
				NPCTownBase.doorType = Blocks.spruce_door.getDefaultState();
				NPCTownBase.fenceType = Blocks.spruce_fence.getDefaultState();
				NPCTownBase.gateType = Blocks.spruce_fence_gate.getDefaultState();
				break;
			case 2:
				NPCTownBase.plankType = BlockPlanks.EnumType.BIRCH;
				NPCTownBase.doorType = Blocks.birch_door.getDefaultState();
				NPCTownBase.fenceType = Blocks.birch_fence.getDefaultState();
				NPCTownBase.gateType = Blocks.birch_fence_gate.getDefaultState();
				break;
			case 3:
				NPCTownBase.plankType = BlockPlanks.EnumType.JUNGLE;
				NPCTownBase.doorType = Blocks.jungle_door.getDefaultState();
				NPCTownBase.fenceType = Blocks.jungle_fence.getDefaultState();
				NPCTownBase.gateType = Blocks.jungle_fence_gate.getDefaultState();
				break;
			default:
				NPCTownBase.plankType = BlockPlanks.EnumType.OAK;
				NPCTownBase.doorType = Blocks.oak_door.getDefaultState();
				NPCTownBase.fenceType = Blocks.oak_fence.getDefaultState();
				NPCTownBase.gateType = Blocks.oak_fence_gate.getDefaultState();
				break;
			}
		} else if (this.getEquals(this.world, this.block1.getBlock(), Blocks.log2)) {
			final int r = random.nextInt(2);

			switch (r) {
			case 0:
				NPCTownBase.plankType = BlockPlanks.EnumType.ACACIA;
				NPCTownBase.doorType = Blocks.acacia_door.getDefaultState();
				NPCTownBase.fenceType = Blocks.acacia_fence.getDefaultState();
				NPCTownBase.gateType = Blocks.acacia_fence_gate.getDefaultState();
				break;
			case 1:
				NPCTownBase.plankType = BlockPlanks.EnumType.DARK_OAK;
				NPCTownBase.doorType = Blocks.dark_oak_door.getDefaultState();
				NPCTownBase.fenceType = Blocks.dark_oak_fence.getDefaultState();
				NPCTownBase.gateType = Blocks.dark_oak_fence_gate.getDefaultState();
				break;
			default:
				NPCTownBase.plankType = BlockPlanks.EnumType.ACACIA;
				NPCTownBase.doorType = Blocks.acacia_door.getDefaultState();
				NPCTownBase.fenceType = Blocks.acacia_fence.getDefaultState();
				NPCTownBase.gateType = Blocks.acacia_fence_gate.getDefaultState();
				break;
			}
		} else {
			NPCTownBase.plankType = BlockPlanks.EnumType.OAK;
			NPCTownBase.doorType = Blocks.oak_door.getDefaultState();
			NPCTownBase.fenceType = Blocks.oak_fence.getDefaultState();
			NPCTownBase.gateType = Blocks.oak_fence_gate.getDefaultState();
		}
	}

	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockOldLog || state.getBlock() instanceof BlockNewLog) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(NPCTownBase.plankType.ordinal() % 4));
		} else if (state.getBlock() instanceof BlockPlanks) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(NPCTownBase.plankType.ordinal()));
		} else if (state.getBlock() instanceof BlockFence) {
			this.world.setBlockState(pos, NPCTownBase.fenceType);
		} else if (state.getBlock() instanceof BlockTorch) {
			this.placeBlockTorch(this.world, random, pos, Blocks.torch);
		} else {
			this.world.setBlockState(pos, state);
		}
	}

	@SuppressWarnings("unused")
	protected void placeBlock(final Random random, final BlockPos pos, final IBlockState state,
			final EnumFacing facing) {
		if (state.getBlock() instanceof BlockDoor) {
			ItemDoor.placeDoor(this.world, pos, facing, NPCTownBase.doorType.getBlock());
		} else if (state.getBlock() instanceof BlockFenceGate) {
			this.world.setBlockState(pos, state.withProperty(BlockDirectional.FACING, facing));
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
