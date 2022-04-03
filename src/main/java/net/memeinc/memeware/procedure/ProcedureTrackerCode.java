package net.memeinc.memeware.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.memeinc.memeware.MemewareModVariables;
import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;
import java.util.List;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureTrackerCode extends ElementsMemewareMod.ModElement {
	public ProcedureTrackerCode(ElementsMemewareMod instance) {
		super(instance, 34);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TrackerCode!");
			return;
		}
		World world = (World) dependencies.get("world");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (((MemewareModVariables.TToggle) == (true))) {
			List<Entity> list = world.getLoadedEntityList();
			for (Entity entityiterator : list) {
				if (((entityiterator) instanceof EntityPlayer)) {
					MemewareModVariables.Tracker = (String) ((" Name: ") + "" + (((entityiterator).getDisplayName().getUnformattedText())) + ""
							+ (" Health: ") + ""
							+ ((((entityiterator) instanceof EntityLivingBase) ? ((EntityLivingBase) (entityiterator)).getHealth() : -1)) + ""
							+ (" X: ") + "" + (((entityiterator).posX)) + "" + (" Y: ") + "" + (((entityiterator).posY)) + "" + (" Z: ") + ""
							+ (((entityiterator).posZ)) + "" + (" Dimension: ") + "" + (((entityiterator).dimension)));
					System.out.println("Memedar > " + MemewareModVariables.Tracker);
				}
			}
		}
	}

	@SubscribeEvent
	public void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
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
