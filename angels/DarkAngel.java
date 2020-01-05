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
        if (hero.getHp() > 0) {
            int[] hps = {DarkAngelConstants.HP_ROGUE, DarkAngelConstants.HP_KNIGHT,
                    DarkAngelConstants.HP_PYROMANCER, DarkAngelConstants.HP_WIZARD};
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
