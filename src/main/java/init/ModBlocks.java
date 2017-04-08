package init;

import com.noodlecraft.customitems.blocks.BlockRubiks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block rubiks;

	public static void init() {
		rubiks = new BlockRubiks();
	}
	
	public static void register() {
		registerBlock(rubiks);
	}
	
	private static void registerBlock(Block b) {
		GameRegistry.register(b);
		ItemBlock item = new ItemBlock(b);
		item.setRegistryName(b.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(rubiks);
	}
	
	private static void registerRender(Block b) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(b), 0, new ModelResourceLocation(b.getRegistryName(), "inventory"));
	}

}
