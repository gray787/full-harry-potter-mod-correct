package com.potterspells;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PotterSpellsMain implements ModInitializer {
    public static final String MOD_ID = "potterspells";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Wizarding World Spells loaded.");
    }
}
