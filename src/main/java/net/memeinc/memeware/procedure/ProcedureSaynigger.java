package net.memeinc.memeware.procedure;

import net.minecraft.client.Minecraft;

import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureSaynigger extends ElementsMemewareMod.ModElement {
	public ProcedureSaynigger(ElementsMemewareMod instance) {
		super(instance, 28);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		Minecraft.getMinecraft().player.sendChatMessage("Nigger");
	}
}
