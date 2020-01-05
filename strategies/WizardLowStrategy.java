package strategies;

import helpers.WizardConstants;
import heroes.Wizard;

public class WizardLowStrategy implements WizardStrategy {

    /**
     * @param wizard
     */
    @Override
    public void wizardStrategy(final Wizard wizard) {
        wizard.setModificators(wizard.getModificators() + WizardConstants.MODIFICATORS_SUBTRACTED);
        wizard.setHp(Math.round(wizard.getHp() * WizardConstants.HP_ADDED_FACTOR));
    }
}
