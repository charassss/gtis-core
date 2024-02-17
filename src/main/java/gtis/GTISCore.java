package gtis;

import gtis.common.recipe.ModGregRecipes;
import gtis.common.te.ModMetaTileEntities;
import gtis.common.CommonProxy;
import gtis.common.Reference;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chara_SS
 */
@Mod(modid = Reference.MOD_ID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class GTISCore {
    public static final String MODID = "gtiscore";
    public static final String NAME = "GTIS Core";
    public static final String VERSION = "1.0";


    @Mod.Instance
    public static GTISCore instance;

    public static Logger logger;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @EventHandler
    public void preInit(@NotNull FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        ModMetaTileEntities.init();
    }

    @EventHandler
    public void onRecipeRegister(RegistryEvent<IRecipe> event) {
        ModGregRecipes.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
//        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        logger.info("Hello Minecraft!");
    }
}
