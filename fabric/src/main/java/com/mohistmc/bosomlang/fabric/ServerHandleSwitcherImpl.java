package com.mohistmc.bosomlang.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class ServerHandleSwitcherImpl {
    public static boolean hasBukkitSide() {
        return FabricLoader.getInstance().isModLoaded("banner");
    }
}
