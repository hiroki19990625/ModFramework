package jp.hiroki19990625.modframework.core.handler.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;

public interface IRegisterBlock {
    Block getBlock();

    ModelResourceLocation getResourceLocation();

    int getMetaDataCount();

    ItemBlock getBlockItem();
}
