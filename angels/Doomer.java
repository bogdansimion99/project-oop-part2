package angels;

public class Doomer extends Angel {
    private Angel doomer;

    public Angel getDoomer() {
        return doomer;
    }

    public void setDoomer(Angel doomer) {
        this.doomer = doomer;
    }

    public Doomer(int[] position, Angel doomer) {
        super("Doomer", position);
        this.doomer = doomer;
    }
}
