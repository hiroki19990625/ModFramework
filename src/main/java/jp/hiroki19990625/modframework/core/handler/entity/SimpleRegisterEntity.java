package jp.hiroki19990625.modframework.core.handler.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.util.ResourceLocation;


public class SimpleRegisterEntity implements IRegisterEntity {
    private Class<? extends Entity> entityClass;
    private ResourceLocation registryName;
    private String name;
    private EntityEggInfo eggInfo;

    public SimpleRegisterEntity(Class<? extends Entity> clazz, ResourceLocation registryName) {
        this(clazz, registryName, clazz.getSimpleName());
    }

    public SimpleRegisterEntity(Class<? extends Entity> clazz, ResourceLocation registryName, String name) {
        this(clazz, registryName, name, null);
    }

    public SimpleRegisterEntity(Class<? extends Entity> clazz, ResourceLocation registryName, String name, EntityEggInfo egg) {
        this.entityClass = clazz;
        this.registryName = registryName;
        this.name = name;
        this.eggInfo = egg;
    }

    @Override
    public Class<? extends Entity> getEntity() {
        return entityClass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ResourceLocation getRegistryName() {
        return registryName;
    }

    @Override
    public EntityEggInfo getEgg() {
        return eggInfo;
    }
}
