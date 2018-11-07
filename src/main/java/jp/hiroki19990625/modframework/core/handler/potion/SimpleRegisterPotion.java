package jp.hiroki19990625.modframework.core.handler.potion;

import net.minecraft.potion.Potion;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class SimpleRegisterPotion implements IRegisterPotion {
    private Potion potionInstance;
    private boolean isAutoPotionType;
    private String typeName;
    private IRegisterPotionType potionType;

    public SimpleRegisterPotion(@Nonnull Potion potion) {
        this(potion, potion.getRegistryName().getResourcePath(), true);
    }

    public SimpleRegisterPotion(@Nonnull Potion potion, IRegisterPotionType potionType) {
        this.potionInstance = potion;
        this.potionType = potionType;
    }

    public SimpleRegisterPotion(@Nonnull Potion potion, String typeName, boolean isAutoPotionType) {
        this.potionInstance = potion;
        this.typeName = typeName;
        this.isAutoPotionType = isAutoPotionType;
    }

    @Nonnull
    @Override
    public Potion getPotion() {
        return this.potionInstance;
    }

    @Override
    public boolean isAutoPotionType() {
        return this.isAutoPotionType;
    }

    @Nonnull
    @Override
    public String getTypeName() {
        return this.typeName;
    }

    @Nullable
    @Override
    public IRegisterPotionType getRegisterPotionType() {
        return this.potionType;
    }
}
