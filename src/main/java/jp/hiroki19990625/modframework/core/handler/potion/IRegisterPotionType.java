package jp.hiroki19990625.modframework.core.handler.potion;

import net.minecraft.potion.PotionType;

import javax.annotation.Nonnull;

public interface IRegisterPotionType {
    @Nonnull
    PotionType getPotionType();
}
