package de.urbq.wowrobot.types;

import java.util.Map;

public abstract class Class {

	protected Map<String, Observable> skills;
	protected Map<String, Rotation> rotations;

	public Map<String, Observable> getSkills() {
		return skills;
	}

	public Map<String, Rotation> getRotations() {
		return rotations;
	}

}
