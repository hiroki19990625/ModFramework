package jp.hiroki19990625.modframework.core.handler.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class SimpleRegisterItem implements IRegisterItem {
    private Item itemInstance;
    private int metaDataCount;

    public SimpleRegisterItem(Item item) {
        this(item, 1);
    }

    public SimpleRegisterItem(Item item, int metaCount) {
        itemInstance = item;
        metaDataCount = metaCount;
    }

    @Override
    public Item getItem() {
        return itemInstance;
    }

    @Override
    public ModelResourceLocation getResourceLocation() {
        return new ModelResourceLocation(itemInstance.getRegistryName(), "inventory");
    }

    @Override
    public int getMetaDataCount() {
        return metaDataCount;
    }
}
