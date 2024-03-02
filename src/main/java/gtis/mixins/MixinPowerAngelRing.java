package gtis.mixins;

import com.rwtema.extrautils2.items.ItemAngelRing;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author Chara_SS
 */
@Mixin(ItemAngelRing.PlayerPowerAngelRing.class)
public abstract class MixinPowerAngelRing {

    @Shadow(remap = false)
    int power;

    @Inject(method = "update", at = @At("RETURN"), remap = false)
    public void update(boolean selected, ItemStack params, CallbackInfo ci) {
        this.power = 0;
    }
}
