package com.mohistmc.bosomlang.mixin.common;

import com.mohistmc.bosomlang.ServerHandleSwitcher;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer {

    @ModifyConstant(method = "prepareLevels(Lnet/minecraft/server/level/progress/ChunkProgressListener;)V", remap = false, constant = @Constant(stringValue = "Preparing start region for dimension {}"))
    private String bosom$prepRegion(String constant) {
        return ServerHandleSwitcher.getMSG().get("server.region.prepare");
    }

    @ModifyConstant(method = "saveAllChunks(ZZZ)Z", constant = @Constant(stringValue = "Saving chunks for level '{}'/{}"))
    private String bosom$localSaveChunk(String constant){
        return ServerHandleSwitcher.getMSG().get("server.chunk.saving");
    }

    @ModifyConstant(method = "initializeKeyPair()V", constant = @Constant(stringValue = "Generating keypair"))
    private String bosom$localKeyPair(String constant){
        return ServerHandleSwitcher.getMSG().get("server.key.pair");
    }

    @ModifyConstant(method = "saveAllChunks(ZZZ)Z", constant = @Constant(stringValue = "ThreadedAnvilChunkStorage ({}): All chunks are saved"))
    private String bosom$localSaveAnvil(String constant){
        return ServerHandleSwitcher.getMSG().get("server.chunk.saved");
    }

    @ModifyConstant(method = "saveAllChunks(ZZZ)Z", constant = @Constant(stringValue = "ThreadedAnvilChunkStorage: All dimensions are saved"))
    private String bosom$localSaveAnvil0(String constant){
        return ServerHandleSwitcher.getMSG().get("server.dimension.saved");
    }

    @ModifyConstant(method = "stopServer()V", constant = @Constant(stringValue = "Stopping server"))
    private String bosom$localStoppingServer(String constant){
        return ServerHandleSwitcher.getMSG().get("server.stopping");
    }

    @ModifyConstant(method = "stopServer()V", constant = @Constant(stringValue = "Saving players"))
    private String bosom$localSavePlayer(String constant){
        return ServerHandleSwitcher.getMSG().get("server.saving.player");
    }

    @ModifyConstant(method = "stopServer()V", constant = @Constant(stringValue = "Saving worlds"))
    private String bosom$localSaveWorld(String constant){
        return ServerHandleSwitcher.getMSG().get("server.saving.world");
    }
    @ModifyConstant(method = "stopServer()V", constant = @Constant(stringValue = "Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind"))
    private String bosom$localCKP(String constant){
        return ServerHandleSwitcher.getMSG().get("server.hold.ckp");
    }

}
