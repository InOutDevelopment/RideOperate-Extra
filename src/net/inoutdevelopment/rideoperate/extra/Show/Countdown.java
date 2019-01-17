package net.inoutdevelopment.rideoperate.extra.Show;

import net.inoutdevelopment.rideoperate.extra.Main;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.File;
import java.io.IOException;

public class Countdown {

    public static int count = 0;

    public static void tensec(String name) throws IOException {
        File show = new File(Main.pl.getDataFolder() + "/showfiles",  name + ".show");
        YamlConfiguration configuration = YamlConfiguration.loadConfiguration(show);
        if (!configuration.get("show.iscountdowning").equals("true")) {
            count = 10;

            configuration.set("show.iscountdowning", "true");
            configuration.save(show);
            new BukkitRunnable() {
                @Override
                public void run() {
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor.DARK_PURPLE + configuration.get("show.Name").toString() + " is starting in " + count + " seconds."));
                    }
                    if (count < 1) {
                        cancel();
                    }
                }

            }.runTaskTimer(Main.pl, 0L, 0L);
            new BukkitRunnable() {

                @Override
                public void run() {
                    count -= 1;

                    if (count < 1) {
                        configuration.set("show.iscountdowning", "false");
                        try {
                            configuration.save(show);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), configuration.get("show.Start.command").toString());
                        count = 0;
                        cancel();
                    }


                }
            }.runTaskTimer(Main.pl, 0L, 20L);
        }

    }
    public static void onemin(String name) throws IOException {
        File show = new File(Main.pl.getDataFolder() + "/showfiles", name + ".show");
        YamlConfiguration configuration = YamlConfiguration.loadConfiguration(show);
        if (!configuration.get("show.iscountdowning").equals("true")) {
            count = 60;
            configuration.set("show.iscountdowning", "true");
            configuration.save(show);
            new BukkitRunnable() {
                @Override
                public void run() {
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor.DARK_PURPLE + configuration.get("show.Name").toString() + " is starting in " + count + " seconds."));
                    }
                    if (count < 1) {
                        cancel();
                    }
                }

            }.runTaskTimer(Main.pl, 0L, 0L);
            new BukkitRunnable() {

                @Override
                public void run() {
                    count -= 1;

                    if (count < 1) {
                        configuration.set("show.iscountdowning", "false");
                        try {
                            configuration.save(show);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), configuration.get("show.Start.command").toString());
                        count = 0;
                        cancel();
                    }

                }
            }.runTaskTimer(Main.pl, 0L, 20L);
        }

    }
    public static void fivemin(String name) throws IOException {
        File show = new File(Main.pl.getDataFolder() + "/showfiles", name + ".show");
        YamlConfiguration configuration = YamlConfiguration.loadConfiguration(show);
        if (!configuration.get("show.iscountdowning").equals("true")) {
            count = 300;
            configuration.set("show.iscountdowning", "true");
            configuration.save(show);
            new BukkitRunnable() {
                @Override
                public void run() {
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor.DARK_PURPLE + configuration.get("show.Name").toString() + " is starting in " + count + " seconds."));
                    }
                    if (count == 300) {
                        cancel();
                    }
                }

            }.runTaskTimer(Main.pl, 0L, 0L);
            new BukkitRunnable() {

                @Override
                public void run() {
                    count -= 1;

                    if (count < 1) {
                        configuration.set("show.iscountdowning", "false");
                        try {
                            configuration.save(show);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), configuration.get("show.Start.command").toString());
                        count = 0;
                        cancel();
                    }

                }
            }.runTaskTimer(Main.pl, 0L, 20L);
        }

    }
    public static void tenmin(String name) throws IOException {
        File show = new File(Main.pl.getDataFolder() + "/showfiles", name + ".show");
        YamlConfiguration configuration = YamlConfiguration.loadConfiguration(show);
        if (!configuration.get("show.iscountdowning").equals("true")) {
            count = 600;
            configuration.set("show.iscountdowning", "true");
            configuration.save(show);
            new BukkitRunnable() {
                @Override
                public void run() {
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor.DARK_PURPLE + configuration.get("show.Name").toString() + " is starting in " + count + " seconds."));
                    }

                    if (count < 1) {
                        cancel();
                    }
                }

            }.runTaskTimer(Main.pl, 0L, 0L);
            new BukkitRunnable() {

                @Override
                public void run() {
                    count -= 1;

                    if (count < 1) {
                        configuration.set("show.iscountdowning", "false");
                        try {
                            configuration.save(show);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), configuration.get("show.Start.command").toString());
                        count = 0;
                        cancel();
                    }

                }
            }.runTaskTimer(Main.pl, 0L, 20L);
        }

    }
    public static void fivteenmin(String name) throws IOException {
        File show = new File(Main.pl.getDataFolder() + "/showfiles", name + ".show");
        YamlConfiguration configuration = YamlConfiguration.loadConfiguration(show);
        if (!configuration.get("show.iscountdowning").equals("true")) {
            count = 900;
            configuration.set("show.iscountdowning", "true");
            configuration.save(show);
            new BukkitRunnable() {
                @Override
                public void run() {
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor.DARK_PURPLE + configuration.get("show.Name").toString() + " is starting in " + count + " seconds."));
                    }
                    if (count < 1) {
                        cancel();
                    }
                }

            }.runTaskTimer(Main.pl, 0L, 0L);
            new BukkitRunnable() {

                @Override
                public void run() {
                    count -= 1;

                    if (count < 1) {
                        configuration.set("show.iscountdowning", "false");
                        try {
                            configuration.save(show);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), configuration.get("show.Start.command").toString());
                        count = 0;
                        cancel();
                    }

                }
            }.runTaskTimer(Main.pl, 0L, 20L);
        }

    }
}
