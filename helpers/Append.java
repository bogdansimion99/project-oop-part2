package helpers;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class Append implements ModificatorVisitor {
    /**
     * @param pyromancer
     * @param modifcators
     * @return modificatorul specific jucatorului de tip Pyromancer pentru
     * abilitatea specifica
     */
    @Override
    public float visit(final Pyromancer pyromancer, final float[] modifcators) {
        return modifcators[2];
    }

    /**
     * @param knight
     * @param modificators
     * @return modificatorul specific jucatorului de tip Knight pentru
     * abilitatea specifica
     */
    @Override
    public float visit(final Knight knight, final float[] modificators) {
        return modificators[1];
    }

    /**
     * @param rogue
     * @param modificators
     * @return modificatorul specific jucatorului de tip Rogue pentru
     * abilitatea specifica
     */
    @Override
    public float visit(final Rogue rogue, final float[] modificators) {
        return modificators[0];
    }

    /**
     * @param wizard
     * @param modificators
     * @return modificatorul specific jucatorului de tip Wizard pentru
     * abilitatea specifica
     */
    @Override
    public float visit(final Wizard wizard, final float[] modificators) {
        return modificators[3];
    }

    /**
     * @param pyromancer
     * @param hps
     * @return
     */
    @Override
    public int visit(final Pyromancer pyromancer, final int[] hps) {
        return hps[2];
    }

    /**
     * @param knight
     * @param hps
     * @return
     */
    @Override
    public int visit(final Knight knight, final int[] hps) {
        return hps[1];
    }

    /**
     * @param rogue
     * @param hps
     * @return
     */
    @Override
    public int visit(final Rogue rogue, final int[] hps) {
        return hps[0];
    }

    /**
     * @param wizard
     * @param hps
     * @return
     */
    @Override
    public int visit(final Wizard wizard, final int[] hps) {
        return hps[3];
    }
}
