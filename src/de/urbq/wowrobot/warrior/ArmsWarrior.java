package de.urbq.wowrobot.warrior;

import java.awt.Color;
import java.awt.event.KeyEvent;

import de.urbq.wowrobot.types.Position;
import de.urbq.wowrobot.types.Skill;
import de.urbq.wowrobot.types.SkillState;

public class ArmsWarrior extends de.urbq.wowrobot.types.Class{
	
	public ArmsWarrior() {
		super();
		skills.put(WarriorSkillNames.AVATAR,
				new Skill(WarriorSkillNames.AVATAR, new Color(255, 0, 9), new Position(15, 15), KeyEvent.VK_F5));
		skills.put(WarriorSkillNames.WARBREAKER,
				new Skill(WarriorSkillNames.WARBREAKER, new Color(255, 0, 9), new Position(15, 15), KeyEvent.VK_F5));
		skills.put(WarriorSkillNames.WARBREAKER_BELOW_8,
				new SkillState(WarriorSkillNames.WARBREAKER_BELOW_8, new Color(255, 0, 9), new Position(15, 15)));
		skills.put(WarriorSkillNames.COLOSSUS_SMASH_DEBUF,
				new SkillState(WarriorSkillNames.COLOSSUS_SMASH_DEBUF, new Color(255, 0, 9), new Position(15, 15)));
		skills.put(WarriorSkillNames.SUDDEN_DEATH_BUFF,
				new SkillState(WarriorSkillNames.SUDDEN_DEATH_BUFF, new Color(255, 0, 9), new Position(15, 15)));
		skills.put(WarriorSkillNames.TEST_OF_MIGHT_BUFF,
				new SkillState(WarriorSkillNames.TEST_OF_MIGHT_BUFF, new Color(255, 0, 9), new Position(15, 15)));
		skills.put(WarriorSkillNames.MORTAL_STRIKE,
				new Skill(WarriorSkillNames.MORTAL_STRIKE, new Color(255, 0, 9), new Position(15, 15), KeyEvent.VK_F5));
		skills.put(WarriorSkillNames.MORTAL_STRIKE_ABOVE_5,
				new SkillState(WarriorSkillNames.MORTAL_STRIKE_ABOVE_5, new Color(255, 0, 9), new Position(15, 15)));
		skills.put(WarriorSkillNames.BLADESTORM,
				new Skill(WarriorSkillNames.BLADESTORM, new Color(255, 0, 9), new Position(15, 15), KeyEvent.VK_F5));
		skills.put(WarriorSkillNames.OVERPOWER,
				new Skill(WarriorSkillNames.OVERPOWER, new Color(255, 0, 9), new Position(15, 15), KeyEvent.VK_F5));
	}

}
