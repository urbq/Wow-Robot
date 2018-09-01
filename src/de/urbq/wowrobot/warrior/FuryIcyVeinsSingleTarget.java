package de.urbq.wowrobot.warrior;

import java.awt.Robot;
import java.util.Map;

import de.urbq.wowrobot.types.Observable;
import de.urbq.wowrobot.types.Rotation;
import de.urbq.wowrobot.types.Skill;

public class FuryIcyVeinsSingleTarget extends Rotation {

	public FuryIcyVeinsSingleTarget(Map<String, Observable> skills) {
		super(skills);
	}

	@Override
	public void doRotation(Robot robot) {
		// 1. Cast Rampage if Enrage is not active, or at >90 Rage.
		if (skills.get(WarriorSkillNames.RAMPAGE).isReady()) {
			((Skill) skills.get(WarriorSkillNames.RAMPAGE)).press(robot);
		}
		// 2. Cast Recklessness on cooldown, or whenever burst is needed.
		else if (skills.get(WarriorSkillNames.RECKLESSNESS).isReady()) {
			((Skill) skills.get(WarriorSkillNames.RECKLESSNESS)).press(robot);
		}
		// 3. Cast Siegebreaker during Recklessness or inbetween Recklessness's
		// cooldown.
		else if (skills.get(WarriorSkillNames.SIEGEBREAKER).isReady()
				&& !skills.get(WarriorSkillNames.RECKLESSNESS_BELOW_30).isReady()) {
			((Skill) skills.get(WarriorSkillNames.SIEGEBREAKER)).press(robot);
		}
		// 4. Cast Execute during Enrage.
		else if (skills.get(WarriorSkillNames.EXECUTE).isReady() && skills.get(WarriorSkillNames.ENRAGE).isReady()) {
			((Skill) skills.get(WarriorSkillNames.EXECUTE)).press(robot);
		}
		// 5. Cast Bloodthirst if Enrage is not active.
		else if (skills.get(WarriorSkillNames.BLOODTHIRST).isReady()
				&& !skills.get(WarriorSkillNames.ENRAGE).isReady()) {
			((Skill) skills.get(WarriorSkillNames.BLOODTHIRST)).press(robot);
		}
		// 6. Cast Raging Blow when at two charges.
		else if (skills.get(WarriorSkillNames.RAGING_BLOW).isReady()
				&& skills.get(WarriorSkillNames.RAGING_BLOW_STACKS_2).isReady()) {
			((Skill) skills.get(WarriorSkillNames.RAGING_BLOW)).press(robot);
		}
		// 7. Cast Bloodthirst on cooldown.
		else if (skills.get(WarriorSkillNames.BLOODTHIRST).isReady()) {
			((Skill) skills.get(WarriorSkillNames.BLOODTHIRST)).press(robot);
		}
		// 8. Cast Dragon Roar during Enrage.
		else if (skills.get(WarriorSkillNames.DRAGONROAR).isReady() && skills.get(WarriorSkillNames.ENRAGE).isReady()) {
			((Skill) skills.get(WarriorSkillNames.DRAGONROAR)).press(robot);
		}
		// 9. Cast Raging Blow for Rage.
		else if (skills.get(WarriorSkillNames.RAGING_BLOW).isReady()
				&& !skills.get(WarriorSkillNames.BLOODTHIRST_BELOW_1).isReady()) {
			((Skill) skills.get(WarriorSkillNames.RAGING_BLOW)).press(robot);
		}
		// 10. Cast Whirlwind as a filler.
		else if (skills.get(WarriorSkillNames.WHIRLWIND).isReady()
				&& !skills.get(WarriorSkillNames.BLOODTHIRST_BELOW_1).isReady()
				&& !skills.get(WarriorSkillNames.RAGING_BLOW_BELOW_1).isReady()) {
			((Skill) skills.get(WarriorSkillNames.WHIRLWIND)).press(robot);
		}
	}

}
