package com.dudi.vbmod.blocks;

import com.dudi.vbmod.Main;
import com.dudi.vbmod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class VibraniumOre extends BlockBase {
    public VibraniumOre(String name, Material material) {
        super(name, material);

        setCreativeTab(Main.ModCreativeTab);
        setSoundType(SoundType.METAL);
        setHardness(5f);
        setResistance(100f);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(10f);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.VIBRANIUM_DUST;
    }


    @Override
    public int quantityDropped(Random random) {
        int max = 3;
        int min = 1;
        return random.nextInt(max)+min;
    }
}
