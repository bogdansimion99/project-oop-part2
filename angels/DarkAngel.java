package angels;

import helpers.Append;
import helpers.DarkAngelConstants;
import heroes.Hero;

public class DarkAngel extends Angel {
    private Angel darkAngel;

    /**
     * @return
     */
    public Angel getDarkAngel() {
        return darkAngel;
    }

    /**
     * @param darkAngel
     */
    public void setDarkAngel(final Angel darkAngel) {
        this.darkAngel = darkAngel;
    }

    /**
     * @param position
     * @param darkAngel
     */
    public DarkAngel(final int[] position, final Angel darkAngel) {
        super("DarkAngel", position);
        this.darkAngel = darkAngel;
    }

    /**
     * @param hero
     */
    public void action(final Hero hero) {
        int[] hps = {DarkAngelConstants.HP_ROGUE, DarkAngelConstants.HP_KNIGHT, DarkAngelConstants
                .HP_PYROMANCER, DarkAngelConstants.HP_WIZARD};
        hero.setModificators(hero.getModificators() + hero.accept(new Append(), hps));
    }
}
