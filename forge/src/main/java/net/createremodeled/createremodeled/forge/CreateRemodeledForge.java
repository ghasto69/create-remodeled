package net.createremodeled.createremodeled.forge;

import net.createremodeled.createremodeled.CreateRemodeled;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateRemodeled.MOD_ID)
public class CreateRemodeledForge {
    public CreateRemodeledForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CreateRemodeled.REGISTRATE.registerEventListeners(eventBus);
        CreateRemodeled.init();
    }
}
