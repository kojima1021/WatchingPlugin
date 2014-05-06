package net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.method;

import java.net.InetSocketAddress;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class API {
    public static void main(String[] args) {
        //掛け算をするメソッドに、8,9の引数を渡す
        int c = kake(8,9);

        //値を表示
        System.out.println(c);
    }
    public static int kake ( int a,int b) {

        //受け取った引数を掛け算して戻す
        return a*b;
    }
    public static void  kick (Player Player,String KickMessage) {
    	Player.kickPlayer(KickMessage);
    }
    public static String Getip (Player Player) {
    	InetSocketAddress ip_a = Player.getAddress();
    	String ip = ip_a.getHostName();
    	return ip;
    }
    public static InetSocketAddress getHost (Player Player){
    	InetSocketAddress ip_a = Player.getAddress();
    	return ip_a;
    }
	public static void Send (Player Player,String message) {
		Player.sendMessage(message);
    }
	public static void  bc (String message) {
		Bukkit.broadcastMessage(message);
	}
	public static void  sethp (Player Player, int HP){
		Player.setHealthScale(HP);
	}
	public static void  kill (Player Player) {
		Player.setHealth(0);
	}
	public static void ItemAllClear (Player Player) {
		Player.getInventory().clear();
		Player.getInventory().setHelmet(null);
		Player.getInventory().setBoots(null);
		Player.getInventory().setChestplate(null);
		Player.getInventory().setLeggings(null);
	}
	public static ItemStack GetHelmet (Player Player) {
		ItemStack Helmet = Player.getInventory().getHelmet();
		return Helmet;
	}
	public static void ServerMessage (String Message1) {
	    String Server = ChatColor.LIGHT_PURPLE + "[Server]";
		String Message = Server + Message1;
		Bukkit.broadcastMessage(Server + Message);
	}
	public static void PermissionMessage (String Message, String Permission) {
		Bukkit.broadcast(Message, Permission);
	}
	public static Player[] GetOnline () {
		Player[] online = Bukkit.getOnlinePlayers();
		return online;
	}
	public static void SetMode (Player player , GameMode gamemode) {
		player.setGameMode(gamemode);
}
	public static void Hide (Player player , Player hide) {
		player.hidePlayer(hide);
	}
	public static void show (Player player , Player show) {
		player.showPlayer(show);
	}
}