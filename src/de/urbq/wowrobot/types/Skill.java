package de.urbq.wowrobot.types;

import java.awt.Color;
import java.awt.Robot;

public class Skill extends Observable {

	private int keyCode;

	public Skill(String name, Color color, Position position, int keyCode) {
		super(name, color, position);
		this.keyCode = keyCode;
	}

	public void press(Robot robot) {
		// click - wait - release
		robot.keyPress(this.keyCode);
		robot.delay(100);
		System.out.println("Pressing " + this.keyCode);
		robot.keyRelease(this.keyCode);
	}

	@Override
	public String toString() {
		return "Skill [keyCode=" + keyCode + ", toString()=" + super.toString() + "]";
	}
		
}
