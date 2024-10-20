package net._99problemos.datagen;

import net._99problemos.ModBlocks;
import net._99problemos.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

import static net.minecraft.item.Items.ROTTEN_FLESH;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SMELTABLES = List.of(ModItems.UNREFINED_RUBY,
            ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ROTTEN_FLESH);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.UNREFINED_RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.UNREFINED_RUBY_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.RUBY, ModItems.UNREFINED_RUBY, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RUBY_BLOCK, ModBlocks.UNREFINED_RUBY_BLOCK, 1);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORE_PROSPECTING_PICK, 1)
                .pattern("XYZ")
                .pattern("A#B")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('Y', Items.COBBLESTONE)
                .input('Z', Items.IRON_INGOT)
                .input('A', Items.DIAMOND)
                .input('B', Items.NETHERITE_INGOT)
                .input('#', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORE_PROSPECTING_PICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHER_COAL, 1)
                .pattern("ABC")
                .pattern("#&@")
                .pattern("XYZ")
                .input('X', Items.COAL_BLOCK)
                .input('Y', Items.REDSTONE_BLOCK)
                .input('Z', Items.FIRE_CHARGE)
                .input('A', Items.GLOWSTONE)
                .input('B', Items.NETHERRACK)
                .input('C', Items.MAGMA_BLOCK)
                .input('#', Items.COAL)
                .input('&', Items.LAVA_BUCKET)
                .input('@', Items.BLAZE_ROD)
                .criterion(hasItem(Items.COAL_BLOCK), conditionsFromItem(Items.COAL_BLOCK))
                .criterion(hasItem(Items.REDSTONE_BLOCK), conditionsFromItem(Items.REDSTONE_BLOCK))
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .criterion(hasItem(Items.GLOWSTONE), conditionsFromItem(Items.GLOWSTONE))
                .criterion(hasItem(Items.NETHERRACK), conditionsFromItem(Items.NETHERRACK))
                .criterion(hasItem(Items.MAGMA_BLOCK), conditionsFromItem(Items.MAGMA_BLOCK))
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                .criterion(hasItem(Items.LAVA_BUCKET), conditionsFromItem(Items.LAVA_BUCKET))
                .criterion(hasItem(Items.BLAZE_ROD), conditionsFromItem(Items.BLAZE_ROD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHER_COAL)));

        offerSmelting(exporter, SMELTABLES, RecipeCategory.MISC, Items.LEATHER,
                0.35f, 200, "rotten_flesh_to_leather_smelting");

        offerBlasting(exporter, SMELTABLES, RecipeCategory.MISC, Items.LEATHER,
                0.35f, 100, "rotten_flesh_to_leather_blasting");

    }
}
