package nl.juriantech.damagetp;

import nl.juriantech.damagetp.listeners.EntityDamageListener;
import nl.juriantech.damagetp.utils.TeleportUtils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Damagetp extends JavaPlugin {

    TeleportUtils teleportUtils;
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EntityDamageListener(), this);
        Bukkit.getLogger().severe("The DamageTP plugin loaded!");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        this.teleportUtils = new TeleportUtils(this);
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().severe("The DamageTP plugin is now disabled!");
    }
}
