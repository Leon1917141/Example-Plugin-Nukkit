package de.leontendev.events;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;

public class onChat implements Listener {

    @EventHandler
    public void onChat(PlayerChatEvent event){
        Player player = event.getPlayer();
        Server.getInstance().broadcastMessage("Example | " + player.getName() + " » " + event.getMessage());
        event.setCancelled(true);
    }
}
