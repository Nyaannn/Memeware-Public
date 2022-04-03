package net.memeinc.memeware.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.memeinc.memeware.MemewareModVariables;
import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureVelocity extends ElementsMemewareMod.ModElement {
	public ProcedureVelocity(ElementsMemewareMod instance) {
		super(instance, 46);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Velocity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((MemewareModVariables.Noclip) == (true))) {
			if ((entity instanceof EntityPlayer)) {
				if (entity instanceof EntityPlayer) {
					((EntityPlayer) entity).capabilities.isFlying = ((MemewareModVariables.Noclip) == (true));
					((EntityPlayer) entity).sendPlayerAbilities();
				}
				entity.setPositionAndUpdate(
						(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100000, entity.getLook(1f).y * 100000,
										entity.getLook(1f).z * 100000),
								false, false, true).getBlockPos().getX()),
						(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100000, entity.getLook(1f).y * 100000,
										entity.getLook(1f).z * 100000),
								false, false, true).getBlockPos().getY()),
						(entity.world.rayTraceBlocks(entity.getPositionEyes(1f), entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100000,
								entity.getLook(1f).y * 100000, entity.getLook(1f).z * 100000), false, false, true).getBlockPos().getZ()));
			}
		}
	}

	@SubscribeEvent
	public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		EntityPlayer entity = event.getEntityPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
