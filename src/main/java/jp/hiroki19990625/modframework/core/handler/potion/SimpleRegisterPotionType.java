package jp.hiroki19990625.modframework.core.handler.potion;

import net.minecraft.potion.PotionType;

import javax.annotation.Nonnull;

public class SimpleRegisterPotionType implements IRegisterPotionType {
    private PotionType potionTypeInstance;

    public SimpleRegisterPotionType(@Nonnull PotionType potionType) {
        this.potionTypeInstance = potionType;
    }

    @Nonnull
    @Override
    public PotionType getPotionType() {
        return this.potionTypeInstance;
    }
}
