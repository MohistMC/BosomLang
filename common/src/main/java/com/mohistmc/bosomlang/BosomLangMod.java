package com.mohistmc.bosomlang;

import java.io.File;
import java.util.Locale;
import com.mohistmc.yaml.file.YamlConfiguration;

public class BosomLangMod {

    public static final String MOD_ID = "bosomlang";
    public static Message MSG;

    public static final File mohistYml = new File("mohist-config", "mohist.yml");
    public static final YamlConfiguration mohistyml = YamlConfiguration.loadConfiguration(mohistYml);
    public static final File bannerYml = new File("banner-config", "banner.yml");
    public static final YamlConfiguration banneryml = YamlConfiguration.loadConfiguration(bannerYml);

    public static void init() {
        if (ServerHandleSwitcher.isBanner()) {
            String banner_lang = banneryml.getString("banner.lang", "xx_XX");
            String l = banner_lang.split("_")[0];
            String c = banner_lang.split("_")[1];
            BosomLangMod.MSG = new Message(BosomLangMod.class.getClassLoader(), new Locale(l, c));
        }
        if (ServerHandleSwitcher.isMohist()) {
            String banner_lang = mohistyml.getString("mohist.lang", "xx_XX");
            String l = banner_lang.split("_")[0];
            String c = banner_lang.split("_")[1];
            BosomLangMod.MSG = new Message(BosomLangMod.class.getClassLoader(), new Locale(l, c));
        }
    }
}
