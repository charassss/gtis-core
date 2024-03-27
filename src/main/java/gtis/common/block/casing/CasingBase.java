package gtis.common.block.casing;

import gtis.GTISCore;
import gtis.client.IHasModel;
import gtis.common.ModCreativeTab;
import gtis.common.block.ModBlocks;
import gtis.common.item.ModItems;
import gtis.common.recipe.ModRecipeFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;



/**
 * @author Chara_SS
 */
public class CasingBase extends Block implements IHasModel {

    @SuppressWarnings("unused")
    public CasingBase(String materialName, net.minecraft.block.material.Material vlmaterial, gregtech.api.unification.material.Material gtmaterial) {
        super(vlmaterial);
        ModRecipeFactory.casingFactory(gtmaterial);
        setDefaultProperties(materialName);
    }

    public CasingBase(String materialName ,gregtech.api.unification.material.Material gtmaterial) {
        super(net.minecraft.block.material.Material.ROCK);
        ModRecipeFactory.casingFactory(gtmaterial);
        setDefaultProperties(materialName);
    }


    private void setDefaultProperties(String materialName) {

        setRegistryName(String.format("%s_metal_casing", materialName));
        setTranslationKey(String.format("metal_casing.%s", materialName));
        setCreativeTab(ModCreativeTab.GTIS_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public void registerModels() {
        GTISCore.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
