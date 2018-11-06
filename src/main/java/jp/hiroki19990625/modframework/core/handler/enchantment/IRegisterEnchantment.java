package jp.hiroki19990625.modframework.core.handler.enchantment;

import net.minecraft.enchantment.Enchantment;

import javax.annotation.Nonnull;

public interface IRegisterEnchantment {
    @Nonnull
    Enchantment getEnchantment();
}
