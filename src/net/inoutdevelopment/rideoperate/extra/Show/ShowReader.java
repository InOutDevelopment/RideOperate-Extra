package net.inoutdevelopment.rideoperate.extra.Show;

import net.inoutdevelopment.rideoperate.extra.Main;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class ShowReader {

    public static void create(String name, Player player) throws IOException {
        File attraction = new File(Main.pl.getDataFolder()+"/showfiles","Show-" + name +".show");
        File folder = new File(Main.pl.getDataFolder()+"/showfiles");
        folder.mkdir();
        if (attraction.exists()) {
            player.sendMessage("You're already created this Show.");

        } else {
            attraction.createNewFile();
            YamlConfiguration configuration = YamlConfiguration.loadConfiguration(attraction);
            configuration.set("show.ID", attraction.getFreeSpace() + 1);
            configuration.set("show.Name", name);
            configuration.set("show.Start.command", "say Change me");
            configuration.set("show.iscountdowning", "false");
            player.sendMessage("Created Show");
            configuration.save(attraction);
        }
    }

    public static void delete(String name, Player player) throws IOException {
        File attraction = new File(Main.pl.getDataFolder()+"/showfiles","Show-" + name +".show");
        if (attraction.exists()) {
            attraction.delete();
            player.sendMessage("Removed Show");
        } else {
            player.sendMessage("Show not found");
        }

    }
}
