package gtis.common.event;

import gtis.GTISCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static gtis.common.GTISUtility.gtisId;
import static gtis.common.item.ModItems.ZHU_FU_RONG_GUANG;

/**
 * @author Orirock
 */
@Mod.EventBusSubscriber
public class SoundHandler {

    @SubscribeEvent
    public static ActionResult<ItemStack> zhuFuRongGuangUsed(EntityPlayer playerIn, EnumHand handIn){
        GTISCore.logger.info("114514");
         ItemStack zhuFuRongGuang = playerIn.getHeldItem(handIn);
        if (zhuFuRongGuang.getItem() == ZHU_FU_RONG_GUANG) {
            ForgeEventFactory.onPlaySoundAtEntity(playerIn, new SoundEvent(gtisId("gtiscore:gtiscore.zhufurongguang")),playerIn.getSoundCategory(),1.0F,1.0F);
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,zhuFuRongGuang);

    }
}

