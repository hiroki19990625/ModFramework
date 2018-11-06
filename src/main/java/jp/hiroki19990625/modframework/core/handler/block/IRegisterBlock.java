package jp.hiroki19990625.modframework.core.handler.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;

import javax.annotation.Nonnull;

public interface IRegisterBlock {
    @Nonnull
    Block getBlock();

    @Nonnull
    ModelResourceLocation getResourceLocation();

    int getMetaDataCount();

    @Nonnull
    ItemBlock getBlockItem();
}
