package jp.hiroki19990625.modframework.tests.item;

import jp.hiroki19990625.modframework.core.handler.RegisterEventHandler;
import jp.hiroki19990625.modframework.core.handler.item.SimpleRegisterItem;

public class RegisterItemTest {
    public RegisterItemTest() {
        RegisterEventHandler handler = new RegisterEventHandler();
        handler.registerItem(new SimpleRegisterItem(new ItemTest()));
    }
}
