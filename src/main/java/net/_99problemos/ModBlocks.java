package net._99problemos;

import net._99problemos.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block RUBY_BLOCK;
    public static final Block UNREFINED_RUBY_BLOCK;
    public static final Block RUBY_ORE;
    public static final Block SOUND_BLOCK;

    static {
        SOUND_BLOCK = registerBlock("sound_block",
                new SoundBlock(AbstractBlock.Settings.create()
                        .mapColor(MapColor.WHITE)
                        .instrument(Instrument.DIDGERIDOO)
                        .requiresTool()
                        .strength(1.0f,1.0f)
                        .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                )
        );

        RUBY_ORE = registerBlock("ruby_ore",
                new ExperienceDroppingBlock(
                        AbstractBlock.Settings.create()
                                .mapColor(MapColor.STONE_GRAY)
                                .instrument(Instrument.BASEDRUM)
                                .requiresTool()
                                .strength(2.0F, 2.0F)
                                .sounds(BlockSoundGroup.STONE),
                        UniformIntProvider.create(3, 7)
                )
        );
        UNREFINED_RUBY_BLOCK = registerBlock("unrefined_ruby_block",
                new Block(
                        AbstractBlock.Settings.create()
                                .mapColor(MapColor.RAW_IRON_PINK)
                                .instrument(Instrument.BASEDRUM)
                                .requiresTool()
                                .strength(5.0F, 6.0F)
                                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                )
        );
        RUBY_BLOCK = registerBlock("ruby_block",
                new Block(
                        AbstractBlock.Settings.create()
                                .mapColor(MapColor.RED)
                                .instrument(Instrument.BIT)
                                .requiresTool()
                                .strength(5.0F, 6.0F)
                                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                )
        );
    }

    public static final Block DEEPSLATE_RUBY_ORE;

    static {
        DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
                new ExperienceDroppingBlock(
                        AbstractBlock.Settings.create()
                                .mapColor(MapColor.DEEPSLATE_GRAY)
                                .instrument(Instrument.BASEDRUM)
                                .requiresTool()
                                .strength(4.0F, 4.0F)
                                .sounds(BlockSoundGroup.DEEPSLATE),
                        UniformIntProvider.create(3, 7)
                )
        );
    }


    private static Block registerBlock(String id, Block block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(Betterthanvanilla.MOD_ID, id), block);
    }

    private static Item registerBlockItem(String id, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Betterthanvanilla.MOD_ID, id),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Betterthanvanilla.LOGGER.info("Registering ModBlocks for " + Betterthanvanilla.MOD_ID);
    }
}
