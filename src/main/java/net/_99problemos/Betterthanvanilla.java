package net._99problemos;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Betterthanvanilla implements ModInitializer {
	public static final String MOD_ID = "betterthanvanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		net._99problemos.ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		net._99problemos.ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.NETHER_COAL, 40000);
	}
}
