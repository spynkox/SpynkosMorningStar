/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spynkosmorningstar.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.spynkosmorningstar.item.MorningStarItem;
import net.mcreator.spynkosmorningstar.SpynkosMorningStarMod;

import java.util.function.Function;

public class SpynkosMorningStarModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SpynkosMorningStarMod.MODID);
	public static final DeferredItem<Item> MORNING_STAR = register("morning_star", MorningStarItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}