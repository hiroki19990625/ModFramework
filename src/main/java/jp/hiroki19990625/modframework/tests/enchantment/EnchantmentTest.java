package jp.hiroki19990625.modframework.tests.enchantment;

import jp.hiroki19990625.modframework.ModCore;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentTest extends Enchantment {
    protected EnchantmentTest() {
        super(Rarity.COMMON, EnumEnchantmentType.ALL, EntityEquipmentSlot.values());
        this.setRegistryName(new ResourceLocation(ModCore.ModID, "test_enchantment"));
        this.setName("test_enchantment");
    }
}
