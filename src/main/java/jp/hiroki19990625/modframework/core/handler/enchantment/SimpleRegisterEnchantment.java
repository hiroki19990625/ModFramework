package jp.hiroki19990625.modframework.core.handler.enchantment;

import net.minecraft.enchantment.Enchantment;

import javax.annotation.Nonnull;

public class SimpleRegisterEnchantment implements IRegisterEnchantment {
    private Enchantment enchantmentInstance;

    public SimpleRegisterEnchantment(Enchantment enchantment) {
        this.enchantmentInstance = enchantment;
    }

    @Nonnull
    @Override
    public Enchantment getEnchantment() {
        return this.enchantmentInstance;
    }
}
