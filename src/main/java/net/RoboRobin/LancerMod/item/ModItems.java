package net.RoboRobin.LancerMod.item;

import net.RoboRobin.LancerMod.LancerMod;
import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LancerMod.MOD_ID);

    public static final DeferredItem<Item> FILAMENT = ITEMS.register("filament",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_FILAMENT = ITEMS.register("steel_filament",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ADAPTIUM = ITEMS.register("adaptium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ADAPTIUM = ITEMS.register("raw_adaptium",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
