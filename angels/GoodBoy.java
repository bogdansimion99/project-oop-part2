package angels;

public class GoodBoy extends Angel {
    private Angel goodBoy;

    /**
     * @return
     */
    public Angel getGoodBoy() {
        return goodBoy;
    }

    /**
     * @param goodBoy
     */
    public void setGoodBoy(final Angel goodBoy) {
        this.goodBoy = goodBoy;
    }

    public GoodBoy(final int[] position, final Angel goodBoy) {
        super("GoodBoy", position);
        this.goodBoy = goodBoy;
    }
}
