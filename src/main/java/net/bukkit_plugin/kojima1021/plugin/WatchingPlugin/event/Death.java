package net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event;

import net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.method.API;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;


public class Death implements Listener {


	@EventHandler
    public void DeathEvent (PlayerDeathEvent e) {
		if (e.getEntity().getPlayer().getGameMode() == GameMode.CREATIVE) {

		}
		API.SetMode(e.getEntity().getPlayer(), GameMode.CREATIVE);
		Player[] pls = Bukkit.getOnlinePlayers();
		for(int i = 0; i < pls.length; i++)
		{
			Player player = pls[i];
			API.Hide(player, e.getEntity().getPlayer());
			API.Send(e.getEntity().getPlayer(), ChatColor.WHITE + "["+ ChatColor.AQUA+"WatchingPlugin" + ChatColor.WHITE + "]"+ " あなたは死んだため観戦モードになりました。");
	}
}
}