package com.jessepm123.chatfilter;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.jessepm123.chatfilter.PlayerChat;

/**
 * Core - Main class for ChatFilter
 * 
 * @author Jesse M.
 * @version 0.1
 */

public class Core extends JavaPlugin {

	public void onEnable() {
		// Read plugin.yml
		PluginDescriptionFile pdf = getDescription();

		// Create console logger
		Logger logger = getLogger();

		// Register everything
		registerEvents();
		registerConfig();

		// Custom success message
		logger.info(pdf.getName() + " v" + pdf.getVersion() + " is enabled");
	}

	public void onDisable() {
		// Read plugin.yml
		PluginDescriptionFile pdf = getDescription();

		// Create console logger
		Logger logger = getLogger();

		// Custom success message
		logger.info(pdf.getName() + " v" + pdf.getVersion() + " is disabled");
	}

	public void registerEvents() {
		// Gets plugin manager
		PluginManager pm = getServer().getPluginManager();
		// Bans the breaking of the block "gravel"
		pm.registerEvents(new PlayerChat(), this);
		// Events on player join
	}

	private void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}