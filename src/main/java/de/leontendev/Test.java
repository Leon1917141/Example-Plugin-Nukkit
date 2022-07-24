package de.leontendev;

import cn.nukkit.plugin.PluginBase;
import de.leontendev.commands.CustomUI;
import de.leontendev.commands.SimpleUI;
import de.leontendev.events.onResponded;

public class Test extends PluginBase {

    public static Test test;

    @Override
    public void onEnable() {
        test = this;
        getServer().getCommandMap().register("help", new CustomUI("customui", "", "", new String[]{}));
        getServer().getCommandMap().register("help", new SimpleUI("simpleui", "", "", new String[]{}));
        getServer().getPluginManager().registerEvents(new onResponded(), this);
    }
}
