package net.inoutdevelopment.rideoperate.extra.Show;

import net.inoutdevelopment.rideoperate.extra.Main;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.io.File;
import java.io.IOException;

public class ControlListener implements Listener {

    @EventHandler
    public void clickonccenter(InventoryClickEvent e) {
        if (e.getClickedInventory() != null) {
            if (e.getCurrentItem() != null) {
                File f = new File(Main.pl.getDataFolder() + "/showfiles", e.getClickedInventory().getTitle() + ".show");
                YamlConfiguration fconfig = YamlConfiguration.loadConfiguration(f);
                if (f.exists()) {
                    e.setCancelled(true);
                    switch (e.getCurrentItem().getType()) {
                        case GRAY_SHULKER_BOX:
                            try {
                                Countdown.tensec(e.getClickedInventory().getTitle());
                            } catch (IOException err) {
                                err.printStackTrace();
                            }
                            break;
                        case RED_SHULKER_BOX:
                            try {
                                Countdown.onemin(e.getClickedInventory().getTitle());
                            } catch (IOException err) {
                                err.printStackTrace();
                            }
                            break;
                        case ORANGE_SHULKER_BOX:
                            try {
                                Countdown.fivemin(e.getClickedInventory().getTitle());
                            } catch (IOException err) {
                                err.printStackTrace();
                            }
                            break;
                        case LIME_SHULKER_BOX:
                            try {
                                Countdown.tenmin(e.getClickedInventory().getTitle());
                            } catch (IOException err) {
                                err.printStackTrace();
                            }
                            break;
                        case GREEN_SHULKER_BOX:
                            try {
                                Countdown.fivteenmin(e.getClickedInventory().getTitle());
                            } catch (IOException err) {
                                err.printStackTrace();
                            }
                            break;
                        default:
                            break;

                    }
                } else {
                    e.setCancelled(false);
                }
            }
        } else {
            e.setCancelled(false);
        }
    }
}
