package gtis.common.recipe;

import gregtech.api.recipes.RecipeMaps;
import net.minecraft.init.Items;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.Steel;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static gtis.common.materials.MaterialFluids.mana;
import static gtis.common.materials.MaterialMetals.manaSteel;
import static gtis.common.recipe.ModRecipeMaps.STEAM_TEST_RECIPE;

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
    /*试图增加化学反应釜的合成表，但是不会调用Steel和metalManaSteel
    钢块*1+54mb液态魔力---->魔力钢块*1
    钢锭*1+6mb 液态魔力---->魔力钢锭*1
    */
    public static void chemicalReactorRecipes(){
        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .input(ingot, Steel)
                .fluidInputs(mana.getFluid(54))
                .output(ingot, manaSteel)
                .duration(10)
                .EUt(VA[MV])
                .buildAndRegister();
    }

}

