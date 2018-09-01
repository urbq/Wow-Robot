package de.urbq.wowrobot.types;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Map;

public abstract class Rotation implements IRotation {

	protected Map<String, Observable> skills;	

	public Rotation(Map<String, Observable> skills) {
		super();
		this.skills = skills;
	}

	public void start() {
		try {
			Robot robot = new Robot();
			doChecks(robot);
			doRotation(robot);
		} catch (AWTException e) {
			System.err.println("Cannot create robot");
			System.err.println(e.toString());
		}

	}

	public void doChecks(Robot robot) {
		for (Observable skill : skills.values()) {
			skill.check(robot);
		}
	}

}
