package de.urbq.wowrobot.warrior;

import java.awt.Robot;
import java.util.Map;

import de.urbq.wowrobot.types.Observable;
import de.urbq.wowrobot.types.Rotation;
import de.urbq.wowrobot.types.Skill;

public class FurySingleTarget extends Rotation {

	public FurySingleTarget(Map<String, Observable> skills) {
		super(skills);
	}

	@Override
	public void doRotation(Robot robot) {
		// 1. recklessness if rage lesser then 25
		if (skills.get(WarriorSkillNames.RECKLESSNESS).isReady()) {
			((Skill) skills.get(WarriorSkillNames.RECKLESSNESS)).press(robot);
		}
		// 2. Cast Siegebreaker during Recklessness or inbetween Recklessness's
		// cooldown.
		else if (skills.get(WarriorSkillNames.SIEGEBREAKER).isReady()
				&& !skills.get(WarriorSkillNames.RECKLESSNESS_BELOW_30).isReady()) {
			((Skill) skills.get(WarriorSkillNames.SIEGEBREAKER)).press(robot);
		}
		// 3. rampage
		else if (skills.get(WarriorSkillNames.RAMPAGE).isReady()) {
			((Skill) skills.get(WarriorSkillNames.RAMPAGE)).press(robot);
		}
		// 4. execute if enraged
		else if (skills.get(WarriorSkillNames.EXECUTE).isReady() && skills.get(WarriorSkillNames.ENRAGE).isReady()) {
			((Skill) skills.get(WarriorSkillNames.EXECUTE)).press(robot);
		}
		// 5. dragonroar if enraged
		else if (skills.get(WarriorSkillNames.DRAGONROAR).isReady() && skills.get(WarriorSkillNames.ENRAGE).isReady()) {
			((Skill) skills.get(WarriorSkillNames.DRAGONROAR)).press(robot);
		}
		// 6. bloodthrist
		else if (skills.get(WarriorSkillNames.BLOODTHIRST).isReady()) {
			((Skill) skills.get(WarriorSkillNames.BLOODTHIRST)).press(robot);
		}
		// 7. ragingBlow
		else if (skills.get(WarriorSkillNames.RAGING_BLOW).isReady()
				&& !skills.get(WarriorSkillNames.BLOODTHIRST_BELOW_1).isReady()) {
			((Skill) skills.get(WarriorSkillNames.RAGING_BLOW)).press(robot);
		}
		// 8. whirlwind
		else if (skills.get(WarriorSkillNames.WHIRLWIND).isReady()
				&& !skills.get(WarriorSkillNames.BLOODTHIRST_BELOW_1).isReady()
				&& !skills.get(WarriorSkillNames.RAGING_BLOW_BELOW_1).isReady()) {
			((Skill) skills.get(WarriorSkillNames.WHIRLWIND)).press(robot);
		}
	}

}
