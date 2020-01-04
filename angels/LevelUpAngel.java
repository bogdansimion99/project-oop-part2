package angels;

public class LevelUpAngel extends Angel {
    private Angel levelUpAngel;

    public Angel getLevelUpAngel() {
        return levelUpAngel;
    }

    public void setLevelUpAngel(Angel levelUpAngel) {
        this.levelUpAngel = levelUpAngel;
    }

    public LevelUpAngel(int[] position, Angel levelUpAngel) {
        super("LevelUpAngel", position);
        this.levelUpAngel = levelUpAngel;
    }
}
