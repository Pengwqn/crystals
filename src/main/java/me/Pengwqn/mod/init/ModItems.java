package me.Pengwqn.mod.init;

import me.Pengwqn.mod.items.BCrystal;
import me.Pengwqn.mod.items.GCrystal;
import me.Pengwqn.mod.items.RCrystal;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item rcrystal;
	public static Item gcrystal;
	public static Item bcrystal;
	
	public static void init(){
		rcrystal = new RCrystal();
		gcrystal = new GCrystal();
		bcrystal = new BCrystal();
		
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
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}