package org.fazlabs.alltntsrebanned;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.entity.EntityExplodeEvent;



public final class AllTNTsreBanned extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new TNTListener(), this);
        getLogger().info("All TNTs are now disabled. Your buildings should be safe.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabling");
    }
}
