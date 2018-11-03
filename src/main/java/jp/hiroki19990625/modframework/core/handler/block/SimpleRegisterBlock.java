package jp.hiroki19990625.modframework.core.handler.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;

public class SimpleRegisterBlock implements IRegisterBlock {
    private Block blockInstance;
    private int metaDataCount;

    public SimpleRegisterBlock(Block block) {
        this(block, 1);
    }

    public SimpleRegisterBlock(Block block, int metaCount) {
        blockInstance = block;
        metaDataCount = metaCount;
    }

    @Override
    public Block getBlock() {
        return blockInstance;
    }

    @Override
    public ModelResourceLocation getResourceLocation() {
        return new ModelResourceLocation(blockInstance.getLocalizedName(), "inventory");
    }

    @Override
    public int getMetaDataCount() {
        return metaDataCount;
    }

    @Override
    public ItemBlock getBlockItem() {
        return (ItemBlock) new ItemBlock(blockInstance).setRegistryName(blockInstance.getRegistryName());
    }
}
