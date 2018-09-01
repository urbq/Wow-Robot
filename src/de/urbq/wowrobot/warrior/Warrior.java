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
	}

}
