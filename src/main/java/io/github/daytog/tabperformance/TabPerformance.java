package io.github.daytog.tabperformance;
import java.util.Locale;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
public final class TabPerformance extends JavaPlugin {
 @Override public void onEnable() {
  Bukkit.getScheduler().runTaskTimer(this, () -> {
   double tps = Math.min(20.0, Bukkit.getTPS()[0]);
   double mspt = Bukkit.getAverageTickTime();
   Component footer = Component.text("TPS: ", NamedTextColor.GRAY)
    .append(Component.text(String.format(Locale.ROOT, "%.1f", tps), tps >= 18 ? NamedTextColor.GREEN : tps >= 15 ? NamedTextColor.YELLOW : NamedTextColor.RED))
    .append(Component.text("  |  MSPT: ", NamedTextColor.GRAY))
    .append(Component.text(String.format(Locale.ROOT, "%.1f", mspt), mspt < 40 ? NamedTextColor.GREEN : mspt < 50 ? NamedTextColor.YELLOW : NamedTextColor.RED));
   for (Player player : Bukkit.getOnlinePlayers()) player.sendPlayerListFooter(footer);
  }, 0L, 20L);
 }
 @Override public void onDisable() { for (Player player : Bukkit.getOnlinePlayers()) player.sendPlayerListFooter(Component.empty()); }
}
