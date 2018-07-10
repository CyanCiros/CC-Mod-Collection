package cc_more.achievements;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatBase;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

public class AchievementOnMineEvent {
	public StatBase achievement;
	public Item item;

	public AchievementOnMineEvent(final StatBase statBase, final Item item) {
		this.achievement = statBase;
		this.item = item;
	}

	@SubscribeEvent
	public void whenIGetItem(final ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(this.item))) {
			e.player.addStat(this.achievement, 1);
		}
	}
}
