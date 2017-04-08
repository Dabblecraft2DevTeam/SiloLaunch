/*    */ package com.github.pocketkid2.silolaunch;
/*    */ 
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.block.BlockBreakEvent;
/*    */ 
/*    */ @SuppressWarnings("unused")
public class DefenseBreak implements org.bukkit.event.Listener
/*    */ {
/*    */   @org.bukkit.event.EventHandler
/*    */   public void TikaTika(BlockBreakEvent e1)
/*    */   {
/* 15 */     if (e1.isCancelled())
/* 16 */       return;
/* 17 */     if (e1.getBlock().getType() != Material.IRON_BLOCK) {
/* 18 */       return;
/*    */     }
/* 20 */     Player player2 = e1.getPlayer();
/* 21 */     org.bukkit.World world2 = player2.getWorld();
/* 22 */     Block block1 = e1.getBlock();
/* 23 */     int x1 = block1.getX();
/* 24 */     int y1 = block1.getY();
/* 25 */     int z1 = block1.getZ();
/* 26 */     if (world2.getBlockAt(x1, y1, z1 - 1).getType().equals(Material.WOOD_BUTTON))
/*    */     {
/* 28 */       if (SiloLaunchPlugin.instance.getConfig().get("Defenses." + block1.getLocation().getBlockX()) == null)
/* 29 */         return;
/* 30 */       if (SiloLaunchPlugin.instance.getConfig().get("Defenses." + block1.getLocation().getBlockX()) != null)
/* 31 */         player2.sendMessage(org.bukkit.ChatColor.YELLOW + "AA Pod destroyed...");
/* 32 */       SiloLaunchPlugin.instance.getConfig().set("Defenses." + block1.getLocation().getBlockX(), null);
/* 33 */       SiloLaunchPlugin.instance.saveConfig();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\keough99\Desktop\dev stuff\SiloLaunch(1).jar!\com\github\pocketkid2\silolaunch\DefenseBreak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */