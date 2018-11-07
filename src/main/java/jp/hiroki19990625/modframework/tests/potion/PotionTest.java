package jp.hiroki19990625.modframework.tests.potion;

import jp.hiroki19990625.modframework.ModCore;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionTest extends Potion {
    protected PotionTest() {
        super(false, 0xff00ff);

        this.setRegistryName(new ResourceLocation(ModCore.ModID, "test_potion"));
        this.setPotionName("test");
    }
}
