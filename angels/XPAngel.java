package angels;

import helpers.Append;
import helpers.XpAngelConstants;
import heroes.Hero;

public class XPAngel extends Angel {
    private Angel xpAngel;

    /**
     * @return
     */
    public Angel getXpAngel() {
        return xpAngel;
    }

    /**
     * @param xpAngel
     */
    public void setXpAngel(final Angel xpAngel) {
        this.xpAngel = xpAngel;
    }

    public XPAngel(final int[] position, final Angel xpAngel) {
        super("XPAngel", position);
        this.xpAngel = xpAngel;
    }

    /**
     * @param hero
     */
    @Override
    public void action(final Hero hero) {
        int[] xps = {XpAngelConstants.XP_ROGUE, XpAngelConstants.XP_KNIGHT, XpAngelConstants
                .XP_PYROMANCER, XpAngelConstants.XP_WIZARD};
        hero.setXp(hero.getXp() + hero.accept(new Append(), xps));
        int level = hero.getLevel();
        hero.levelUp(hero);
        if (level != hero.getLevel()) {
            hero.calculateHp(hero);
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
