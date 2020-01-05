package angels;

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
}
