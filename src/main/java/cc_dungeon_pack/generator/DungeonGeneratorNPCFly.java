package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
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
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DungeonGeneratorNPCFly extends DungeonGenerator {
	public final World world;

	public final IBlockState block1;
	public final IBlockState block2;
	public final IBlockState block3;
	public final IBlockState block4;
	public final IBlockState block5;
	public final IBlockState block6;
	public IBlockState block7;
	public final IBlockState block8;
	public final IBlockState block9;
	public IBlockState block10;
	public final IBlockState block11;

	private static BlockPlanks.EnumType plankType;
	private static IBlockState doorType;
	private static IBlockState fenceType;
	private static IBlockState gateType;

	private final int distance;

	protected final ArrayList<ArrayList<Item>> items;

	protected ArrayList<Integer> profession;

	public DungeonGeneratorNPCFly(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);
		this.block4 = blocks.get(3);
		this.block5 = blocks.get(4);
		this.block6 = blocks.get(5);
		this.block7 = blocks.get(6);
		this.block8 = blocks.get(7);
		this.block9 = blocks.get(8);
		this.block10 = blocks.get(9);
		this.block11 = blocks.get(10);

		this.distance = 24;

		this.items = items;

		this.profession = new ArrayList<Integer>();
		this.profession.add(1);
		this.profession.add(2);
		this.profession.add(3);
		this.profession.add(7);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		if (this.getEquals(this.world, this.block10.getBlock(), Blocks.log)) {
			this.block10 = random.nextInt(3) == 0 ? Blocks.log2.getDefaultState() : Blocks.log.getDefaultState();
		}
		if (this.getEquals(this.world, this.block10.getBlock(), Blocks.log)) {
			final int r = random.nextInt(4);

			switch (r) {
			case 0:
				DungeonGeneratorNPCFly.plankType = BlockPlanks.EnumType.OAK;
				DungeonGeneratorNPCFly.doorType = Blocks.oak_door.getDefaultState();
				DungeonGeneratorNPCFly.fenceType = Blocks.oak_fence.getDefaultState();
				DungeonGeneratorNPCFly.gateType = Blocks.oak_fence_gate.getDefaultState();
				break;
			case 1:
				DungeonGeneratorNPCFly.plankType = BlockPlanks.EnumType.SPRUCE;
				DungeonGeneratorNPCFly.doorType = Blocks.spruce_door.getDefaultState();
				DungeonGeneratorNPCFly.fenceType = Blocks.spruce_fence.getDefaultState();
				DungeonGeneratorNPCFly.gateType = Blocks.spruce_fence_gate.getDefaultState();
				break;
			case 2:
				DungeonGeneratorNPCFly.plankType = BlockPlanks.EnumType.BIRCH;
				DungeonGeneratorNPCFly.doorType = Blocks.birch_door.getDefaultState();
				DungeonGeneratorNPCFly.fenceType = Blocks.birch_fence.getDefaultState();
				DungeonGeneratorNPCFly.gateType = Blocks.birch_fence_gate.getDefaultState();
				break;
			case 3:
				DungeonGeneratorNPCFly.plankType = BlockPlanks.EnumType.JUNGLE;
				DungeonGeneratorNPCFly.doorType = Blocks.jungle_door.getDefaultState();
				DungeonGeneratorNPCFly.fenceType = Blocks.jungle_fence.getDefaultState();
				DungeonGeneratorNPCFly.gateType = Blocks.jungle_fence_gate.getDefaultState();
				break;
			default:
				DungeonGeneratorNPCFly.plankType = BlockPlanks.EnumType.OAK;
				DungeonGeneratorNPCFly.doorType = Blocks.oak_door.getDefaultState();
				DungeonGeneratorNPCFly.fenceType = Blocks.oak_fence.getDefaultState();
				DungeonGeneratorNPCFly.gateType = Blocks.oak_fence_gate.getDefaultState();
				break;
			}
		} else if (this.getEquals(this.world, this.block10.getBlock(), Blocks.log2)) {
			final int r = random.nextInt(2);

			switch (r) {
			case 0:
				DungeonGeneratorNPCFly.plankType = BlockPlanks.EnumType.ACACIA;
				DungeonGeneratorNPCFly.doorType = Blocks.acacia_door.getDefaultState();
				DungeonGeneratorNPCFly.fenceType = Blocks.acacia_fence.getDefaultState();
				DungeonGeneratorNPCFly.gateType = Blocks.acacia_fence_gate.getDefaultState();
				break;
			case 1:
				DungeonGeneratorNPCFly.plankType = BlockPlanks.EnumType.DARK_OAK;
				DungeonGeneratorNPCFly.doorType = Blocks.dark_oak_door.getDefaultState();
				DungeonGeneratorNPCFly.fenceType = Blocks.dark_oak_fence.getDefaultState();
				DungeonGeneratorNPCFly.gateType = Blocks.dark_oak_fence_gate.getDefaultState();
				break;
			default:
				DungeonGeneratorNPCFly.plankType = BlockPlanks.EnumType.ACACIA;
				DungeonGeneratorNPCFly.doorType = Blocks.acacia_door.getDefaultState();
				DungeonGeneratorNPCFly.fenceType = Blocks.acacia_fence.getDefaultState();
				DungeonGeneratorNPCFly.gateType = Blocks.acacia_fence_gate.getDefaultState();
				break;
			}
		} else {
			DungeonGeneratorNPCFly.plankType = BlockPlanks.EnumType.OAK;
			DungeonGeneratorNPCFly.doorType = Blocks.oak_door.getDefaultState();
			DungeonGeneratorNPCFly.fenceType = Blocks.oak_fence.getDefaultState();
			DungeonGeneratorNPCFly.gateType = Blocks.oak_fence_gate.getDefaultState();
		}

		final ArrayList<Integer> vxa = new ArrayList<Integer>();
		final ArrayList<Integer> vza = new ArrayList<Integer>();

		int vx = 0;
		int vz = 0;

		boolean xz;

		for (int o = 0; o <= 11 + random.nextInt(9); o++) {
			if (o > 0) {
				final int r = random.nextInt(4);

				if (r == 0) {
					vx += this.distance;
				} else if (r == 1) {
					vx -= this.distance;
				} else if (r == 2) {
					vz += this.distance;
				} else {
					vz -= this.distance;
				}
			}

			xz = true;

			for (int i = 0; i < vxa.size(); i++) {
				if (vxa.get(i) == vx && vza.get(i) == vz) {
					xz = false;
					break;
				}
			}

			if (xz) {
				vxa.add(vx);
				vza.add(vz);
			}
		}

		int vxg;
		int vzg;

		final ArrayList<Integer> vxs = new ArrayList<Integer>();
		final ArrayList<Integer> vzs = new ArrayList<Integer>();

		for (int i = 0; i < vxa.size(); i++) {
			vxg = x + vxa.get(i);
			vzg = z + vza.get(i);

			if (this.world.isAirBlock(new BlockPos(vxg, y - 1, vzg))) {
				this.platform(this.world, random, vxg, y, vzg);
				vxs.add(vxa.get(i));
				vzs.add(vza.get(i));
			}
			if (i > 0) {
				this.generateBridge(this.world, random, vxg, y, vzg);
			}
		}

		for (int i = 0; i < vxs.size(); i++) {
			vxg = x + vxs.get(i);
			vzg = z + vzs.get(i);

			final int r = random.nextInt(7);

			if (r == 0) {
				this.flyFieldGenerate(random, vxg, y, vzg);
			} else if (r == 1) {
				this.flyFountainGenerate(random, vxg, y, vzg);
			} else if (r <= 3) {
				this.flyHouse1Generate(random, vxg, y, vzg);
			} else if (r <= 5) {
				this.flyHouse2Generate(random, vxg, y, vzg);
			} else if (r == 6) {
				this.flyStableGenerate(random, vxg, y, vzg);
			}
		}
	}

	private void flyStableGenerate(final Random random, final int x, final int y, final int z) {
		for (int vx = -1; vx <= 1; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y - 1, z + 4), Blocks.grass.getDefaultState());
			this.placeBlock(random, new BlockPos(x + vx, y - 1, z - 4), Blocks.grass.getDefaultState());

			this.placeBlock(random, new BlockPos(x + vx, y, z + 7), this.block7);
			this.placeBlock(random, new BlockPos(x + vx, y, z - 7), this.block7);
		}
		if (!this.world.isAirBlock(new BlockPos(x, y - 1, z + 8))) {
			this.placeBlock(random, new BlockPos(x, y, z + 7), Blocks.oak_fence_gate.getDefaultState(),
					EnumFacing.NORTH);
		}
		if (!this.world.isAirBlock(new BlockPos(x, y - 1, z - 8))) {
			this.placeBlock(random, new BlockPos(x, y, z - 7), Blocks.oak_fence_gate.getDefaultState(),
					EnumFacing.SOUTH);
		}

		for (int vz = -1; vz <= 1; vz++) {
			this.placeBlock(random, new BlockPos(x + 4, y - 1, z + vz), Blocks.grass.getDefaultState());
			this.placeBlock(random, new BlockPos(x - 4, y - 1, z + vz), Blocks.grass.getDefaultState());

			this.placeBlock(random, new BlockPos(x + 7, y, z + vz), this.block7);
			this.placeBlock(random, new BlockPos(x - 7, y, z + vz), this.block7);
		}
		if (!this.world.isAirBlock(new BlockPos(x + 8, y - 1, z))) {
			this.placeBlock(random, new BlockPos(x + 7, y, z), Blocks.oak_fence_gate.getDefaultState(),
					EnumFacing.EAST);
		}
		if (!this.world.isAirBlock(new BlockPos(x - 8, y - 1, z))) {
			this.placeBlock(random, new BlockPos(x - 7, y, z), Blocks.oak_fence_gate.getDefaultState(),
					EnumFacing.WEST);
		}

		for (int vx = -6; vx <= 6; vx++) {
			for (int vz = -6; vz <= 6; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), Blocks.grass.getDefaultState());
			}
		}
		for (int v = 0; v <= 1; v++) {
			this.spawnCow(this.world, x + random.nextInt(13) - 6, y, z + random.nextInt(13) - 6);
			this.spawnPig(this.world, x + random.nextInt(13) - 6, y, z + random.nextInt(13) - 6);
			this.spawnSheep(this.world, x + random.nextInt(13) - 6, y, z + random.nextInt(13) - 6);
			this.spawnChicken(this.world, x + random.nextInt(13) - 6, y, z + random.nextInt(13) - 6);
		}

		this.platformPlants(this.world, random, x, y, z);
	}

	private void flyHouse2Generate(final Random random, final int x, final int y, final int z) {
		for (int vy = -1; vy <= 7; vy++) {
			for (int vx = -3; vx <= 3; vx++) {
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 4), this.block9);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 4), this.block9);
			}
			for (int vz = -3; vz <= 3; vz++) {
				this.placeBlock(random, new BlockPos(x + 4, y + vy, z + vz), this.block9);
				this.placeBlock(random, new BlockPos(x - 4, y + vy, z + vz), this.block9);
			}
			this.placeBlock(random, new BlockPos(x + 4, y + vy, z + 4), this.block10);
			this.placeBlock(random, new BlockPos(x - 4, y + vy, z + 4), this.block10);
			this.placeBlock(random, new BlockPos(x + 4, y + vy, z - 4), this.block10);
			this.placeBlock(random, new BlockPos(x - 4, y + vy, z - 4), this.block10);
		}
		for (int vx = -3; vx <= 3; vx++) {
			for (int vz = -3; vz <= 3; vz++) {
				if (vx == 0 && vz == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y + 6, z + vz), this.block11);
				} else {
					this.placeBlock(random, new BlockPos(x + vx, y + 6, z + vz), this.block9);
				}
				if (vx == 0 && vz == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block11);
				} else {
					this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block9);
				}
			}
		}
		if (!this.world.isAirBlock(new BlockPos(x + 8, y - 1, z))) {
			this.placeBlock(random, new BlockPos(x + 4, y, z), Blocks.oak_door.getDefaultState(), EnumFacing.EAST);
		} else {
			this.placeBlock(random, new BlockPos(x + 4, y + 1, z), this.block3);
			this.placeBlock(random, new BlockPos(x + 4, y + 2, z), this.block3);
		}
		if (!this.world.isAirBlock(new BlockPos(x - 8, y - 1, z))) {
			this.placeBlock(random, new BlockPos(x - 4, y, z), Blocks.oak_door.getDefaultState(), EnumFacing.WEST);
		} else {
			this.placeBlock(random, new BlockPos(x - 4, y + 1, z), this.block3);
			this.placeBlock(random, new BlockPos(x - 4, y + 2, z), this.block3);
		}
		if (!this.world.isAirBlock(new BlockPos(x, y - 1, z + 8))) {
			this.placeBlock(random, new BlockPos(x, y, z + 4), Blocks.oak_door.getDefaultState(), EnumFacing.SOUTH);
		} else {
			this.placeBlock(random, new BlockPos(x, y + 1, z + 4), this.block3);
			this.placeBlock(random, new BlockPos(x, y + 2, z + 4), this.block3);
		}
		if (!this.world.isAirBlock(new BlockPos(x, y - 1, z - 8))) {
			this.placeBlock(random, new BlockPos(x, y, z - 4), Blocks.oak_door.getDefaultState(), EnumFacing.NORTH);
		} else {
			this.placeBlock(random, new BlockPos(x, y + 1, z - 4), this.block3);
			this.placeBlock(random, new BlockPos(x, y + 2, z - 4), this.block3);
		}

		for (int vx = -2; vx <= 2; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 4, z + 4), this.block3);
			this.placeBlock(random, new BlockPos(x + vx, y + 4, z - 4), this.block3);
		}
		for (int vz = -2; vz <= 2; vz++) {
			this.placeBlock(random, new BlockPos(x + 4, y + 4, z + vz), this.block3);
			this.placeBlock(random, new BlockPos(x - 4, y + 4, z + vz), this.block3);
		}
		for (int vy = 1; vy <= 2; vy++) {
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z + 4), this.block3);
			this.placeBlock(random, new BlockPos(x - 2, y + vy, z + 4), this.block3);
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z - 4), this.block3);
			this.placeBlock(random, new BlockPos(x - 2, y + vy, z - 4), this.block3);
			this.placeBlock(random, new BlockPos(x + 4, y + vy, z + 2), this.block3);
			this.placeBlock(random, new BlockPos(x + 4, y + vy, z - 2), this.block3);
			this.placeBlock(random, new BlockPos(x - 4, y + vy, z + 2), this.block3);
			this.placeBlock(random, new BlockPos(x - 4, y + vy, z - 2), this.block3);
		}
		if (random.nextInt(6) == 0) {
			if (random.nextBoolean()) {
				this.placeBlock(random, new BlockPos(x + 3, y, z + 3), this.block6);
			}
			if (random.nextBoolean()) {
				this.placeBlock(random, new BlockPos(x - 3, y, z + 3), this.block6);
			}
			if (random.nextBoolean()) {
				this.placeBlock(random, new BlockPos(x + 3, y, z - 3), this.block6);
			}
			if (random.nextBoolean()) {
				this.placeBlock(random, new BlockPos(x - 3, y, z - 3), this.block6);
			}
		} else {
			if (random.nextBoolean()) {
				this.addChestWithCustomItemsLoot(this.world, random, x + 3, y, z + 3, this.items);
			}
			if (random.nextBoolean()) {
				this.addChestWithCustomItemsLoot(this.world, random, x - 3, y, z + 3, this.items);
			}
			if (random.nextBoolean()) {
				this.addChestWithCustomItemsLoot(this.world, random, x + 3, y, z - 3, this.items);
			}
			if (random.nextBoolean()) {
				this.addChestWithCustomItemsLoot(this.world, random, x - 3, y, z - 3, this.items);
			}
		}

		int xr = 0;
		int zr = 0;

		for (int v = 0; v <= 1; v++) {
			xr = random.nextInt(13) - 6;
			zr = random.nextInt(13) - 6;

			if (this.world.isAirBlock(new BlockPos(x + xr, y, z + zr))) {
				this.spawnVillager(this.world, x + xr, y, z + zr,
						this.profession.get(random.nextInt(this.profession.size())));
			}
		}

		xr = random.nextInt(13) - 6;
		zr = random.nextInt(13) - 6;

		if (this.world.isAirBlock(new BlockPos(x + xr, y, z + zr))
				&& this.world.isAirBlock(new BlockPos(x + xr + 1, y, z + zr))
				&& this.world.isAirBlock(new BlockPos(x + xr - 1, y, z + zr))
				&& this.world.isAirBlock(new BlockPos(x + xr, y, z + zr + 1))
				&& this.world.isAirBlock(new BlockPos(x + xr, y, z + zr - 1))) {
			this.spawnGolem(this.world, x + xr, y, z + zr);
		}

		if (this.block2.getBlock() == Blocks.grass) {
			this.platformPlants(this.world, random, x, y, z);
		}
	}

	private void flyHouse1Generate(final Random random, final int x, final int y, final int z) {
		for (int vy = -1; vy <= 5; vy++) {
			for (int vx = -1; vx <= 1; vx++) {
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 2), this.block9);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z - 2), this.block9);
			}
			for (int vz = -1; vz <= 1; vz++) {
				this.placeBlock(random, new BlockPos(x + 2, y + vy, z + vz), this.block9);
				this.placeBlock(random, new BlockPos(x - 2, y + vy, z + vz), this.block9);
			}
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z + 2), this.block10);
			this.placeBlock(random, new BlockPos(x - 2, y + vy, z + 2), this.block10);
			this.placeBlock(random, new BlockPos(x + 2, y + vy, z - 2), this.block10);
			this.placeBlock(random, new BlockPos(x - 2, y + vy, z - 2), this.block10);
		}
		if (!this.world.isAirBlock(new BlockPos(x + 8, y - 1, z))) {
			this.placeBlock(random, new BlockPos(x + 2, y, z), Blocks.oak_door.getDefaultState(), EnumFacing.EAST);
		} else {
			this.placeBlock(random, new BlockPos(x + 2, y + 1, z), this.block3);
		}
		if (!this.world.isAirBlock(new BlockPos(x - 8, y - 1, z))) {
			this.placeBlock(random, new BlockPos(x - 2, y, z), Blocks.oak_door.getDefaultState(), EnumFacing.WEST);
		} else {
			this.placeBlock(random, new BlockPos(x - 2, y + 1, z), this.block3);
		}
		if (!this.world.isAirBlock(new BlockPos(x, y - 1, z + 8))) {
			this.placeBlock(random, new BlockPos(x, y, z + 2), Blocks.oak_door.getDefaultState(), EnumFacing.SOUTH);
		} else {
			this.placeBlock(random, new BlockPos(x, y + 1, z + 2), this.block3);
		}
		if (!this.world.isAirBlock(new BlockPos(x, y - 1, z - 8))) {
			this.placeBlock(random, new BlockPos(x, y, z - 2), Blocks.oak_door.getDefaultState(), EnumFacing.NORTH);
		} else {
			this.placeBlock(random, new BlockPos(x, y + 1, z - 2), this.block3);
		}

		for (int vx = -1; vx <= 1; vx++) {
			for (int vz = -1; vz <= 1; vz++) {
				if (vx == 0 && vz == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y + 4, z + vz), this.block11);
				} else {
					this.placeBlock(random, new BlockPos(x + vx, y + 4, z + vz), this.block9);
				}
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block9);
			}
		}

		this.addChestWithCustomItemsLoot(this.world, random, x, y, z, this.items);

		int xr = 0;
		int zr = 0;

		for (int v = 0; v <= 1; v++) {
			xr = random.nextInt(13) - 6;
			zr = random.nextInt(13) - 6;

			if (this.world.isAirBlock(new BlockPos(x + xr, y, z + zr))) {
				this.spawnVillager(this.world, x + xr, y, z + zr,
						this.profession.get(random.nextInt(this.profession.size())));
			}
		}

		xr = random.nextInt(13) - 6;
		zr = random.nextInt(13) - 6;

		if (this.world.isAirBlock(new BlockPos(x + xr, y, z + zr))
				&& this.world.isAirBlock(new BlockPos(x + xr + 1, y, z + zr))
				&& this.world.isAirBlock(new BlockPos(x + xr - 1, y, z + zr))
				&& this.world.isAirBlock(new BlockPos(x + xr, y, z + zr + 1))
				&& this.world.isAirBlock(new BlockPos(x + xr, y, z + zr - 1))) {
			this.spawnGolem(this.world, x + xr, y, z + zr);
		}

		if (this.block2.getBlock() == Blocks.grass) {
			this.platformPlants(this.world, random, x, y, z);
		}
	}

	private void flyFountainGenerate(final Random random, final int x, final int y, final int z) {
		for (int vx = -4; vx <= 4; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y - 1, z + 4), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y - 1, z - 4), this.block2);
		}
		for (int vz = -3; vz <= 3; vz++) {
			this.placeBlock(random, new BlockPos(x + 4, y - 1, z + vz), this.block2);
			this.placeBlock(random, new BlockPos(x - 4, y - 1, z + vz), this.block2);
		}
		for (int vx = -3; vx <= 3; vx++) {
			for (int vz = -3; vz <= 3; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block5);

				if (random.nextInt(8) == 0) {
					this.placeBlock(random, new BlockPos(x + vx, y, z + vz), Blocks.waterlily.getDefaultState());
				}
			}
		}

		if (this.block2.getBlock() == Blocks.grass) {
			this.platformPlants(this.world, random, x, y, z);
		}
	}

	private void flyFieldGenerate(final Random random, final int x, final int y, final int z) {
		ArrayList<Block> field;

		field = new ArrayList<Block>();
		field.add(Blocks.carrots);
		field.add(Blocks.potatoes);
		field.add(Blocks.wheat);
		field.add(Blocks.pumpkin_stem);
		field.add(Blocks.melon_stem);

		for (int vx = -3; vx <= 3; vx++) {
			for (int vz = -3; vz <= 3; vz++) {
				if (vx != 0) {
					this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), Blocks.farmland.getDefaultState());

					if (this.block4.getBlock() == Blocks.melon_block) {
						if (vx == -3 || vx == 3 || vz == -3 || vz == 3) {
							this.placeBlock(random, new BlockPos(x + vx, y, z + vz),
									field.get(random.nextInt(field.size())).getDefaultState());
						} else {
							this.placeBlock(random, new BlockPos(x + vx, y, z + vz),
									field.get(random.nextInt(3)).getDefaultState());
						}
					} else {
						this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block4);
					}
				} else {
					if (vz == 0) {
						this.placeBlock(random, new BlockPos(x, y - 1, z + vz), Blocks.glowstone.getDefaultState());
					} else {
						this.placeBlock(random, new BlockPos(x, y - 1, z + vz), this.block5);
					}
				}
			}
		}

		if (this.block2.getBlock() == Blocks.grass) {
			this.platformPlants(this.world, random, x, y, z);
		}
	}

	@SuppressWarnings("unused")
	protected void platform(final World world, final Random random, final int x, final int y, final int z) {
		int cx1 = 0;
		int cz1 = 0;
		int cx2 = 0;
		int cz2 = 0;

		for (int vy = -8; vy <= -2; vy++) {
			for (int vx = cx1; vx <= cx2; vx++) {
				for (int vz = cz1; vz <= cz2; vz++) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block1);
				}
			}
			cx1--;
			cz1--;
			cx2++;
			cz2++;
		}

		for (int vx = -7; vx <= 7; vx++) {
			for (int vz = -7; vz <= 7; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);

				if (vx == 7 || vx == -7 || vz == 7 || vz == -7) {
					this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block7);

					if (vx == 7 && vz == 7 || vx == -7 && vz == 7 || vx == 7 && vz == -7 || vx == -7 && vz == -7) {
						this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), this.block8);
					}
				}
			}
		}
	}

	protected void platformPlants(final World world, final Random random, final int x, final int y, final int z) {
		for (int vx = -7; vx <= 7; vx++) {
			for (int vz = -7; vz <= 7; vz++) {
				if (world.getBlockState(new BlockPos(x + vx, y - 1, z + vz)).getBlock() == Blocks.grass
						&& world.isAirBlock(new BlockPos(x + vx, y, z + vz)) && random.nextInt(6) == 0) {
					if (random.nextBoolean()) {
						final EnumType grassType = BlockTallGrass.EnumType
								.values()[random.nextInt(BlockTallGrass.EnumType.values().length - 1) + 1];
						final IBlockState blockGrass = Blocks.tallgrass.getDefaultState()
								.withProperty(BlockTallGrass.TYPE, grassType);
						this.placeBlock(random, new BlockPos(x + vx, y, z + vz), blockGrass);
					} else {
						final EnumFlowerType flowerType = BlockFlower.EnumFlowerType.values()[random
								.nextInt(BlockFlower.EnumFlowerType.values().length)];
						final IBlockState blockFlower = flowerType.getBlockType().getBlock()
								.getStateFromMeta(flowerType.getMeta());
						this.placeBlock(random, new BlockPos(x + vx, y, z + vz), blockFlower);
					}
				}
			}
		}
	}

	private void generateBridge(final World world, final Random random, final int x, final int y, final int z) {
		if (!world.isAirBlock(new BlockPos(x + this.distance, y - 1, z))) {
			final int dx = 8;

			for (int vx = dx - 2; vx <= this.distance - dx + 2; vx++) {
				for (int vz = -2; vz <= 2; vz++) {
					if (world.isAirBlock(new BlockPos(x + vx, y - 1, z + vz))) {
						this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);

						if (vz == -2 || vz == 2) {
							this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block7);

							if (vx % 12 == 0) {
								this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), this.block8);
							}
						}
					}
					if (world.isAirBlock(new BlockPos(x + vx, y - 2, z + vz)) && vz >= -1 && vz <= 1) {
						this.placeBlock(random, new BlockPos(x + vx, y - 2, z + vz), this.block1);
					}
					if (world.isAirBlock(new BlockPos(x + vx, y - 3, z + vz)) && vz == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y - 3, z + vz), this.block1);
					}
				}
			}
			world.setBlockToAir(new BlockPos(x + dx - 1, y, z + 1));
			world.setBlockToAir(new BlockPos(x + dx - 1, y, z));
			world.setBlockToAir(new BlockPos(x + dx - 1, y, z - 1));
			world.setBlockToAir(new BlockPos(x + this.distance - dx + 1, y, z + 1));
			world.setBlockToAir(new BlockPos(x + this.distance - dx + 1, y, z));
			world.setBlockToAir(new BlockPos(x + this.distance - dx + 1, y, z - 1));

			if (this.block2.getBlock() == Blocks.grass) {
				this.placeBridgeXPlants(world, random, x, y, z, dx, this.distance - dx);
			}
		}
		if (!world.isAirBlock(new BlockPos(x - this.distance, y - 1, z))) {
			final int dx = -8;

			for (int vx = (this.distance + dx) * -1 - 2; vx <= dx + 2; vx++) {
				for (int vz = -2; vz <= 2; vz++) {
					if (world.isAirBlock(new BlockPos(x + vx, y - 1, z + vz))) {
						this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);

						if (vz == -2 || vz == 2) {
							this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block7);

							if (vx % 12 == 0) {
								this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), this.block8);
							}
						}
					}
					if (world.isAirBlock(new BlockPos(x + vx, y - 2, z + vz)) && vz >= -1 && vz <= 1) {
						this.placeBlock(random, new BlockPos(x + vx, y - 2, z + vz), this.block1);
					}
					if (world.isAirBlock(new BlockPos(x + vx, y - 3, z + vz)) && vz == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y - 3, z + vz), this.block1);
					}
				}
			}
			world.setBlockToAir(new BlockPos(x + dx + 1, y, z + 1));
			world.setBlockToAir(new BlockPos(x + dx + 1, y, z));
			world.setBlockToAir(new BlockPos(x + dx + 1, y, z - 1));
			world.setBlockToAir(new BlockPos(x - this.distance - dx - 1, y, z + 1));
			world.setBlockToAir(new BlockPos(x - this.distance - dx - 1, y, z));
			world.setBlockToAir(new BlockPos(x - this.distance - dx - 1, y, z - 1));

			if (this.block2.getBlock() == Blocks.grass) {
				this.placeBridgeXPlants(world, random, x, y, z, (this.distance + dx) * -1, dx);
			}
		}
		if (!world.isAirBlock(new BlockPos(x, y - 1, z + this.distance))) {
			final int dz = 8;

			for (int vz = dz - 2; vz <= this.distance - dz + 2; vz++) {
				for (int vx = -2; vx <= 2; vx++) {
					if (world.isAirBlock(new BlockPos(x + vx, y - 1, z + vz))) {
						this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);

						if (vx == -2 || vx == 2) {
							this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block7);

							if (vz % 12 == 0) {
								this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), this.block8);
							}
						}
					}
					if (world.isAirBlock(new BlockPos(x + vx, y - 2, z + vz)) && vx >= -1 && vx <= 1) {
						this.placeBlock(random, new BlockPos(x + vx, y - 2, z + vz), this.block1);
					}
					if (world.isAirBlock(new BlockPos(x + vx, y - 3, z + vz)) && vx == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y - 3, z + vz), this.block1);
					}
				}
			}
			world.setBlockToAir(new BlockPos(x + 1, y, z + dz - 1));
			world.setBlockToAir(new BlockPos(x, y, z + dz - 1));
			world.setBlockToAir(new BlockPos(x - 1, y, z + dz - 1));
			world.setBlockToAir(new BlockPos(x + 1, y, z + this.distance - dz + 1));
			world.setBlockToAir(new BlockPos(x, y, z + this.distance - dz + 1));
			world.setBlockToAir(new BlockPos(x - 1, y, z + this.distance - dz + 1));

			if (this.block2.getBlock() == Blocks.grass) {
				this.placeBridgeZPlants(world, random, x, y, z, dz, this.distance - dz);
			}
		}
		if (!world.isAirBlock(new BlockPos(x, y - 1, z - this.distance))) {
			final int dz = -8;

			for (int vz = (this.distance + dz) * -1 - 2; vz <= dz + 2; vz++) {
				for (int vx = -2; vx <= 2; vx++) {
					if (world.isAirBlock(new BlockPos(x + vx, y - 1, z + vz))) {
						this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);

						if (vx == -2 || vx == 2) {
							this.placeBlock(random, new BlockPos(x + vx, y, z + vz), this.block7);

							if (vz % 12 == 0) {
								this.placeBlock(random, new BlockPos(x + vx, y + 1, z + vz), this.block8);
							}
						}
					}
					if (world.isAirBlock(new BlockPos(x + vx, y - 2, z + vz)) && vx >= -1 && vx <= 1) {
						this.placeBlock(random, new BlockPos(x + vx, y - 2, z + vz), this.block1);
					}
					if (world.isAirBlock(new BlockPos(x + vx, y - 3, z + vz)) && vx == 0) {
						this.placeBlock(random, new BlockPos(x + vx, y - 3, z + vz), this.block1);
					}
				}
			}
			world.setBlockToAir(new BlockPos(x + 1, y, z + dz + 1));
			world.setBlockToAir(new BlockPos(x, y, z + dz + 1));
			world.setBlockToAir(new BlockPos(x - 1, y, z + dz + 1));
			world.setBlockToAir(new BlockPos(x + 1, y, z - this.distance - dz - 1));
			world.setBlockToAir(new BlockPos(x, y, z - this.distance - dz - 1));
			world.setBlockToAir(new BlockPos(x - 1, y, z - this.distance - dz - 1));

			if (this.block2.getBlock() == Blocks.grass) {
				this.placeBridgeZPlants(world, random, x, y, z, (this.distance + dz) * -1, dz);
			}
		}
	}

	private void placeBridgeXPlants(final World world, final Random random, final int x, final int y, final int z,
			final int vx1, final int vx2) {
		for (int vx = vx1; vx <= vx2; vx++) {
			for (int vz = -1; vz <= 1; vz++) {
				if (world.getBlockState(new BlockPos(x + vx, y - 1, z + vz)).getBlock() == Blocks.grass
						&& world.isAirBlock(new BlockPos(x + vx, y, z + vz)) && random.nextInt(6) == 0) {
					if (random.nextBoolean()) {
						final EnumType grassType = BlockTallGrass.EnumType
								.values()[random.nextInt(BlockTallGrass.EnumType.values().length - 1) + 1];
						final IBlockState blockGrass = Blocks.tallgrass.getDefaultState()
								.withProperty(BlockTallGrass.TYPE, grassType);
						this.placeBlock(random, new BlockPos(x + vx, y, z + vz), blockGrass);
					} else {
						final EnumFlowerType flowerType = BlockFlower.EnumFlowerType.values()[random
								.nextInt(BlockFlower.EnumFlowerType.values().length)];
						final IBlockState blockFlower = flowerType.getBlockType().getBlock()
								.getStateFromMeta(flowerType.getMeta());
						this.placeBlock(random, new BlockPos(x + vx, y, z + vz), blockFlower);
					}
				}
			}
		}
	}

	private void placeBridgeZPlants(final World world, final Random random, final int x, final int y, final int z,
			final int vz1, final int vz2) {
		for (int vz = vz1; vz <= vz2; vz++) {
			for (int vx = -1; vx <= 1; vx++) {
				if (world.getBlockState(new BlockPos(x + vx, y - 1, z + vz)).getBlock() == Blocks.grass
						&& world.isAirBlock(new BlockPos(x + vx, y, z + vz)) && random.nextInt(6) == 0) {
					if (random.nextBoolean()) {
						final EnumType grassType = BlockTallGrass.EnumType
								.values()[random.nextInt(BlockTallGrass.EnumType.values().length - 1) + 1];
						final IBlockState blockGrass = Blocks.tallgrass.getDefaultState()
								.withProperty(BlockTallGrass.TYPE, grassType);
						this.placeBlock(random, new BlockPos(x + vx, y, z + vz), blockGrass);
					} else {
						final EnumFlowerType flowerType = BlockFlower.EnumFlowerType.values()[random
								.nextInt(BlockFlower.EnumFlowerType.values().length)];
						final IBlockState blockFlower = flowerType.getBlockType().getBlock()
								.getStateFromMeta(flowerType.getMeta());
						this.placeBlock(random, new BlockPos(x + vx, y, z + vz), blockFlower);
					}
				}
			}
		}
	}

	@SuppressWarnings("unused")
	protected void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockOldLog || state.getBlock() instanceof BlockNewLog) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorNPCFly.plankType.ordinal() % 4));
		} else if (state.getBlock() instanceof BlockPlanks) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorNPCFly.plankType.ordinal()));
		} else if (state.getBlock() instanceof BlockFence) {
			this.world.setBlockState(pos, DungeonGeneratorNPCFly.fenceType);
		} else {
			this.world.setBlockState(pos, state);
		}
	}

	@SuppressWarnings("unused")
	protected void placeBlock(final Random random, final BlockPos pos, final IBlockState state,
			final EnumFacing facing) {
		if (state.getBlock() instanceof BlockDoor) {
			if (DungeonGeneratorNPCFly.doorType != null) {
				ItemDoor.placeDoor(this.world, pos, facing, DungeonGeneratorNPCFly.doorType.getBlock());
			} else {
				ItemDoor.placeDoor(this.world, pos, facing, state.getBlock());
			}
		} else if (state.getBlock() instanceof BlockFenceGate) {
			if (DungeonGeneratorNPCFly.gateType != null) {
				this.world.setBlockState(pos,
						DungeonGeneratorNPCFly.gateType.withProperty(BlockDirectional.FACING, facing));
			} else {
				this.world.setBlockState(pos, state.withProperty(BlockDirectional.FACING, facing));
			}
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
