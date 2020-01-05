package angels;

public class SmallAngel extends Angel {
    private Angel smallAngel;

    /**
     * @return
     */
    public Angel getSmallAngel() {
        return smallAngel;
    }

    /**
     * @param smallAngel
     */
    public void setSmallAngel(final Angel smallAngel) {
        this.smallAngel = smallAngel;
    }

    public SmallAngel(final int[] position, final Angel smallAngel) {
        super("SmallAngel", position);
        this.smallAngel = smallAngel;
    }
}
