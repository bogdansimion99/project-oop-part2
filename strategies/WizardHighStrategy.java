package strategies;

import helpers.WizardConstants;
import heroes.Wizard;

public class WizardHighStrategy implements WizardStrategy {
    private static WizardHighStrategy instance = null;

    public static WizardHighStrategy getInstance() {
        if (instance == null) {
            instance = new WizardHighStrategy();
        }
        return instance;
    }
    /**
     * @param wizard
     */
    @Override
    public void wizardStrategy(final Wizard wizard) {
        wizard.setModificators(wizard.getModificators() + WizardConstants.MODIFICATORS_ADDED);
        wizard.setHp(Math.round(wizard.getHp() * WizardConstants.HP_SUBTRACTED_FACTOR));
    }
}
