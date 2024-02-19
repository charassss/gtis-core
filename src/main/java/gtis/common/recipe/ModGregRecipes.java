package gtis.common.recipe;

import net.minecraft.init.Items;

import static gregtech.api.GTValues.*;
import static gtis.common.recipe.ModRecipeMaps.*;

/**
 * @author Chara_SS
 */
public class ModGregRecipes {
    public static void init() {
        steamTestRecipes();
    }

    public static void steamTestRecipes() {
        STEAM_TEST_RECIPE.recipeBuilder()
                .input(Items.APPLE, 1)
                .chancedOutput(Items.GOLDEN_APPLE.getDefaultInstance(), 5000,0)
                .chancedOutput(Items.GOLD_INGOT.getDefaultInstance(), 5000, 0)
                .duration(10)
                .EUt(VA[MAX])
                .buildAndRegister();
    }
}

