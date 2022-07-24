package de.leontendev.command;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandParamType;
import cn.nukkit.command.data.CommandParameter;

public class NukkitTabCompleter extends Command {
    public NukkitTabCompleter(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        //TABCOMPLETE
        //First set the name of the Tabcomplete
        //Then set an new CommandParameter and set the name of the Parameter and then set the type (CommandParamType.TARGET == all players)
        commandParameters.put("tabcomplete", new CommandParameter[]{new CommandParameter("players", CommandParamType.TARGET, false)});
    }

    //COMMAND: /tabcomplete
    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        //Check sender is an player
        if (sender instanceof Player){
            //Cast sender to a player
            Player player = (Player) sender;
            //check args length (Command length)
            if (args.length == 1){
                String arg0 = args[0];
                if (Server.getInstance().getPlayer(arg0) != null){
                    Player target = Server.getInstance().getPlayer(arg0);
                    player.sendMessage("Name: " + target.getName()
                                        + "\nPing: " + target.getPing());
                }
            }
        }
        return true;
    }
}
