package gtis.common.recipe;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gtis.common.block.ModBlocks;
import net.minecraft.item.ItemStack;

/**
 * @author Orirock
 */
public class ModRecipeFactory {
    public static void casingFactory(Material material){
        ModHandler.addShapedRecipe("mana_steel_casing_block", new ItemStack(ModBlocks.MANA_STEEL_CASING_BLOCK,2),
                "PhP",
                "PFP",
                "PwP",
                'P', new UnificationEntry(OrePrefix.plate, material),
                'F', new UnificationEntry(OrePrefix.frameGt, material)
        );
    }
}
