package net.memeinc.memeware.procedure;

import org.w3c.dom.css.Counter;

import net.memeinc.memeware.MemewareModVariables;
import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;
import java.util.HashMap;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureNoclipBondOnKeyPressed extends ElementsMemewareMod.ModElement {
	public ProcedureNoclipBondOnKeyPressed(ElementsMemewareMod instance) {
		super(instance, 56);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		double Counter = 0;
		if (((MemewareModVariables.Noclip) == (true))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				ProcedureNoclipOff.executeProcedure($_dependencies);
			}
		} else {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				ProcedureNoclipOn.executeProcedure($_dependencies);
			}
		}
	}
}
