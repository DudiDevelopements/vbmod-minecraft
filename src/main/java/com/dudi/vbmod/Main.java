package com.dudi.vbmod;

import com.dudi.vbmod.init.ModCreativeTab;
import com.dudi.vbmod.init.ModRecipes;
import com.dudi.vbmod.proxy.CommonProxy;
import com.dudi.vbmod.util.Reference;
import com.dudi.vbmod.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@SuppressWarnings("unused")
@Mod(modid = Reference.MOD_ID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTEDMCVERSIONS)
public class Main {
    public static final CreativeTabs ModCreativeTab = new ModCreativeTab("modCreativeTab");

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent ev) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);

    }

    @EventHandler
    public static void init(FMLInitializationEvent ev) {
        ModRecipes.init();

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent ev) {


    }

}
