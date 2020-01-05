package heroes;

import helpers.GeneralConstants;
import helpers.ModificatorVisitor;
import maps.Map;

public class Hero {
    private int hp;
    private int xp;
    private int level;
    private int[] position;
    // for multiple actions
    private int overtime;
    private int damageOvertime;
    // for Drain and Execute
    private int maximumHp;
    private String type;
    private float modificators;

    /**
     * @return
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp
     */
    public void setHp(final int hp) {
        this.hp = hp;
    }

    /**
     * @return
     */
    public int getXp() {
        return xp;
    }

    /**
     * @param xp
     */
    public void setXp(final int xp) {
        this.xp = xp;
    }

    /**
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(final int level) {
        this.level = level;
    }

    /**
     * @return
     */
    public int[] getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(final int[] position) {
        this.position = position;
    }

    /**
     * @return
     */
    public int getOvertime() {
        return overtime;
    }

    /**
     * @param overtime
     */
    public void setOvertime(final int overtime) {
        this.overtime = overtime;
    }

    /**
     * @return
     */
    public int getDamageOvertime() {
        return damageOvertime;
    }

    /**
     * @param damageOvertime
     */
    public void setDamageOvertime(final int damageOvertime) {
        this.damageOvertime = damageOvertime;
    }

    /**
     * @return
     */
    public int getMaximumHp() {
        return maximumHp;
    }

    /**
     * @param maximumHp
     */
    public void setMaximumHp(final int maximumHp) {
        this.maximumHp = maximumHp;
    }

    /**
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * @return
     */
    public float getModificators() {
        return modificators;
    }

    /**
     * @param modificators
     */
    public void setModificators(final float modificators) {
        this.modificators = modificators;
    }

    public Hero() {
        this.hp = 0;
        this.level = 0;
        this.xp = 0;
        this.position = new int[]{0, 0};
        this.overtime = 0;
        this.damageOvertime = 0;
        this.maximumHp = 0;
        this.type = "";
        this.modificators = 0;
    }

    public Hero(final int hp, final int[] position, final String type) {
        this.hp = hp;
        this.xp = 0;
        this.level = 0;
        this.position = position;
        this.overtime = 0;
        this.damageOvertime = 0;
        this.maximumHp = hp;
        this.type = type;
        this.modificators = 0;
    }

    /**
     * @param player
     */
    public void levelUp(final Hero player) {
        if (player.xp < GeneralConstants.LIMIT_LEVEL1) {
            player.level = 0;
        } else {
            player.level = (player.xp - GeneralConstants.LIMIT_LEVEL0) / GeneralConstants.
                    LIMIT_LEVEL_UPGRADE;
        }
    }

    /**
     * @param aggressor
     * @param victim
     * @param area
     */
    public void action(final Hero aggressor, final Hero victim, final Map area) {

    }

    /**
     * @param modificatorVisitor
     * @param modificators
     * @return
     */
    public float accept(final ModificatorVisitor modificatorVisitor, final float[] modificators) {
        return 0.0f;
    }

    /**
     * @param modificatorVisitor
     * @param hp
     * @return
     */
    public int accept(final ModificatorVisitor modificatorVisitor, final int[] hp) {
        return 0;
    }

    /**
     * @param aggressor
     * @param victim
     */
    public void calculateXp(final Hero aggressor, final Hero victim) {

    }

    /**
     * @param aggressor
     */
    public void calculateHp(final Hero aggressor) {

    }

    /**
     * @param hero
     */
    public void chooseStrategy (final Hero hero) {

    }
}
