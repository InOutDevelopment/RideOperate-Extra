package net.inoutdevelopment.rideoperate.extra.Command;

import net.inoutdevelopment.rideoperate.extra.Main;
import net.inoutdevelopment.rideoperate.extra.Show.ShowGUI;
import net.inoutdevelopment.rideoperate.extra.Show.ShowReader;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class RideOpExtraCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (strings.length == 0) {
            sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "RideOperate+ Extra" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "Argument not found /rideopextra help");
            return false;
        }
        if (strings[0].equalsIgnoreCase("help")) {
            sender.sendMessage(ChatColor.DARK_PURPLE + "(-=- RideOperate+ Extra -=-)");
            sender.sendMessage(ChatColor.GRAY + "/rideopextra show create (name) - Create a Show");
            sender.sendMessage(ChatColor.GRAY +  "/rideopextra show delete (name) - Delete a Show");
            sender.sendMessage(ChatColor.GRAY + "/rideopextra show control (name) - Control a Show");
            sender.sendMessage(ChatColor.DARK_PURPLE + "(-=- RideOperate+ Extra -=-)");
        }
        if (strings[0].equalsIgnoreCase("show")) {
            if (strings.length == 1) {
                sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "RideOperate+ Extra" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "Argument not found /rideopextra help");
                return false;
            }
            if (strings[1].equalsIgnoreCase("create")) {
                if (strings.length == 3) {
                    try {
                        ShowReader.create(strings[2], (Player) sender);
                    } catch (IOException e) {
                        sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "RideOperate+ Extra" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "Whoops there is a error! " + e);
                    }
                } else {
                    sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "RideOperate+ Extra" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "Wrong usage /rideopextra help");
                }
            }
            if (strings[1].equalsIgnoreCase("delete")) {
                if (strings.length == 3) {
                    try {
                        ShowReader.delete(strings[2], (Player) sender);
                    } catch (IOException e) {
                        sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "RideOperate+ Extra" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "Whoops there is a error! " + e);
                    }
                } else {
                    sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "RideOperate+ Extra" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "Wrong usage /rideopextra help");
                }
            }
            if (strings[1].equalsIgnoreCase("control")) {
                if (strings.length == 3) {
                    File show = new File(Main.pl.getDataFolder() + "/showfiles", "Show-" + strings[2] + ".show");
                    if (show.exists()) {
                        ShowGUI.loadGUI(strings[2], (Player) sender);
                    } else {
                        sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "RideOperate+ Extra" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "Can't find this Show");
                    }
                } else {
                    sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "RideOperate+ Extra" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "Wrong usage /rideopextra help");
                }

            }
        }

        return false;
    }
}
