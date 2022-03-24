package com.zefir.lobbysystem;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Help implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("Help")){
                Player p = ((Player) sender).getPlayer();
                p.sendTitle(ChatColor.RED + "HELP","команды плагина");
                p.sendMessage("Команды плагина:");
                p.sendMessage("Help - команды плагина");
                p.sendMessage("Reload - обновление конфига");
                return true;
            }
        }
        return false;
    }
}
