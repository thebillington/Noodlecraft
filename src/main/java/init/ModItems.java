package init;

import items.ItemNoodles;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item noodles;

	public static void init() {
		noodles = new ItemNoodles();
	}
	
	public static void register() {
		GameRegistry.register(noodles);
	}
	
	public static void registerRenders() {	
		registerRender(noodles);
	}
	
	private static void registerRender(Item i) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0, new ModelResourceLocation(i.getRegistryName(), "inventory"));
	}
	
}
