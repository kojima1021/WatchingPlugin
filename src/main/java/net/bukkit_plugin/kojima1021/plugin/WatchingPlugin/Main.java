package net.bukkit_plugin.kojima1021.plugin.WatchingPlugin;

import net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event.Click;
import net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event.Damage;
import net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event.Death;
import net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event.Drop;
import net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event.ItemPickUp;
import net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event.Join;
import net.bukkit_plugin.kojima1021.plugin.WatchingPlugin.event.Vehicle;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


/**
 *  WatchingPluginメインクラス
 * @author kojima1021
 */
public class Main extends JavaPlugin implements Listener{
    //インスタンス
    private static Main instance;
    /**
     * メインクラスを取得します
     * @return instance
     */
    public static Main getInstance(){
        return instance;
    }
    //Plugin開始時
    @Override
    public void onEnable() {
        //初期設定完了;
        //リスナー登録
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new Death(), this);
        getServer().getPluginManager().registerEvents(new Click(), this);
        getServer().getPluginManager().registerEvents(new Damage(), this);
        getServer().getPluginManager().registerEvents(new Drop(), this);
        getServer().getPluginManager().registerEvents(new Join(), this);
        getServer().getPluginManager().registerEvents(new ItemPickUp(), this);
        getServer().getPluginManager().registerEvents(new Vehicle(), this);
        //インスタンス設定
        instance = this;
        //Config
        this.saveDefaultConfig();
        if (Main.this.getConfig().getString("enable") == "false") {
            getServer().getPluginManager().disablePlugins();
            getLogger().info("Configを読み取りました。");
		}else if (Main.this.getConfig().getString("enable") == "true"){
	        getLogger().info("Configを読み取りました。");
		}else {
	        getLogger().info("Configを読み取りました。");
			getLogger().info("Configでの設定で間違えてる場所があります");
			getLogger().info("1行目のenableを true か false に設定してください");
			getLogger().info("サーバーを停止します。");
			getServer().shutdown();
		}
    }
    //Pluginun終了時
    @Override
    public void onDisable() {
        if (Main.this.getConfig().getString("enable") != "true") {

        }else {
            getLogger().info("プラグインを正常に終了しました。");
		}
    }
}