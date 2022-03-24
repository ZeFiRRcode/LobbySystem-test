package com.zefir.lobbysystem;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class EventEdiror implements Listener {

    @EventHandler
    public void OnJoin(PlayerJoinEvent e){
        // создание скорборда

        Player p = e.getPlayer();

        String text1 = LobbySystem.getPlugin(LobbySystem.class).getConfig().getString("scoreboard.text1");
        String text2 = LobbySystem.getPlugin(LobbySystem.class).getConfig().getString("scoreboard.text2");

        DynamicScoreboard scoreboard = new DynamicScoreboard(ChatColor.RED + "Hello World");
        scoreboard.blankLine(3);
        scoreboard.add(text1, 1);
        scoreboard.add(text2, 2);
        scoreboard.add(p.getName(), 3);
        p.setScoreboard(scoreboard.getScoreboard());
    }

    @EventHandler
    public void InvenClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        ClickType click = e.getClick();
        Inventory open = e.getClickedInventory();
        ItemStack item = e.getCurrentItem();

        if(open.getName().equals(ChatColor.DARK_RED + "Menu")) {
            if(item.equals(null) || !item.hasItemMeta()) {
                return;
            }
        }

    }

}