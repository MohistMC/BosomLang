package com.mohistmc.bosomlang.forge;

import net.minecraftforge.fml.ModList;

public class ServerHandleSwitcherImpl {

    public static boolean hasBukkitSide() {
        return ModList.get().isLoaded("mohist");
    }

    public static boolean isBanner() {
        return false;
    }

    public static boolean isMohist() {
        return ModList.get().isLoaded("mohist");
    }
}
