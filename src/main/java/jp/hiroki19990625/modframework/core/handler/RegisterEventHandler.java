package jp.hiroki19990625.modframework.core.handler;

import jp.hiroki19990625.modframework.ModCore;
import jp.hiroki19990625.modframework.core.handler.block.IRegisterBlock;
import jp.hiroki19990625.modframework.core.handler.enchantment.IRegisterEnchantment;
import jp.hiroki19990625.modframework.core.handler.entity.IRegisterEntity;
import jp.hiroki19990625.modframework.core.handler.item.IRegisterItem;
import jp.hiroki19990625.modframework.core.handler.item.SimpleRegisterItem;
import jp.hiroki19990625.modframework.core.handler.sound.IRegisterSoundEvent;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;

import javax.annotation.Nonnull;
import java.util.HashMap;

public class RegisterEventHandler {
    private boolean initedFlag;

    private HashMap<String, IRegisterBlock> blocks = new HashMap<>();
    private HashMap<String, IRegisterItem> items = new HashMap<>();
    private HashMap<String, IRegisterEntity> entities = new HashMap<>();
    private HashMap<String, IRegisterSoundEvent> soundEvents = new HashMap<>();
    private HashMap<String, IRegisterEnchantment> enchantments = new HashMap<>();

    public RegisterEventHandler() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    protected void registerItems(RegistryEvent.Register<Item> event) {
        ModCore.ModLogger.info("Start RegisterItem");
        for (IRegisterItem item : items.values()) {
            event.getRegistry().register(item.getItem());
            ModCore.ModLogger.info("RegisterItem >> " + item.getItem().getRegistryName().toString());
        }
    }

    @SubscribeEvent
    protected void registerBlocks(RegistryEvent.Register<Block> event) {
        ModCore.ModLogger.info("Start RegisterBlock");
        for (IRegisterBlock block : blocks.values()) {
            event.getRegistry().register(block.getBlock());
            ModCore.ModLogger.info("RegisterBlock >> " + block.getBlock().getRegistryName().toString());
        }
    }

    @SubscribeEvent
    protected void registerEntities(RegistryEvent.Register<EntityEntry> event) {
        ModCore.ModLogger.info("Start RegisterEntity");
        for (IRegisterEntity entity : entities.values()) {
            EntityEntry entry = new EntityEntry(entity.getEntity(), entity.getName());
            entry.setRegistryName(entity.getRegistryName());
            EntityList.EntityEggInfo info = entity.getEgg();
            if (info != null) {
                entry.setEgg(info);
            }

            IRenderFactory factory = entity.getModelRenderFactory();
            if (factory != null) {
                RenderingRegistry.registerEntityRenderingHandler(entity.getEntity(), factory);
                ModCore.ModLogger.info("RegisterEntityRender >> " + entry.getRegistryName().toString());
            }

            event.getRegistry().register(entry);
            ModCore.ModLogger.info("RegisterEntity >> " + entry.getRegistryName().toString());
        }
    }

    @SubscribeEvent
    protected void registerSoundEvents(RegistryEvent.Register<SoundEvent> event) {
        ModCore.ModLogger.info("Start RegisterSoundEvent");
        for (IRegisterSoundEvent soundEvent : soundEvents.values()) {
            event.getRegistry().register(soundEvent.getSoundEvent());
            ModCore.ModLogger.info("RegisterSoundEvent >> " + soundEvent.getSoundEvent().getRegistryName().toString());
        }
    }

    @SubscribeEvent
    protected void registerEnchantment(RegistryEvent.Register<Enchantment> event) {
        ModCore.ModLogger.info("Start RegisterEnchantment");
        for (IRegisterEnchantment enchantment : enchantments.values()) {
            event.getRegistry().register(enchantment.getEnchantment());
            ModCore.ModLogger.info("RegisterEnchantment >> " + enchantment.getEnchantment().getRegistryName().toString());
        }
    }

    @SubscribeEvent
    protected void registerModels(ModelRegistryEvent event) {
        for (IRegisterItem item : items.values()) {
            for (int i = 0; i < item.getMetaDataCount(); ++i) {
                ModelLoader.setCustomModelResourceLocation(item.getItem(), i, item.getResourceLocation());
                ModCore.ModLogger.info("RegisterItemModel >> " + item.getItem().getRegistryName().toString());
            }
        }
    }

    public void registerBlock(@Nonnull IRegisterBlock block) {
        if (initedFlag)
            return;

        this.blocks.put(block.getBlock().getRegistryName().toString(), block);
        if (block.getBlockItem() != null) {
            registerItem(new SimpleRegisterItem(block.getBlockItem()));
        }
    }

    public void registerItem(@Nonnull IRegisterItem item) {
        if (initedFlag)
            return;

        this.items.put(item.getItem().getRegistryName().toString(), item);
    }

    public void registerEntity(@Nonnull IRegisterEntity entity) {
        if (initedFlag)
            return;

        this.entities.put(entity.getRegistryName().toString(), entity);
    }

    public void registerSoundEvent(@Nonnull IRegisterSoundEvent soundEvent) {
        if (initedFlag)
            return;

        this.soundEvents.put(soundEvent.getSoundEvent().getRegistryName().toString(), soundEvent);
    }

    public void registerEnchantment(@Nonnull IRegisterEnchantment enchantment) {
        if (initedFlag)
            return;

        this.enchantments.put(enchantment.getEnchantment().getRegistryName().toString(), enchantment);
    }

    public IRegisterBlock getBlock(ResourceLocation registryName) {
        return this.blocks.get(registryName.toString());
    }

    public IRegisterItem getItem(ResourceLocation registryName) {
        return this.items.get(registryName.toString());
    }

    public IRegisterEntity getEntity(ResourceLocation registryName) {
        return this.entities.get(registryName.toString());
    }

    public IRegisterSoundEvent getSoundEvent(ResourceLocation registryName) {
        return this.soundEvents.get(registryName.toString());
    }

    public IRegisterEnchantment getEnchantment(ResourceLocation registerName) {
        return this.enchantments.get(registerName.toString());
    }
}
