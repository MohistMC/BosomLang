package com.mohistmc.bosomlang.mixin.common;

import com.mohistmc.bosomlang.ServerHandleSwitcher;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer {

    @ModifyConstant(
            method = "prepareLevels",
            constant = @Constant(stringValue = "Preparing start region for dimension {}"))
    private static String bosom$localPrepLevels(String constant) {
        if (ServerHandleSwitcher.isBanner()) {
            return ServerHandleSwitcher.getMSG().get("server.region.prepare");
        }else {
            return "Preparing start region for dimension {}";
        }
    }

    @ModifyConstant(
            method = "*",
            constant = @Constant(stringValue = "Preparing start region for dimension {}"))
    private static String bosom$localPrepLevels0(String constant) {
        if (ServerHandleSwitcher.isMohist()) {
            return ServerHandleSwitcher.getMSG().get("server.region.prepare");
        }else {
            return "Preparing start region for dimension {}";
        }
    }

    @ModifyConstant(method = "saveAllChunks", constant = @Constant(stringValue = "Saving chunks for level '{}'/{}"))
    private String bosom$localSaveChunk(String constant){
        return ServerHandleSwitcher.getMSG().get("server.chunk.saving");
    }

    @ModifyConstant(method = "initializeKeyPair", constant = @Constant(stringValue = "Generating keypair"))
    private String bosom$localKeyPair(String constant){
        return ServerHandleSwitcher.getMSG().get("server.key.pair");
    }

    @ModifyConstant(method = "saveAllChunks", constant = @Constant(stringValue = "ThreadedAnvilChunkStorage ({}): All chunks are saved"))
    private String bosom$localSaveAnvil(String constant){
        return ServerHandleSwitcher.getMSG().get("server.chunk.saved");
    }

    @ModifyConstant(method = "saveAllChunks", constant = @Constant(stringValue = "ThreadedAnvilChunkStorage: All dimensions are saved"))
    private String bosom$localSaveAnvil0(String constant){
        return ServerHandleSwitcher.getMSG().get("server.dimension.saved");
    }

    @ModifyConstant(method = "stopServer", constant = @Constant(stringValue = "Stopping server"))
    private String bosom$localStoppingServer(String constant){
        return ServerHandleSwitcher.getMSG().get("server.stopping");
    }

    @ModifyConstant(method = "stopServer", constant = @Constant(stringValue = "Saving players"))
    private String bosom$localSavePlayer(String constant){
        return ServerHandleSwitcher.getMSG().get("server.saving.player");
    }

    @ModifyConstant(method = "stopServer", constant = @Constant(stringValue = "Saving worlds"))
    private String bosom$localSaveWorld(String constant){
        return ServerHandleSwitcher.getMSG().get("server.saving.world");
    }
    @ModifyConstant(method = "runServer", constant = @Constant(stringValue = "Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind"))
    private String bosom$localCKP(String constant){
        return ServerHandleSwitcher.getMSG().get("server.hold.ckp");
    }
}
