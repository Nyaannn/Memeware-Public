package net.memeinc.memeware.procedure;

import net.minecraftforge.common.DimensionManager;

import net.minecraft.world.WorldServer;
import net.minecraft.world.Teleporter;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureTPNether extends ElementsMemewareMod.ModElement {
	public ProcedureTPNether(ElementsMemewareMod instance) {
		super(instance, 52);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TPNether!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
				int dimensionID = -1;
				class TeleporterDirect extends Teleporter {
					public TeleporterDirect(WorldServer worldserver) {
						super(worldserver);
					}

					@Override
					public void placeInPortal(Entity entity, float yawrotation) {
					}

					@Override
					public boolean placeInExistingPortal(Entity entity, float yawrotation) {
						return true;
					}

					@Override
					public boolean makePortal(Entity entity) {
						return true;
					}
				}
				EntityPlayerMP _player = (EntityPlayerMP) _ent;
				_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
				_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
						DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
						DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
			}
		}
	}
}
