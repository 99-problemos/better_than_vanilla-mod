package net._99problemos;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.
            Builder().
            hunger(1).
            saturationModifier(0.3f).
            build();
    public static final FoodComponent GOLDEN_BERRIES = new FoodComponent
            .Builder().hunger(4).saturationModifier(0.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION
                    , (int) 2000.0f, (int) 1.0f), 100.0f).build();
}
