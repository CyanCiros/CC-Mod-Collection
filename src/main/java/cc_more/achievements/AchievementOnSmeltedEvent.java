package cc_more.achievements;

import net.minecraft.item.Item;
import net.minecraft.stats.StatBase;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;

public class AchievementOnSmeltedEvent {
	public StatBase achievement;
	public Item item;

	public AchievementOnSmeltedEvent(final StatBase statBase, final Item item) {
		this.achievement = statBase;
		this.item = item;
	}

	@SubscribeEvent
	public void whenIGetItem(final ItemSmeltedEvent e) {
		if (e.smelting.getItem() == this.item) {
			e.player.addStat(this.achievement, 1);
		}
	}
}
