/*    */ package com.github.pocketkid2.silolaunch;
/*    */ 
/*    */ import java.util.logging.Level;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ 
/*    */ @SuppressWarnings("unused")
public class SiloLaunchPlugin extends org.bukkit.plugin.java.JavaPlugin
/*    */ {
/*  9 */   public static String ammo1 = "TNT";
/* 10 */   public static String ammo2 = "DIAMOND_BLOCK";
/* 11 */   public static String ammo3 = "SULPHUR";
/* 12 */   public static Integer number1 = Integer.valueOf(1);
/* 13 */   public static Integer number2 = Integer.valueOf(2);
/* 14 */   public static Integer number3 = Integer.valueOf(5);
/*    */   
/*    */   public static SiloLaunchPlugin instance;
/*    */   
/*    */   public static org.bukkit.plugin.Plugin plugin;
/* 19 */   public static final java.util.logging.Logger log = java.util.logging.Logger.getLogger("Minecraft");
/*    */   
/*    */   public void onEnable()
/*    */   {
/* 23 */     instance = this;
/*    */     
/* 25 */     getConfig().options().copyDefaults(true);
/* 26 */     saveConfig();
/*    */     
/* 28 */     ammo1 = getConfig().getString("ammo1");
/* 29 */     ammo2 = getConfig().getString("ammo2");
/* 30 */     ammo3 = getConfig().getString("ammo3");
/* 31 */     number1 = Integer.valueOf(getConfig().getInt("ammo1amount"));
/* 32 */     number2 = Integer.valueOf(getConfig().getInt("ammo2amount"));
/* 33 */     number3 = Integer.valueOf(getConfig().getInt("ammo3amount"));
/*    */     
/* 35 */     getServer().getPluginManager().registerEvents(new MortarTower(), this);
/* 36 */     getServer().getPluginManager().registerEvents(new AirDefense(), this);
/* 37 */     getServer().getPluginManager().registerEvents(new DefenseBreak(), this);
/*    */     
/* 39 */     log("SiloLaunch has been enabled!", Level.INFO);
/*    */     
/* 41 */     plugin = this;
/*    */   }
/*    */   
/*    */   public static org.bukkit.plugin.Plugin getPlugin() {
/* 45 */     return plugin;
/*    */   }
/*    */   
/*    */   public void onDisable()
/*    */   {
/* 50 */     log("SiloLaunch has been disabled!", Level.INFO);
/*    */   }
/*    */   
/*    */   public void log(String s, Level l) {
/* 54 */     log.log(l, "[GCp] " + s);
/*    */   }
/*    */ }


/* Location:              C:\Users\keough99\Desktop\dev stuff\SiloLaunch(1).jar!\com\github\pocketkid2\silolaunch\SiloLaunchPlugin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */