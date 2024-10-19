package net._99problemos;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Better_than_vanilla implements ModInitializer {
	public static final String MOD_ID = "better_than_vanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		net._99problemos.ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		net._99problemos.ModBlocks.registerModBlocks();
	}
}
