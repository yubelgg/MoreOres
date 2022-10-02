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
import java.util.HashSet;

public class OreHandler implements Listener {
    public OreHandler(MoreOres plugins) {
        Bukkit.getPluginManager().registerEvents(this, plugins);
    }

    @EventHandler
    public void OnOrePlaced(BlockPlaceEvent event) {
        HashSet<Material> ores = new HashSet<>();
        ores.add(Material.COAL_ORE);
        ores.add(Material.DEEPSLATE_COAL_ORE);
        ores.add(Material.IRON_ORE);
        ores.add(Material.DEEPSLATE_IRON_ORE);
        ores.add(Material.COPPER_ORE);
        ores.add(Material.DEEPSLATE_COPPER_ORE);
        ores.add(Material.GOLD_ORE);
        ores.add(Material.DEEPSLATE_GOLD_ORE);
        ores.add(Material.REDSTONE_ORE);
        ores.add(Material.DEEPSLATE_REDSTONE_ORE);
        ores.add(Material.EMERALD_ORE);
        ores.add(Material.DEEPSLATE_EMERALD_ORE);
        ores.add(Material.LAPIS_ORE);
        ores.add(Material.DEEPSLATE_LAPIS_ORE);
        ores.add(Material.DIAMOND_ORE);
        ores.add(Material.DEEPSLATE_DIAMOND_ORE);
        ores.add(Material.NETHER_GOLD_ORE);
        ores.add(Material.NETHER_QUARTZ_ORE);

        Block block = event.getBlock();

        if(ores.contains(block.getType())) {
            Location blockLoc = block.getLocation().add(3, 0, 3);
            blockLoc.getBlock().setType(block.getType());

            Location blockLoc2 = block.getLocation().add(3, 0, -3);
            blockLoc2.getBlock().setType(block.getType());

            Location blockLoc3 = block.getLocation().add(-3, 0, 3);
            blockLoc3.getBlock().setType(block.getType());

            Location blockLoc4 = block.getLocation().add(-3, 0, -3);
            blockLoc4.getBlock().setType(block.getType());
        }
    }

    @EventHandler
    public void OnOreBreak(BlockBreakEvent event) {
        HashSet<Material> ores = new HashSet<>();
        ores.add(Material.COAL_ORE);
        ores.add(Material.DEEPSLATE_COAL_ORE);
        ores.add(Material.IRON_ORE);
        ores.add(Material.DEEPSLATE_IRON_ORE);
        ores.add(Material.COPPER_ORE);
        ores.add(Material.DEEPSLATE_COPPER_ORE);
        ores.add(Material.GOLD_ORE);
        ores.add(Material.DEEPSLATE_GOLD_ORE);
        ores.add(Material.REDSTONE_ORE);
        ores.add(Material.DEEPSLATE_REDSTONE_ORE);
        ores.add(Material.EMERALD_ORE);
        ores.add(Material.DEEPSLATE_EMERALD_ORE);
        ores.add(Material.LAPIS_ORE);
        ores.add(Material.DEEPSLATE_LAPIS_ORE);
        ores.add(Material.DIAMOND_ORE);
        ores.add(Material.DEEPSLATE_DIAMOND_ORE);
        ores.add(Material.NETHER_GOLD_ORE);
        ores.add(Material.NETHER_QUARTZ_ORE);

        Block block = event.getBlock();
        if(ores.contains(block.getType())) {
            Location blockLoc = block.getLocation().add(3,0,3);
            if(blockLoc.getBlock().getType().equals(block.getType())) {
                blockLoc.getBlock().setType(Material.AIR);
            }

            Location blockLoc2 = block.getLocation().add(3,0,-3);
            if(blockLoc2.getBlock().getType().equals(block.getType())) {
                blockLoc2.getBlock().setType(Material.AIR);
            }

            Location blockLoc3 = block.getLocation().add(-3,0,3);
            if(blockLoc3.getBlock().getType().equals(block.getType())) {
                blockLoc3.getBlock().setType(Material.AIR);
            }

            Location blockLoc4 = block.getLocation().add(-3,0,-3);
            if(blockLoc4.getBlock().getType().equals(block.getType())) {
                blockLoc4.getBlock().setType(Material.AIR);
            }
        }
    }
}
