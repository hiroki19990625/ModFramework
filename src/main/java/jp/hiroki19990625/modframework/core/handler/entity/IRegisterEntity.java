package jp.hiroki19990625.modframework.core.handler.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.util.ResourceLocation;

public interface IRegisterEntity {
    Class<? extends Entity> getEntity();

    String getName();

    EntityEggInfo getEgg();

    ResourceLocation getRegistryName();
}
