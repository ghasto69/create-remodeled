package net.createremodeled.createremodeled.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.createremodeled.createremodeled.CreateRemodeled;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateRemodeled.init();
        CreateRemodeled.REGISTRATE.register();
    }
}
