package com.jessepm123.chatfilter;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * PlayerChat - Class for filtering language on servers
 * 
 * @author Jesse M.
 * @version 0.1
 */

public class PlayerChat implements Listener {

	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		String message = event.getMessage().toLowerCase();

		if (message.contains("fuck")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("shit")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("bitch")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("cunt")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("nigger")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("ass")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("dick")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("vagina")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("sex")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("rape")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains(".")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't advertise on this server");
		}
		if (message.contains("axwound")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("bastard")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("bullshit")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("penis")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("erection")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("boner")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
		if (message.contains("blowjob")){
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "You can't say that swear");
		}
	}
}