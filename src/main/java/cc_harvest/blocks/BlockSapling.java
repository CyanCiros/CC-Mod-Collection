package cc_harvest.blocks;

import java.util.Random;

import cc_harvest.CCHarvest;
import cc_harvest.world.WorldGenFruitLogTree;
import cc_harvest.world.WorldGenFruitPalmTree;
import cc_harvest.world.WorldGenFruitTree;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BlockSapling extends BlockBush implements IGrowable {
	public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);

	public BlockSapling(final String name) {
		this.setDefaultState(this.blockState.getBaseState().withProperty(STAGE, Integer.valueOf(0)));
		this.setUnlocalizedName(name);
		final float f = 0.4F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setTickRandomly(true);
		this.setStepSound(Block.soundTypeGrass);
		this.setCreativeTab(CCHarvest.creativeTab);
	}

	@Override
	public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
		if (!worldIn.isRemote) {
			super.updateTick(worldIn, pos, state, rand);

			if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0) {
				this.grow(worldIn, pos, state, rand);
			}
		}
	}

	public void grow(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
		if (((Integer) state.getValue(STAGE)).intValue() == 0) {
			worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
		} else {
			this.generateTree(worldIn, pos, state, rand);
		}
	}

	@SuppressWarnings("unused")
	public void generateTree(final World world, final BlockPos pos, final IBlockState state, final Random random) {
		if (!TerrainGen.saplingGrowTree(world, random, pos)) {
			return;
		}
		if (state.getBlock() == ModBlocks.appleSapling) {
			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.apple);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, blockPos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (state.getBlock() == ModBlocks.avocadoSapling) {
			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.avocado);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, blockPos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.cherrySapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.cherry);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.chestnutSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.chestnut);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.nutmegSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.nutmeg);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.pearSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.pear);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.plumSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.plum);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.walnutSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.walnut);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.bananaSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.banana);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.coconutSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.coconut);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.dateSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.date);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.dragonfruitSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.dragonfruit);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.papayaSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.papaya);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.almondSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.almond);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.apricotSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.apricot);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.cashewSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.cashew);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.durianSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.durian);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.figSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.fig);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.grapefruitSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.grapefruit);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.lemonSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.lemon);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.limeSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.lime);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.mangoSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.mango);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.oliveSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.olive);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.orangeSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.orange);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.peachSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.peach);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.pecanSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.pecan);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.peppercornSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.peppercorn);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.persimmonSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.persimmon);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.pistachioSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.pistachio);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.pomegranateSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.pomegranate);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.starfruitSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.starfruit);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.vanillaBeanSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.vanillaBean);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.mapleSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitLogTree(true, 5, 1, 1, ModBlocks.maple);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.paperbarkSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitLogTree(true, 5, 3, 3, ModBlocks.paperbark);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
		if (this == ModBlocks.cinnamonSapling) {
			if (!TerrainGen.saplingGrowTree(world, random, pos)) {
				return;
			}
			// final int l = world.getBlockMetadata(x, y, z) & 0x7;

			final WorldGenerator worldGenerator = new WorldGenFruitLogTree(true, 5, 3, 3, ModBlocks.cinnamon);

			final int x1 = 0;
			final int z1 = 0;

			world.setBlockState(pos, Blocks.air.getDefaultState(), 0);

			final BlockPos blockPos = new BlockPos(pos.getX() + x1, pos.getY(), pos.getZ() + z1);

			if (!worldGenerator.generate(world, random, pos)) {
				world.setBlockState(pos, this.getDefaultState(), 0);
			}
		}
	}

	@Override
	public boolean canGrow(final World worldIn, final BlockPos pos, final IBlockState state, final boolean isClient) {
		return true;
	}

	@Override
	public boolean canUseBonemeal(final World worldIn, final Random rand, final BlockPos pos, final IBlockState state) {
		return worldIn.rand.nextFloat() < 0.45D;
	}

	@Override
	public void grow(final World worldIn, final Random rand, final BlockPos pos, final IBlockState state) {
		this.grow(worldIn, pos, state, rand);
	}

	@Override
	public IBlockState getStateFromMeta(final int meta) {
		return this.getDefaultState().withProperty(STAGE, Integer.valueOf((meta & 8) >> 3));
	}

	@Override
	public int getMetaFromState(final IBlockState state) {
		final byte b0 = 0;
		int i = b0;
		i |= ((Integer) state.getValue(STAGE)).intValue() << 3;
		return i;
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { STAGE });
	}
}
