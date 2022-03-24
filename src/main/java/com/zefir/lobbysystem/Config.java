package com.zefir.lobbysystem;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;


public class Config implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("Config")) {

                Player p = ((Player) sender).getPlayer();

                LobbySystem.getPlugin(LobbySystem.class).reloadConfig();

                String rm = LobbySystem.getPlugin(LobbySystem.class).getConfig().getString("message.title1");
                String rm2 = LobbySystem.getPlugin(LobbySystem.class).getConfig().getString("message.title2");

                p.sendTitle(ChatColor.RED + rm, rm2);
            }
        }
        return false;
    }
}
