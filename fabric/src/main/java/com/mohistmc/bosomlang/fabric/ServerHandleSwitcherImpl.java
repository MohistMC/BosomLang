package com.mohistmc.bosomlang.fabric;

import com.mohistmc.bosomlang.Message;
import net.fabricmc.loader.api.FabricLoader;

public class ServerHandleSwitcherImpl {

    public static boolean hasBukkitSide() {
        return FabricLoader.getInstance().isModLoaded("banner");
    }

    public static boolean isBanner() {
        return FabricLoader.getInstance().isModLoaded("banner");
    }

    public static boolean isMohist() {
        return false;
    }

    public static Message getMSG() {
        return BosomLangFabric.MSG;
    }

}
