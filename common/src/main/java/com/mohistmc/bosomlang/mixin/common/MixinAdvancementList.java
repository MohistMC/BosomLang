package com.mohistmc.bosomlang.mixin.common;

import com.mohistmc.bosomlang.ServerHandleSwitcher;
import net.minecraft.advancements.AdvancementList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AdvancementList.class)
public class MixinAdvancementList {

    @ModifyConstant(method = "remove(Lnet/minecraft/advancements/Advancement;)V",
            constant = @Constant(stringValue = "Forgot about advancement {}"))
    private String bosom$localForgot(String constant) {
        return ServerHandleSwitcher.getMSG().get("advancement.forgot");
    }

    @ModifyConstant(method = "remove(Ljava/util/Set;)V",
            constant = @Constant(stringValue = "Told to remove advancement {} but I don't know what that is"))
    private String bosom$localRemove(String constant) {
        return ServerHandleSwitcher.getMSG().get("advancement.remove.told");
    }

    @ModifyConstant(method = "add",
            constant = @Constant(stringValue = "Loaded {} advancements"))
    private String bosom$localAdvanList(String constant) {
        return ServerHandleSwitcher.getMSG().get("advancement.list");
    }
}
