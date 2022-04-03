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

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureCrystalAura extends ElementsMemewareMod.ModElement {
	public ProcedureCrystalAura(ElementsMemewareMod instance) {
		super(instance, 11);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CrystalAura!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (((MemewareModVariables.CrystalAura) == (true))) {
			entity.rotationYaw = (entity.rotationYaw);
			entity.rotationPitch = ((entity.rotationPitch) - 10);
			Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
				entity.rotationYaw = (entity.rotationYaw);
				entity.rotationPitch = ((entity.rotationPitch) + 10);
			}, 250, TimeUnit.MILLISECONDS);
		}
	}

	@SubscribeEvent
	public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
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
