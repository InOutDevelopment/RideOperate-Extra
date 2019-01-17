package net.inoutdevelopment.rideoperate.extra;

import net.inoutdevelopment.rideoperate.extra.Command.RideOpExtraCommand;
import net.inoutdevelopment.rideoperate.extra.Show.ControlListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Plugin pl;

    @Override
    public void onEnable() {
        pl = this;
        if (Bukkit.getServer().getPluginManager().getPlugin("RideOperate") != null) {
            this.getConfig().options().copyDefaults();
            saveDefaultConfig();
            getCommand("rideopextra").setExecutor(new RideOpExtraCommand());
            Bukkit.getServer().getPluginManager().registerEvents(new ControlListener(), pl);

        } else {
            Bukkit.getLogger().info(ChatColor.RED + "RideOperate Standard is not installed");
        }


    }

    @Override
    public void onDisable() {

    }
}
