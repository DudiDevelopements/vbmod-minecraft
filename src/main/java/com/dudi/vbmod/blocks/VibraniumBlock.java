package com.dudi.vbmod.blocks;

import com.dudi.vbmod.Main;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VibraniumBlock extends BlockBase {
    public VibraniumBlock(String name, Material material) {
        super(name, material);

        setCreativeTab(Main.ModCreativeTab);
        setSoundType(SoundType.METAL);
        setHardness(50.0f);
        setResistance(100000f);
        setHarvestLevel("pickaxe", 5);
        setLightLevel(1.0f);
    }
}
