package angels;

public class GoodBoy extends Angel {
    private Angel goodBoy;

    public Angel getGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(Angel goodBoy) {
        this.goodBoy = goodBoy;
    }

    public GoodBoy(int[] position, Angel goodBoy) {
        super("GoodBoy", position);
        this.goodBoy = goodBoy;
    }
}
