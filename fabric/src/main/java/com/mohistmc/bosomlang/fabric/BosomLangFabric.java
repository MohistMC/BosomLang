package com.mohistmc.bosomlang.fabric;

import com.mohistmc.bosomlang.Message;
import net.fabricmc.api.ModInitializer;

import java.io.File;
import java.util.Locale;
import java.util.jar.JarFile;

import com.mohistmc.yaml.file.YamlConfiguration;

public class BosomLangFabric implements ModInitializer {

    public static final File bannerYml = new File("banner-config", "banner.yml");
    public static final YamlConfiguration banneryml = YamlConfiguration.loadConfiguration(bannerYml);
    public static Message MSG;

    @Override
    public void onInitialize() {
        String banner_lang = banneryml.getString("banner.lang", "xx_XX");
        String l = banner_lang.split("_")[0];
        String c = banner_lang.split("_")[1];
        MSG = new Message(new Locale(l, c));
    }
}
