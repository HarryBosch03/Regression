package net.boschingmachine.regression.Items;

import net.boschingmachine.regression.Regression;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister
{
    public static final DeferredRegister<Item> MainRegister = DeferredRegister.create(ForgeRegistries.ITEMS, Regression.ModID);

    public static void Register()
    {
        MainRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
