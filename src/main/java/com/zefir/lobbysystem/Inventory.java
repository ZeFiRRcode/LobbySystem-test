package com.zefir.lobbysystem;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Inventory implements Listener, CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("Inventory")) {
                Player p = (((Player) sender).getPlayer());
                CustomInventory i = new CustomInventory();

                i.newInventory(p);

                return true;
            }
        }
        return false;
    }
}
