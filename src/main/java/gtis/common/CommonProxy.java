package gtis.common;

import net.minecraft.item.Item;

/**
 * @author Chara_SS
 */
@SuppressWarnings("unused")
public class CommonProxy {

    public boolean isServer() {
        return true;
    }

    public void registerItemRenderer(Item item, int meta, String id) {

    }
}
