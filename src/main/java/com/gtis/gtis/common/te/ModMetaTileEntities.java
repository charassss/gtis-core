package com.gtis.gtis.common.te;

import com.gtis.gtis.GTISCore;
import net.minecraft.util.ResourceLocation;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

/**
 * @author Chara_SS
 */
public class ModMetaTileEntities {
    private static SteamTest STEAM_TEST;

    public static void init() {
        STEAM_TEST = registerMetaTileEntity(30201, new SteamTest(gtisId("STEAM_TEST"), false));
    }

    public static ResourceLocation gtisId(String name) {
        return new ResourceLocation(GTISCore.MODID, name);
    }
}
