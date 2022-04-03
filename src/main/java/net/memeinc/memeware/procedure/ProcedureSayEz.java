package net.memeinc.memeware.procedure;

import net.minecraft.client.Minecraft;

import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureSayEz extends ElementsMemewareMod.ModElement {
	public ProcedureSayEz(ElementsMemewareMod instance) {
		super(instance, 29);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		Minecraft.getMinecraft().player.sendChatMessage("You just got ezed by memeware");
	}
}
