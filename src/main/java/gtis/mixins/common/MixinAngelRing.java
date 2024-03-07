package gtis.mixins.common;

import com.rwtema.extrautils2.backend.XUItemFlatMetadata;
import com.rwtema.extrautils2.items.ItemAngelRing;
import com.rwtema.extrautils2.power.player.IPlayerPowerCreator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

/**
 * @author Chara_SS
 */
@Mixin(value = ItemAngelRing.class, remap = false)
public abstract class MixinAngelRing extends XUItemFlatMetadata implements IPlayerPowerCreator {
    
    @Inject(method = "addInformation", at = @At("HEAD"), remap = false, cancellable = true)
    public void addInformationMixin(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced, @NotNull CallbackInfo ci){
        super.addInformation(stack, playerIn, tooltip, advanced);
        tooltip.add("GP消耗已被禁用.");
        ci.cancel();
    }
}
