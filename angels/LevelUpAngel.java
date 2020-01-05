package angels;

import helpers.Append;
import helpers.GeneralConstants;
import helpers.LevelUpAngelConstants;
import heroes.Hero;

public class LevelUpAngel extends Angel {
    private Angel levelUpAngel;

    /**
     * @return
     */
    public Angel getLevelUpAngel() {
        return levelUpAngel;
    }

    /**
     * @param levelUpAngel
     */
    public void setLevelUpAngel(final Angel levelUpAngel) {
        this.levelUpAngel = levelUpAngel;
    }

    public LevelUpAngel(final int[] position, final Angel levelUpAngel) {
        super("LevelUpAngel", position);
        this.levelUpAngel = levelUpAngel;
    }

    /**
     * @param hero
     */
    @Override
    public void action(final Hero hero) {
        if (hero.getHp() > 0) {
            float[] modificators = {LevelUpAngelConstants.MODIFICATOR_ROGUE, LevelUpAngelConstants.
                    MODIFICATOR_KNIGHT, LevelUpAngelConstants.MODIFICATOR_PYROMANCER,
                    LevelUpAngelConstants.MODIFICATOR_WIZARD};
            hero.setModificators(hero.getModificators() + hero.accept(new Append(), modificators));
            if (hero.getXp() % GeneralConstants.LEVEL_UP_BY_100 < GeneralConstants.LEVEL_UP_BY_50) {
                hero.setXp(hero.getXp() - hero.getXp() % GeneralConstants.LEVEL_UP_BY_100
                        + GeneralConstants.LEVEL_UP_BY_50);
            } else {
                hero.setXp(hero.getXp() - hero.getXp() % GeneralConstants.LEVEL_UP_BY_100
                        + GeneralConstants.LEVEL_UP_BY_100);
            }
            hero.levelUp(hero);
            hero.calculateHp(hero);
        }
    }

    /**
     * @return
     */
    public String message() {
        return "helped";
    }
}
