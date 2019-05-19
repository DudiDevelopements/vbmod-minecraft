package com.dudi.vbmod.blocks.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerVibraniumFurnace extends Container {
    private int cookTime, totalCookTime, burnTime, currentBurnTime;

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return true;
    }
}
