package net.createremodeled.createremodeled.fabric;

import net.createremodeled.createremodeled.CreateRemodeled;
import net.fabricmc.api.ModInitializer;

public class CreateRemodeledFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateRemodeled.init();
        CreateRemodeled.REGISTRATE.register();
    }
}
