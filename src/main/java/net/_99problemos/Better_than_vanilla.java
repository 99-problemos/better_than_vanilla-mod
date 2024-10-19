package net._99problemos;

import net._99problemos.ModItems.ModItemGroups;
import net._99problemos.ModItems.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Better_than_vanilla implements ModInitializer {
	
	public static final String MOD_ID = "better_than_vanilla";
	
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		/* Calls this function to register mod item groups in the onInit */
		ModItemGroups.registerItemGroups();

        /* Calls this function to register mod items in the onInit */
		ModItems.registerModItems();

	}
}