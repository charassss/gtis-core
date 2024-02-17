package com.gtis.gtis.proxy;

import net.minecraft.item.Item;

/**
 * @author Chara_SS
 */
public class ProxyBase {
    public boolean isServer() {
        return false;
    }

    public void registerItemRenderer(Item item, int meta, String id) {}
}
