package cc_emerald.blocks;

import cc_emerald.CCEmerald;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock extends Block {
	public ModBlock(final Material material) {
		super(material);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModBlock(final Material material, final String name, final float hardness, final float resistance,
			final float light) {
		super(material);
		this.setUnlocalizedName(name);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(light);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModBlock(final Material material, final String name, final float hardness) {
		this(material, name, hardness, 0, 0);
	}

	public ModBlock(final Material material, final String name, final float hardness, final float resistance) {
		this(material, name, hardness, resistance, 0);
	}
}
