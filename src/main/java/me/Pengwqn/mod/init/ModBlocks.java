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
