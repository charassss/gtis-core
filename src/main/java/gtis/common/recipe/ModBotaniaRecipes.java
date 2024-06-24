package gtis.common.recipe;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import vazkii.botania.api.BotaniaAPI;

//import vazkii.botania.common.item.ModItems;
//import gtis.common.item.ModItems;

/**
 * @author Orirock
 */

public class ModBotaniaRecipes {
    public static void init(){
        elvenTradeRecipe();
    }

    private static void elvenTradeRecipe(){
        BotaniaAPI.registerElvenTradeRecipe(new ItemStack(vazkii.botania.common.item.ModItems.manaResource,1,7), new Object[]{new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT)});
    }
}
