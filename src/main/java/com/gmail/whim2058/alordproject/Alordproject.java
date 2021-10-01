package com.gmail.whim2058.alordproject;

import com.gmail.whim2058.alordproject.listeners.WallJump;
import org.bukkit.plugin.java.JavaPlugin;

public final class Alordproject extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new WallJump(), this);

        System.out.println("starting up the plugin...");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("shutting down the plugin...");
    }
}
