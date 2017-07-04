<<<<<<< HEAD
package me.Pengwqn.mod.init;

import me.Pengwqn.mod.blocks.blue_crystal_block;
import me.Pengwqn.mod.blocks.blue_crystal_ore;
import me.Pengwqn.mod.blocks.green_crystal_block;
import me.Pengwqn.mod.blocks.green_crystal_ore;
import me.Pengwqn.mod.blocks.red_crystal_block;
import me.Pengwqn.mod.blocks.red_crystal_ore;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block red_crystal_block;
	public static Block green_crystal_block;
	public static Block blue_crystal_block;
	public static Block red_crystal_ore;
	public static Block green_crystal_ore;
	public static Block blue_crystal_ore;
	
	public static void init(){
		red_crystal_block = new red_crystal_block();
		green_crystal_block = new green_crystal_block();
		blue_crystal_block = new blue_crystal_block();
		red_crystal_ore = new red_crystal_ore();
		green_crystal_ore = new green_crystal_ore();
		blue_crystal_ore = new blue_crystal_ore();
		
	}
	
	private static void registerBlock(Block block){
		
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
		
	}
	
	public static void register(){

		registerBlock(red_crystal_block);
		registerBlock(green_crystal_block);
		registerBlock(blue_crystal_block);
		registerBlock(red_crystal_ore);
		registerBlock(green_crystal_ore);
		registerBlock(blue_crystal_ore);
		
	}
	
	public static void registerRenders(){
		
		registerRender(red_crystal_block);
		registerRender(green_crystal_block);
		registerRender(blue_crystal_block);
		registerRender(red_crystal_ore);
		registerRender(green_crystal_ore);
		registerRender(blue_crystal_ore);
	}
	
	private static void registerRender(Block block){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		System.out.print("Registered render for " + block.getUnlocalizedName());
	}
}
=======
package me.Pengwqn.mod.init;

import me.Pengwqn.mod.blocks.BCrystalBlock;
import me.Pengwqn.mod.blocks.BlueCOre;
import me.Pengwqn.mod.blocks.GCrystalBlock;
import me.Pengwqn.mod.blocks.GreenCOre;
import me.Pengwqn.mod.blocks.RCrystalBlock;
import me.Pengwqn.mod.blocks.RedCOre;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block rcblock;
	public static Block gcblock;
	public static Block bcblock;
	public static Block rcore;
	public static Block gcore;
	public static Block bcore;
	
	public static void init(){
		rcblock = new RCrystalBlock();
		gcblock = new GCrystalBlock();
		bcblock = new BCrystalBlock();
		rcore = new RedCOre();
		gcore = new GreenCOre();
		bcore = new BlueCOre();
		
	}
	
	private static void registerBlock(Block block){
		
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
		
	}
	
	public static void register(){

		registerBlock(rcblock);
		registerBlock(gcblock);
		registerBlock(bcblock);
		registerBlock(rcore);
		registerBlock(gcore);
		registerBlock(bcore);
		
	}
	
	public static void registerRenders(){
		
		registerRender(rcblock);
		registerRender(gcblock);
		registerRender(bcblock);
		registerRender(rcore);
		registerRender(gcore);
		registerRender(bcore);
	}
	
	private static void registerRender(Block block){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
>>>>>>> 8daf87906cbe3b8ed7784b5023e60e58d537896d
