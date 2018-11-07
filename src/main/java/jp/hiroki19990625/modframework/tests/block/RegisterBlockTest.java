package jp.hiroki19990625.modframework.tests.block;

import jp.hiroki19990625.modframework.core.handler.RegisterEventHandler;
import jp.hiroki19990625.modframework.core.handler.block.SimpleRegisterBlock;

public class RegisterBlockTest {
    public RegisterBlockTest() {
        RegisterEventHandler handler = new RegisterEventHandler();
        handler.registerBlock(new SimpleRegisterBlock(new BlockTest()));
    }
}
