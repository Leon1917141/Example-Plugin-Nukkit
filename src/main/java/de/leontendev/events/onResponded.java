package de.leontendev.events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.response.FormResponseSimple;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.level.Sound;

public class onResponded implements Listener {

    @EventHandler
    public void onResponded(PlayerFormRespondedEvent event){
        if (!event.wasClosed()){
            if (event.getWindow() instanceof FormWindowSimple){
                Player player = event.getPlayer();
                FormWindowSimple ui = (FormWindowSimple) event.getWindow();
                FormResponseSimple rui = (FormResponseSimple) event.getResponse();
                if (ui.getTitle().equalsIgnoreCase("SimpleUI")){
                    String button = rui.getClickedButton().getText();
                    if (button.equalsIgnoreCase("Button")){
                        player.sendMessage("Clicked!");
                    }
                }
            }
        }
    }
}
