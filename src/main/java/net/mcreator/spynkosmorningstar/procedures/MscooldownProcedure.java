package net.mcreator.spynkosmorningstar.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.spynkosmorningstar.network.SpynkosMorningStarModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class MscooldownProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		SpynkosMorningStarModVariables.WorldVariables.get(world).cooldown = DoubleArgumentType.getDouble(arguments, "cooldown");
		SpynkosMorningStarModVariables.WorldVariables.get(world).syncData(world);
		if (SpynkosMorningStarModVariables.WorldVariables.get(world).cooldown == 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("command.cooldown.disabled").getString())), false);
		} else if (SpynkosMorningStarModVariables.WorldVariables.get(world).cooldown > 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("command.cooldown.successfull").getString() + " " + Math.round(SpynkosMorningStarModVariables.WorldVariables.get(world).cooldown) + " ticks")), false);
		}
	}
}