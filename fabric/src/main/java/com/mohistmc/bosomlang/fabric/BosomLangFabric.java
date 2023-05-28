package com.mohistmc.bosomlang.fabric;

import net.fabricmc.api.ModInitializer;
import com.mohistmc.bosomlang.BosomLangMod;

public class BosomLangFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        BosomLangMod.init();
    }
}
