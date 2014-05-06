package net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event;

import net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.method.API;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class Join implements Listener {

	@EventHandler
    public void PJoin(PlayerJoinEvent e){
		if(e.getPlayer().getGameMode() == GameMode.CREATIVE) {
			Player[] pls = Bukkit.getOnlinePlayers();
			for(int i = 0; i < pls.length; i++)
			{
				Player player = pls[i];
	            if(player.getGameMode() == GameMode.CREATIVE) {
					API.Hide(player, e.getPlayer());
					API.Hide(e.getPlayer(), player);
	            }
			}
		}
	}
}