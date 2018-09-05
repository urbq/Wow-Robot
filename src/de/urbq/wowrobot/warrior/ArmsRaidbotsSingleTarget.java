package de.urbq.wowrobot.warrior;

import java.awt.Robot;
import java.util.Map;

import de.urbq.wowrobot.types.Observable;
import de.urbq.wowrobot.types.Rotation;

public class ArmsRaidbotsSingleTarget extends Rotation{

	public ArmsRaidbotsSingleTarget(Map<String, Observable> skills) {
		super(skills);
	}

	@Override
	public void doRotation(Robot robot) {
		// 1. avatar,if=cooldown.colossus_smash.remains<8|(talent.warbreaker.enabled&cooldown.warbreaker.remains<8)
		// execute
		// 2. warbreaker,if=debuff.colossus_smash.down
		// 3. bladestorm,if=rage<30&!buff.deadly_calm.up
		// 4. execute
		// 5. overpower
		// normal
		// 2. warbreaker,if=debuff.colossus_smash.down
		// 3. execute,if=buff.sudden_death.react
	    // 4. bladestorm,if=cooldown.mortal_strike.remains&((debuff.colossus_smash.up&!azerite.test_of_might.enabled)|buff.test_of_might.up)
		// 5. mortal_strike
		// 6. overpower
		// 7. whirlwind,if=talent.fervor_of_battle.enabled&(!azerite.test_of_might.enabled|(rage>=60|debuff.colossus_smash.up|buff.deadly_calm.up))
	}

}
