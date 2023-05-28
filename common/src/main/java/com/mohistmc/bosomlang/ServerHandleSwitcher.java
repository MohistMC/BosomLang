package com.mohistmc.bosomlang;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class ServerHandleSwitcher {

    @ExpectPlatform
    public static boolean hasBukkitSide() {
        throw new AssertionError();
    }
    
    @ExpectPlatform
    public static boolean isBanner() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean isMohist() {
        throw new AssertionError();
    }
}
