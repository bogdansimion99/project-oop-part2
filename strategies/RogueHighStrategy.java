package strategies;

import helpers.RogueConstants;
import heroes.Rogue;

public class RogueHighStrategy implements RogueStrategy {
    @Override
    public void rogueStrategy(Rogue rogue) {
        rogue.setModificators(rogue.getModificators() + RogueConstants.MODIFICATORS_ADDED);
        rogue.setHp(Math.round(rogue.getHp() * RogueConstants.HP_SUBTRACTED_FACTOR));
    }
}
