package com.dudi.vbmod.init;

import com.dudi.vbmod.food.FoodBase;
import com.dudi.vbmod.items.ItemBase;
import com.dudi.vbmod.items.armor.ArmorBase;
import com.dudi.vbmod.items.tools.ToolAxe;
import com.dudi.vbmod.items.tools.ToolPick;
import com.dudi.vbmod.items.tools.ToolSpade;
import com.dudi.vbmod.items.tools.ToolSword;
import com.dudi.vbmod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    private static final Item.ToolMaterial MATERIAL_VIBRANIUM = EnumHelper.addToolMaterial(
            "material_vibraniums",
            6,
            8192,
            2000f,
            40f,
            400
    );
    private static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_VIBRANIUM = EnumHelper.addArmorMaterial(
            "armor_material_vibranium",
            Reference.MOD_ID + ":vibranium",
            10000,
            new int[] {90, 180, 240, 90},
            500,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            200.0f
    );


    //Armors
    public static final Item VIBRANIUM_HELMET = new ArmorBase("vibranium_helmet", ARMOR_MATERIAL_VIBRANIUM, 1, EntityEquipmentSlot.HEAD);
    public static final Item VIBRANIUM_CHESTPLATE = new ArmorBase("vibranium_chestplate", ARMOR_MATERIAL_VIBRANIUM, 1, EntityEquipmentSlot.CHEST);
    public static final Item VIBRANIUM_LEGGINGS = new ArmorBase("vibranium_leggings", ARMOR_MATERIAL_VIBRANIUM, 1, EntityEquipmentSlot.LEGS);
    public static final Item VIBRANIUM_BOOTS = new ArmorBase("vibranium_boots", ARMOR_MATERIAL_VIBRANIUM, 1, EntityEquipmentSlot.FEET);


    //Tools
    public static final ItemSword VIBRANIUM_SWORD = new ToolSword("vibranium_sword", MATERIAL_VIBRANIUM);
    public static final ItemPickaxe VIBRANIUM_PICKAXE = new ToolPick("vibranium_pickaxe", MATERIAL_VIBRANIUM);
    public static final ItemAxe VIBRANIUM_AXE = new ToolAxe("vibranium_axe", MATERIAL_VIBRANIUM);
    public static final ItemSpade VIBRANIUM_SHOVEL = new ToolSpade("vibranium_shovel", MATERIAL_VIBRANIUM);


    //Items
    public static final Item VIBRANIUM_DUST = new ItemBase("vibranium_dust");
    public static final Item VIBRANIUM_INGOT = new ItemBase("vibranium_ingot");


    //Food
    public static final Item VIBRANIUM_MEAT = new FoodBase("vibranium_meat", 19, 30.0f, false);
}
