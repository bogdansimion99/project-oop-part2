package angels;

public class DamageAngel extends Angel {
    private Angel damageAngel;

    public Angel getDamageAngel() {
        return damageAngel;
    }

    public void setDamageAngel(Angel damageAngel) {
        this.damageAngel = damageAngel;
    }

    public DamageAngel(int[] position, Angel damageAngel) {
        super("DamageAngel", position);
        this.damageAngel = damageAngel;
    }
}
