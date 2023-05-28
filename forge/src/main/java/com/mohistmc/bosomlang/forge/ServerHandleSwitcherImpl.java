package com.mohistmc.bosomlang.forge;

import net.minecraftforge.fml.ModList;

public class ServerHandleSwitcherImpl {

    public static boolean hasBukkitSide() {
        return ModList.get().isLoaded("mohist");
    }
}
