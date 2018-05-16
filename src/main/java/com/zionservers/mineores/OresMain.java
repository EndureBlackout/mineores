package com.zionservers.mineores;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class OresMain extends JavaPlugin {

	public void onEnable() {

	}

	public void oreRunnable() {
		new BukkitRunnable() {
			public void run() {
				
			}
		}.runTaskLater(this, 1L);
	}
}
