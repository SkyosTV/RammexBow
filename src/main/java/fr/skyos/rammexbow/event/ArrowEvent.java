package fr.skyos.rammexbow.event;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.util.Vector;

public class ArrowEvent implements Listener {

    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent event){

        if(event.getEntity() instanceof Arrow) {
            Arrow arrow = (Arrow) event.getEntity();

            if(arrow.getShooter() instanceof Player) {
                Vector velocity = arrow.getVelocity();
                velocity.setY(velocity.getY() + 5);
                arrow.setVelocity(velocity);

            }
        }
    }
}
