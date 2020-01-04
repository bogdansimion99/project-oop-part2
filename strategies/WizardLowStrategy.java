package strategies;

import helpers.WizardConstants;
import heroes.Wizard;

public class WizardLowStrategy implements WizardStrategy {

    @Override
    public void wizardStrategy(Wizard wizard) {
        wizard.setModificators(wizard.getModificators() + WizardConstants.MODIFICATORS_SUBTRACTED);
        wizard.setHp(Math.round(wizard.getHp() * WizardConstants.HP_ADDED_FACTOR));
    }
}
