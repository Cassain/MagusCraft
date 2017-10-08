package cassain.maguscraft.init;

import java.util.List;

import cassain.maguscraft.objects.armor.ArmorBase;
import cassain.maguscraft.objects.items.ItemBase;
import cassain.maguscraft.objects.tools.ToolAxe;
import cassain.maguscraft.objects.tools.ToolHoe;
import cassain.maguscraft.objects.tools.ToolPickaxe;
import cassain.maguscraft.objects.tools.ToolShovel;
import cassain.maguscraft.objects.tools.ToolSword;
import cassain.maguscraft.util.Reference;

import java.util.ArrayList;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_MAGUSIUM = EnumHelper.addToolMaterial("tool_magusium", 2, 750, 7.0F, 3.0F, 14);
	public static final ArmorMaterial ARMOR_MAGUSIUM = EnumHelper.addArmorMaterial("armor_magusium", Reference.MODID + ":magusium", 20, new int[]{2, 6, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	
	//Items
	public static final Item INGOT_MAGUSIUM = new ItemBase("ingot_magusium");
	
	//Tools
	public static final Item SWORD_MAGUSIUM = new ToolSword("sword_magusium", TOOL_MAGUSIUM);
	public static final Item PICKAXE_MAGUSIUM = new ToolPickaxe("pickaxe_magusium", TOOL_MAGUSIUM);
	public static final Item SHOVEL_MAGUSIUM = new ToolShovel("shovel_magusium", TOOL_MAGUSIUM);
	public static final Item AXE_MAGUSIUM = new ToolAxe("axe_magusium", TOOL_MAGUSIUM);
	public static final Item HOE_MAGUSIUM = new ToolHoe("hoe_magusium", TOOL_MAGUSIUM);
	
	//Armor
	public static final Item HELMET_MAGUSIUM = new ArmorBase("helmet_magusium", ARMOR_MAGUSIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_MAGUSIUM = new ArmorBase("chestplate_magusium", ARMOR_MAGUSIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_MAGUSIUM = new ArmorBase("leggings_magusium", ARMOR_MAGUSIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_MAGUSIUM = new ArmorBase("boots_magusium", ARMOR_MAGUSIUM, 1, EntityEquipmentSlot.FEET);
	
}
