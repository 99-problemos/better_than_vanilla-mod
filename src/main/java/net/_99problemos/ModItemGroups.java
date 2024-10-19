package net._99problemos;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Better_than_vanilla.MOD_ID, "better_than_vanilla"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.betterthanvanilla"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.UNREFINED_RUBY);

                        entries.add(Items.DIAMOND);

                        entries.add(net._99problemos.ModBlocks.RUBY_BLOCK);
                        entries.add(net._99problemos.ModBlocks.RAW_RUBY_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        Better_than_vanilla.LOGGER.info("Registering Item Groups for " + Better_than_vanilla.MOD_ID);
    }
}
