package dev.lpsmods.moress;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MoreStairsAndSlabs {

    public MoreStairsAndSlabs(IEventBus eventBus) {
        Bootstrap.init();
    }
}