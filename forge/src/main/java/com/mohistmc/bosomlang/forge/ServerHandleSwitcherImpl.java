package com.mohistmc.bosomlang.forge;

import com.mohistmc.bosomlang.BosomLangMod;
import com.mohistmc.bosomlang.Message;
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

    public static Message getMSG() {
        return BosomLangForge.MSG;
    }
}
