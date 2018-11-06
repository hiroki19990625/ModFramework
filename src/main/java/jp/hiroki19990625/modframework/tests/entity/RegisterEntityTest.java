package jp.hiroki19990625.modframework.tests.entity;

import jp.hiroki19990625.modframework.ModCore;
import jp.hiroki19990625.modframework.core.handler.RegisterEventHandler;
import jp.hiroki19990625.modframework.core.handler.entity.EntityRenderFactory;
import jp.hiroki19990625.modframework.core.handler.entity.SimpleRegisterEntity;
import net.minecraft.util.ResourceLocation;

public class RegisterEntityTest {
    public RegisterEntityTest() {
        RegisterEventHandler handler = new RegisterEventHandler();
        EntityRenderFactory factory = new EntityRenderFactory((m) -> {
            return new TestZombieRender(m);
        });
        handler.registerEntity(new SimpleRegisterEntity(TestZombie.class, new ResourceLocation(ModCore.ModID, "test_zombie"), factory));
    }
}
