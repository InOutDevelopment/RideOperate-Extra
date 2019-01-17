package net.inoutdevelopment.rideoperate.extra.Show;

import net.inoutdevelopment.rideoperate.extra.Util.ItemFactory;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class ShowControl {

    public ShowControl(Inventory inv) {
        ItemFactory.create("10 sec", "Starts a Countdown for your show", Material.GRAY_SHULKER_BOX, inv, 2);
        ItemFactory.create("1 min", "Starts a Countdown for your show", Material.RED_SHULKER_BOX, inv, 3);
        ItemFactory.create("5 min", "Starts a Countdown for your show", Material.ORANGE_SHULKER_BOX, inv, 4);
        ItemFactory.create("10 min", "Starts a Countdown for your show", Material.LIME_SHULKER_BOX, inv, 5);
        ItemFactory.create("15 min", "Starts a Countdown for your show", Material.GREEN_SHULKER_BOX, inv, 6);
    }
}
