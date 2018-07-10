package cc_emerald.blocks;

import cc_emerald.CCEmerald;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModLamp extends Block {
	public ModLamp(final Material material) {
		super(material);
		this.setCreativeTab(CCEmerald.creativeTab);
		this.setLightLevel(1.0F);
	}

	public ModLamp(final String name, final float hardness, final SoundType soundType) {
		super(Material.glass);
		this.setUnlocalizedName(name);
		this.setLightLevel(1.0F);
		this.setHardness(hardness);
		this.setStepSound(soundType);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
