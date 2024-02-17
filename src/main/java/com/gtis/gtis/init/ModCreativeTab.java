package com.gtis.gtis.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chara_SS
 */
public class ModCreativeTab {
    public static final CreativeTabs GTIS_TAB = new CreativeTabs(CreativeTabs.getNextID(), "gtis") {
        @SideOnly(Side.CLIENT)
        @Override
        public @NotNull ItemStack createIcon() {
            return new ItemStack(Items.EMERALD);
        }
    };
}
