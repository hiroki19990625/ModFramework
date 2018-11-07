package jp.hiroki19990625.modframework.core.handler.potion;

import net.minecraft.potion.Potion;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface IRegisterPotion {
    @Nonnull
    Potion getPotion();

    boolean isAutoPotionType();

    @Nonnull
    String getTypeName();

    @Nullable
    IRegisterPotionType getRegisterPotionType();
}
