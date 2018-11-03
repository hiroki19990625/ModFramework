package jp.hiroki19990625.modframework.core.handler.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public interface IRegisterItem {
    Item getItem();

    ModelResourceLocation getResourceLocation();

    int getMetaDataCount();
}
