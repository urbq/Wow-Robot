package de.urbq.wowrobot.test;

import java.awt.Robot;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.urbq.wowrobot.Main;
import de.urbq.wowrobot.SystemObservableNames;

class WowRobotTest {
	
	static Robot robot;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		robot = new Robot();
		Main.initSystemObservables();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}	
	
	@Test
	void testStartPosition() {
		Main.systemObservables.get(SystemObservableNames.START).check(robot);
	}
	
	@Test
	void testPausePosition() {
		Main.systemObservables.get(SystemObservableNames.PAUSE).check(robot);
	}
	
	@Test
	void testAbortPosition() {
		Main.systemObservables.get(SystemObservableNames.ABORT).check(robot);
	}

}
