package me.Pengwqn.mod.init;

import me.Pengwqn.mod.blocks.BlockBCrystal;
import me.Pengwqn.mod.blocks.BlockGCrystal;
import me.Pengwqn.mod.blocks.BlockRCrystal;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block rcblock;
	public static Block gcblock;
	public static Block bcblock;
	
	public static void init(){
		rcblock = new BlockRCrystal();
		gcblock = new BlockGCrystal();
		bcblock = new BlockBCrystal();
		
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
		
	}
	
	public static void registerRenders(){
		
		registerRender(rcblock);
		registerRender(gcblock);
		registerRender(bcblock);
	}
	
	private static void registerRender(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getUnlocalizedName(), "inventory"));
	}
}
