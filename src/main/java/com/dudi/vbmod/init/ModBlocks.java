package com.dudi.vbmod.init;

import com.dudi.vbmod.blocks.VibraniumBlock;
import com.dudi.vbmod.blocks.VibraniumOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Ores
    public static final Block VIBRANIUM_BLOCK = new VibraniumBlock("vibranium_block", Material.IRON);

    //Blocks
    public static final Block VIBRANIUM_ORE = new VibraniumOre("vibranium_ore", Material.ROCK);
    
}
