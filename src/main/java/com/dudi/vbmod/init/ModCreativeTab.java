package com.dudi.vbmod.init;

import com.dudi.vbmod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModCreativeTab extends CreativeTabs {

    public ModCreativeTab(String name) {
        super(Reference.MOD_ID + "." + name);
    }

    @SideOnly(Side.CLIENT)

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.VIBRANIUM_DUST);
    }

}