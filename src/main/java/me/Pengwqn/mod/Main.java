<<<<<<< HEAD
package me.Pengwqn.mod;

import me.Pengwqn.mod.init.ModBlocks;
import me.Pengwqn.mod.init.ModItems;
import me.Pengwqn.mod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		System.out.print("I'm preinitializing baby!");
		
		ModItems.init(); // Initializes items 
		ModItems.register(); // Registers the items in minecraft
		
		ModBlocks.init(); // Initializes blocks
		ModBlocks.register(); // Registers the blocks in minecraft
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		System.out.print("I'm initializing baby!");
		
		proxy.init();
		
		
	}
	
	@EventHandler
	public void Post(FMLPostInitializationEvent event){ 
		
		System.out.print("I'm postinitializing baby!");
		
	}
	
}
=======
package me.Pengwqn.mod;

import me.Pengwqn.mod.init.ModBlocks;
import me.Pengwqn.mod.init.ModItems;
import me.Pengwqn.mod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		System.out.print("I'm preinitializing baby!");
		
		ModItems.init(); // Initializes items 
		ModItems.register(); // Registers the items in minecraft
		
		ModBlocks.init(); // Initializes blocks
		ModBlocks.register(); // Registers the blocks in minecraft
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		System.out.print("I'm initializing baby!");
		
		proxy.init();
		
		
	}
	
	@EventHandler
	public void Post(FMLPostInitializationEvent event){ 
		
		System.out.print("I'm postinitializing baby!");
		
	}
	
}
>>>>>>> 8daf87906cbe3b8ed7784b5023e60e58d537896d
