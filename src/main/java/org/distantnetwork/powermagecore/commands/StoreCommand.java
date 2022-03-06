package org.distantnetwork.powermagecore.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StoreCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;
        TextComponent link = new TextComponent(String.format("%sClick here to view the shop to buy ranks and support the server!", ChatColor.GOLD));
        link.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://powermage.tebex.io&e&eClick"));
        player.spigot().sendMessage(link);
        return true;
    }
}
