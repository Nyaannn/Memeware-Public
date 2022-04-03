package net.memeinc.memeware.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureDespawn extends ElementsMemewareMod.ModElement {
	public ProcedureDespawn(ElementsMemewareMod instance) {
		super(instance, 44);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Despawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof EntityPlayer)) {
			(entity).world.removeEntity(entity);
		}
	}
}
