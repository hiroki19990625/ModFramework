package jp.hiroki19990625.modframework.tests.entity;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TestZombie extends EntityZombie {

    public TestZombie(World worldIn) {
        super(worldIn);

        this.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 1000));
        this.experienceValue = 300;
    }
}
