package gtis.common.sound;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;


/**
 * @author Orirock
 */
@SuppressWarnings("unused")
@Mod.EventBusSubscriber
public class ModSounds {
    public static final SoundEvent ZHU_FU_RONG_GUANG = new SoundEvent(new ResourceLocation("gtiscore", "music.zhufurongguang"));

    public static void registerAllSounds(RegistryEvent.@NotNull Register<SoundEvent> event) {
        event.getRegistry().register(ZHU_FU_RONG_GUANG.setRegistryName(new ResourceLocation("gtiscore", "music.zhufurongguang")));
    }
}

