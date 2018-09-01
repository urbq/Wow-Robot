package de.urbq.wowrobot.types;

import java.awt.Color;
import java.awt.Robot;

public class Observable {

	protected String name;
	protected Color color;
	protected Position position;
	protected boolean state;
	
	public Observable(String name, Color color, Position position) {
		super();
		this.name = name;
		this.color = color;
		this.position = position;
	}
	
	public boolean isReady() {
		return this.state;
	}
	
	public void check(Robot robot) {
//		System.out.println("Checking " + this.name);
		Color foundColor = robot.getPixelColor(this.position.getX(), this.position.getY());
//		System.out.println("Found color " + foundColor.toString());
		if (foundColor.equals(this.color)) {
			this.state = true;
//			System.out.println("That's a match");
		} else {
			this.state = false;
//			System.out.println("That's not a match :(");
		}
	}

	@Override
	public String toString() {
		return "Observable [name=" + name + ", color=" + color + ", position=" + position + ", state=" + state + "]";
	}
	
}
