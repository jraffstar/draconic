package net.jensen.draconic.util;

import net.jensen.draconic.Draconic;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


//idfk makes tooltier work
public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_GONK_TOOL = tag("needs_gonk_tool");

        public static final TagKey<Block> NEEDS_PLONK_TOOL = tag("needs_plonk_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Draconic.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Draconic.MOD_ID, name));
        }
    }
}