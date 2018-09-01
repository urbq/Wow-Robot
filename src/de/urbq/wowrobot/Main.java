package de.urbq.wowrobot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.util.HashMap;
import java.util.Map;

import de.urbq.wowrobot.types.Observable;
import de.urbq.wowrobot.types.Position;
import de.urbq.wowrobot.types.Rotation;
import de.urbq.wowrobot.types.Skill;
import de.urbq.wowrobot.warrior.FuryWarrior;
import de.urbq.wowrobot.warrior.WarriorRotationNames;

public class Main {

	private static Map<String, Observable> systemObservables = new HashMap<String, Observable>();

	public static void main(String[] args) {
		System.out.println("Wow-Robot started");
		try {
			// create new robot
			Robot robot = new Robot();
			initSystemObservables();

			System.out.println("Ready");

			Rotation rotation = initRotation();

			while (true) {
				for (Observable observable : systemObservables.values()) {
					observable.check(robot);
				}
				if (systemObservables.get(SystemObservableNames.START).isReady()) {
					rotation.start();
				} else if (systemObservables.get(SystemObservableNames.PAUSE).isReady()) {
					continue;
				} else if (systemObservables.get(SystemObservableNames.ABORT).isReady()) {
					System.out.println("Aborted by user");
					System.exit(0);
				}
			}
		} catch (AWTException e) {
			System.err.println("Cannot create robot cause: " + e);
			System.exit(1);
		}
	}

	private static void initSystemObservables() {
		// set abort skill, whose pointing to shop menu
		systemObservables.put(SystemObservableNames.START,
				new Skill(SystemObservableNames.START, new Color(35, 24, 6), new Position(658, 705), 0));

		systemObservables.put(SystemObservableNames.PAUSE,
				new Skill(SystemObservableNames.PAUSE, new Color(35, 24, 6), new Position(658, 705), 0));

		systemObservables.put(SystemObservableNames.ABORT,
				new Skill(SystemObservableNames.ABORT, new Color(35, 24, 6), new Position(658, 705), 0));
	}

	private static Rotation initRotation() {
		FuryWarrior furyWarrior = new FuryWarrior();
		Rotation rotation = furyWarrior.getRotations().get(WarriorRotationNames.FURY_ICY_VEINS_SINGLE_TARGET);
		return rotation;
	}

}
