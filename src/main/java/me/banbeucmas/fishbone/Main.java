package me.banbeucmas.fishbone;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Banbeucams on 12/25/2017.
 */
public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEating(PlayerItemConsumeEvent e){
        Player player = e.getPlayer();
        ItemStack item = e.getItem();

        if(item.getType() == Material.COOKED_FISH
                || item.getType() == Material.RAW_FISH){
            player.getInventory().addItem(new ItemStack(Material.BONE, 1));
        }
    }
}
