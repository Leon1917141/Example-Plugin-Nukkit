package de.leontendev.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.form.element.*;
import cn.nukkit.form.window.FormWindowCustom;
import cn.nukkit.form.window.FormWindowSimple;

public class CustomUI extends Command {
    public CustomUI(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
    }

    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
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
