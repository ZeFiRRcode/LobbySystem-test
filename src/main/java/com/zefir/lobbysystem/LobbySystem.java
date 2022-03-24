package com.zefir.lobbysystem;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;


public final class LobbySystem extends JavaPlugin {
    @Override
    public void onEnable() {
        // запуск плагина


        // создание конфига
        File config = new File(getDataFolder() + File.separator + "config.yml");
        if (!config.exists()) {
            getLogger().info("Create config");
            getConfig().options().copyDefaults(true);
            saveDefaultConfig();
        }

        Bukkit.getPluginManager().registerEvents(new EventEdiror(), this);
        this.getCommand("Help").setExecutor(new Help());
        this.getCommand("Inventory").setExecutor(new Inventory());
        this.getCommand("Config").setExecutor(new Config());
        getLogger().info("Started");


    }

    @Override
    public void onDisable() {
        // выключение плагина
        getLogger().info("Stopped");
    }
}
