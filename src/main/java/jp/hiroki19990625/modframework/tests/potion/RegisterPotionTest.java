package jp.hiroki19990625.modframework.tests.potion;

import jp.hiroki19990625.modframework.core.handler.RegisterEventHandler;
import jp.hiroki19990625.modframework.core.handler.potion.SimpleRegisterPotion;

public class RegisterPotionTest {
    public RegisterPotionTest() {
        RegisterEventHandler handler = new RegisterEventHandler();
        handler.registerPotion(new SimpleRegisterPotion(new PotionTest()));
    }
}
