package gtis.common.block.casing;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gtis.GTISCore;
import gtis.client.IHasModel;
import gtis.common.ModCreativeTab;
import gtis.common.block.ModBlocks;
import gtis.common.item.ModItems;
import gtis.common.recipe.ModRecipes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.Objects;


/**
 * @author Chara_SS
 */
public class CasingBase extends Block implements IHasModel {

    private final Material gtMaterial;
    private final boolean autoRecipe;

    {
        ModRecipes.CASING_BASES.add(this);
    }

    @SuppressWarnings("unused")
    public CasingBase(String materialName, net.minecraft.block.material.Material vlmaterial, Material gtMaterial) {
        super(vlmaterial);
        setDefaultProperties(materialName);
        this.gtMaterial = gtMaterial;
        this.autoRecipe = true;
    }

    @SuppressWarnings("unused")
    public CasingBase(String materialName, net.minecraft.block.material.Material vlmaterial, Material gtMaterial, boolean autoRecipe) {
        super(vlmaterial);
        setDefaultProperties(materialName);
        this.gtMaterial = gtMaterial;
        this.autoRecipe = autoRecipe;
    }

    public CasingBase(String materialName, Material gtmaterial) {
        super(net.minecraft.block.material.Material.ROCK);
        setDefaultProperties(materialName);
        this.gtMaterial = gtmaterial;
        this.autoRecipe = true;
    }

    @SuppressWarnings("unused")
    public CasingBase(String materialName, Material gtmaterial, boolean autoRecipe) {
        super(net.minecraft.block.material.Material.ROCK);
        setDefaultProperties(materialName);
        this.gtMaterial = gtmaterial;
        this.autoRecipe = autoRecipe;
    }

    private void setDefaultProperties(String materialName) {

        setRegistryName(String.format("%s_metal_casing", materialName));
        setTranslationKey(String.format("metal_casing.%s", materialName));
        setCreativeTab(ModCreativeTab.GTIS_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    public void addRecipe() {
        if (!this.autoRecipe) {
            return;
        }
        ModHandler.addShapedRecipe("test", new ItemStack(this, 2),
                "PhP",
                "PFP",
                "PwP",
                'P', new UnificationEntry(OrePrefix.plate, this.gtMaterial),
                'F', new UnificationEntry(OrePrefix.frameGt, this.gtMaterial)
        );
    }

    @Override
    public void registerModels() {
        GTISCore.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
