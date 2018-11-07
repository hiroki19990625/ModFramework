package jp.hiroki19990625.modframework.tests.item;

import jp.hiroki19990625.modframework.ModCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemTest extends Item {
    public ItemTest() {
        this.setRegistryName(new ResourceLocation(ModCore.ModID, "test"));
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setUnlocalizedName("test");
    }
}
