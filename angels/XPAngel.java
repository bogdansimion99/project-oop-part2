package angels;

public class XPAngel extends Angel {
    private Angel xpAngel;

    public Angel getXpAngel() {
        return xpAngel;
    }

    public void setXpAngel(Angel xpAngel) {
        this.xpAngel = xpAngel;
    }

    public XPAngel(int[] position, Angel xpAngel) {
        super("XPAngel", position);
        this.xpAngel = xpAngel;
    }
}
