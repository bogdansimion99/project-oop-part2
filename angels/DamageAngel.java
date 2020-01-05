package angels;

import helpers.Append;
import helpers.DamageAngelConstants;
import heroes.Hero;

public class DamageAngel extends Angel {
    private Angel damageAngel;

    /**
     * @return
     */
    public Angel getDamageAngel() {
        return damageAngel;
    }

    /**
     * @param damageAngel
     */
    public void setDamageAngel(final Angel damageAngel) {
        this.damageAngel = damageAngel;
    }

    public DamageAngel(final int[] position, final Angel damageAngel) {
        super("DamageAngel", position);
        this.damageAngel = damageAngel;
    }

    /**
     * @param hero
     */
    @Override
    public void action(final Hero hero) {
        if (hero.getHp() > 0) {
            float[] modificators = {DamageAngelConstants.MODIFICATOR_ROGUE, DamageAngelConstants.
                    MODIFICATOR_KNIGHT, DamageAngelConstants.MODIFICATOR_PYROMANCER,
                    DamageAngelConstants.MODIFICATOR_WIZARD};
            hero.setModificators(hero.getModificators() + hero.accept(new Append(), modificators));
        }
    }

    /**
     * @return
     */
    @Override
    public String message() {
        return "helped";
    }
}
