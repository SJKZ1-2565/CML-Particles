package com.sjkz1.cml_particles.mixin.client;

import com.sjkz1.cml_particles.CMLParticles;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(TitleScreen.class)
public class TitleScreenMixin extends Screen
{
    TitleScreenMixin()
    {
        super(null);
    }

    @Inject(at = @At("HEAD"), method = "init", cancellable = true)
    private void init(CallbackInfo info)
    {
        if (this.client != null)
        {
            if (!CMLParticles.NAME_LIST.contains(this.client.getSession().getUsername()))
            {
                    info.cancel();
            }
        }

    }

    @Inject(at = @At(value = "HEAD"), method = "mouseClicked")
    private void mouseClicked(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir)
    {
        if (this.client != null)
        {
            if (!CMLParticles.NAME_LIST.contains(this.client.getSession().getUsername()))
            {
                this.client.scheduleStop();
            }
        }

    }
}