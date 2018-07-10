package cc_more.achievements;

import net.minecraft.item.Item;
import net.minecraft.stats.StatBase;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class AchievementOnCraftEvent {
	public StatBase achievement;
	public Item item;

	public AchievementOnCraftEvent(final StatBase achievementPortalIgniter2, final Item item) {
		this.achievement = achievementPortalIgniter2;
		this.item = item;
	}

	@SubscribeEvent
	public void whenICraftItem(final ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(this.item)) {
			e.player.addStat(this.achievement, 1);
		}
	}
}
