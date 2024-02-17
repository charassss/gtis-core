package gtis.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chara_SS
 */
@SuppressWarnings("unused")
public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block TEST_BLOCK = new BlockBase("test_block", Material.ROCK);
}
