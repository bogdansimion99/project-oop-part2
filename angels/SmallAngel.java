package angels;

import helpers.Append;
import helpers.SmallAngelConstants;
import heroes.Hero;

public class SmallAngel extends Angel {
    private Angel smallAngel;

    /**
     * @return
     */
    public Angel getSmallAngel() {
        return smallAngel;
    }

    /**
     * @param smallAngel
     */
    public void setSmallAngel(final Angel smallAngel) {
        this.smallAngel = smallAngel;
    }

    public SmallAngel(final int[] position, final Angel smallAngel) {
        super("SmallAngel", position);
        this.smallAngel = smallAngel;
    }

    /**
     * @param hero
     */
    @Override
    public void action(final Hero hero) {
        float[] modificators = {SmallAngelConstants.MODIFICATOR_ROGUE, SmallAngelConstants.
                MODIFICATOR_KNIGHT, SmallAngelConstants.MODIFICATOR_PYROMANCER,
                SmallAngelConstants.MODIFICATOR_WIZARD};
        hero.setModificators(hero.getModificators() + hero.accept(new Append(), modificators));
        int[] hps = {SmallAngelConstants.HP_ROGUE, SmallAngelConstants.HP_KNIGHT,
                SmallAngelConstants.HP_PYROMANCER, SmallAngelConstants.HP_WIZARD};
        hero.setHp(hero.getHp() + hero.accept(new Append(), hps));
    }

    /**
     * @return
     */
    @Override
    public String message() {
        return "helped";
    }
}
