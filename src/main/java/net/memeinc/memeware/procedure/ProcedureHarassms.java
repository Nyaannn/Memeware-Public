package net.memeinc.memeware.procedure;

import net.minecraft.client.Minecraft;

import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Random;
import java.util.Map;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureHarassms extends ElementsMemewareMod.ModElement {
	public ProcedureHarassms(ElementsMemewareMod instance) {
		super(instance, 47);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		Minecraft.getMinecraft().player
				.sendChatMessage("/msg MS_Popbob I just performed the PopBob sex dupe and got " + (new Random().nextInt(30) + 1) + " shulkers!");
	}
}
