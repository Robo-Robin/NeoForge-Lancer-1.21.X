package net.RoboRobin.LancerMod.item;

import net.RoboRobin.LancerMod.LancerMod;
import net.RoboRobin.LancerMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LancerMod.MOD_ID);

    public static final Supplier<CreativeModeTab> PRINTING_ITEMS_TAB  = CREATIVE_MODE_TAB.register("printing_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FILAMENT.get()))
                    .title(Component.translatable("creativetab.lancerintegration.printing_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FILAMENT);
                        output.accept(ModItems.STEEL_FILAMENT);
                        output.accept(ModItems.ADAPTIUM);
                        output.accept(ModItems.RAW_ADAPTIUM);
                    })

                    .build());

public static final Supplier<CreativeModeTab> PRINTING_BLOCKS_TAB  = CREATIVE_MODE_TAB.register("printing_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GENERIC_PRINTING_MATERIAL))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(LancerMod.MOD_ID, "printing_items_tab"))
                    .title(Component.translatable("creativetab.lancerintegration.printing_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GENERIC_PRINTING_MATERIAL);
                        output.accept(ModBlocks.ADAPTIUM_BLOCK);
                        output.accept(ModBlocks.ADAPTIUM_ORE);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> BATTLEMAP_BLOCK_TAB  = CREATIVE_MODE_TAB.register("battlemap_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HEXMAP_L_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(LancerMod.MOD_ID, "printing_blocks_tab"))
                    .title(Component.translatable("creativetab.lancerintegration.battlemap_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HEXMAP_L_BLOCK);
                        output.accept(ModBlocks.HEXMAP_R_BLOCK);
                    })

                    .build());



    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
