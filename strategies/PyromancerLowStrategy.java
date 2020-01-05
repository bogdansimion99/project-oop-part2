package strategies;

import helpers.PyromancerConstants;
import heroes.Pyromancer;

public class PyromancerLowStrategy implements PyromancerStrategy {
    private static PyromancerLowStrategy instance = null;

    public static PyromancerLowStrategy getInstance() {
        if (instance == null) {
            instance = new PyromancerLowStrategy();
        }
        return instance;
    }
    /**
     * @param pyromancer
     */
    @Override
    public void pyromancerStrategy(final Pyromancer pyromancer) {
        pyromancer.setModificators(pyromancer.getModificators() + PyromancerConstants.
                MODIFICATORS_SUBTRACTED);
        pyromancer.setHp(Math.round(pyromancer.getHp() * PyromancerConstants.HP_ADDED_FACTOR));
    }
}
