package net.mcreator.spynkosmorningstar.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.spynkosmorningstar.network.SpynkosMorningStarModVariables;
import net.mcreator.spynkosmorningstar.SpynkosMorningStarMod;

public class NightCheckProcedure {
	public static void execute(LevelAccessor world) {
		SpynkosMorningStarModVariables.WorldVariables.get(world).time = Math.abs(SpynkosMorningStarModVariables.WorldVariables.get(world).daytime - world.dayTime());
		SpynkosMorningStarModVariables.WorldVariables.get(world).syncData(world);
		SpynkosMorningStarMod.LOGGER.info("Target Time: " + SpynkosMorningStarModVariables.WorldVariables.get(world).time);
	}
}