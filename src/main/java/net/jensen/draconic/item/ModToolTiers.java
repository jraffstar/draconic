package net.jensen.draconic.item;

import net.jensen.draconic.Draconic;
import net.jensen.draconic.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier GONKTIER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 999999, 420f, 7523f, 7523,
                    ModTags.Blocks.NEEDS_GONK_TOOL, () -> Ingredient.of(ModItems.GONK.get())),
            new ResourceLocation(Draconic.MOD_ID, "gonk"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier PLONKTIER = TierSortingRegistry.registerTier(
            new ForgeTier(6, 420, 420f, 420f, 420,
                    ModTags.Blocks.NEEDS_PLONK_TOOL, () -> Ingredient.of(ModItems.PLONK.get())),
            new ResourceLocation(Draconic.MOD_ID, "plonk"), List.of(Tiers.NETHERITE), List.of());

}