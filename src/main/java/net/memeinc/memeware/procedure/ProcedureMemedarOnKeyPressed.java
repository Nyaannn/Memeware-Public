package net.memeinc.memeware.procedure;

import net.memeinc.memeware.MemewareModVariables;
import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;
import java.util.HashMap;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureMemedarOnKeyPressed extends ElementsMemewareMod.ModElement {
	public ProcedureMemedarOnKeyPressed(ElementsMemewareMod instance) {
		super(instance, 58);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (((MemewareModVariables.TToggle) == (true))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				ProcedureTrackerOff.executeProcedure($_dependencies);
			}
		} else {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				ProcedureTrackerON.executeProcedure($_dependencies);
			}
		}
	}
}
