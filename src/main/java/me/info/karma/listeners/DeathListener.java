package me.info.karma.listeners;

import me.info.karma.Karma;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.List;
import java.util.Objects;

public class DeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        Player kill = event.getEntity().getKiller();
        if(kill == null) {return;}
        for(String player: Karma.getInstance().getConfig().getStringList("InvinciblePlayerName")){
            if(event.getEntity().getDisplayName().contains(player)){
                kill.setHealth(0);
                Bukkit.broadcastMessage(Objects.requireNonNull(Karma.getInstance().getConfig().getString("KarmaMessage")));

            }

        }

    }
}
