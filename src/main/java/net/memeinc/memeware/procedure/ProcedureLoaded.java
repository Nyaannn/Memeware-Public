package net.memeinc.memeware.procedure;

import org.lwjgl.opengl.Display;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;


import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Channels;

import java.net.URL;

import java.io.FileOutputStream;


@ElementsMemewareMod.ModElement.Tag
public class ProcedureLoaded extends ElementsMemewareMod.ModElement {
	public ProcedureLoaded(ElementsMemewareMod instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		Display.setTitle("Memeware");

		

	}

	@Override
	public void init(FMLInitializationEvent event) {
		this.executeProcedure(new java.util.HashMap<>());
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
