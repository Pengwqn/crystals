<<<<<<< HEAD
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
=======
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
>>>>>>> 8daf87906cbe3b8ed7784b5023e60e58d537896d
