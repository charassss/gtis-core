package gtis.common.recipe;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gtis.common.block.ModBlocks;
import gtis.common.materials.MaterialMetals;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * @author Chara_SS
 */
public class ModRecipes {
    public static void init() {
        shapedRecipes();
    }

    public static void shapedRecipes() {
        ModHandler.addShapedRecipe("test", new ItemStack(ModBlocks.MANA_STEEL_CASING_BLOCK,2),
                "PhP",
                "PFP",
                "PwP",
                'P', new UnificationEntry(OrePrefix.plate, MaterialMetals.manaSteel),
                'F', new UnificationEntry(OrePrefix.gear, MaterialMetals.manaSteel)
        );
    }
}
