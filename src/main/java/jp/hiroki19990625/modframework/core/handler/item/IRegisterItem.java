package jp.hiroki19990625.modframework.core.handler.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;

public interface IRegisterItem {
    @Nonnull
    Item getItem();

    @Nonnull
    ModelResourceLocation getResourceLocation();

    int getMetaDataCount();
}
