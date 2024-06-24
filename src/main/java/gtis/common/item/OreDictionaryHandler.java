package gtis.common.item;

import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gtis.common.materials.MaterialMetals;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

//import vazkii.botania.common.item.ModItems;
//import gtis.common.item.ModItems;

/**
 * @author Orirock
 */
public class OreDictionaryHandler {
    public static void init() {
        OreDictionary.registerOre("ingotElvenelementium", new ItemStack(vazkii.botania.common.item.ModItems.manaResource, 1, 7));
        OreDictionary.registerOre("ingotElvenElementium", new ItemStack(new UnificationEntry(OrePrefix.plate, MaterialMetals.manaSteel)));
    }
}