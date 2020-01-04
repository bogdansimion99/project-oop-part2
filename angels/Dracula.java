package angels;

public class Dracula extends Angel {
    private Angel dracula;

    public Angel getDracula() {
        return dracula;
    }

    public void setDracula(Angel dracula) {
        this.dracula = dracula;
    }

    public Dracula(int[] position, Angel dracula) {
        super("Dracula", position);
        this.dracula = dracula;
    }
}
