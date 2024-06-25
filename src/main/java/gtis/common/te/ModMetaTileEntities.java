package gtis.common.te;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gtis.common.GTISUtility.gtisId;

/**
 * @author Chara_SS
 */
public class ModMetaTileEntities {
    @SuppressWarnings({"unused", "FieldCanBeLocal"})
    private static SteamTest STEAM_TEST;

    public static void init() {
        STEAM_TEST = registerMetaTileEntity(30201, new SteamTest(gtisId("steam_test"), false));
    }


}
