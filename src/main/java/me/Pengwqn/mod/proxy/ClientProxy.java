package me.Pengwqn.mod.proxy;

import me.Pengwqn.mod.init.ModBlocks;
import me.Pengwqn.mod.init.ModItems;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void init() {
		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

}
