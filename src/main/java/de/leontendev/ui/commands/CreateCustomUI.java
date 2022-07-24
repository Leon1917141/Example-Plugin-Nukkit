package de.leontendev.ui.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.form.element.*;
import cn.nukkit.form.window.FormWindowCustom;

public class CreateCustomUI extends Command {
    public CreateCustomUI(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
    }

    //COMMAND: /customui
    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            //Create the UI
            FormWindowCustom ui = new FormWindowCustom("CustomUI");
            ui.addElement(new ElementInput("Input"));
            ui.addElement(new ElementSlider("Slider", 1, 10));
            ui.addElement(new ElementDropdown("Dropdown"));
            ui.addElement(new ElementToggle("toggle"));
            player.showFormWindow(ui);
        }
        return true;
    }
}
