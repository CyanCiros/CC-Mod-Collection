package cc_dungeon_pack.npctown;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class NPCTownHouse1 extends NPCTownBase {
	public NPCTownHouse1(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		for (int h = 0; h <= 8; h++) {
			final int rx = x - 10 + random.nextInt(3) * 7 + random.nextInt(2);
			final int rz = z - 10 + random.nextInt(3) * 7 + random.nextInt(2);

			if (this.world.getBlockState(new BlockPos(rx, y - 1, rz)) == this.block12
					&& this.world.getBlockState(new BlockPos(rx, y - 1, rz + 3)) == this.block12
					&& this.world.getBlockState(new BlockPos(rx + 3, y - 1, rz)) == this.block12
					&& this.world.getBlockState(new BlockPos(rx + 3, y - 1, rz + 3)) == this.block12
					&& this.world.isAirBlock(new BlockPos(rx - 1, y, rz))
					&& this.world.isAirBlock(new BlockPos(rx, y, rz - 1))
					&& this.world.isAirBlock(new BlockPos(rx + 4, y, rz))
					&& this.world.isAirBlock(new BlockPos(rx, y, rz + 4))) {
				this.generateHouse(random, rx, y, rz);
			}
		}
	}

	protected void generateHouse(final Random random, final int x, final int y, final int z) {
		this.getBlocks(random);

		for (int vy = -1; vy <= 4; vy++) {
			this.placeBlock(random, new BlockPos(x, y + vy, z), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vy, z), this.block1);
			this.placeBlock(random, new BlockPos(x, y + vy, z + 3), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y + vy, z + 3), this.block1);

			for (int vx = 1; vx <= 2; vx++) {
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z), this.block4);
				this.placeBlock(random, new BlockPos(x + vx, y + vy, z + 3), this.block4);
			}
			for (int vz = 1; vz <= 2; vz++) {
				this.placeBlock(random, new BlockPos(x, y + vy, z + vz), this.block4);
				this.placeBlock(random, new BlockPos(x + 3, y + vy, z + vz), this.block4);
			}
		}

		this.placeBlock(random, new BlockPos(x + 1, y - 1, z + 1), this.block4);
		this.placeBlock(random, new BlockPos(x + 1, y - 1, z + 2), this.block4);
		this.placeBlock(random, new BlockPos(x + 2, y - 1, z + 1), this.block4);
		this.placeBlock(random, new BlockPos(x + 2, y - 1, z + 2), this.block4);

		this.placeBlock(random, new BlockPos(x + 1, y + 4, z + 1), this.block7);
		this.placeBlock(random, new BlockPos(x + 1, y + 4, z + 2), this.block7);
		this.placeBlock(random, new BlockPos(x + 2, y + 4, z + 1), this.block7);
		this.placeBlock(random, new BlockPos(x + 2, y + 4, z + 2), this.block7);

		final int d = random.nextInt(4);
		int dx = 0;
		int dz = 0;
		int cx = 0;
		int cz = 0;

		if (d == 0) {
			dz = random.nextInt(2) + 1;
			dx = 0;
			cz = random.nextInt(2) + 1;
			cx = 2;
		} else if (d == 1) {
			dz = 0;
			dx = random.nextInt(2) + 1;
			cz = 2;
			cx = random.nextInt(2) + 1;
		} else if (d == 2) {
			dz = random.nextInt(2) + 1;
			dx = 3;
			cz = random.nextInt(2) + 1;
			cx = 1;
		} else if (d == 3) {
			dz = 3;
			dx = random.nextInt(2) + 1;
			cz = 1;
			cx = random.nextInt(2) + 1;
		}
		this.placeBlock(random, new BlockPos(x + dx, y, z + dz), Blocks.oak_door.getDefaultState(), EnumFacing.NORTH);

		int xv = 0;
		int zv = 0;

		xv = x + random.nextInt(22) - 10;
		zv = z + random.nextInt(22) - 10;

		if (this.world.isAirBlock(new BlockPos(xv, y, zv))) {
			this.spawnVillager(this.world, xv, y, zv, this.profession.get(random.nextInt(this.profession.size())));
		}

		xv = x + random.nextInt(22) - 10;
		zv = z + random.nextInt(22) - 10;

		if (this.world.isAirBlock(new BlockPos(xv, y, zv)) && this.world.isAirBlock(new BlockPos(xv + 1, y, zv))
				&& this.world.isAirBlock(new BlockPos(xv - 1, y, zv))
				&& this.world.isAirBlock(new BlockPos(xv, y, zv + 1))
				&& this.world.isAirBlock(new BlockPos(xv, y, zv - 1)) && random.nextBoolean()) {
			this.spawnGolem(this.world, xv, y, zv);
		}

		this.addChestWithCustomItemsLoot(this.world, random, x + cx, y, z + cz, this.items);
		this.placeBlock(random, new BlockPos(x + cx, y + 2, z + cz), this.block14);
	}
}
