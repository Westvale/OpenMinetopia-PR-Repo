package nl.openminetopia.utils.menu;

import dev.triumphteam.gui.builder.item.PaperItemBuilder;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class ConfirmMenu extends Menu{

    public ConfirmMenu(String title, ConfirmCallback confirmCallback) {
        super(title, 1);
        gui.disableAllInteractions();
        gui.setItem(3, PaperItemBuilder.from(Material.GREEN_WOOL)
                .name(Component.text("Bevestig").color(TextColor.color(13, 171, 13))).asGuiItem(event -> confirmCallback.confirm((Player) event.getWhoClicked())));
        gui.setItem(5, PaperItemBuilder.from(Material.RED_WOOL)
                .name(Component.text("Annuleer").color(TextColor.color(180, 0, 17))).asGuiItem(event -> confirmCallback.cancel((Player) event.getWhoClicked())));
    }
}
