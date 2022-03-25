package com.zefir.lobbysystem;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class CustomInventory implements Listener {

    private Plugin plugin = LobbySystem.getPlugin(LobbySystem.class);

    public void newInventory(Player player) {
        byte sizeinv = 9;
        Inventory i = plugin.getServer().createInventory(null, sizeinv, ChatColor.DARK_RED + "Menu");

        String pnick = player.getName();


        ItemStack object1 = new ItemStack(Material.CAKE, 1);
        ItemMeta obmeta1 = object1.getItemMeta();
        obmeta1.setDisplayName(ChatColor.YELLOW + pnick);
        object1.setItemMeta(obmeta1);


        i.setItem(3, object1);
        player.openInventory(i);
    }

}
