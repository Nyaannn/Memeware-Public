package net.memeinc.memeware.procedure;

import net.minecraft.client.Minecraft;

import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureDeth extends ElementsMemewareMod.ModElement {
	public ProcedureDeth(ElementsMemewareMod instance) {
		super(instance, 38);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		Minecraft.getMinecraft().player.sendChatMessage("/kill");
	}
}
