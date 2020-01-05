package angels;

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
}
