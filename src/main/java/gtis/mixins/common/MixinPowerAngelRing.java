package gtis.mixins.common;

import com.rwtema.extrautils2.items.ItemAngelRing;
import com.rwtema.extrautils2.power.player.PlayerPower;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author Chara_SS
 */
@Mixin(value = ItemAngelRing.PlayerPowerAngelRing.class, remap = false)
public abstract class MixinPowerAngelRing extends PlayerPower {

    @Shadow(remap = false)
    int power;

    @Shadow
    boolean wasFlying;

    @Shadow
    String name;

    @Shadow
    int type;

    public MixinPowerAngelRing(EntityPlayer referent, int type) {
        super(referent);
        this.name = referent.getGameProfile().getName();
        this.type = type;
    }

    @Inject(method = "update", at = @At("HEAD"), remap = false, cancellable = true)
    public void update(boolean selected, ItemStack params, @NotNull CallbackInfo ci) {
        if (!this.invalid) {
            ItemAngelRing.updateWingsDisplay(this.name, this.type, selected);
            EntityPlayerMP player = this.getPlayerMP();
            if (!this.getPlayer().isSpectator()) {
                if (!player.capabilities.allowFlying) {
                    player.capabilities.allowFlying = true;
                    player.sendPlayerAbilities();
                }

                if (player.capabilities.isFlying) {
                    this.wasFlying = true;
                }

                if (this.wasFlying) {
                    if (player.onGround) {
                        this.wasFlying = false;
                    }

                }
                this.power = 0;

            }
        }
        ci.cancel();
    }
}
