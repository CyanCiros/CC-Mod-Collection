package cc_more.world;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SHROOM;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.NETHER_BRIDGE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.NETHER_CAVE;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.QUARTZ;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.FIRE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.GLOWSTONE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.NETHER_LAVA;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.NETHER_LAVA2;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.GeneratorBushFeature;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCavesHell;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.WorldGenFire;
import net.minecraft.world.gen.feature.WorldGenGlowStone1;
import net.minecraft.world.gen.feature.WorldGenGlowStone2;
import net.minecraft.world.gen.feature.WorldGenHellLava;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenNetherBridge;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

public class ChunkProviderMiners implements IChunkProvider {
	private final World worldObj;
	private final boolean field_177466_i;
	private final Random hellRNG;

	private double[] slowsandNoise = new double[256];
	private double[] gravelNoise = new double[256];

	private double[] netherrackExclusivityNoise = new double[256];
	private double[] noiseField;

	private final NoiseGeneratorOctaves netherNoiseGen1;
	private final NoiseGeneratorOctaves netherNoiseGen2;
	private final NoiseGeneratorOctaves netherNoiseGen3;

	private final NoiseGeneratorOctaves slowsandGravelNoiseGen;

	private final NoiseGeneratorOctaves netherrackExculsivityNoiseGen;
	public final NoiseGeneratorOctaves netherNoiseGen6;
	public final NoiseGeneratorOctaves netherNoiseGen7;
	private final WorldGenFire field_177470_t = new WorldGenFire();
	private final WorldGenGlowStone1 field_177469_u = new WorldGenGlowStone1();
	private final WorldGenGlowStone2 field_177468_v = new WorldGenGlowStone2();
	private final WorldGenerator field_177467_w;
	private final WorldGenHellLava field_177473_x;
	private final WorldGenHellLava field_177472_y;
	private final GeneratorBushFeature field_177471_z;
	private final GeneratorBushFeature field_177465_A;
	private final MapGenNetherBridge genNetherBridge;
	private final MapGenBase netherCaveGenerator;
	double[] noiseData1;
	double[] noiseData2;
	double[] noiseData3;
	double[] noiseData4;
	double[] noiseData5;

	public ChunkProviderMiners(final World world, final boolean p_i45637_2_, final long par2) {
		this.field_177467_w = new WorldGenMinable(Blocks.quartz_ore.getDefaultState(), 14,
				BlockHelper.forBlock(Blocks.netherrack));
		this.field_177473_x = new WorldGenHellLava(Blocks.flowing_lava, true);
		this.field_177472_y = new WorldGenHellLava(Blocks.flowing_lava, false);
		this.field_177471_z = new GeneratorBushFeature(Blocks.brown_mushroom);
		this.field_177465_A = new GeneratorBushFeature(Blocks.red_mushroom);
		this.genNetherBridge = (MapGenNetherBridge) TerrainGen.getModdedMapGen(new MapGenNetherBridge(), NETHER_BRIDGE);
		this.netherCaveGenerator = TerrainGen.getModdedMapGen(new MapGenCavesHell(), NETHER_CAVE);
		this.worldObj = world;
		this.field_177466_i = p_i45637_2_;
		this.hellRNG = new Random(par2);

		NoiseGenerator[] noiseGens = { new NoiseGeneratorOctaves(this.hellRNG, 16),
				new NoiseGeneratorOctaves(this.hellRNG, 16), new NoiseGeneratorOctaves(this.hellRNG, 8),
				new NoiseGeneratorOctaves(this.hellRNG, 4), new NoiseGeneratorOctaves(this.hellRNG, 4),
				new NoiseGeneratorOctaves(this.hellRNG, 10), new NoiseGeneratorOctaves(this.hellRNG, 16) };
		noiseGens = TerrainGen.getModdedNoiseGenerators(world, this.hellRNG, noiseGens);
		this.netherNoiseGen1 = (NoiseGeneratorOctaves) noiseGens[0];
		this.netherNoiseGen2 = (NoiseGeneratorOctaves) noiseGens[1];
		this.netherNoiseGen3 = (NoiseGeneratorOctaves) noiseGens[2];
		this.slowsandGravelNoiseGen = (NoiseGeneratorOctaves) noiseGens[3];
		this.netherrackExculsivityNoiseGen = (NoiseGeneratorOctaves) noiseGens[4];
		this.netherNoiseGen6 = (NoiseGeneratorOctaves) noiseGens[5];
		this.netherNoiseGen7 = (NoiseGeneratorOctaves) noiseGens[6];
	}

	public void func_180515_a(final int p_180515_1_, final int p_180515_2_, final ChunkPrimer p_180515_3_) {
		final byte b0 = 4;
		final byte b1 = 32;
		final int k = b0 + 1;
		final byte b2 = 17;
		final int l = b0 + 1;
		this.noiseField = this.initializeNoiseField(this.noiseField, p_180515_1_ * b0, 0, p_180515_2_ * b0, k, b2, l);

		for (int i1 = 0; i1 < b0; ++i1) {
			for (int j1 = 0; j1 < b0; ++j1) {
				for (int k1 = 0; k1 < 16; ++k1) {
					final double d0 = 0.125D;
					double d1 = this.noiseField[((i1 + 0) * l + j1 + 0) * b2 + k1 + 0];
					double d2 = this.noiseField[((i1 + 0) * l + j1 + 1) * b2 + k1 + 0];
					double d3 = this.noiseField[((i1 + 1) * l + j1 + 0) * b2 + k1 + 0];
					double d4 = this.noiseField[((i1 + 1) * l + j1 + 1) * b2 + k1 + 0];
					final double d5 = (this.noiseField[((i1 + 0) * l + j1 + 0) * b2 + k1 + 1] - d1) * d0;
					final double d6 = (this.noiseField[((i1 + 0) * l + j1 + 1) * b2 + k1 + 1] - d2) * d0;
					final double d7 = (this.noiseField[((i1 + 1) * l + j1 + 0) * b2 + k1 + 1] - d3) * d0;
					final double d8 = (this.noiseField[((i1 + 1) * l + j1 + 1) * b2 + k1 + 1] - d4) * d0;

					for (int l1 = 0; l1 < 8; ++l1) {
						final double d9 = 0.25D;
						double d10 = d1;
						double d11 = d2;
						final double d12 = (d3 - d1) * d9;
						final double d13 = (d4 - d2) * d9;

						for (int i2 = 0; i2 < 4; ++i2) {
							final double d14 = 0.25D;
							double d15 = d10;
							final double d16 = (d11 - d10) * d14;

							for (int j2 = 0; j2 < 4; ++j2) {
								IBlockState iblockstate = null;

								if (k1 * 8 + l1 < b1) {
									iblockstate = Blocks.water.getDefaultState();
								}

								if (d15 > 0.0D && d15 < 2.0D) {
									iblockstate = Blocks.netherrack.getDefaultState();
								} else if (d15 > 2.0D && d15 < 2.001D) {
									iblockstate = Blocks.lava.getDefaultState();
								} else if (d15 > 2.001D && d15 < 4.0D) {
									iblockstate = Blocks.grass.getDefaultState();
								} else if (d15 > 4.0D && d15 < 4.5D) {
									iblockstate = Blocks.sand.getDefaultState();
								} else if (d15 > 4.5D) {
									iblockstate = Blocks.stone.getDefaultState();
								}

								final int k2 = i2 + i1 * 4;
								final int l2 = l1 + k1 * 8;
								final int i3 = j2 + j1 * 4;
								p_180515_3_.setBlockState(k2, l2, i3, iblockstate);
								d15 += d16;
							}

							d10 += d12;
							d11 += d13;
						}

						d1 += d5;
						d2 += d6;
						d3 += d7;
						d4 += d8;
					}
				}
			}
		}
	}

	public void func_180516_b(final int p_180516_1_, final int p_180516_2_, final ChunkPrimer p_180516_3_) {
		final ChunkProviderEvent.ReplaceBiomeBlocks event = new ChunkProviderEvent.ReplaceBiomeBlocks(this, p_180516_1_,
				p_180516_2_, p_180516_3_, this.worldObj);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.getResult() == Result.DENY) {
			return;
		}

		final byte b0 = 64;
		final double d0 = 0.03125D;
		this.slowsandNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.slowsandNoise, p_180516_1_ * 16,
				p_180516_2_ * 16, 0, 16, 16, 1, d0, d0, 1.0D);
		this.gravelNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.gravelNoise, p_180516_1_ * 16, 109,
				p_180516_2_ * 16, 16, 1, 16, d0, 1.0D, d0);
		this.netherrackExclusivityNoise = this.netherrackExculsivityNoiseGen.generateNoiseOctaves(
				this.netherrackExclusivityNoise, p_180516_1_ * 16, p_180516_2_ * 16, 0, 16, 16, 1, d0 * 2.0D, d0 * 2.0D,
				d0 * 2.0D);

		for (int k = 0; k < 16; ++k) {
			for (int l = 0; l < 16; ++l) {
				final boolean flag = this.slowsandNoise[k + l * 16] + this.hellRNG.nextDouble() * 0.2D > 0.0D;
				final boolean flag1 = this.gravelNoise[k + l * 16] + this.hellRNG.nextDouble() * 0.2D > 0.0D;
				final int i1 = (int) (this.netherrackExclusivityNoise[k + l * 16] / 3.0D + 3.0D
						+ this.hellRNG.nextDouble() * 0.25D);
				int j1 = -1;
				IBlockState iblockstate = Blocks.stone.getDefaultState();
				IBlockState iblockstate1 = Blocks.grass.getDefaultState();

				for (int k1 = 127; k1 >= 0; --k1) {
					if (k1 < 127 - this.hellRNG.nextInt(5) && k1 > this.hellRNG.nextInt(5)) {
						final IBlockState iblockstate2 = p_180516_3_.getBlockState(l, k1, k);

						if (iblockstate2.getBlock() != null && iblockstate2.getBlock().getMaterial() != Material.air) {
							if (iblockstate2.getBlock() == Blocks.dirt) {
								if (j1 == -1) {
									if (i1 <= 0) {
										iblockstate = null;
										iblockstate1 = Blocks.stone.getDefaultState();
									} else if (k1 >= b0 - 4 && k1 <= b0 + 1) {
										iblockstate = Blocks.cobblestone.getDefaultState();
										iblockstate1 = Blocks.grass.getDefaultState();

										if (flag1) {
											iblockstate = Blocks.gravel.getDefaultState();
											iblockstate1 = Blocks.netherrack.getDefaultState();
										}

										if (flag) {
											iblockstate = Blocks.soul_sand.getDefaultState();
											iblockstate1 = Blocks.soul_sand.getDefaultState();
										}
									}

									if (k1 < b0 && (iblockstate == null
											|| iblockstate.getBlock().getMaterial() == Material.air)) {
										iblockstate = Blocks.lava.getDefaultState();
									}

									j1 = i1;

									if (k1 >= b0 - 1) {
										p_180516_3_.setBlockState(l, k1, k, iblockstate);
									} else {
										p_180516_3_.setBlockState(l, k1, k, iblockstate1);
									}
								} else if (j1 > 0) {
									--j1;
									p_180516_3_.setBlockState(l, k1, k, iblockstate1);
								}
							}
						} else {
							j1 = -1;
						}
					} else {
						// p_180516_3_.setBlockState(l, k1, k,
						// Blocks.bedrock.getDefaultState());
					}
				}
			}
		}
	}

	@Override
	public Chunk provideChunk(final int x, final int z) {
		this.hellRNG.setSeed(x * 341873128712L + z * 132897987541L);
		final ChunkPrimer chunkprimer = new ChunkPrimer();
		this.func_180515_a(x, z, chunkprimer);
		this.func_180516_b(x, z, chunkprimer);
		this.netherCaveGenerator.func_175792_a(this, this.worldObj, x, z, chunkprimer);

		if (this.field_177466_i) {
			this.genNetherBridge.func_175792_a(this, this.worldObj, x, z, chunkprimer);
		}

		final Chunk chunk = new Chunk(this.worldObj, chunkprimer, x, z);
		final BiomeGenBase[] abiomegenbase = this.worldObj.getWorldChunkManager()
				.loadBlockGeneratorData((BiomeGenBase[]) null, x * 16, z * 16, 16, 16);
		final byte[] abyte = chunk.getBiomeArray();

		for (int k = 0; k < abyte.length; ++k) {
			abyte[k] = (byte) abiomegenbase[k].biomeID;
		}

		chunk.resetRelightChecks();
		return chunk;
	}

	private double[] initializeNoiseField(final double[] p1, final int p2, final int p3, final int p4, final int p5,
			final int p6, final int p7) {
		final ChunkProviderEvent.InitNoiseField event = new ChunkProviderEvent.InitNoiseField(this, p1, p2, p3, p4, p5,
				p6, p7);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.getResult() == Result.DENY) {
			return event.noisefield;
		}

		double[] p1n = p1;

		if (p1n == null) {
			p1n = new double[p5 * p6 * p7];
		}

		final double d0 = 684.412D;
		final double d1 = 2053.236D;
		this.noiseData4 = this.netherNoiseGen6.generateNoiseOctaves(this.noiseData4, p2, p3, p4, p5, 1, p7, 1.0D, 0.0D,
				1.0D);
		this.noiseData5 = this.netherNoiseGen7.generateNoiseOctaves(this.noiseData5, p2, p3, p4, p5, 1, p7, 100.0D,
				0.0D, 100.0D);
		this.noiseData1 = this.netherNoiseGen3.generateNoiseOctaves(this.noiseData1, p2, p3, p4, p5, p6, p7, d0 / 80.0D,
				d1 / 60.0D, d0 / 80.0D);
		this.noiseData2 = this.netherNoiseGen1.generateNoiseOctaves(this.noiseData2, p2, p3, p4, p5, p6, p7, d0, d1,
				d0);
		this.noiseData3 = this.netherNoiseGen2.generateNoiseOctaves(this.noiseData3, p2, p3, p4, p5, p6, p7, d0, d1,
				d0);
		int k1 = 0;
		final double[] adouble1 = new double[p6];
		int l1;

		for (l1 = 0; l1 < p6; ++l1) {
			adouble1[l1] = Math.cos(l1 * Math.PI * 6.0D / p6) * 2.0D;
			double d2 = l1;

			if (l1 > p6 / 2) {
				d2 = p6 - 1 - l1;
			}

			if (d2 < 4.0D) {
				d2 = 4.0D - d2;
				adouble1[l1] -= d2 * d2 * d2 * 10.0D;
			}
		}

		for (l1 = 0; l1 < p5; ++l1) {
			for (int j2 = 0; j2 < p7; ++j2) {
				final double d3 = 0.0D;

				for (int i2 = 0; i2 < p6; ++i2) {
					double d4 = 0.0D;
					final double d5 = adouble1[i2];
					final double d6 = this.noiseData2[k1] / 512.0D;
					final double d7 = this.noiseData3[k1] / 512.0D;
					final double d8 = (this.noiseData1[k1] / 10.0D + 1.0D) / 2.0D;

					if (d8 < 0.0D) {
						d4 = d6;
					} else if (d8 > 1.0D) {
						d4 = d7;
					} else {
						d4 = d6 + (d7 - d6) * d8;
					}

					d4 -= d5;
					double d9;

					if (i2 > p6 - 4) {
						d9 = (i2 - (p6 - 4)) / 3.0F;
						d4 = d4 * (1.0D - d9) + -10.0D * d9;
					}

					if (i2 < d3) {
						d9 = (d3 - i2) / 4.0D;
						d9 = MathHelper.clamp_double(d9, 0.0D, 1.0D);
						d4 = d4 * (1.0D - d9) + -10.0D * d9;
					}

					p1n[k1] = d4;
					++k1;
				}
			}
		}

		return p1n;
	}

	@Override
	public boolean chunkExists(final int x, final int z) {
		return true;
	}

	@Override
	public void populate(final IChunkProvider chunkProvider, final int p2, final int p3) {
		BlockFalling.fallInstantly = true;

		MinecraftForge.EVENT_BUS
				.post(new PopulateChunkEvent.Pre(chunkProvider, this.worldObj, this.hellRNG, p2, p3, false));

		final BlockPos blockpos = new BlockPos(p2 * 16, 0, p3 * 16);
		final ChunkCoordIntPair chunkcoordintpair = new ChunkCoordIntPair(p2, p3);
		this.genNetherBridge.func_175794_a(this.worldObj, this.hellRNG, chunkcoordintpair);
		int k;

		boolean doGen = TerrainGen.populate(chunkProvider, this.worldObj, this.hellRNG, p2, p3, false, NETHER_LAVA);
		for (k = 0; doGen && k < 8; ++k) {
			this.field_177472_y.generate(this.worldObj, this.hellRNG, blockpos.add(this.hellRNG.nextInt(16) + 8,
					this.hellRNG.nextInt(120) + 4, this.hellRNG.nextInt(16) + 8));
		}

		doGen = TerrainGen.populate(chunkProvider, this.worldObj, this.hellRNG, p2, p3, false, FIRE);
		for (k = 0; doGen && k < this.hellRNG.nextInt(this.hellRNG.nextInt(10) + 1) + 1; ++k) {
			this.field_177470_t.generate(this.worldObj, this.hellRNG, blockpos.add(this.hellRNG.nextInt(16) + 8,
					this.hellRNG.nextInt(120) + 4, this.hellRNG.nextInt(16) + 8));
		}

		doGen = TerrainGen.populate(chunkProvider, this.worldObj, this.hellRNG, p2, p3, false, GLOWSTONE);
		for (k = 0; doGen && k < this.hellRNG.nextInt(this.hellRNG.nextInt(10) + 1); ++k) {
			this.field_177469_u.generate(this.worldObj, this.hellRNG, blockpos.add(this.hellRNG.nextInt(16) + 8,
					this.hellRNG.nextInt(120) + 4, this.hellRNG.nextInt(16) + 8));
		}

		for (k = 0; doGen && k < 10; ++k) {
			this.field_177468_v.generate(this.worldObj, this.hellRNG, blockpos.add(this.hellRNG.nextInt(16) + 8,
					this.hellRNG.nextInt(128), this.hellRNG.nextInt(16) + 8));
		}

		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(this.worldObj, this.hellRNG, blockpos));

		doGen = TerrainGen.decorate(this.worldObj, this.hellRNG, blockpos, SHROOM);
		if (doGen && this.hellRNG.nextBoolean()) {
			this.field_177471_z.generate(this.worldObj, this.hellRNG, blockpos.add(this.hellRNG.nextInt(16) + 8,
					this.hellRNG.nextInt(128), this.hellRNG.nextInt(16) + 8));
		}

		if (doGen && this.hellRNG.nextBoolean()) {
			this.field_177465_A.generate(this.worldObj, this.hellRNG, blockpos.add(this.hellRNG.nextInt(16) + 8,
					this.hellRNG.nextInt(128), this.hellRNG.nextInt(16) + 8));
		}

		doGen = TerrainGen.generateOre(this.worldObj, this.hellRNG, this.field_177467_w, blockpos, QUARTZ);
		for (k = 0; doGen && k < 16; ++k) {
			this.field_177467_w.generate(this.worldObj, this.hellRNG,
					blockpos.add(this.hellRNG.nextInt(16), this.hellRNG.nextInt(108) + 10, this.hellRNG.nextInt(16)));
		}

		doGen = TerrainGen.populate(chunkProvider, this.worldObj, this.hellRNG, p2, p3, false, NETHER_LAVA2);
		for (k = 0; doGen && k < 16; ++k) {
			this.field_177473_x.generate(this.worldObj, this.hellRNG,
					blockpos.add(this.hellRNG.nextInt(16), this.hellRNG.nextInt(108) + 10, this.hellRNG.nextInt(16)));
		}

		BlockFalling.fallInstantly = false;
	}

	@Override
	public boolean func_177460_a(final IChunkProvider p_177460_1_, final Chunk p_177460_2_, final int p_177460_3_,
			final int p_177460_4_) {
		return false;
	}

	@Override
	public boolean saveChunks(final boolean p_73151_1_, final IProgressUpdate p_73151_2_) {
		return true;
	}

	@Override
	public void saveExtraData() {
	}

	@Override
	public boolean unloadQueuedChunks() {
		return false;
	}

	@Override
	public boolean canSave() {
		return true;
	}

	@Override
	public String makeString() {
		return "HellRandomLevelSource";
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List func_177458_a(final EnumCreatureType p_177458_1_, final BlockPos p_177458_2_) {
		if (p_177458_1_ == EnumCreatureType.MONSTER) {
			if (this.genNetherBridge.func_175795_b(p_177458_2_)) {
				return this.genNetherBridge.getSpawnList();
			}

			if (this.genNetherBridge.func_175796_a(this.worldObj, p_177458_2_)
					&& this.worldObj.getBlockState(p_177458_2_.down()).getBlock() == Blocks.nether_brick) {
				return this.genNetherBridge.getSpawnList();
			}
		}

		final BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(p_177458_2_);
		return biomegenbase.getSpawnableList(p_177458_1_);
	}

	@Override
	public BlockPos getStrongholdGen(final World worldIn, final String p_180513_2_, final BlockPos p_180513_3_) {
		return null;
	}

	@Override
	public int getLoadedChunkCount() {
		return 0;
	}

	@Override
	public void recreateStructures(final Chunk p_180514_1_, final int p_180514_2_, final int p_180514_3_) {
		this.genNetherBridge.func_175792_a(this, this.worldObj, p_180514_2_, p_180514_3_, (ChunkPrimer) null);
	}

	@Override
	public Chunk provideChunk(final BlockPos blockPosIn) {
		return this.provideChunk(blockPosIn.getX() >> 4, blockPosIn.getZ() >> 4);
	}
}
