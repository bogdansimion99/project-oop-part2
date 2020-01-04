package angels;

public class LifeGiver extends Angel {
    private Angel lifeGiver;

    public Angel getLifeGiver() {
        return lifeGiver;
    }

    public void setLifeGiver(Angel lifeGiver) {
        this.lifeGiver = lifeGiver;
    }

    public LifeGiver(int[] position, Angel lifeGiver) {
        super("LifeGiver", position);
        this.lifeGiver = lifeGiver;
    }
}
