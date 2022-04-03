package net.memeinc.memeware.procedure;

import net.minecraft.client.Minecraft;

import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Random;
import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedurePopbobsexdupe extends ElementsMemewareMod.ModElement {
	public ProcedurePopbobsexdupe(ElementsMemewareMod instance) {
		super(instance, 26);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		Minecraft.getMinecraft().player
				.sendChatMessage("I just performed the PopBob sex dupe and got " + (new Random().nextInt(30) + 1) + " shulkers!");
	}
}
