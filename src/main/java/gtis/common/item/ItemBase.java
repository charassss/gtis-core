package gtis.common.item;

import gtis.GTISCore;
import gtis.common.ModCreativeTab;
import gtis.client.IHasModel;
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
