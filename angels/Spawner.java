package angels;

public class Spawner extends Angel {
    private Angel spawner;

    public Angel getSpawner() {
        return spawner;
    }

    public void setSpawner(Angel spawner) {
        this.spawner = spawner;
    }

    public Spawner(int[] position, Angel spawner) {
        super("Spawner", position);
        this.spawner = spawner;
    }
}
