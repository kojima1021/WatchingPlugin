package net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class Damage implements Listener {

	@EventHandler
    public void DamageEvent(EntityDamageByEntityEvent e){
		if(e.getDamager() instanceof Player ){
			Player player = (Player) e.getDamager();
			if (player.getGameMode() == GameMode.CREATIVE) {
				e.setCancelled(true);
			}
			}
		}
	}