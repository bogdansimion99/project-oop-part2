package angels;

public class Spawner extends Angel {
    private Angel spawner;

    /**
     * @return
     */
    public Angel getSpawner() {
        return spawner;
    }

    /**
     * @param spawner
     */
    public void setSpawner(final Angel spawner) {
        this.spawner = spawner;
    }

    public Spawner(final int[] position, final Angel spawner) {
        super("Spawner", position);
        this.spawner = spawner;
    }
}
