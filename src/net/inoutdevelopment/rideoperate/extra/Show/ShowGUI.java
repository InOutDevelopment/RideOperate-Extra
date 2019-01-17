package net.inoutdevelopment.rideoperate.extra.Show;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ShowGUI {

    public static void loadGUI(String name, Player player) {
        Inventory inv = Bukkit.createInventory(null, 9, "Show-" + name);
        new ShowControl(inv);
        player.openInventory(inv);
    }
}
