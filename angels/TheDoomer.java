package angels;

import heroes.Hero;

public class TheDoomer extends Angel {
    private Angel doomer;

    /**
     * @return
     */
    public Angel getDoomer() {
        return doomer;
    }

    /**
     * @param doomer
     */
    public void setDoomer(final Angel doomer) {
        this.doomer = doomer;
    }

    public TheDoomer(final int[] position, final Angel doomer) {
        super("TheDoomer", position);
        this.doomer = doomer;
    }

    /**
     * @param hero
     */
    public void action(final Hero hero) {
        if (hero.getHp() > 0) {
            hero.setHp(0);
        }
    }

    /**
     * @return
     */
    public String message() {
        return "hit";
    }

}
