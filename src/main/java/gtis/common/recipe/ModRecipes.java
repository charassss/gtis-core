package gtis.common.recipe;

import gregtech.api.recipes.ModHandler;
import gtis.common.block.ModBlocks;
import net.minecraft.item.ItemStack;

/**
 * @author Chara_SS
 */
public class ModRecipes {
    public static void init() {
        shapedRecipes();
    }

    private static void shapedRecipes() {
        ModHandler.addShapedRecipe("test", new ItemStack(ModBlocks.MANA_STEEL_CASING_BLOCK),
                "AAA",
                "ABA",
                "AAA",
                'A', "ingotIron",
                'B', new ItemStack(ModBlocks.MANA_STEEL_CASING_BLOCK)
        );
    }
}
