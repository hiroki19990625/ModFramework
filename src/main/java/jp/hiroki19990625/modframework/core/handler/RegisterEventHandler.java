package jp.hiroki19990625.modframework.core.handler;

import jp.hiroki19990625.modframework.ModCore;
import jp.hiroki19990625.modframework.core.handler.block.IRegisterBlock;
import jp.hiroki19990625.modframework.core.handler.item.IRegisterItem;
import jp.hiroki19990625.modframework.core.handler.item.SimpleRegisterItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;

public class RegisterEventHandler {
    private boolean initedFlag;
    private ArrayList<IRegisterBlock> blocks = new ArrayList<>();
    private ArrayList<IRegisterItem> items = new ArrayList<>();

    public RegisterEventHandler() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    protected void registerItems(RegistryEvent.Register<Item> event) {
        for (IRegisterItem item : items) {
            event.getRegistry().register(item.getItem());
            ModCore.ModLogger.info("RegisterItem >> " + item.getItem().getRegistryName().toString());
        }
    }

    @SubscribeEvent
    protected void registerBlocks(RegistryEvent.Register<Block> event) {
        for (IRegisterBlock block : blocks) {
            event.getRegistry().register(block.getBlock());
            ModCore.ModLogger.info("RegisterBlock >> " + block.getBlock().getRegistryName().toString());
        }
    }

    @SubscribeEvent
    protected void registerModels(ModelRegistryEvent event) {
        for (IRegisterItem item : items) {
            for (int i = 0; i < item.getMetaDataCount(); ++i) {
                ModelLoader.setCustomModelResourceLocation(item.getItem(), i, item.getResourceLocation());
                ModCore.ModLogger.info("RegisterItemModel >> " + item.getItem().getRegistryName().toString());
            }
        }
    }

    public void registerBlock(IRegisterBlock block) {
        if (initedFlag)
            return;

        this.blocks.add(block);
        if (block.getBlockItem() != null) {
            registerItem(new SimpleRegisterItem(block.getBlockItem()));
        }
    }

    public void registerItem(IRegisterItem item) {
        if (initedFlag)
            return;

        this.items.add(item);
    }
}
