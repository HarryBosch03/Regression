package net.boschingmachine.regression.Blocks;

import net.boschingmachine.regression.Regression;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegister
{
    public static final DeferredRegister<Item> ItemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, Regression.ModID);
    public static final DeferredRegister<Item> BlockRegister = DeferredRegister.create(ForgeRegistries.ITEMS, Regression.ModID);

    public static void Register()
    {
        BlockRegister.register();

        BlockRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
