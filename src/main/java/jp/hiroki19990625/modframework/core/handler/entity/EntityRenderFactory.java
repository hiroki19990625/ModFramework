package jp.hiroki19990625.modframework.core.handler.entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;
import java.util.function.Function;

public class EntityRenderFactory implements IRenderFactory {
    private Function<RenderManager, Render> callback;

    public EntityRenderFactory(@Nonnull Function<RenderManager, Render> callback) {
        this.callback = callback;
    }

    @Nonnull
    @Override
    public Render createRenderFor(RenderManager manager) {
        return this.callback.apply(manager);
    }
}
