package sodlier.STM;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

@Mod(modid = "stm", name = "Sodlier's Tech Mod", version = "1.0")
public class STM {
	
	public static Item deshPowderEdible;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block initialize and register
		//Configure handling
		deshPowderEdible = new ItemFood(5, 0.8f, false).setUnlocalizedName("desh_powder_edible").setTextureName("stm:desh_powder");
		GameRegistry.registerItem(deshPowderEdible, deshPowderEdible.getUnlocalizedName().substring(5));
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TitleEntity, entity, GUI and Packet Registering
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
