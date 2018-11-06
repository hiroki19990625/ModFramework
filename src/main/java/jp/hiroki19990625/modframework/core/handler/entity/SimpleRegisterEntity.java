package jp.hiroki19990625.modframework.core.handler.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


public class SimpleRegisterEntity implements IRegisterEntity {
    private Class<? extends Entity> entityClass;
    private String name;
    private EntityEggInfo eggInfo;
    private ResourceLocation registryName;
    private IRenderFactory modelRender;

    public SimpleRegisterEntity(@Nonnull Class<? extends Entity> clazz, @Nonnull ResourceLocation registryName) {
        this(clazz, registryName, clazz.getSimpleName(), null);
    }

    public SimpleRegisterEntity(@Nonnull Class<? extends Entity> clazz, @Nonnull ResourceLocation registryName, @Nullable IRenderFactory modelRender) {
        this(clazz, registryName, clazz.getSimpleName(), modelRender);
    }

    public SimpleRegisterEntity(@Nonnull Class<? extends Entity> clazz, @Nonnull ResourceLocation registryName, @Nonnull String name, @Nullable IRenderFactory modelRender) {
        this(clazz, registryName, name, modelRender, null);
    }

    public SimpleRegisterEntity(@Nonnull Class<? extends Entity> clazz, @Nonnull ResourceLocation registryName, @Nonnull String name, @Nullable IRenderFactory modelRender, @Nullable EntityEggInfo egg) {
        this.entityClass = clazz;
        this.modelRender = modelRender;
        this.name = name;
        this.eggInfo = egg;
        this.registryName = registryName;
    }

    @Nonnull
    @Override
    public Class<? extends Entity> getEntity() {
        return entityClass;
    }

    @Nonnull
    @Override
    public String getName() {
        return name;
    }

    @Nullable
    @Override
    public EntityEggInfo getEgg() {
        return eggInfo;
    }

    @Nonnull
    @Override
    public ResourceLocation getRegistryName() {
        return registryName;
    }

    @Nullable
    @Override
    public IRenderFactory getModelRenderFactory() {
        return this.modelRender;
    }
}
