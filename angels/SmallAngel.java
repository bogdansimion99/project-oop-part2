package angels;

public class SmallAngel extends Angel {
    private Angel smallAngel;

    public Angel getSmallAngel() {
        return smallAngel;
    }

    public void setSmallAngel(Angel smallAngel) {
        this.smallAngel = smallAngel;
    }

    public SmallAngel(int[] position, Angel smallAngel) {
        super("SmallAngel", position);
        this.smallAngel = smallAngel;
    }
}
