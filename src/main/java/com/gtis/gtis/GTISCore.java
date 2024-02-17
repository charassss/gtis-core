package com.gtis.gtis;

import com.gtis.gtis.proxy.ProxyBase;
import com.gtis.gtis.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
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

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static ProxyBase proxy;

    @EventHandler
    public void preInit(@NotNull FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
//        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        logger.info("Hello Minecraft!");
    }
}
