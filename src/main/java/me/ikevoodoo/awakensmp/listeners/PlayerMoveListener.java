package me.ikevoodoo.awakensmp.listeners;

import me.ikevoodoo.awakensmp.utils.EliminationUtils;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMoveListener implements Listener {

    @EventHandler
    public void on(PlayerMoveEvent e) {
        Player p = e.getPlayer();

        if (p == null || !EliminationUtils.isEliminated(p.getUniqueId())) {
            return;
        }

        e.setTo(e.getFrom());
        e.setCancelled(true);
    }
}
