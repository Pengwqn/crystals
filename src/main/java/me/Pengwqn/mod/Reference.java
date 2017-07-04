<<<<<<< HEAD
package me.Pengwqn.mod;

public class Reference {
	public static final String MOD_ID = "pencry";
	public static final String NAME = "Pengwqn's Random Item Mod";
	public static final String VERSION = "a1.0.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4,1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "me.Pengwqn.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "me.Pengwqn.mod.proxy.ServerProxy";
	
	public static enum PenItems{

		RCRYSTAL("rcrystal", "red_crystal"),
		GCRYSTAL("gcrystal", "green_crystal"),
		BCRYSTAL("bcrystal", "blue_crystal");
		
		private String unlocalizedName;
		private String registryName;
		
		PenItems(String unlocalizedName, String registryName){
			
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
	}
	
	public static enum PenBlocks{

		RCBLOCK("rcblock", "red_crystal_block"),
		GCBLOCK("gcblock", "green_crystal_block"),
		BCBLOCK("bcblock", "blue_crystal_block"),
		
		// CRYSTAL ORES
		RCORE("rcore", "red_crystal_ore"),
		GCORE("gcore", "green_crystal_ore"),
		BCORE("bcore", "blue_crystal_ore");
		
		private String registryName;
		private String unlocalizedName;
		
		PenBlocks(String unlocalizedName, String registryName){
			
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
	}
	
}
=======
package me.Pengwqn.mod;

public class Reference {
	public static final String MOD_ID = "pencry";
	public static final String NAME = "Pengwqn's Random Item Mod";
	public static final String VERSION = "a1.0.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4,1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "me.Pengwqn.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "me.Pengwqn.mod.proxy.ServerProxy";
	
	public static enum PenItems{

		RCRYSTAL("rcrystal", "RCrystal"),
		GCRYSTAL("gcrystal", "GCrystal"),
		BCRYSTAL("bcrystal", "BCrystal");
		
		private String unlocalizedName;
		private String registryName;
		
		PenItems(String unlocalizedName, String registryName){
			
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
	}
	
	public static enum PenBlocks{

		RCBLOCK("rcblock", "RCrystal"),
		GCBLOCK("gcblock", "GCrystal"),
		BCBLOCK("bcblock", "BCrystal"),
		
		// CRYSTAL ORES
		RCORE("rcore", "RCOre"),
		GCORE("gcore", "GCOre"),
		BCORE("bcore", "BCOre");
		
		private String registryName;
		private String unlocalizedName;
		
		PenBlocks(String unlocalizedName, String registryName){
			
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
	}
	
}
>>>>>>> 8daf87906cbe3b8ed7784b5023e60e58d537896d
