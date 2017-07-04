<<<<<<< HEAD
package me.Pengwqn.mod.init;

import me.Pengwqn.mod.items.blue_crystal;
import me.Pengwqn.mod.items.green_crystal;
import me.Pengwqn.mod.items.red_crystal;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item red_crystal;
	public static Item green_crystal;
	public static Item blue_crystal;
	
	public static void init(){
		red_crystal = new red_crystal();
		green_crystal = new green_crystal();
		blue_crystal = new blue_crystal();
		
	}
	
	public static void register(){
		GameRegistry.register(red_crystal);
		GameRegistry.register(green_crystal);
		GameRegistry.register(blue_crystal);
	}
	
	public static void registerRenders(){
		registerRender(red_crystal);
		registerRender(green_crystal);
		registerRender(blue_crystal);
	}
	
	private static void registerRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		System.out.print("Registered render for " + item.getUnlocalizedName());
	}

=======
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

>>>>>>> 8daf87906cbe3b8ed7784b5023e60e58d537896d
}