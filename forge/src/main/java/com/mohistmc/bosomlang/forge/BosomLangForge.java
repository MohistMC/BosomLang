package com.mohistmc.bosomlang.forge;

import com.mohistmc.bosomlang.BosomLangMod;
import com.mohistmc.bosomlang.Message;
import net.minecraftforge.fml.common.Mod;
import com.mohistmc.yaml.file.YamlConfiguration;

import java.io.File;
import java.util.Locale;

@Mod(BosomLangMod.MOD_ID)
public class BosomLangForge {

    public static final File mohistYml = new File("mohist-config", "mohist.yml");
    public static final YamlConfiguration mohistyml = YamlConfiguration.loadConfiguration(mohistYml);
    public static Message MSG;

    public BosomLangForge() {
        String banner_lang = mohistyml.getString("mohist.lang", "xx_XX");
        String l = banner_lang.split("_")[0];
        String c = banner_lang.split("_")[1];
        BosomLangForge.MSG = new Message(this.getClass(), new Locale(l, c));
    }
}
