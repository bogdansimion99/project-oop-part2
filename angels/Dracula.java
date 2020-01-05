package angels;

import helpers.Append;
import helpers.DraculaConstants;
import heroes.Hero;

public class Dracula extends Angel {
    private Angel dracula;

    /**
     * @return
     */
    public Angel getDracula() {
        return dracula;
    }

    /**
     * @param dracula
     */
    public void setDracula(final Angel dracula) {
        this.dracula = dracula;
    }

    public Dracula(final int[] position, final Angel dracula) {
        super("Dracula", position);
        this.dracula = dracula;
    }

    /**
     * @param hero
     */
    public void action(final Hero hero) {
        if (hero.getHp() > 0) {
            float[] modificators = {DraculaConstants.MODIFICATOR_ROGUE, DraculaConstants.
                    MODIFICATOR_KNIGHT, DraculaConstants.MODIFICATOR_PYROMANCER,
                    DraculaConstants.MODIFICATOR_WIZARD};
            hero.setModificators(hero.getModificators() + hero.accept(new Append(), modificators));
            int[] hps = {DraculaConstants.HP_ROGUE, DraculaConstants.HP_KNIGHT, DraculaConstants
                    .HP_PYROMANCER, DraculaConstants.HP_WIZARD};
            hero.setHp(hero.getHp() + hero.accept(new Append(), hps));
        }
    }

    /**
     * @return
     */
    public String message() {
        return "hit";
    }
}
