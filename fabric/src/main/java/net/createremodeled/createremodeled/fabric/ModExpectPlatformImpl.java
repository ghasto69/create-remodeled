package net.createremodeled.createremodeled.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class ModExpectPlatformImpl {
	public static String platformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}
}
