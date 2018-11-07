package jp.hiroki19990625.modframework.tests.sound;

import jp.hiroki19990625.modframework.ModCore;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundEventTest extends SoundEvent {
    public SoundEventTest() {
        super(new ResourceLocation(ModCore.ModID, "test_sound"));
        this.setRegistryName(new ResourceLocation(ModCore.ModID, "test_sound"));
    }
}
