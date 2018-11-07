package jp.hiroki19990625.modframework.tests.sound;

import jp.hiroki19990625.modframework.core.handler.RegisterEventHandler;
import jp.hiroki19990625.modframework.core.handler.sound.SimpleRegisterSoundEvent;

public class RegisterSoundEventTest {
    public RegisterSoundEventTest() {
        RegisterEventHandler handler = new RegisterEventHandler();
        handler.registerSoundEvent(new SimpleRegisterSoundEvent(new SoundEventTest()));
    }
}
