package strategies;

import helpers.RogueConstants;
import heroes.Rogue;

public class RogueLowStrategy implements RogueStrategy {
    private static RogueLowStrategy instance = null;

    public static RogueLowStrategy getInstance() {
        if (instance == null) {
            instance = new RogueLowStrategy();
        }
        return instance;
    }
    /**
     * @param rogue
     */
    @Override
    public void rogueStrategy(final Rogue rogue) {
        rogue.setModificators(rogue.getModificators() + RogueConstants.MODIFICATORS_SUBTRACTED);
        rogue.setHp(Math.round(rogue.getHp() * RogueConstants.HP_ADDED_FACTOR));
    }
}
