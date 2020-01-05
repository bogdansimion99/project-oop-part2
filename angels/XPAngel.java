package angels;

public class XPAngel extends Angel {
    private Angel xpAngel;

    /**
     * @return
     */
    public Angel getXpAngel() {
        return xpAngel;
    }

    /**
     * @param xpAngel
     */
    public void setXpAngel(final Angel xpAngel) {
        this.xpAngel = xpAngel;
    }

    public XPAngel(final int[] position, final Angel xpAngel) {
        super("XPAngel", position);
        this.xpAngel = xpAngel;
    }
}
