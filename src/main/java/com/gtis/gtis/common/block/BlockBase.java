package com.gtis.gtis.common.block;

import com.gtis.gtis.GTISCore;
import com.gtis.gtis.common.ModCreativeTab;
import com.gtis.gtis.common.item.ModItems;
import com.gtis.gtis.client.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

/**
 * @author Chara_SS
 */
public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTab.GTIS_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public void registerModels() {
        GTISCore.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
