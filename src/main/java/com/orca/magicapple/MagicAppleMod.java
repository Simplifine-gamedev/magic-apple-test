package com.orca.magicapple;

import net.fabricmc.api.ModInitializer;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicAppleMod implements ModInitializer {
    public static final String MOD_ID = "magic-apple-test";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final FoodComponent MAGIC_APPLE_FOOD = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 1), 1.0f)
            .build();

    public static final Item MAGIC_APPLE = new Item(new Item.Settings().food(MAGIC_APPLE_FOOD));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "magic_apple"), MAGIC_APPLE);
        LOGGER.info("Magic Apple Mod initialized! Enjoy your Speed II apples!");
    }
}
