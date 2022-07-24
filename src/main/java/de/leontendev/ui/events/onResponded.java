package de.leontendev.ui.events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.response.FormResponseSimple;
import cn.nukkit.form.window.FormWindowSimple;

public class onResponded implements Listener {


    //Event when player interact with an Form!
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
