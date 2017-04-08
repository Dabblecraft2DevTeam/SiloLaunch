/*    */ package com.github.pocketkid2.silolaunch;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ 
/*    */ @SuppressWarnings("unused")
public class AirDefense implements org.bukkit.event.Listener
/*    */ {
/*    */   @org.bukkit.event.EventHandler
/*    */   public void PlayerUse(PlayerInteractEvent e)
/*    */   {
/* 17 */     if (e.isCancelled())
/* 18 */       return;
/* 19 */     if (e.getAction() != org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK)
/* 20 */       return;
/* 21 */     if (e.getClickedBlock().getType() != Material.WOOD_BUTTON) {
/* 22 */       return;
/*    */     }
/* 24 */     Player player1 = e.getPlayer();
/* 25 */     World world1 = player1.getWorld();
/* 26 */     Block block1 = e.getClickedBlock();
/* 27 */     int x1 = block1.getX();
/* 28 */     int y1 = block1.getY();
/* 29 */     int z1 = block1.getZ();
/* 30 */     if ((world1.getBlockAt(x1, y1, z1).getType().equals(Material.WOOD_BUTTON)) && (world1.getBlockAt(x1 + 1, y1, z1).getType().equals(Material.WALL_SIGN)) && (world1.getBlockAt(x1, y1, z1 + 1).getType().equals(Material.IRON_BLOCK)) && (world1.getBlockAt(x1 + 1, y1, z1 + 1).getType().equals(Material.IRON_BLOCK)) && (world1.getBlockAt(x1, y1 - 1, z1 + 1).getType().equals(Material.OBSIDIAN)) && (world1.getBlockAt(x1 + 1, y1 - 1, z1 + 1).getType().equals(Material.OBSIDIAN)) && (world1.getBlockAt(x1, y1 + 1, z1 + 1).getType().equals(Material.IRON_BLOCK)) && (world1.getBlockAt(x1 + 1, y1 + 1, z1 + 1).getType().equals(Material.IRON_BLOCK)) && (world1.getBlockAt(x1, y1 - 1, z1).getType().equals(Material.CHEST)) && (world1.getBlockAt(x1 + 2, y1, z1).getType().equals(Material.OBSIDIAN)) && (world1.getBlockAt(x1 - 1, y1, z1).getType().equals(Material.OBSIDIAN)) && (world1.getBlockAt(x1 + 2, y1 - 1, z1).getType().equals(Material.IRON_BLOCK)) && (world1.getBlockAt(x1 - 1, y1 - 1, z1).getType().equals(Material.IRON_BLOCK)) && (world1.getBlockAt(x1 + 2, y1 + 1, z1).getType().equals(Material.IRON_FENCE)) && (world1.getBlockAt(x1 + 2, y1 + 2, z1).getType().equals(Material.IRON_FENCE)) && (world1.getBlockAt(x1 + 2, y1 + 3, z1).getType().equals(Material.IRON_FENCE)))
/*    */     {
/* 32 */       if (SiloLaunchPlugin.instance.getConfig().get("Defenses." + block1.getLocation().getBlockX()) != null) {
/* 33 */         player1.sendMessage(ChatColor.RED + "Please shift Pod either 1 block to the left or right!");
/* 34 */         return;
/*    */       }
/* 36 */       if (SiloLaunchPlugin.instance.getConfig().get("Defenses." + block1.getLocation().getBlockX()) == null)
/* 37 */         player1.sendMessage(ChatColor.YELLOW + "AA Pod creation was successful!");
/* 38 */       SiloLaunchPlugin.instance.getConfig().set("Defenses." + block1.getLocation().getBlockX(), Integer.valueOf(block1.getLocation().getBlockZ()));
/* 39 */       SiloLaunchPlugin.instance.saveConfig();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\keough99\Desktop\dev stuff\SiloLaunch(1).jar!\com\github\pocketkid2\silolaunch\AirDefense.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */