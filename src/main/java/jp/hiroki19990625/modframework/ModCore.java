package jp.hiroki19990625.modframework;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(name = ModCore.ModName, modid = ModCore.ModID, version = ModCore.Version)
public class ModCore {
    public static final String ModName = "ModFramework";
    public static final String ModID = "mfw";
    public static final String Version = "0.0.1";

    public static Logger ModLogger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModLogger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
