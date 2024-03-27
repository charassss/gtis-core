package gtis.common.recipe;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gtis.common.block.ModBlocks;
import gtis.common.block.casing.CasingBase;
import gtis.common.materials.MaterialMetals;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chara_SS
 */
public class ModRecipes {
    public static final List<CasingBase> CASING_BASES = new ArrayList<>();
    public static void init() {
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
    }
}
