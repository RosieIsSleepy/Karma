package me.info.karma;

import me.info.karma.listeners.DeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Karma extends JavaPlugin {
    public static Karma instance;

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new DeathListener(), this);
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static Karma getInstance(){
        return instance;
    }
}
