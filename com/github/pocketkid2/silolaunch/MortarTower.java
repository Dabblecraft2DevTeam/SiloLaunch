/*     */ package com.github.pocketkid2.silolaunch;
/*     */ 
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Sound;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.block.Chest;
/*     */ import org.bukkit.block.Sign;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ 
/*     */ @SuppressWarnings("unused")
public class MortarTower implements org.bukkit.event.Listener
/*     */ {
/*     */   @org.bukkit.event.EventHandler
/*     */   public void PlayerUse(PlayerInteractEvent e)
/*     */   {
/*  21 */     if (e.isCancelled())
/*  22 */       return;
/*  23 */     if (e.getAction() != org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK)
/*  24 */       return;
/*  25 */     if (e.getClickedBlock().getType() != Material.STONE_BUTTON) {
/*  26 */       return;
/*     */     }
/*  28 */     final Player player = e.getPlayer();
/*  29 */     final World world = player.getWorld();
/*  30 */     Block block = e.getClickedBlock();
/*  31 */     int x = block.getX();
/*  32 */     int y = block.getY();
/*  33 */     int z = block.getZ();
/*  34 */     if ((world.getBlockAt(x, y, z).getType().equals(Material.STONE_BUTTON)) && (world.getBlockAt(x, y, z + 1).getType().equals(Material.DIAMOND_BLOCK)) && (world.getBlockAt(x, y, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y, z + 3).getType().equals(Material.TNT)) && (world.getBlockAt(x, y, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  35 */       (world.getBlockAt(x, y + 1, z + 1).getType().equals(Material.DIAMOND_BLOCK)) && (world.getBlockAt(x, y + 1, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y + 1, z + 3).getType().equals(Material.TNT)) && (world.getBlockAt(x, y + 1, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 1, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y + 1, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 1, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y + 1, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  36 */       (world.getBlockAt(x, y + 2, z + 1).getType().equals(Material.DIAMOND_BLOCK)) && (world.getBlockAt(x, y + 2, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y + 2, z + 3).getType().equals(Material.TNT)) && (world.getBlockAt(x, y + 2, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 2, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y + 2, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 2, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y + 2, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  37 */       (world.getBlockAt(x, y + 3, z + 1).getType().equals(Material.DIAMOND_BLOCK)) && (world.getBlockAt(x, y + 3, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y + 3, z + 3).getType().equals(Material.TNT)) && (world.getBlockAt(x, y + 3, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 3, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y + 3, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 3, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y + 3, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  38 */       (world.getBlockAt(x, y + 4, z + 1).getType().equals(Material.DIAMOND_BLOCK)) && (world.getBlockAt(x, y + 4, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y + 4, z + 3).getType().equals(Material.TNT)) && (world.getBlockAt(x, y + 4, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 4, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y + 4, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 4, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y + 4, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  39 */       (world.getBlockAt(x, y + 5, z + 1).getType().equals(Material.DIAMOND_BLOCK)) && (world.getBlockAt(x, y + 5, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y + 5, z + 3).getType().equals(Material.TNT)) && (world.getBlockAt(x, y + 5, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 5, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y + 5, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 5, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y + 5, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  40 */       (world.getBlockAt(x, y + 6, z + 1).getType().equals(Material.DIAMOND_BLOCK)) && (world.getBlockAt(x, y + 6, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y + 6, z + 3).getType().equals(Material.TNT)) && (world.getBlockAt(x, y + 6, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 6, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y + 6, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 6, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y + 6, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  41 */       (world.getBlockAt(x, y + 7, z + 1).getType().equals(Material.DIAMOND_BLOCK)) && (world.getBlockAt(x, y + 7, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y + 7, z + 3).getType().equals(Material.TNT)) && (world.getBlockAt(x, y + 7, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 7, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y + 7, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 7, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y + 7, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  42 */       (world.getBlockAt(x, y + 8, z + 1).getType().equals(Material.DIAMOND_BLOCK)) && (world.getBlockAt(x, y + 8, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y + 8, z + 3).getType().equals(Material.TNT)) && (world.getBlockAt(x, y + 8, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 8, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y + 8, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 8, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y + 8, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  43 */       (world.getBlockAt(x, y + 9, z + 1).getType().equals(Material.CHEST)) && (world.getBlockAt(x, y + 9, z + 2).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x, y + 9, z + 3).getType().equals(Material.GLASS)) && (world.getBlockAt(x, y + 9, z + 4).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 9, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x - 1, y + 9, z + 3).getType().equals(Material.IRON_BLOCK)) && (world.getBlockAt(x + 1, y + 9, z + 1).getType().equals(Material.OBSIDIAN)) && (world.getBlockAt(x - 1, y + 9, z + 1).getType().equals(Material.OBSIDIAN)) && 
/*  44 */       (world.getBlockAt(x, y + 1, z).getType().equals(Material.WALL_SIGN))) {
/*  45 */       player.sendMessage(org.bukkit.ChatColor.GOLD + "Silo Integrity Confirmed. Checking ammo.");
/*  46 */       Chest chest = (Chest)world.getBlockAt(x, y + 9, z + 1).getState();
/*  47 */       Sign sign = (Sign)world.getBlockAt(x, y + 1, z).getState();
/*     */       
/*  49 */       org.bukkit.util.Vector vec = new org.bukkit.util.Vector(0, 1, 0);
/*  50 */       Integer xCoor = Integer.valueOf(Integer.parseInt(sign.getLine(0)));
/*  51 */       Integer zCoor = Integer.valueOf(Integer.parseInt(sign.getLine(1)));
/*  52 */       final Block blockBoom = world.getBlockAt(xCoor.intValue(), 250, zCoor.intValue());
/*  53 */       Material material1 = Material.getMaterial(SiloLaunchPlugin.instance.getConfig().getString("ammo1"));
/*  54 */       Material material2 = Material.getMaterial(SiloLaunchPlugin.instance.getConfig().getString("ammo2"));
/*  55 */       Material material3 = Material.getMaterial(SiloLaunchPlugin.instance.getConfig().getString("ammo3"));
/*  56 */       Integer amount1 = Integer.valueOf(SiloLaunchPlugin.instance.getConfig().getInt("ammo1amount"));
/*  57 */       Integer amount2 = Integer.valueOf(SiloLaunchPlugin.instance.getConfig().getInt("ammo2amount"));
/*  58 */       Integer amount3 = Integer.valueOf(SiloLaunchPlugin.instance.getConfig().getInt("ammo3amount"));
/*     */       
/*  60 */       Block firingBlock = world.getBlockAt(x, world.getHighestBlockYAt(x, z + 3), z + 3);
/*     */       
/*  62 */       if (world.getBlockAt(x, y + 9, z + 3).getY() != firingBlock.getY()) {
/*  63 */         player.sendMessage(org.bukkit.ChatColor.RED + "Operation failed. Cannon must not be covered by any blocks on top!");
/*  64 */         return;
/*     */       }
/*  66 */       if ((chest.getInventory().contains(new ItemStack(material1, amount1.intValue()))) && (chest.getInventory().contains(new ItemStack(material2, amount2.intValue()))) && (chest.getInventory().contains(new ItemStack(material3, amount3.intValue())))) {
/*  67 */         player.sendMessage(org.bukkit.ChatColor.GOLD + "Preparing cannon for attack. Checking coordinates.");
/*     */         
/*  69 */         Integer distance1 = Integer.valueOf((int)blockBoom.getLocation().distance(firingBlock.getLocation()));
/*  70 */         player.sendMessage(org.bukkit.ChatColor.BLUE + "Firing projectile at chosen coordinates! Estimated time to impact: " + distance1.intValue() / 10 * 5 / 20 + " seconds.");
/*  71 */         world.spawnEntity(world.getBlockAt(x, y + 10, z + 3).getLocation(), org.bukkit.entity.EntityType.FIREWORK).setVelocity(vec);
/*  72 */         System.out.println("Projectile fired at " + blockBoom.getLocation() + "by" + player.getName());
/*  73 */         world.playSound(sign.getLocation(), Sound.ENTITY_FIREWORK_LARGE_BLAST, 100.0F, -10.0F);
/*  74 */         world.playSound(sign.getLocation(), Sound.BLOCK_FIRE_AMBIENT, 100.0F, -10.0F);
/*  75 */         chest.getInventory().clear();
/*  76 */         world.playSound(sign.getLocation(), Sound.ENTITY_FIREWORK_LAUNCH, 100.0F, -50.0F);
/*  77 */         Block blockHigh = world.getBlockAt(blockBoom.getLocation().getBlockX(), world.getHighestBlockYAt(blockBoom.getLocation().getBlockX(), blockBoom.getLocation().getBlockZ()) + 45, blockBoom.getLocation().getBlockZ());
/*  78 */         for (String key : SiloLaunchPlugin.instance.getConfig().getConfigurationSection("Defenses").getKeys(false)) {
/*  79 */           if ((Math.abs(Math.abs(Integer.parseInt(key)) - Math.abs(blockBoom.getLocation().getBlockX())) <= 12) && (Math.abs(Math.abs(Integer.parseInt(SiloLaunchPlugin.instance.getConfig().getString("Defenses." + key))) - Math.abs(blockBoom.getLocation().getBlockZ())) <= 12) && (world.getBlockAt(Integer.parseInt(key), world.getHighestBlockYAt(Integer.parseInt(key), Integer.parseInt(SiloLaunchPlugin.instance.getConfig().getString("Defenses." + key))), Integer.parseInt(SiloLaunchPlugin.instance.getConfig().getString("Defenses." + key))).getType().equals(Material.CHEST))) {
/*  80 */             Chest chest1 = (Chest)world.getBlockAt(Integer.parseInt(key), world.getHighestBlockYAt(Integer.parseInt(key), Integer.parseInt(SiloLaunchPlugin.instance.getConfig().getString("Defenses." + key))), Integer.parseInt(SiloLaunchPlugin.instance.getConfig().getString("Defenses." + key))).getState();
/*  81 */             if (chest1.getInventory().contains(new ItemStack(Material.OBSIDIAN, 64))) {
/*  82 */               chest1.getInventory().removeItem(new ItemStack[] { new ItemStack(Material.OBSIDIAN, 64) });
/*  83 */               world.playSound(chest1.getLocation(), Sound.BLOCK_PISTON_EXTEND, 100.0F, -50.0F);
/*     */               
/*  85 */               world.getBlockAt(blockBoom.getLocation().getBlockX(), blockHigh.getY(), blockBoom.getLocation().getBlockZ()).setType(Material.GLOWSTONE);
/*  86 */               world.playEffect(chest1.getLocation(), org.bukkit.Effect.SMOKE, 0);
/*  87 */               world.getBlockAt(blockBoom.getLocation().getBlockX() + 1, blockHigh.getY(), blockBoom.getLocation().getBlockZ()).setType(Material.GLASS);
/*     */               
/*  89 */               world.getBlockAt(blockBoom.getLocation().getBlockX() + 1, blockHigh.getY(), blockBoom.getLocation().getBlockZ() + 1).setType(Material.GLASS);
/*  90 */               world.getBlockAt(blockBoom.getLocation().getBlockX() + 1, blockHigh.getY(), blockBoom.getLocation().getBlockZ() - 1).setType(Material.GLASS);
/*  91 */               world.getBlockAt(blockBoom.getLocation().getBlockX() - 1, blockHigh.getY(), blockBoom.getLocation().getBlockZ() + 1).setType(Material.GLASS);
/*  92 */               world.getBlockAt(blockBoom.getLocation().getBlockX() - 1, blockHigh.getY(), blockBoom.getLocation().getBlockZ() - 1).setType(Material.GLASS);
/*     */               
/*  94 */               world.getBlockAt(blockBoom.getLocation().getBlockX() - 1, blockHigh.getY(), blockBoom.getLocation().getBlockZ()).setType(Material.GLASS);
/*  95 */               world.getBlockAt(blockBoom.getLocation().getBlockX(), blockHigh.getY(), blockBoom.getLocation().getBlockZ() + 1).setType(Material.GLASS);
/*  96 */               world.getBlockAt(blockBoom.getLocation().getBlockX(), blockHigh.getY(), blockBoom.getLocation().getBlockZ() - 1).setType(Material.GLASS);
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 101 */         org.bukkit.Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(SiloLaunchPlugin.getPlugin(), new Runnable()
/*     */         {
/*     */           public void run() {
/* 104 */             player.sendMessage("Projectile is at target location.");
/* 105 */             world.spawnEntity(world.getBlockAt(blockBoom.getLocation()).getLocation(), org.bukkit.entity.EntityType.MINECART_TNT);
/* 106 */             world.playSound(world.getBlockAt(world.getBlockAt(blockBoom.getLocation()).getX(), world.getHighestBlockYAt(world.getBlockAt(blockBoom.getLocation()).getZ(), world.getBlockAt(blockBoom.getLocation()).getZ()), world.getBlockAt(blockBoom.getLocation()).getZ()).getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 5.0F, -100.0F);
/*     */           }
/* 108 */         }, distance1.intValue() / 10 * 5L);
/*     */       } else {
/* 110 */         player.sendMessage("Check that the ammo is correct!");
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\keough99\Desktop\dev stuff\SiloLaunch(1).jar!\com\github\pocketkid2\silolaunch\MortarTower.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */