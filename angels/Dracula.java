package angels;

public class Dracula extends Angel {
    private Angel dracula;

    /**
     * @return
     */
    public Angel getDracula() {
        return dracula;
    }

    /**
     * @param dracula
     */
    public void setDracula(final Angel dracula) {
        this.dracula = dracula;
    }

    public Dracula(final int[] position, final Angel dracula) {
        super("Dracula", position);
        this.dracula = dracula;
    }
}
