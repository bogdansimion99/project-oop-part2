package strategies;

import helpers.WizardConstants;
import heroes.Wizard;

public class WizardLowStrategy implements WizardStrategy {
    private static WizardLowStrategy instance = null;

    public static WizardLowStrategy getInstance() {
        if (instance == null) {
            instance = new WizardLowStrategy();
        }
        return instance;
    }
    /**
     * @param wizard
     */
    @Override
    public void wizardStrategy(final Wizard wizard) {
        wizard.setModificators(wizard.getModificators() + WizardConstants.MODIFICATORS_SUBTRACTED);
        wizard.setHp(Math.round(wizard.getHp() * WizardConstants.HP_ADDED_FACTOR));
    }
}
