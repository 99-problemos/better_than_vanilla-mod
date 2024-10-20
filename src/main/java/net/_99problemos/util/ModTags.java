package net._99problemos.util;

import net._99problemos.Betterthanvanilla;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORE_PROSPECTING_PICK_PROSPECTED_BLOCKS =
                createTag("ore_prospecting_pick_prospected_blocks");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Betterthanvanilla.MOD_ID, name));



        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Betterthanvanilla.MOD_ID, name));



        }
    }
}
