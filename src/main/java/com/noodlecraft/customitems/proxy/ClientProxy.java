package com.noodlecraft.customitems.proxy;

import init.ModBlocks;
import init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
	
}
