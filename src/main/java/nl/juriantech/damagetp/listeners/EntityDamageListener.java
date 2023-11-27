package nl.juriantech.damagetp.listeners;

import nl.juriantech.damagetp.utils.TeleportUtils;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class EntityDamageListener implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();

            player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 1));
            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));

            Location randomLocation = TeleportUtils.findSafeLocation(player);
            player.teleport(randomLocation);
            player.sendMessage(ChatColor.AQUA + "Woosh!" + ChatColor.YELLOW + "You are teleported to a random location because you got damage!" + ChatColor.RED + "Survive!");
        }
    }
}
