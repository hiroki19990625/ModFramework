package jp.hiroki19990625.modframework.tests;

import jp.hiroki19990625.modframework.ModCore;
import jp.hiroki19990625.modframework.core.handler.RegisterEventHandler;
import jp.hiroki19990625.modframework.core.handler.entity.SimpleRegisterEntity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;

public class RegisterEntityTest {
    public RegisterEntityTest() {
        RegisterEventHandler handler = new RegisterEventHandler();
        handler.registerEntity(new SimpleRegisterEntity(TestZombie.class, new ResourceLocation(ModCore.ModID, "test_zombie"), "TestZombie"));
    }
}
