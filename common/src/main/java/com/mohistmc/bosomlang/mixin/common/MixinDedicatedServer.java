package com.mohistmc.bosomlang.mixin.common;

import com.mohistmc.bosomlang.ServerHandleSwitcher;
import net.minecraft.server.dedicated.DedicatedServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = DedicatedServer.class)
public class MixinDedicatedServer {

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "Starting minecraft server version {}"))
    private String bosom$localStartingInfo(String constant) {
        return ServerHandleSwitcher.getMSG().get("mc.server.starting");
    }

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "Loading properties"))
    private String bosom$localPropertiesInfo(String constant) {
        return ServerHandleSwitcher.getMSG().get("mc.server.properties");
    }

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "Default game type: {}"))
    private String bosom$localGameType(String constant) {
        return ServerHandleSwitcher.getMSG().get("mc.server.game_type");
    }

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "Starting Minecraft server on {}:{}"))
    private String bosom$localStartOn(String constant) {
        return ServerHandleSwitcher.getMSG().get("mc.server.start_on");
    }

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "Done ({})! For help, type \"help\""))
    private String bosom$localStartDone(String constant) {
        return ServerHandleSwitcher.getMSG().get("server.start.done");
    }

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!"))
    private String bosom$localStartWarn(String constant) {
        return ServerHandleSwitcher.getMSG().get("server.warn.offline");
    }

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "The server will make no attempt to authenticate usernames. Beware."))
    private String bosom$localStartWarn0(String constant) {
        return ServerHandleSwitcher.getMSG().get("server.warn.offline.0");
    }

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."))
    private String bosom$localStartWarn1(String constant) {
        return ServerHandleSwitcher.getMSG().get("server.warn.offline.1");
    }

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "To change this, set \"online-mode\" to \"true\" in the server.properties file."))
    private String bosom$localStartWarn2(String constant) {
        return ServerHandleSwitcher.getMSG().get("server.warn.offline.2");
    }

    @ModifyConstant(method = "initServer()Z", constant = @Constant(stringValue = "Preparing level \"{}\""))
    private String bosom$localPrepareLevel(String constant) {
        return ServerHandleSwitcher.getMSG().get("server.level.prepare");
    }
}
