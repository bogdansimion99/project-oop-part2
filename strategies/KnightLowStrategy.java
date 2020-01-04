package strategies;

import helpers.KnightConstants;
import heroes.Knight;

public class KnightLowStrategy implements KnightStrategy {
    @Override
    public void knightStrategy(Knight knight) {
        knight.setModificators(knight.getModificators() + KnightConstants.MODIFICATORS_SUBTRACTED);
        knight.setHp(Math.round(knight.getHp() * KnightConstants.HP_ADDED_FACTOR));
    }
}
