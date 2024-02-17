package gtis.common.recipe;

import net.minecraft.init.Items;

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
                .output(Items.GOLDEN_APPLE, 1)
                .duration(1)
                .EUt(4)
                .buildAndRegister();
    }
}
