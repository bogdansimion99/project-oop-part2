package strategies;

import helpers.RogueConstants;
import heroes.Rogue;

public class RogueHighStrategy implements RogueStrategy {
    /**
     * @param rogue
     */
    @Override
    public void rogueStrategy(final Rogue rogue) {
        rogue.setModificators(rogue.getModificators() + RogueConstants.MODIFICATORS_ADDED);
        rogue.setHp(Math.round(rogue.getHp() * RogueConstants.HP_SUBTRACTED_FACTOR));
    }
}
