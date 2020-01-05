package strategies;

import helpers.PyromancerConstants;
import heroes.Pyromancer;

public class PyromancerHighStrategy implements PyromancerStrategy {
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
