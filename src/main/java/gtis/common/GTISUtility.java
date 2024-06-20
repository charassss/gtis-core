package gtis.common;

import gtis.GTISCore;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chara_SS
 */
public class GTISUtility {
    @NotNull
    public static ResourceLocation gtisId(@NotNull String path) {
        return new ResourceLocation(GTISCore.MODID, path);
    }
}
