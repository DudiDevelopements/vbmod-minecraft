package com.dudi.vbmod.food;

import com.dudi.vbmod.Main;
import com.dudi.vbmod.init.ModItems;
import com.dudi.vbmod.util.IHasModel;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {
    public  FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
        super(amount, saturation, isAnimalFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.ModCreativeTab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this,0, "inventory");
    }
}
