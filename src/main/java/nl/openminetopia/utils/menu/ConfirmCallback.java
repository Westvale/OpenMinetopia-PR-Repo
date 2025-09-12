package nl.openminetopia.utils.menu;

import org.bukkit.entity.Player;

public interface ConfirmCallback {

    default void confirm(Player player) {
    }

    default void cancel(Player player) {
        player.closeInventory();
    }
}
