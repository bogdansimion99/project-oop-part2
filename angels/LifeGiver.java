package angels;

import helpers.Append;
import helpers.LifeGiverConstants;
import heroes.Hero;

public class LifeGiver extends Angel {
    private Angel lifeGiver;

    /**
     * @return
     */
    public Angel getLifeGiver() {
        return lifeGiver;
    }

    /**
     * @param lifeGiver
     */
    public void setLifeGiver(final Angel lifeGiver) {
        this.lifeGiver = lifeGiver;
    }

    public LifeGiver(final int[] position, final Angel lifeGiver) {
        super("LifeGiver", position);
        this.lifeGiver = lifeGiver;
    }

    /**
     * @param hero
     */
    @Override
    public void action(final Hero hero) {
        if (hero.getHp() > 0) {
            int[] hps = {LifeGiverConstants.HP_ROGUE, LifeGiverConstants.HP_KNIGHT,
                    LifeGiverConstants.HP_PYROMANCER, LifeGiverConstants.HP_WIZARD};
            hero.setHp(hero.getHp() + hero.accept(new Append(), hps));
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
