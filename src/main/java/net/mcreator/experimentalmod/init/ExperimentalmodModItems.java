
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.experimentalmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.experimentalmod.item.SaxearlyItem;
import net.mcreator.experimentalmod.ExperimentalmodMod;

public class ExperimentalmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExperimentalmodMod.MODID);
	public static final RegistryObject<Item> SAXEARLY = REGISTRY.register("saxearly", () -> new SaxearlyItem());
}
