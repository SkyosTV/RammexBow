package fr.skyos.rammexbow;

import fr.skyos.rammexbow.event.ArrowEvent;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class RammexBow extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents((Listener) new ArrowEvent(), this);
        getLogger().info("Le plugin est activé !");

    }

    @Override
    public void onDisable() {
        getLogger().info("Le plugin est désactivé !");

    }
}
