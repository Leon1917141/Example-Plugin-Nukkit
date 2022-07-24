package de.leontendev;

import cn.nukkit.plugin.PluginBase;
import de.leontendev.command.NukkitTabCompleter;
import de.leontendev.ui.commands.CreateCustomUI;
import de.leontendev.ui.commands.CreateSimpleUI;
import de.leontendev.ui.events.onResponded;


public class Example extends PluginBase {

    public static Example test;

    @Override
    public void onEnable() {
        test = this;
        registerCommands();
        registerEvents();
    }

    public void registerEvents(){
        getServer().getPluginManager().registerEvents(new onResponded(), this);
    }


    public void registerCommands(){
        getServer().getCommandMap().register("help", new CreateCustomUI("customui", "", "", new String[]{}));
        getServer().getCommandMap().register("help", new CreateSimpleUI("simpleui", "", "", new String[]{}));
        getServer().getCommandMap().register("help", new NukkitTabCompleter("tabcomplete", "", "", new String[]{}));
    }
}
