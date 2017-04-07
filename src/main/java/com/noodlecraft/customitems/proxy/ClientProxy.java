package com.noodlecraft.customitems.proxy;

import init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
	}
	
}
