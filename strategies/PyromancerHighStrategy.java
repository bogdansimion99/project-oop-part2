package strategies;

import helpers.PyromancerConstants;
import heroes.Pyromancer;

public class PyromancerHighStrategy implements PyromancerStrategy {
    private static PyromancerHighStrategy instance = null;

    public static PyromancerHighStrategy getInstance() {
        if (instance == null) {
            instance = new PyromancerHighStrategy();
        }
        return instance;
    }
    /**
     * @param pyromancer
     */
    @Override
    public void pyromancerStrategy(final Pyromancer pyromancer) {
        pyromancer.setModificators(pyromancer.getModificators() + PyromancerConstants.
                MODIFICATORS_ADDED);
        pyromancer.setHp(Math.round(pyromancer.getHp() * PyromancerConstants.HP_SUBTRACTED_FACTOR));
    }
}
