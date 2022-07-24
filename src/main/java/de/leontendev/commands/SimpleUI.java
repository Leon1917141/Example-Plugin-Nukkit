package de.leontendev.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandParamType;
import cn.nukkit.command.data.CommandParameter;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.element.ElementButtonImageData;
import cn.nukkit.form.window.FormWindowSimple;

public class SimpleUI extends Command {
    public SimpleUI(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
    }

    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            FormWindowSimple ui = new FormWindowSimple("SimpleUI", "Das ist eine SimpleUI!");
            ui.addButton(new ElementButton("Button", new ElementButtonImageData("path", "textures/ui/check")));
            player.showFormWindow(ui);
        }
        return true;
    }
}
