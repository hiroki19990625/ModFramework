package jp.hiroki19990625.modframework.core.handler.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;

import javax.annotation.Nonnull;

public class SimpleRegisterBlock implements IRegisterBlock {
    private Block blockInstance;
    private int metaDataCount;

    public SimpleRegisterBlock(@Nonnull Block block) {
        this(block, 1);
    }

    public SimpleRegisterBlock(@Nonnull Block block, int metaCount) {
        blockInstance = block;
        metaDataCount = metaCount;
    }

    @Nonnull
    @Override
    public Block getBlock() {
        return blockInstance;
    }

    @Nonnull
    @Override
    public ModelResourceLocation getResourceLocation() {
        return new ModelResourceLocation(blockInstance.getLocalizedName(), "inventory");
    }

    @Override
    public int getMetaDataCount() {
        return metaDataCount;
    }

    @Nonnull
    @Override
    public ItemBlock getBlockItem() {
        return (ItemBlock) new ItemBlock(blockInstance).setRegistryName(blockInstance.getRegistryName());
    }
}
