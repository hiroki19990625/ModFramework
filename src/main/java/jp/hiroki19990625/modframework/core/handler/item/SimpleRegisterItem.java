package jp.hiroki19990625.modframework.core.handler.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class SimpleRegisterItem implements IRegisterItem {
    private Item itemInstance;
    private int metaDataCount;

    public SimpleRegisterItem(@Nonnull Item item) {
        this(item, 1);
    }

    public SimpleRegisterItem(@Nonnull Item item, int metaCount) {
        itemInstance = item;
        metaDataCount = metaCount;
    }

    @Nonnull
    @Override
    public Item getItem() {
        return itemInstance;
    }

    @Nonnull
    @Override
    public ModelResourceLocation getResourceLocation() {
        return new ModelResourceLocation(itemInstance.getRegistryName(), "inventory");
    }

    @Nullable
    @Override
    public int getMetaDataCount() {
        return metaDataCount;
    }
}
