package jp.hiroki19990625.modframework.tests;

import jp.hiroki19990625.modframework.ModCore;
import jp.hiroki19990625.modframework.core.handler.RegisterEventHandler;
import jp.hiroki19990625.modframework.core.handler.block.SimpleRegisterBlock;
import jp.hiroki19990625.modframework.core.handler.item.SimpleRegisterItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class RegisterBlockAndItem {
    public RegisterBlockAndItem() {
        RegisterEventHandler handler = new RegisterEventHandler();
        handler.registerItem(new SimpleRegisterItem(new Item()
                .setRegistryName(new ResourceLocation(ModCore.ModID, "test"))
                .setCreativeTab(CreativeTabs.FOOD)
                .setUnlocalizedName("test")));
        handler.registerBlock(new SimpleRegisterBlock(new Block(Material.ANVIL)
                .setRegistryName(new ResourceLocation(ModCore.ModID, "test_block"))
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
                .setUnlocalizedName("test_block")));
    }
}
