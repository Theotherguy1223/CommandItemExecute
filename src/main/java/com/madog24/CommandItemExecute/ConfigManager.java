package com.madog24.CommandItemExecute;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {

	
	private FileConfiguration config;
	public ConfigManager( FileConfiguration config ) {
	    super();

	    this.config = config;
	}
	// add getters and setters on config:
	
	private List<Material> materials = new ArrayList<Material>();
	private List<String> command = new ArrayList<String>();
		
	public ConfigManager(){
		
	}
	
	public List<Material> getMaterials() {
		return materials;
	}
	
	public List<String> getCommand() {
		return command;
	}
}
