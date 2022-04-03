package net.memeinc.memeware.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.client.Minecraft;

import net.memeinc.memeware.MemewareModVariables;
import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;

import com.mojang.realmsclient.gui.ChatFormatting;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureOldClipOn extends ElementsMemewareMod.ModElement {
	public ProcedureOldClipOn(ElementsMemewareMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		MemewareModVariables.OldClip = (boolean) (true);
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString(
				ChatFormatting.RED + "Meme" + ChatFormatting.WHITE + "ware" + " > " + ChatFormatting.GREEN + "Old Noclip Enabled"));
	}
}
