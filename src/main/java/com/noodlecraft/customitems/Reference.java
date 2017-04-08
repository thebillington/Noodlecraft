package com.noodlecraft.customitems;

public class Reference {

	public static final String MOD_ID = "noodlecraft";
	public static final String NAME = "Noodlecraft";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.noodlecraft.customitems.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.noodlecraft.customitems.proxy.ServerProxy";
	
	public static enum CustomItems {
		NOODLES("noodles", "ItemNoodles");
		
		private String unlocalizedName;
		private String registryName;
		
		CustomItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
	}
	
	public static enum CustomBlocks {
		RUBIKS("rubiks", "BlockRubiks");
		
		private String unlocalizedName;
		private String registryName;
		
		CustomBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
}
