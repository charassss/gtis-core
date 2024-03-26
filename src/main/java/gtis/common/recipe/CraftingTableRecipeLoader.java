package gtis.common.recipe;

import gregtech.api.recipes.ModHandler;
import gtis.GTISCore;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Orirock
 */
public class CraftingTableRecipeLoader {
    public CraftingTableRecipeLoader (){
        registerRecipe();
    }

    private static void registerRecipe(){
        //参考https://github.com/GregTech-Chinese-Community/EPCore/blob/overhaul/src/main/java/cn/gtcommunity/epimorphism/loaders/recipe/components/MachineComponents.java
        //Gt提供的注册工作台合成的方法 4/7开始时崩溃
        // java报错java.lang.RuntimeException: Invalid shaped recipe: CCC, RRR, PPP, C, net.minecraft.item.ItemBlockSpecial@33a3e5db, R, net.minecraft.item.ItemRecord@2d3bb944, P, net.minecraft.item.ItemEnderPearl@5059d398,
//        ModHandler.addShapedRecipe(false,"test", Items.GOLDEN_APPLE.getDefaultInstance(),
//                "CCC",
//                "RRR",
//                "PPP",
//                "C",Items.CAKE,
//                "R",Items.RECORD_11,
//                "P",Items.ENDER_PEARL
//        );
        //forge提供的注册工作台的方法 4/7加载到GTISCore时崩溃
        //java报错Caused by: java.lang.RuntimeException: Invalid shaped recipe: CCC, RRR, PPP, C, net.minecraft.item.ItemBlockSpecial@33a3e5db, R, net.minecraft.item.ItemRecord@5614ae05, P, net.minecraft.item.ItemEnderPearl@5059d398,
        GameRegistry.addShapedRecipe(new ResourceLocation("gtiscore:ahahahahahahaha"),null, new ItemStack(Items.GOLDEN_CARROT,2),new Object[]{
                "CCC",
                "RRR",
                "PPP",
                "C",Items.CAKE,
                "R",Items.RECORD_13,
                "P",Items.ENDER_PEARL
        });
    }
}
