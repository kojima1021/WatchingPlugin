package net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;


public class Vehicle implements Listener {


	@EventHandler
    public void Vehicle1 (VehicleDamageEvent e) {
		if(e.getAttacker() instanceof Player ){
			Player player = (Player) e.getAttacker();
			if (player.getGameMode() == GameMode.CREATIVE) {
				e.setCancelled(true);
			}
		}
	}
	@EventHandler
    public void Vehicle2 (VehicleEnterEvent e) {
		if(e.getEntered() instanceof Player ){
			Player player = (Player) e.getEntered();
			if (player.getGameMode() == GameMode.CREATIVE) {
				e.setCancelled(true);
			}
		}
	}
}