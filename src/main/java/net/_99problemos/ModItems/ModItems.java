package net._99problemos.ModItems;

import net._99problemos.Better_than_vanilla;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    /* Makes a new item called the Ruby as in the gemstone different abilities than diamonds does not have the exact functionality as a diamond in game */
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item UNREFINED_RUBY = registerItem("unrefined_ruby", new Item(new FabricItemSettings()));

    /* adds the item to the creative ingredients tab */
    private static void  addItemsToCreativeIngredientsTabItemGroup(FabricItemGroupEntries entries) {

        entries.add(RUBY);
        entries.add(UNREFINED_RUBY);

    }

    private static Item registerItem(String name, Item item) {

        /* Registers the items in the mod */
        return Registry.register(Registries.ITEM, new Identifier(Better_than_vanilla.MOD_ID, name), item);

    }

    public static void registerModItems() {

        /* Logger for telling the console that the mod is registering the items. */
        Better_than_vanilla.LOGGER.info("Registering Mod Items For " + Better_than_vanilla.MOD_ID);

        /* Modifies the creative tab to allow for the Ruby Item to show in the ingredients tab  */
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToCreativeIngredientsTabItemGroup);

    }

}
