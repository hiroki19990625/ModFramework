package jp.hiroki19990625.modframework.core.handler.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface IRegisterEntity {
    @Nonnull
    Class<? extends Entity> getEntity();

    @Nonnull
    String getName();

    @Nullable
    EntityEggInfo getEgg();

    @Nonnull
    ResourceLocation getRegistryName();

    @Nullable
    IRenderFactory getModelRenderFactory();
}
