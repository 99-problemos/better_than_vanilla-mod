package net._99problemos;
import net._99problemos.custom.OreProspectingPick;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item UNREFINED_RUBY = registerItem("unrefined_ruby", new Item(new FabricItemSettings()));
    public static final Item ORE_PROSPECTING_PICK = registerItem("ore_prospecting_pick", new OreProspectingPick(new FabricItemSettings().maxDamage(4096)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(UNREFINED_RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Betterthanvanilla.MOD_ID, name), item);
    }

    public static void registerModItems() {

        Betterthanvanilla.LOGGER.info("Registering Mod Items for " + Betterthanvanilla.MOD_ID);

    }
}
