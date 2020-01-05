package angels;

import heroes.Hero;

public class Angel {
    private String type;
    private int xpGiven;
    private int hpGiven;
    private float modifcatorsGiven;
    private boolean levelUp;
    private int[] position;

    /**
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * @return
     */
    public int getXpGiven() {
        return xpGiven;
    }

    /**
     * @param xpGiven
     */
    public void setXpGiven(final int xpGiven) {
        this.xpGiven = xpGiven;
    }

    /**
     * @return
     */
    public int getHpGiven() {
        return hpGiven;
    }

    /**
     * @param hpGiven
     */
    public void setHpGiven(final int hpGiven) {
        this.hpGiven = hpGiven;
    }

    /**
     * @return
     */
    public float getModifcatorsGiven() {
        return modifcatorsGiven;
    }

    /**
     * @param modifcatorsGiven
     */
    public void setModifcatorsGiven(final float modifcatorsGiven) {
        this.modifcatorsGiven = modifcatorsGiven;
    }

    /**
     * @return
     */
    public boolean isLevelUp() {
        return levelUp;
    }

    /**
     * @param levelUp
     */
    public void setLevelUp(final boolean levelUp) {
        this.levelUp = levelUp;
    }

    /**
     * @return
     */
    public int[] getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(final int[] position) {
        this.position = position;
    }

    public Angel() {
        this.type = "";
        this.position = new int[]{0, 0};
        this.hpGiven = 0;
        this.levelUp = false;
        this.modifcatorsGiven = 0.0f;
        this.xpGiven = 0;
    }

    public Angel(final String type, final int[] position) {
        this.type = type;
        this.position = position;
        this.hpGiven = 0;
        this.levelUp = false;
        this.modifcatorsGiven = 0.0f;
        this.xpGiven = 0;
    }

    public void action(final Hero hero) {

    }

    /**
     * @return
     */
    public String message() {
        return null;
    }
}
