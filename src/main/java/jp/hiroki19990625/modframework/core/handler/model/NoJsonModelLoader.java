package jp.hiroki19990625.modframework.core.handler.model;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;

import java.util.HashMap;

public class NoJsonModelLoader implements ICustomModelLoader {
    private String modDomain;
    private HashMap<String, IModel> models = new HashMap<>();

    private boolean initedFlag;

    public NoJsonModelLoader(String modDomain) {
        this.modDomain = modDomain;
    }

    @Override
    public boolean accepts(ResourceLocation modelLocation) {
        return modDomain.equals(modelLocation.getResourceDomain());
    }

    @Override
    public IModel loadModel(ResourceLocation modelLocation) throws Exception {
        initedFlag = true;
        return models.get(modelLocation.toString());
    }

    @Override
    public void onResourceManagerReload(IResourceManager resourceManager) {

    }

    public void registerModel(ResourceLocation location, IModel model) {
        if (initedFlag) {
            return;
        }
        models.put(location.toString(), model);
    }
}
