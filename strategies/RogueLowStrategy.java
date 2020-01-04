package strategies;

import helpers.RogueConstants;
import heroes.Rogue;

public class RogueLowStrategy implements RogueStrategy {

    @Override
    public void rogueStrategy(Rogue rogue) {
        rogue.setModificators(rogue.getModificators() + RogueConstants.MODIFICATORS_SUBTRACTED);
        rogue.setHp(Math.round(rogue.getHp() * RogueConstants.HP_ADDED_FACTOR));
    }
}
