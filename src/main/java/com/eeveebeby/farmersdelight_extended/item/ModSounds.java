package com.eeveebeby.farmersdelight_extended.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, "farmersdelight_extended");

    public static final DeferredHolder<SoundEvent, SoundEvent> FART = SOUND_EVENTS.register(
            "farts",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("farmersdelight_extended", "farts"))
    );
}
