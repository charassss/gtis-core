package gtis;

import gregtech.api.unification.material.event.MaterialEvent;
import gtis.common.init.OreDictionaryHandler;
import gtis.common.materials.MaterialMetals;
import gtis.common.recipe.ModBotaniaRecipes;
import gtis.common.recipe.ModGregRecipes;
import gtis.common.recipe.ModRecipes;
import gtis.common.sound.ModSounds;
import gtis.common.te.ModMetaTileEntities;
import gtis.common.CommonProxy;
import gtis.common.Reference;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import gtis.common.materials.MaterialFluids;

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
    public void preInit(@NotNull FMLPreInitializationEvent event) {
        logger = event.getModLog();
        ModMetaTileEntities.init();
        OreDictionaryHandler.init();
//        ModTools.init();
    }

    @SubscribeEvent
    public void onRecipeRegister(RegistryEvent<IRecipe> event) {
        ModGregRecipes.init();
        ModBotaniaRecipes.init();
    }



    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
//        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        logger.info("Hello Minecraft!");
        ModRecipes.init();
    }

    @SubscribeEvent
    public void registerMaterials(MaterialEvent event) {
        MaterialFluids.init();
        MaterialMetals.init();
    }

    @SubscribeEvent
    public static void onSoundEventRegistration(RegistryEvent.@NotNull Register<SoundEvent> event) {
        ModSounds.registerAllSounds(event);

    }
}
