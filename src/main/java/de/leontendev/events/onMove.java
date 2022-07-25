package de.leontendev.events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;

public class onMove implements Listener {


    @EventHandler
    public void onMove(PlayerMoveEvent event){
        Player player = event.getPlayer();
        player.sendActionBar("ChunkX: " + player.getChunk().getX() + " " + "ChunkZ: " + player.getChunk().getZ());
    }
}
