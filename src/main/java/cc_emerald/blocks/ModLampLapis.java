package cc_emerald.blocks;

import cc_emerald.CCEmerald;
import net.minecraft.block.BlockRedstoneLight;

public class ModLampLapis extends BlockRedstoneLight {
	public ModLampLapis() {
		super(false);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModLampLapis(final String name, final float hardness, final SoundType soundType, final boolean on) {
		super(on);
		this.setUnlocalizedName(name);
		this.setHardness(hardness);
		this.setStepSound(soundType);

		if (!on) {
			this.setCreativeTab(CCEmerald.creativeTab);
		}
	}
}
