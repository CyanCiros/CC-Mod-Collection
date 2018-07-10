package cc_emerald.blocks;

import cc_emerald.CCEmerald;
import net.minecraft.block.BlockTorch;

public class ModTorch extends BlockTorch {
	public ModTorch(final String name, final float hardness, final float light, final SoundType soundType) {
		super();
		this.setUnlocalizedName(name);
		this.setHardness(hardness);
		this.setLightLevel(light);
		this.setStepSound(soundType);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
