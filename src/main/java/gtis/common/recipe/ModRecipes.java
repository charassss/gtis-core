package gtis.common.recipe;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.common.metatileentities.multi.MetaTileEntityPrimitiveBlastFurnace;
import gtis.common.block.ModBlocks;
import gtis.common.block.casing.CasingBase;
import gtis.common.materials.MaterialMetals;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import static gregtech.api.unification.material.Materials.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Chara_SS
 */
public class ModRecipes {
    public static final List<CasingBase> CASING_BASES = new ArrayList<>();

    public static void init() {
        recipeRemove();
        shapedRecipes();
    }

    public static void shapedRecipes() {
        CASING_BASES.forEach(CasingBase::addRecipe);
        ModHandler.addShapedRecipe("test", new ItemStack(ModBlocks.MANA_STEEL_CASING_BLOCK,2),
                "PhP",
                "PFP",
                "PwP",
                'P', new UnificationEntry(OrePrefix.plate, MaterialMetals.manaSteel),
                'F', new UnificationEntry(OrePrefix.gear, MaterialMetals.manaSteel)
        );

        ModHandler.addShapedRecipe("bronze_hull", new ItemStack(MetaBlocks.STEAM_CASING,1),
                "BEB",
                "EhE",
                "BEB",
                'B', new UnificationEntry(OrePrefix.plate,Bronze),
                'E', new UnificationEntry(OrePrefix.gearSmall,MaterialMetals.elvenElementium)
        );

        ModHandler.addShapedRecipe("bronze_primitive_blast_furnace", MetaTileEntities.PRIMITIVE_BLAST_FURNACE.getStackForm(),
                "hSC",
                "PBS",
                "sSC",
                'S',new UnificationEntry(OrePrefix.stick,MaterialMetals.elvenElementium),
                'P',new UnificationEntry(OrePrefix.plate,MaterialMetals.terraSteel),
                'C',new UnificationEntry(OrePrefix.screw,MaterialMetals.terraSteel),
                'B',MetaBlocks.METAL_CASING.getItemVariant(BlockMetalCasing.MetalCasingType.PRIMITIVE_BRICKS)
        );
    }
    private static void recipeRemove(){
        ModHandler.removeRecipeByName(new ResourceLocation("gregtech:bronze_hull"));
        ModHandler.removeRecipeByName(new ResourceLocation("gregtech:bronze_primitive_blast_furnace"));
    }
}
