package heroes;

import helpers.GeneralConstants;
import helpers.KnightConstants;
import helpers.Modificator;
import helpers.ModificatorVisitor;
import helpers.Append;
import maps.Map;
import strategies.KnightHighStrategy;
import strategies.KnightLowStrategy;

public class Knight extends Hero implements Modificator {
    private Hero knight;

    /**
     * @return
     */
    public Hero getKnight() {
        return knight;
    }

    public Knight(final Hero knight, final int[] position) {
        super(GeneralConstants.INITIAL_HP_KNIGHT, position, "Knight");
        this.knight = knight;
    }

    public static class Constants {
        public static final float MODIFICATOR_FIREBLAST = 1.2f;
        public static final float MODIFICATOR_IGNITE = 1.2f;
        public static final float MODIFICATOR_EXECUTE = 1.0f;
        public static final float MODIFICATOR_SLAM = 1.2f;
        public static final float MODIFICATOR_DRAIN = 1.2f;
        public static final float MODIFICATOR_DEFLECT = 1.4f;
        public static final float MODIFICATOR_BACKSTAB = 0.9f;
        public static final float MODIFICATOR_PARALYSIS = 0.8f;
    }

    /**
     * @param modificatorVisitor
     * @param modificators
     * @return face legatura cu metoda visit implementata in Append si mentionata
     * in ModificatorVisitor.
     */
    @Override
    public float accept(final ModificatorVisitor modificatorVisitor, final float[] modificators) {
        return modificatorVisitor.visit(this, modificators);
    }

    /**
     * @param modificatorVisitor
     * @param hp
     * @return
     */
    @Override
    public int accept(final ModificatorVisitor modificatorVisitor, final int[] hp) {
        return modificatorVisitor.visit(this, hp);
    }

    /**
     * @param aggressor cel care da damage
     * @param victim cel care isi ia damage
     * @param area terenul pe care se desfasoara jocul
     * Aceasta metoda apeleaza metodele specifice jucatorului de tip Knight.
     * La final se calculeaza xp-ul agresorului (cel care da damage).
     */
    @Override
    public void action(final Hero aggressor, final Hero victim, final Map area) {
        execute(aggressor, victim, area);
        slam(aggressor, victim, area);
        calculateXp(aggressor, victim);
    }

    /**
     * @param aggressor
     * @param victim
     * @param area
     */
    public void execute(final Hero aggressor, final Hero victim, final Map area) {
        // Trebuie sa fac acea limita
        if (victim.getHp() < victim.getMaximumHp() * Math.min(KnightConstants.INITIAL_HP_LIMIT
                + KnightConstants.ADDED_HP_LIMIT * aggressor.getLevel(), KnightConstants.
                MAXIMUM_HP_LIMIT)) {
            if (victim.getType().equals("Wizard")) {
                ((Wizard) victim).setDamage(((Wizard) victim).getDamage() + Math.round(victim.
                        getHp()));
            }
            victim.setHp(0);
            aggressor.calculateXp(aggressor, victim);
            aggressor.calculateHp(aggressor);
            return;
        }
        float hp = 0;
        hp = KnightConstants.BASE_DAMAGE_EXECUTE + KnightConstants.ADDED_DAMAGE_EXECUTE
                * aggressor.getLevel();
        if (area.getType().equals("Land")) {
            hp = hp * area.getModificator();
            hp = Math.round(hp);
        }
        if (victim.getType().equals("Wizard")) {
            ((Wizard) victim).setDamage(((Wizard) victim).getDamage() + Math.round(hp));
        }
        float[] modificators = {Rogue.Constants.MODIFICATOR_EXECUTE, Knight.Constants.
                MODIFICATOR_EXECUTE, Pyromancer.Constants.MODIFICATOR_EXECUTE, Wizard.Constants.
                MODIFICATOR_EXECUTE};
        hp = hp * victim.accept(new Append(), modificators) * (1 + aggressor.getModificators());
        victim.setHp(victim.getHp() - Math.round(hp));
    }

    /**
     * @param aggressor
     * @param victim
     * @param area
     */
    public void slam(final Hero aggressor, final Hero victim, final Map area) {
        if (victim.getHp() <= 0) {
            return;
        }
        float hp = 0;
        hp = KnightConstants.BASE_DAMAGE_SLAM + KnightConstants.ADDED_DAMAGE_SLAM
                * aggressor.getLevel();
        if (area.getType().equals("Land")) {
            hp = hp * area.getModificator();
            hp = Math.round(hp);
        }
        if (victim.getType().equals("Wizard")) {
            ((Wizard) victim).setDamage(((Wizard) victim).getDamage() + Math.round(hp));
        }
        float[] modificators = {Rogue.Constants.MODIFICATOR_SLAM, Knight.Constants.
                MODIFICATOR_SLAM, Pyromancer.Constants.MODIFICATOR_SLAM, Wizard.Constants.
                MODIFICATOR_SLAM};
        hp = hp * victim.accept(new Append(), modificators) * (1 + aggressor.getModificators());
        victim.setOvertime(KnightConstants.NO_ROUND_PARALYSIS);
        victim.setDamageOvertime(0);
        victim.setHp(victim.getHp() - Math.round(hp));
    }

    /**
     * @param aggressor
     * @param victim
     * Modifica nivelul jucatorului doar daca victima a murit.
     */
    @Override
    public void calculateXp(final Hero aggressor, final Hero victim) {
        if (victim.getHp() <= 0) {
            victim.setHp(0);
            int xp = aggressor.getXp();
            xp = xp + Math.max(0, GeneralConstants.STANDARD_ADDED_XP - (aggressor.getLevel()
                    - victim.getLevel()) * GeneralConstants.MODIFIED_ADDED_XP);
            aggressor.setXp(xp);
            int level = aggressor.getLevel();
            levelUp(aggressor);
            if (aggressor.getLevel() != level) {
                aggressor.calculateHp(aggressor);
            }
        }
    }

    /**
     * @param aggressor
     */
    @Override
    public void calculateHp(final Hero aggressor) {
        aggressor.setHp(GeneralConstants.INITIAL_HP_KNIGHT + aggressor.getLevel()
                * GeneralConstants.ADDED_HP_KNIGHT);
        aggressor.setMaximumHp(aggressor.getHp());
    }

    /**
     * @param hero
     */
    @Override
    public void chooseStrategy(final Hero hero) {
        if (hero.getHp() <= 0) {
            return;
        } else if (hero.getHp() < KnightConstants.HP_LIMIT_LOW_FACTOR * hero.getMaximumHp()) {
            KnightLowStrategy.getInstance().knightStrategy((Knight) hero);
        } else if (hero.getHp() < KnightConstants.HP_LIMIT_HIGH_FACTOR * hero.getMaximumHp()) {
            KnightHighStrategy.getInstance().knightStrategy((Knight) hero);
        }
    }
}
