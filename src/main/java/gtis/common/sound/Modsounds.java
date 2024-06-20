package gtis.common.sound;

import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

import static gtis.common.GTISUtility.gtisId;


/**
 * @author Orirock
 */
@SuppressWarnings("unused")
@Mod.EventBusSubscriber
public class Modsounds {
    public static final SoundEvent ZHU_FU_RONG_GUANG = new SoundEvent(new ResourceLocation("gtiscore", "music.zhufurongguang"));

    @SubscribeEvent
    public static void onSoundEventRegistration(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().register(ZHU_FU_RONG_GUANG.setRegistryName(new ResourceLocation("gtiscore", "music.zhufurongguang")));
    }
}

