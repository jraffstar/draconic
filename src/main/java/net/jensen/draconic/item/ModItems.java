package net.jensen.draconic.item;

import net.jensen.draconic.Draconic;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// Makes Items work idk, register them or somethin
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Draconic.MOD_ID);

    // Register an item using this, in this case replace GONK and gonk with whatever item you wanna add
    public static final RegistryObject<Item> GONK = ITEMS.register("gonk",
            // make it sword
            () -> new SwordItem(ModToolTiers.GONKTIER, 7523, 420, new Item.Properties()));

    public static final RegistryObject<Item> PLONK = ITEMS.register("plonk",
            () -> new SwordItem(ModToolTiers.PLONKTIER, 1, 1, new Item.Properties()));
    // event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}