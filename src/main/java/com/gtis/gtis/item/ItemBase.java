package com.gtis.gtis.item;

import com.gtis.gtis.GTISCore;
import com.gtis.gtis.init.ModCreativeTab;
import com.gtis.gtis.util.IHasModel;
import net.minecraft.item.Item;

/**
 * @author Chara_SS
 */
public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTab.GTIS_TAB);

        ModItems.ITEMS.add(this);
    }


    @Override
    public void registerModels() {
        GTISCore.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
