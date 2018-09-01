package de.urbq.wowrobot.warrior;

import java.awt.Color;
import java.awt.event.KeyEvent;

import de.urbq.wowrobot.types.Position;
import de.urbq.wowrobot.types.Skill;
import de.urbq.wowrobot.types.SkillState;

public class FuryWarrior extends Warrior {

	public FuryWarrior() {
		super();

		skills.put(WarriorSkillNames.RECKLESSNESS,
				new Skill(WarriorSkillNames.RECKLESSNESS, new Color(255, 0, 9), new Position(15, 15), KeyEvent.VK_F5));
		skills.put(WarriorSkillNames.RECKLESSNESS_BELOW_30,
				new SkillState(WarriorSkillNames.RECKLESSNESS_BELOW_30, new Color(255, 0, 9), new Position(45, 15)));

		skills.put(WarriorSkillNames.RAMPAGE,
				new Skill(WarriorSkillNames.RAMPAGE, new Color(23, 0, 255), new Position(15, 45), KeyEvent.VK_1));

		skills.put(WarriorSkillNames.BLOODTHIRST,
				new Skill(WarriorSkillNames.BLOODTHIRST, new Color(0, 129, 255), new Position(15, 75), KeyEvent.VK_2));
		skills.put(WarriorSkillNames.BLOODTHIRST_BELOW_1,
				new SkillState(WarriorSkillNames.BLOODTHIRST_BELOW_1, new Color(0, 129, 255), new Position(45, 75)));

		skills.put(WarriorSkillNames.RAGING_BLOW,
				new Skill(WarriorSkillNames.RAGING_BLOW, new Color(0, 230, 255), new Position(15, 105), KeyEvent.VK_3));
		skills.put(WarriorSkillNames.RAGING_BLOW_BELOW_1,
				new SkillState(WarriorSkillNames.RAGING_BLOW_BELOW_1, new Color(0, 230, 255), new Position(45, 105)));
		skills.put(WarriorSkillNames.RAGING_BLOW_STACKS_2,
				new SkillState(WarriorSkillNames.RAGING_BLOW_STACKS_2, new Color(0, 230, 255), new Position(75, 105)));

		skills.put(WarriorSkillNames.DRAGONROAR,
				new Skill(WarriorSkillNames.DRAGONROAR, new Color(0, 255, 111), new Position(15, 135), KeyEvent.VK_4));
		skills.put(WarriorSkillNames.DRAGONROAR_BELOW_1,
				new SkillState(WarriorSkillNames.DRAGONROAR_BELOW_1, new Color(0, 255, 111), new Position(45, 135)));

		skills.put(WarriorSkillNames.ENRAGE,
				new Skill(WarriorSkillNames.ENRAGE, new Color(255, 0, 247), new Position(15, 255), 0));

		skills.put(WarriorSkillNames.SIEGEBREAKER,
				new Skill(WarriorSkillNames.SIEGEBREAKER, new Color(0, 0, 0), new Position(15, 315), KeyEvent.VK_6));
		skills.put(WarriorSkillNames.SIEGEBREAKER_BELOW_1,
				new SkillState(WarriorSkillNames.SIEGEBREAKER_BELOW_1, new Color(0, 0, 0), new Position(45, 315)));

		rotations.put(WarriorRotationNames.FURY_ICY_VEINS_SINGLE_TARGET, new FuryIcyVeinsSingleTarget(skills));
		rotations.put(WarriorRotationNames.FURY_SINGLE_TARGET, new FurySingleTarget(skills));
	}

}
