package cc_emerald.blocks;

import cc_emerald.CCEmerald;
import net.minecraft.block.BlockFire;

public class ModFire extends BlockFire {
	public ModFire(final String name, final float light) {
		super();
		this.setUnlocalizedName(name);
		this.setLightLevel(light);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
