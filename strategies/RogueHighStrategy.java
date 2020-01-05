package strategies;

import helpers.RogueConstants;
import heroes.Rogue;

public class RogueHighStrategy implements RogueStrategy {
    private static RogueHighStrategy instance = null;

    public static RogueHighStrategy getInstance() {
        if (instance == null) {
            instance = new RogueHighStrategy();
        }
        return instance;
    }
    /**
     * @param rogue
     */
    @Override
    public void rogueStrategy(final Rogue rogue) {
        rogue.setModificators(rogue.getModificators() + RogueConstants.MODIFICATORS_ADDED);
        rogue.setHp(Math.round(rogue.getHp() * RogueConstants.HP_SUBTRACTED_FACTOR));
    }
}
