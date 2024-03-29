package gtis.common.block;


import gtis.common.block.casing.ManaSteelMachineCasing;
import gtis.common.materials.MaterialMetals;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chara_SS
 */
public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block MANA_STEEL_CASING_BLOCK = new ManaSteelMachineCasing("mana_steel", MaterialMetals.manaSteel);
}
