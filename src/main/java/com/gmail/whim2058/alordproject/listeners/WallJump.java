package com.gmail.whim2058.alordproject.listeners;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

public class WallJump implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.getPlayer().setAllowFlight(true);
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event){
        Player player = event.getPlayer();
            player.setAllowFlight(true);
        }

    @EventHandler
    public void onPlayerWallJump(PlayerToggleFlightEvent event) {
        Player player = event.getPlayer();
        if (player.getGameMode() != GameMode.CREATIVE) {
            event.setCancelled(true);

            Block wxblock = player.getWorld().getBlockAt(player.getLocation().subtract(1.05, 0, 0));
            Block nxblock = player.getWorld().getBlockAt(player.getLocation().subtract(0, 0, 1.05));
            Block exblock = player.getWorld().getBlockAt(player.getLocation().subtract(-1.05, 0, 0));
            Block sxblock = player.getWorld().getBlockAt(player.getLocation().subtract(0, 0, -1.05));
            Block yblock = player.getWorld().getBlockAt(player.getLocation().subtract(0, 2, 0));

            double angle = player.getLocation().getYaw();
            double yaw = Utils.normalAbsoluteAngleDegrees(angle);
            double velox = player.getVelocity().getX();
            double veloz = player.getVelocity().getZ();

            if (!yblock.getType().equals(Material.AIR) && !wxblock.getType().equals(Material.AIR)) {
                if (yaw >= 50 && yaw <= 130) {
                    if (velox <= -0.01 && velox >= -1.0 && veloz <= -0.01 && veloz >= -1.0) {
                        Vector vector = player.getLocation().getDirection().multiply(0.5).setX(velox * -4.25).setY(0.64).setZ(veloz * 5.25);
                        player.setVelocity(vector);
                        Location location = player.getLocation().subtract(1,0,0);
                        player.playSound(location, Sound.BLOCK_ANCIENT_DEBRIS_STEP,1,1);
                        player.spawnParticle(Particle.CRIT_MAGIC,location,10);
                    } else if (velox <= -0.01 && velox >= -1.0 && veloz <= 1.0 && veloz >= 0.01) {
                        Vector vector = player.getLocation().getDirection().multiply(0.5).setX(velox * -4.25).setY(0.64).setZ(veloz * 5.25);
                        player.setVelocity(vector);
                        Location location = player.getLocation().subtract(1,0,0);
                        player.playSound(location, Sound.BLOCK_ANCIENT_DEBRIS_STEP,1,1);
                        player.spawnParticle(Particle.CRIT_MAGIC,location,10);
                    }
                }
            } else if (!yblock.getType().equals(Material.AIR) && !nxblock.getType().equals(Material.AIR)) {
                if (yaw >= 140 && yaw <= 220 ) {
                    if (velox <= 1.0 && velox >= 0.01 && veloz <= -0.01 && veloz >= -1.0) {
                        Vector vector = player.getLocation().getDirection().multiply(0.5).setX(velox * 5.25).setY(0.64).setZ(veloz * -4.25);
                        player.setVelocity(vector);
                        Location location = player.getLocation().subtract(0,0,1);
                        player.playSound(location, Sound.BLOCK_ANCIENT_DEBRIS_STEP,1,1);
                        player.spawnParticle(Particle.CRIT_MAGIC,location,10);
                    } else if (velox <= -0.01 && velox >= -1.0 && veloz <= -0.01 && veloz >= -1.0) {
                        Vector vector = player.getLocation().getDirection().multiply(0.5).setX(velox * 5.25).setY(0.64).setZ(veloz * -4.25);
                        player.setVelocity(vector);
                        Location location = player.getLocation().subtract(0,0,1);
                        player.playSound(location, Sound.BLOCK_ANCIENT_DEBRIS_STEP,1,1);
                        player.spawnParticle(Particle.CRIT_MAGIC,location,10);
                    }
                }
            } else if (!yblock.getType().equals(Material.AIR) && !exblock.getType().equals(Material.AIR)) {
                if (yaw >= 230 && yaw <= 310) {
                    if (velox <= 1.0 && velox >= 0.01 && veloz <= 1.0 && veloz >= 0.01) {
                        Vector vector = player.getLocation().getDirection().multiply(0.5).setX(velox * -4.25).setY(0.64).setZ(veloz * 5.25);
                        player.setVelocity(vector);
                        Location location = player.getLocation().subtract(-1,0,0);
                        player.playSound(location, Sound.BLOCK_ANCIENT_DEBRIS_STEP,1,1);
                        player.spawnParticle(Particle.CRIT_MAGIC,location,10);
                    } else if (velox <= 1.0 && velox >= 0.01 && veloz <= -0.01 && veloz >= -1.0) {
                        Vector vector = player.getLocation().getDirection().multiply(0.5).setX(velox * -4.25).setY(0.64).setZ(veloz * 5.25);
                        player.setVelocity(vector);
                        Location location = player.getLocation().subtract(-1,0,0);
                        player.playSound(location, Sound.BLOCK_ANCIENT_DEBRIS_STEP,1,1);
                        player.spawnParticle(Particle.CRIT_MAGIC,location,10);
                    }
                }
            } else if (!yblock.getType().equals(Material.AIR) && !sxblock.getType().equals(Material.AIR)) {
                if (yaw >= 320 && yaw <= 360 || yaw >= 0 && yaw <= 40 ) {
                    if (velox <= -0.01 && velox >= -1.0 && veloz <= 1.0 && veloz >= 0.01) {
                        Vector vector = player.getLocation().getDirection().multiply(0.5).setX(velox * 5.25).setY(0.64).setZ(veloz * -4.25);
                        player.setVelocity(vector);
                        Location location = player.getLocation().subtract(0,0,-1);
                        player.playSound(location, Sound.BLOCK_ANCIENT_DEBRIS_STEP,1,1);
                        player.spawnParticle(Particle.CRIT_MAGIC,location,10);
                    } else if (velox <= 1.0 && velox >= 0.01 && veloz <= 1.0 && veloz >= 0.01) {
                        Vector vector = player.getLocation().getDirection().multiply(0.5).setX(velox * 5.25).setY(0.64).setZ(veloz * -4.25);
                        player.setVelocity(vector);
                        Location location = player.getLocation().subtract(0,0,-1);
                        player.playSound(location, Sound.BLOCK_ANCIENT_DEBRIS_STEP,1,1);
                        player.spawnParticle(Particle.CRIT_MAGIC,location,10);
                    }
                }
            }
        }
    }
}

class Utils {
    /**
     * Normalizes an angle to an absolute angle.
     * The normalized angle will be in the range from 0 to 360, where 360
     * itself is not included.
     *
     * @param angle the angle to normalize
     * @return the normalized angle that will be in the range of [0,360[
     */
    public static double normalAbsoluteAngleDegrees(double angle) {
        return (angle %= 360) >= 0 ? angle : (angle + 360);
    }
}
