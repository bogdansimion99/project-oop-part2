package angels;

import helpers.Append;
import helpers.GoodBoyConstants;
import heroes.Hero;

public class GoodBoy extends Angel {
    private Angel goodBoy;

    /**
     * @return
     */
    public Angel getGoodBoy() {
        return goodBoy;
    }

    /**
     * @param goodBoy
     */
    public void setGoodBoy(final Angel goodBoy) {
        this.goodBoy = goodBoy;
    }

    public GoodBoy(final int[] position, final Angel goodBoy) {
        super("GoodBoy", position);
        this.goodBoy = goodBoy;
    }

    /**
     * @param hero
     */
    @Override
    public void action(final Hero hero) {
        if (hero.getHp() > 0) {
            float[] modificators = {GoodBoyConstants.MODIFICATOR_ROGUE, GoodBoyConstants.
                    MODIFICATOR_KNIGHT, GoodBoyConstants.MODIFICATOR_PYROMANCER,
                    GoodBoyConstants.MODIFICATOR_WIZARD};
            hero.setModificators(hero.getModificators() + hero.accept(new Append(), modificators));
            int[] hps = {GoodBoyConstants.HP_ROGUE, GoodBoyConstants.HP_KNIGHT, GoodBoyConstants
                    .HP_PYROMANCER, GoodBoyConstants.HP_WIZARD};
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
