package com.gmail.whim2058.alordproject;

import com.gmail.whim2058.alordproject.listeners.WallJump;
import org.bukkit.plugin.java.JavaPlugin;

public final class Alordproject extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new WallJump(), this);

        System.out.println("starting up WallJump Plugin ver.1.0.1!");
        System.out.println("Developer:Alord2058");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("shutting down WallJump Plugin ver.1.0...");
    }
}
