package com.dudi.vbmod.util.handler;

import com.dudi.vbmod.blocks.container.ContainerVibraniumChest;
import com.dudi.vbmod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {


    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == Reference.GUI_VIBRANIUM_CHEST) return new ContainerVibraniumChest(player.inventory, 12*15, player);
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == Reference.GUI_VIBRANIUM_CHEST) return new GuiVibraniumChest();
        return null;
    }

    public static void registerGUIs() {

    }
}
