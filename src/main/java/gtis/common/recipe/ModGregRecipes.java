package gtis.common.recipe;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gtis.common.materials.MaterialFluids.*;
import static gtis.common.materials.MaterialMetals.*;
import static gtis.common.recipe.ModRecipeMaps.*;

/**
 * @author Chara_SS
 */
public class ModGregRecipes {
    public static void init() {
        steamTestRecipes();
        chemicalReactorRecipes();
    }

    public static void steamTestRecipes() {
        STEAM_TEST_RECIPE.recipeBuilder()
                .input(Items.APPLE, 1)
                .chancedOutput(Items.GOLDEN_APPLE.getDefaultInstance(), 5000,0)
                .chancedOutput(Items.GOLD_INGOT.getDefaultInstance(), 5000, 0)
                .duration(10)
                .EUt(VA[LV])
                .buildAndRegister();
    }
    public static void chemicalReactorRecipes(){
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .input(OrePrefix.block,Steel)
                .fluidInputs(mana.getFluid(54))
                .output(OrePrefix.block,manaSteel)
                .duration(900)
                .EUt(VA[MV])
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .input(OrePrefix.ingot,Steel)
                .fluidInputs(mana.getFluid(6))
                .output(OrePrefix.ingot,manaSteel)
                .duration(100)
                .EUt(VA[MV])
                .buildAndRegister();
    }

}

