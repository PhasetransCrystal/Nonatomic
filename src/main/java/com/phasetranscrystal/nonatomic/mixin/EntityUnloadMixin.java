package com.phasetranscrystal.nonatomic.mixin;

import com.phasetranscrystal.nonatomic.EventHooks;
import com.phasetranscrystal.nonatomic.core.OperatorEntity;
import net.minecraft.world.level.entity.EntityAccess;
import net.minecraft.world.level.entity.PersistentEntitySectionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PersistentEntitySectionManager.class)
public class EntityUnloadMixin {

    @Inject(method = "unloadEntity", at = @At("HEAD"), cancellable = true)
    private void unload(EntityAccess entityAccess, CallbackInfo ci) {
        if (EventHooks.onEntityUninstallByChunk(entityAccess)) ci.cancel();
    }

}
