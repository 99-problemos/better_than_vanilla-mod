package net._99problemos;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BETTER_THAN_VANILLA = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Betterthanvanilla.MOD_ID, "betterthanvanilla"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.betterthanvanilla"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.UNREFINED_RUBY);

                        entries.add(Items.DIAMOND);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);


                    }).build());


    public static void registerItemGroups() {
        Betterthanvanilla.LOGGER.info("Registering Item Groups for " + Betterthanvanilla.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemGroups::modifyEntries);
    }

    private static void modifyEntries(FabricItemGroupEntries entries) {
        entries.add(ModItems.RUBY);
        entries.add(ModItems.UNREFINED_RUBY);
    }
}
