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
        Inventory i = plugin.getServer().createInventory(null, 9, ChatColor.DARK_RED + "Menu");


        ItemStack object1 = new ItemStack(Material.APPLE, 1);
        ItemMeta obmeta1 = object1.getItemMeta();
        obmeta1.setDisplayName(ChatColor.YELLOW + "TEST");
        object1.setItemMeta(obmeta1);

        ItemStack object2 = new ItemStack(Material.CAKE, 1);
        ItemMeta obmeta2 = object2.getItemMeta();
        obmeta2.setDisplayName(ChatColor.RED + "TEST2");
        object2.setItemMeta(obmeta2);

        i.setItem(3, object1);
        i.setItem(5, object2);
        player.openInventory(i);
    }

}
