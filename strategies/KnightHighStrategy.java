package strategies;

import helpers.KnightConstants;
import heroes.Knight;

public class KnightHighStrategy implements KnightStrategy {

    /**
     * @param knight
     */
    @Override
    public void knightStrategy(final Knight knight) {
        knight.setModificators(knight.getModificators() + KnightConstants.MODIFICATORS_ADDED);
        knight.setHp(Math.round(knight.getHp() * KnightConstants.HP_SUBTRACTED_FACTOR));
    }
}
