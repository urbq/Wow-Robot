package de.urbq.wowrobot.warrior;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import de.urbq.wowrobot.types.Observable;
import de.urbq.wowrobot.types.Position;
import de.urbq.wowrobot.types.Rotation;
import de.urbq.wowrobot.types.Skill;
import de.urbq.wowrobot.types.SkillState;

public abstract class Warrior extends de.urbq.wowrobot.types.Class {

	public static final String AVATAR = "Avatar";
	public static final String WARBREAKER= "Warbreaker";
	public static final String WARBREAKER_BELOW_8= "WarbreakerBelow8";
	public static final String COLOSSUS_SMASH_DEBUF = "ColossusSmashDebuf";
	public static final String SUDDEN_DEATH_BUFF = "SuddenDeathBuff";
	public static final String TEST_OF_MIGHT_BUFF = "TestOfMightBuff";
	public static final String MORTAL_STRIKE = "MortalStrike";
	public static final String MORTAL_STRIKE_ABOVE_5 = "MortalStrikeAbove5";
	public static final String BLADESTORM = "BladeStorm";
	public static final String OVERPOWER = "Overpower";
	
	public Warrior() {
		super();
		skills = new HashMap<String, Observable>();
		rotations = new HashMap<String, Rotation>();

		skills.put(WarriorSkillNames.EXECUTE,
				new Skill(WarriorSkillNames.EXECUTE, new Color(171, 255, 0), new Position(15, 165), KeyEvent.VK_F));

		skills.put(WarriorSkillNames.WHIRLWIND,
				new Skill(WarriorSkillNames.WHIRLWIND, new Color(255, 153, 0), new Position(15, 195), KeyEvent.VK_5));

		skills.put(WarriorSkillNames.RAGE_BELOW_40,
				new SkillState(WarriorSkillNames.RAGE_BELOW_40, new Color(225, 234, 255), new Position(15, 225)));
		skills.put(WarriorSkillNames.RAGE_ABOVE_90,
				new SkillState(WarriorSkillNames.RAGE_ABOVE_90, new Color(225, 234, 255), new Position(45, 225)));
		
		skills.put(WarriorSkillNames.RAGE_LIKE_OR_ABOVE_60,
				new SkillState(WarriorSkillNames.RAGE_LIKE_OR_ABOVE_60, new Color(225, 234, 255), new Position(45, 225)));
		skills.put(WarriorSkillNames.TARGET_HEALTH_BELOW_20,
				new SkillState(WarriorSkillNames.TARGET_HEALTH_BELOW_20, new Color(225, 234, 255), new Position(45, 225)));
		skills.put(WarriorSkillNames.RAGE_BELOW_30,
				new SkillState(WarriorSkillNames.RAGE_BELOW_30, new Color(225, 234, 255), new Position(45, 225)));
	}

}
