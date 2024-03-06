package gtis.common.recipe;

import gregtech.api.recipes.RecipeMaps;
import gregtech.common.items.MetaItems;
import gtis.common.materials.MaterialsMetal;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import static gregtech.api.GTValues.*;
import static gtis.common.materials.MaterialsFluid.*;
import static gtis.common.recipe.ModRecipeMaps.*;

/**
 * @author Chara_SS
 */
public class ModGregRecipes {
    public static void init() {
        steamTestRecipes();
//        chemicalReactorRecipes();
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
//    public static void chemicalReactorRecipes(){
//        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
//                .input(Steel)
//                .fluidInputs(fluidMana.getFluid(54))
//                .output(metalManaSteel)
//                .duration(10)
//                .EUt(VA[MV])
//                .buildAndRegister();
//    }

}

