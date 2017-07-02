package me.Pengwqn.mod.init;

import me.Pengwqn.mod.items.ItemBCrystal;
import me.Pengwqn.mod.items.ItemGCrystal;
import me.Pengwqn.mod.items.ItemRCrystal;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item rcrystal;
	public static Item gcrystal;
	public static Item bcrystal;
	
	public static void init(){
		rcrystal = new ItemRCrystal();
		gcrystal = new ItemGCrystal();
		bcrystal = new ItemBCrystal();
		
	}
	
	public static void register(){
		GameRegistry.register(rcrystal);
		GameRegistry.register(gcrystal);
		GameRegistry.register(bcrystal);
	}
	
	public static void registerRenders(){
		registerRender(rcrystal);
		registerRender(gcrystal);
		registerRender(bcrystal);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
