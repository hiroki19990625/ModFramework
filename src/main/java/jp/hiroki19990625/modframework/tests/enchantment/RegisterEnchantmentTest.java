package jp.hiroki19990625.modframework.tests.enchantment;

import jp.hiroki19990625.modframework.core.handler.RegisterEventHandler;
import jp.hiroki19990625.modframework.core.handler.enchantment.SimpleRegisterEnchantment;

public class RegisterEnchantmentTest {
    public RegisterEnchantmentTest() {
        RegisterEventHandler handler = new RegisterEventHandler();
        handler.registerEnchantment(new SimpleRegisterEnchantment(new EnchantmentTest()));
    }
}
