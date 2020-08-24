package bkelly.tutorial.init;

import bkelly.tutorial.Tutorial;
import bkelly.tutorial.items.PoisonAppleItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tutorial.MOD_ID);

    public static final RegistryObject<PoisonAppleItem> POISON_APPLE = ITEMS.register("poison_apple", PoisonAppleItem::new);
}
