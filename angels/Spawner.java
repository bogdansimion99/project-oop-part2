package angels;

import helpers.Append;
import helpers.SpawnerConstants;
import heroes.Hero;

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

    /**
     * @param hero
     */
    @Override
    public void action(final Hero hero) {
        if (hero.getHp() < 0) {
            int[] hps = {SpawnerConstants.HP_ROGUE, SpawnerConstants.HP_KNIGHT, SpawnerConstants
                    .HP_PYROMANCER, SpawnerConstants.HP_WIZARD};
            hero.setHp(hero.getHp() + hero.accept(new Append(), hps));
        }
    }

    /**
     * @return
     */
    @Override
    public String message() {
        return "helped";
    }
}
