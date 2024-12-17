package dev.lpsmods.moress.core;

import dev.lpsmods.moress.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModItems {
    public static void init() {}

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item);
    }

    private static Item registerBlock (String name, Block block) {
        return registerItem(name, new BlockItem(block, new Item.Properties()));
    }

    static {}
}
