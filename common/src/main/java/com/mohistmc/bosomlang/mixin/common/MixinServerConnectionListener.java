package com.mohistmc.bosomlang.mixin.common;

import com.mohistmc.bosomlang.BosomLangMod;
import net.minecraft.server.network.ServerConnectionListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerConnectionListener.class)
public class MixinServerConnectionListener {

    @ModifyConstant(method = "startTcpServerListener", constant = @Constant(stringValue = "Using default channel type"))
    private String bosom$i18nChannel(String constant) {
        return BosomLangMod.MSG.get("networksystem.2");
    }

    @ModifyConstant(method = "startTcpServerListener", constant = @Constant(stringValue = "Using epoll channel type"))
    private String bosom$i18nChannel1(String constant) {
        return BosomLangMod.MSG.get("networksystem.1");
    }
}
