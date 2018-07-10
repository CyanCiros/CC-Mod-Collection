package cc_harvest.blocks;

import cc_harvest.CCHarvest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock extends Block {

	public ModBlock(final Material material, final String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCHarvest.creativeTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(1.5F);
	}

	public ModBlock(final Material material, final float light, final String name, final float hardness) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCHarvest.creativeTab);
		this.setLightLevel(light);
		this.setHardness(hardness);
	}

	public ModBlock(final Material material, final String name, final int harvestLevel) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCHarvest.creativeTab);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setHardness(1.5F);
	}

	public ModBlock(final Material material, final String name, final int harvestLevel, final float hardness) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCHarvest.creativeTab);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setHardness(hardness);
	}

	public ModBlock(final Material material, final String name, final float hardness) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCHarvest.creativeTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(hardness);
	}

	public ModBlock(final Material material, final String name, final float hardness, final SoundType sound) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCHarvest.creativeTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(hardness);
		this.setStepSound(sound);
	}

	public ModBlock(final Material material, final String name, final float hardness, final float resistance) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCHarvest.creativeTab);
		this.setResistance(resistance);
		this.setHardness(hardness);
	}
}
