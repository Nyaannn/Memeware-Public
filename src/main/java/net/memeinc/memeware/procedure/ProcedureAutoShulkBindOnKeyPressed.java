package net.memeinc.memeware.procedure;

import net.memeinc.memeware.MemewareModVariables;
import net.memeinc.memeware.ElementsMemewareMod;

import java.util.Map;
import java.util.HashMap;

@ElementsMemewareMod.ModElement.Tag
public class ProcedureAutoShulkBindOnKeyPressed extends ElementsMemewareMod.ModElement {
	public ProcedureAutoShulkBindOnKeyPressed(ElementsMemewareMod instance) {
		super(instance, 57);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (((MemewareModVariables.AutoShulk) == (true))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				ProcedureDisableAutoshulk.executeProcedure($_dependencies);
			}
		} else {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				ProcedureEnableAutoshulk.executeProcedure($_dependencies);
			}
		}
	}
}
