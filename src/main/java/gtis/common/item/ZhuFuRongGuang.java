package gtis.common.item;

import gtis.GTISCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;

import static gtis.common.GTISUtility.gtisId;
import static gtis.common.item.ModItems.ZHU_FU_RONG_GUANG_CD;

/**
 * @author Orirock
 */
public class ZhuFuRongGuang extends ItemBase {

    public ZhuFuRongGuang(String name) {
        super(name);
    }

    @Override
//    @SubscribeEvent
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        GTISCore.logger.info("114514");
        ItemStack zhuFuRongGuang = playerIn.getHeldItem(handIn);
        if (zhuFuRongGuang.getItem() == ZHU_FU_RONG_GUANG_CD) {
            GTISCore.logger.info(worldIn);
//            ForgeEventFactory.onPlaySoundAtEntity(playerIn, new SoundEvent(gtisId("gtiscore:music.zhufurongguang")), playerIn.getSoundCategory(), 1.0F, 1.0F);
            new PlaySoundAtEntityEvent(playerIn, new SoundEvent(gtisId("gtiscore:music.zhufurongguang")),playerIn.getSoundCategory(),1.0F, 1.0F);
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, zhuFuRongGuang);

    }
}