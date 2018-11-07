package jp.hiroki19990625.modframework.tests.block;

import jp.hiroki19990625.modframework.ModCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class BlockTest extends Block {
    public BlockTest() {
        super(Material.ROCK, MapColor.GRAY_STAINED_HARDENED_CLAY);

        this.setRegistryName(new ResourceLocation(ModCore.ModID, "test_block"));
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setUnlocalizedName("test_block");
    }
}
