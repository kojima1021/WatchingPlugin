package net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;


public class ItemPickUp implements Listener {


	@EventHandler
    public void PickUp (PlayerPickupItemEvent e) {
		if (e.getPlayer().getGameMode() == GameMode.CREATIVE) {
			e.setCancelled(true);
		}
	}
}