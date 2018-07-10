package cc_cyan_weapons.bows;

import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBow extends ItemBow {
	private final String[] pullingModelNames;

	public ModBow() {
		this.pullingModelNames = new String[3];
	}

	@SideOnly(Side.CLIENT)
	public void registerBowRender(final ItemModelMesher itemModelMesher) {
		final String baseModelName = CCCyanWeapons.MODID + ":" + this.getUnlocalizedName().substring(5);

		ModelBakery.addVariantName(this, new String[] { baseModelName });
		itemModelMesher.register(this, 0, new ModelResourceLocation(baseModelName, "inventory"));

		for (int i = 0; i < 3; i++) {
			final String variantName = baseModelName + "_" + Integer.toString(i);
			this.pullingModelNames[i] = variantName;
			final ModelResourceLocation pullingModel = new ModelResourceLocation(variantName, "inventory");

			ModelBakery.addVariantName(this, new String[] { variantName });
			itemModelMesher.register(this, i + 1, pullingModel);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelResourceLocation getModel(final ItemStack stack, final EntityPlayer player, final int useRemaining) {
		if (useRemaining < 1) {
			return null;
		}
		final double vanillaTimeToFullPull = 18.0D;
		final double usedSoFar = this.getMaxItemUseDuration(stack) - useRemaining;
		final String variantName = this.pullingModelNames[Math
				.min((int) Math.floor(usedSoFar / vanillaTimeToFullPull * 2.0D), 2)];

		return new ModelResourceLocation(variantName, "inventory");
	}
}
