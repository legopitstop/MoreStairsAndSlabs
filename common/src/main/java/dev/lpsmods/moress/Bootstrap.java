package dev.lpsmods.moress;

import dev.lpsmods.moress.core.ModBlocks;
import dev.lpsmods.moress.core.ModCreativeModeTabs;
import dev.lpsmods.moress.core.ModItems;

public class Bootstrap {
    public static void init() {
        ModBlocks.init();
        ModItems.init();
        ModCreativeModeTabs.init();
    }
}