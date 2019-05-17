package com.dudi.vbmod.items.tools;

import com.dudi.vbmod.Main;
import com.dudi.vbmod.init.ModCreativeTab;
import com.dudi.vbmod.init.ModItems;
import com.dudi.vbmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
    public ToolAxe(String name, Item.ToolMaterial material) {
        super(material, 6.0f, -3.2f);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.ModCreativeTab);
        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() { Main.proxy.registerItemRenderer(this, 0 , "inventory"); }
}
