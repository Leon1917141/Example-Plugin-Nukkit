package de.leontendev.ui.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.element.ElementButtonImageData;
import cn.nukkit.form.window.FormWindowSimple;

public class CreateSimpleUI extends Command {
    public CreateSimpleUI(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
    }

    //COMMAND: /simpleui
    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            //Create the UI
            FormWindowSimple ui = new FormWindowSimple("SimpleUI", "Content");
                                                          //Image                                      //Path Texturepack
            ui.addButton(new ElementButton("Button", new ElementButtonImageData("path", "textures/ui/check")));
            player.showFormWindow(ui);
        }
        return true;
    }
}
