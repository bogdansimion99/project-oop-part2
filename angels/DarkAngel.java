package angels;

public class DarkAngel extends Angel {
    private Angel darkAngel;

    public Angel getDarkAngel() {
        return darkAngel;
    }

    public void setDarkAngel(Angel darkAngel) {
        this.darkAngel = darkAngel;
    }

    public DarkAngel(int[] position, Angel darkAngel) {
        super("DarkAngel", position);
        this.darkAngel = darkAngel;
    }
}
