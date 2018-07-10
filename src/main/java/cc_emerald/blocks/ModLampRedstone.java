package cc_emerald.blocks;

import cc_emerald.CCEmerald;
import net.minecraft.block.BlockRedstoneLight;

public class ModLampRedstone extends BlockRedstoneLight {
	public ModLampRedstone() {
		super(false);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModLampRedstone(final String name, final float hardness, final SoundType soundType, final boolean on) {
		super(on);
		this.setUnlocalizedName(name);
		this.setHardness(hardness);
		this.setStepSound(soundType);

		if (!on) {
			this.setCreativeTab(CCEmerald.creativeTab);
		}
	}
}
