package moreores.moreores.handlers;

import moreores.moreores.MoreOres;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class OreHandler implements Listener {
    public OreHandler(MoreOres plugins) {
        Bukkit.getPluginManager().registerEvents(this, plugins);
    }

    @EventHandler
    public void OnOrePlaced(BlockPlaceEvent event) {
        Block block = event.getBlock();
        if(block.getType() == Material.DIAMOND_ORE) {
            Location blockLoc = block.getLocation().add(3,0,3);
            blockLoc.getBlock().setType(Material.DIAMOND_ORE);

            Location blockLoc2 = block.getLocation().add(3,0,-3);
            blockLoc2.getBlock().setType(Material.DIAMOND_ORE);

            Location blockLoc3 = block.getLocation().add(-3,0,3);
            blockLoc3.getBlock().setType(Material.DIAMOND_ORE);

            Location blockLoc4 = block.getLocation().add(-3,0,-3);
            blockLoc4.getBlock().setType(Material.DIAMOND_ORE);
        }
        if(block.getType() == Material.GOLD_ORE) {
            Location blockLoc = block.getLocation().add(3,0,3);
            blockLoc.getBlock().setType(Material.GOLD_ORE);

            Location blockLoc2 = block.getLocation().add(3,0,-3);
            blockLoc2.getBlock().setType(Material.GOLD_ORE);

            Location blockLoc3 = block.getLocation().add(-3,0,3);
            blockLoc3.getBlock().setType(Material.GOLD_ORE);

            Location blockLoc4 = block.getLocation().add(-3,0,-3);
            blockLoc4.getBlock().setType(Material.GOLD_ORE);
        }
        Bukkit.getLogger().info("Block Placed");
    }

    @EventHandler
    public void OnOreBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        if(block.getType() == Material.DIAMOND_ORE) {
            Location blockLoc = block.getLocation().add(3,0,3);
            if(blockLoc.getBlock().getType().equals(Material.DIAMOND_ORE)) {
                blockLoc.getBlock().setType(Material.AIR);
            }

            Location blockLoc2 = block.getLocation().add(3,0,-3);
            if(blockLoc2.getBlock().getType().equals(Material.DIAMOND_ORE)) {
                blockLoc2.getBlock().setType(Material.AIR);
            }

            Location blockLoc3 = block.getLocation().add(-3,0,3);
            if(blockLoc3.getBlock().getType().equals(Material.DIAMOND_ORE)) {
                blockLoc3.getBlock().setType(Material.AIR);
            }

            Location blockLoc4 = block.getLocation().add(-3,0,-3);
            if(blockLoc4.getBlock().getType().equals(Material.DIAMOND_ORE)) {
                blockLoc4.getBlock().setType(Material.AIR);
            }
        }

        if(block.getType() == Material.GOLD_ORE) {
            Location blockLoc = block.getLocation().add(3,0,3);
            if(blockLoc.getBlock().getType().equals(Material.GOLD_ORE)) {
                blockLoc.getBlock().setType(Material.AIR);
            }

            Location blockLoc2 = block.getLocation().add(3,0,-3);
            if(blockLoc2.getBlock().getType().equals(Material.GOLD_ORE)) {
                blockLoc2.getBlock().setType(Material.AIR);
            }

            Location blockLoc3 = block.getLocation().add(-3,0,3);
            if(blockLoc3.getBlock().getType().equals(Material.GOLD_ORE)) {
                blockLoc3.getBlock().setType(Material.AIR);
            }

            Location blockLoc4 = block.getLocation().add(-3,0,-3);
            if(blockLoc4.getBlock().getType().equals(Material.GOLD_ORE)) {
                blockLoc4.getBlock().setType(Material.AIR);
            }
        }
        Bukkit.getLogger().info("Block Broke");
    }
}
