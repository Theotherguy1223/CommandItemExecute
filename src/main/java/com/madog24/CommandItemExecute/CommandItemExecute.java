package com.madog24.CommandItemExecute;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandItemExecute extends JavaPlugin{
	
	private ConfigManager configs;
	
	
	public void onEnable(){
		
		getLogger().info("Enabled successfully.");
		saveDefaultConfig();
		
		Bukkit.getPluginManager().registerEvents( new ClickListener(), this );
		this.configs = new ConfigManager( this.getConfig() );
		
		
	// add getters and setters on configs:	
		
    }
	
}