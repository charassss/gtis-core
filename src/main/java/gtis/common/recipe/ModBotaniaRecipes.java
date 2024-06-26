package gtis.common.recipe;

import net.minecraft.init.Blocks;
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
        manaPoolRecipe();
        runeAltarRecipe();
    }

    private static void elvenTradeRecipe(){
        //Add
        BotaniaAPI.registerElvenTradeRecipe(new ItemStack(vazkii.botania.common.item.ModItems.manaResource,1,7), new Object[]{new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT)});
        //Remove
    }

    private static void manaPoolRecipe(){
        //Add
        BotaniaAPI.registerManaInfusionRecipe(new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(Items.IRON_INGOT),3000);
        BotaniaAPI.registerManaInfusionRecipe(new ItemStack(vazkii.botania.common.item.ModItems.manaResource,1,4),new ItemStack(gtis.common.item.ModItems.UNCHARGED_TERRASTEEL_INGOT),500000);
        //Remove
    }

    private static void runeAltarRecipe(){
        //Add
        for(int i = 0; i < 16; i++) {
            //AirRune
            BotaniaAPI.registerRuneAltarRecipe(new ItemStack(vazkii.botania.common.item.ModItems.rune, 2, 3), 6200, new Object[]{"powderMana",new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT) , new ItemStack(Blocks.CARPET, 1, i), "feather", "string"});
        }
        //ManaRune
        BotaniaAPI.registerRuneAltarRecipe(new ItemStack(vazkii.botania.common.item.ModItems.rune, 1, 8), 10000, new Object[]{new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), "manaPearl"});

        //FireRune
        BotaniaAPI.registerRuneAltarRecipe(new ItemStack(vazkii.botania.common.item.ModItems.rune, 2, 1), 6200, new Object[]{"powderMana", new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), "ingotBrickNether", "gunpowder", "cropNetherWart"});

        //WaterRune
        BotaniaAPI.registerRuneAltarRecipe(new ItemStack(vazkii.botania.common.item.ModItems.rune, 2, 0), 6200, new Object[]{"powderMana",new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), new ItemStack(Items.DYE, 1, 15), "sugarcane", new ItemStack(Items.FISHING_ROD)});

        //EarthRune
        BotaniaAPI.registerRuneAltarRecipe(new ItemStack(vazkii.botania.common.item.ModItems.rune, 2, 2), 6200, new Object[]{"powderMana", new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), "stone", "blockCoal", new ItemStack(Blocks.BROWN_MUSHROOM)});
        BotaniaAPI.registerRuneAltarRecipe(new ItemStack(vazkii.botania.common.item.ModItems.rune, 2, 2), 6200, new Object[]{"powderMana", new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT), "stone", "blockCoal", new ItemStack(Blocks.RED_MUSHROOM)});

        //UnChangedTerraSteel
        BotaniaAPI.registerRuneAltarRecipe(new ItemStack(gtis.common.item.ModItems.UNCHARGED_TERRASTEEL_INGOT),500000,new Object[]{new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),new ItemStack(gtis.common.item.ModItems.MANA_IRON_INGOT),"manaPearl","manaDiamond"});

    }


}
