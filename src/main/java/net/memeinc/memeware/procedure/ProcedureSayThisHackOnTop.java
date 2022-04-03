package net.memeinc.memeware.procedure;

import net.minecraft.client.Minecraft;

import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureSayThisHackOnTop extends ElementsMemewareMod.ModElement {
	public ProcedureSayThisHackOnTop(ElementsMemewareMod instance) {
		super(instance, 30);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		Minecraft.getMinecraft().player.sendChatMessage("Memeware on top");
	}
}
