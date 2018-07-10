package cc_more.world;

import cc_more.Config;
import cc_more.CCMore;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MinersProvider extends WorldProvider {
	@Override
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(CCMore.MineBiome, 0.0F);
		this.hasNoSky = true;
		this.dimensionId = Config.minersDimension;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3 getFogColor(final float par1, final float par2) {
		final int i = 10518688;
		float f2 = MathHelper.cos(par1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
		if (f2 < 0.0F) {
			f2 = 0.0F;
		}
		if (f2 > 1.0F) {
			f2 = 1.0F;
		}
		float f3 = (i >> 16 & 0xFF) / 255.0F;
		float f4 = (i >> 8 & 0xFF) / 255.0F;
		float f5 = (i & 0xFF) / 255.0F;
		f3 *= f2 * 0.0F + 0.15F;
		f4 *= f2 * 0.0F + 0.15F;
		f5 *= f2 * 0.0F + 0.15F;

		return new Vec3(f3, f4, f5);
	}

	@Override
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderMiners(this.worldObj, this.worldObj.getWorldInfo().isMapFeaturesEnabled(),
				this.worldObj.getSeed());
	}

	@Override
	public boolean isSurfaceWorld() {
		return false;
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean doesXZShowFog(final int par1, final int par2) {
		return false;
	}

	@Override
	public String getDimensionName() {
		return CCMore.MineBiome.biomeName;
	}

	@Override
	public String getInternalNameSuffix() {
		// TODO Auto-generated method stub
		return null;
	}
}
