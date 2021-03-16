package fire.me.fireshot;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FireShot extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this,this);


    }
    @EventHandler
    public void OnJump(PlayerJumpEvent e) {
        Player player = e.getPlayer();
        player.setFireTicks(75);
    }
}
