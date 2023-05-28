package com.mohistmc.bosomlang.mixin.common;

import com.mohistmc.bosomlang.BosomLangMod;
import com.mohistmc.bosomlang.ServerHandleSwitcher;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer {

    @ModifyConstant(method = "prepareLevels", remap = false, constant = @Constant(stringValue = "Preparing start region for dimension {}"))
    private String bosom$prepRegion(String constant) {
        if (ServerHandleSwitcher.isBanner()) {
            return "Preparing start region for dimension {}";// Bosom - do nothing
        }else {
            return BosomLangMod.MSG.get("server.region.prepare");
        }
    }

    @ModifyConstant(method = "saveAllChunks", constant = @Constant(stringValue = "Saving chunks for level '{}'/{}"))
    private String bosom$localSaveChunk(String constant){
        return BosomLangMod.MSG.get("server.chunk.saving");
    }

    @ModifyConstant(method = "initializeKeyPair", constant = @Constant(stringValue = "Generating keypair"))
    private String bosom$localKeyPair(String constant){
        return BosomLangMod.MSG.get("server.key.pair");
    }

    @ModifyConstant(method = "saveAllChunks", constant = @Constant(stringValue = "ThreadedAnvilChunkStorage ({}): All chunks are saved"))
    private String bosom$localSaveAnvil(String constant){
        return BosomLangMod.MSG.get("server.chunk.saved");
    }

    @ModifyConstant(method = "saveAllChunks", constant = @Constant(stringValue = "ThreadedAnvilChunkStorage: All dimensions are saved"))
    private String bosom$localSaveAnvil0(String constant){
        return BosomLangMod.MSG.get("server.dimension.saved");
    }

    @ModifyConstant(method = "stopServer", constant = @Constant(stringValue = "Stopping server"))
    private String bosom$localStoppingServer(String constant){
        return BosomLangMod.MSG.get("server.stopping");
    }

    @ModifyConstant(method = "stopServer", constant = @Constant(stringValue = "Saving players"))
    private String bosom$localSavePlayer(String constant){
        return BosomLangMod.MSG.get("server.saving.player");
    }

    @ModifyConstant(method = "stopServer", constant = @Constant(stringValue = "Saving worlds"))
    private String bosom$localSaveWorld(String constant){
        return BosomLangMod.MSG.get("server.saving.world");
    }
    @ModifyConstant(method = "stopServer", constant = @Constant(stringValue = "Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind"))
    private String bosom$localCKP(String constant){
        return BosomLangMod.MSG.get("server.hold.ckp");
    }

}
