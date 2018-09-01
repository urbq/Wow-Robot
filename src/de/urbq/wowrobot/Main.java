package de.urbq.wowrobot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import de.urbq.wowrobot.types.Observable;
import de.urbq.wowrobot.types.Position;
import de.urbq.wowrobot.types.Rotation;
import de.urbq.wowrobot.types.Skill;
import de.urbq.wowrobot.warrior.FuryWarrior;
import de.urbq.wowrobot.warrior.WarriorRotationNames;

public class Main {

	public static Map<String, Observable> systemObservables = new HashMap<String, Observable>();

	public static void main(String[] args) {
		System.out.println("Wow-Robot started");
		try {
			// create new robot
			Robot robot = new Robot();
			initSystemObservables();
			boolean runningState = false;

			System.out.println("Ready");

			Rotation rotation = initRotation();

			while (true) {
				for (Observable observable : systemObservables.values()) {
					observable.check(robot);
				}
				if (systemObservables.get(SystemObservableNames.START).isReady()) {
					System.out.println("Started");
					runningState = true;
				} else if (systemObservables.get(SystemObservableNames.PAUSE).isReady()) {
					System.out.println("Paused");
					runningState = false;
					stopAttacks(robot);
					continue;
				} else if (systemObservables.get(SystemObservableNames.ABORT).isReady()) {
					System.out.println("Aborted");
					stopAttacks(robot);
					System.exit(0);
				}
				if (runningState) {
					rotation.start();
					//delay a bit after each
					robot.delay(100);
				}
			}
		} catch (AWTException e) {
			System.err.println("Cannot create robot cause: " + e);
			System.exit(1);
		}
	}

	public static void initSystemObservables() {
		// set start to something in collections
		systemObservables.put(SystemObservableNames.START,
				new Skill(SystemObservableNames.START, new Color(104, 61, 35), new Position(678, 696), 0));

		// set pause to something in adventure guide
		systemObservables.put(SystemObservableNames.PAUSE,
				new Skill(SystemObservableNames.PAUSE, new Color(170, 127, 52), new Position(705, 545), 0));

		// set abort to something in collections
		systemObservables.put(SystemObservableNames.ABORT,
				new Skill(SystemObservableNames.ABORT, new Color(35, 24, 6), new Position(658, 705), 0));
	}

	private static Rotation initRotation() {
		FuryWarrior furyWarrior = new FuryWarrior();
		Rotation rotation = furyWarrior.getRotations().get(WarriorRotationNames.FURY_ICY_VEINS_SINGLE_TARGET);
		return rotation;
	}
	
	private static void stopAttacks(Robot robot) {
		robot.keyPress(KeyEvent.VK_R);
	}

}
