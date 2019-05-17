package com.dudi.vbmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(new ItemStack(ModItems.VIBRANIUM_DUST), new ItemStack(ModItems.VIBRANIUM_INGOT), 5.5f);
    }
}
