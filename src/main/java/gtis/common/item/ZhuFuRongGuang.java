package gtis.common.item;

import gtis.GTISCore;
import gtis.common.sound.ModSounds;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

/**
 * @author Orirock
 */
public class ZhuFuRongGuang extends ItemBase {

    public ZhuFuRongGuang(String name) {
        super(name);
    }

    @Override
    public @NotNull ActionResult<ItemStack> onItemRightClick(@NotNull World worldIn, @NotNull EntityPlayer playerIn, @NotNull EnumHand handIn) {
        ItemStack zhuFuRongGuang = playerIn.getHeldItem(handIn);
        if (!worldIn.isRemote) {
            worldIn.playSound(null, playerIn.posX, playerIn.posY, playerIn.posZ, ModSounds.ZHU_FU_RONG_GUANG,
                playerIn.getSoundCategory(), 1.0F, 1.0F);
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, zhuFuRongGuang);

    }
}