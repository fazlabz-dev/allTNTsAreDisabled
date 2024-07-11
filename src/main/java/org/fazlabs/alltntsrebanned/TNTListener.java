package org.fazlabs.alltntsrebanned;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;


public class TNTListener implements Listener {
    @EventHandler
    public void onEntityExplode(EntityExplodeEvent e) {
        if(e.getEntityType() == EntityType.PRIMED_TNT) {
            e.setCancelled(true);
        }
        if(e.getEntityType() == EntityType.MINECART_TNT) {
            e.setCancelled(true);
        }
        if(e.getEntityType() == EntityType.CREEPER) {
            e.setCancelled(true);
        }
    }
}