package net.memeinc.memeware.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.client.Minecraft;

import net.memeinc.memeware.MemewareModVariables;
import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;

import com.mojang.realmsclient.gui.ChatFormatting;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureFlightOn extends ElementsMemewareMod.ModElement {
	public ProcedureFlightOn(ElementsMemewareMod instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		MemewareModVariables.RVelocity = (boolean) (true);
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString(
				ChatFormatting.RED + "Meme" + ChatFormatting.WHITE + "ware" + " > " + ChatFormatting.GREEN + "Flight Enabled"));
	}
}
