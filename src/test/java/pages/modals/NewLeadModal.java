package pages.modals;

import elements.LightningInput;
import models.Lead;
import org.openqa.selenium.WebDriver;


public class NewLeadModal extends BaseModal {
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }
    public void fillForm(Lead inputLead){
        new LightningInput(driver, "First Name").setValue(inputLead.getFirstName());
        new LightningInput(driver, "Middle Name").setValue(inputLead.getMiddleName());
        new LightningInput(driver, "Last Name").setValue(inputLead.getLastName());
        new LightningInput(driver, "Company").setValue(inputLead.getCompany());
        new LightningInput(driver, "Industry").setValue(inputLead.getMobile());
        new LightningInput(driver, "Phone").setValue(inputLead.getPhone());
        new LightningInput(driver, "Email").setValue(inputLead.getEmail());
        new LightningInput(driver, "Mobile").setValue(inputLead.getMobile());
        new LightningInput(driver, "Salutation").setValue(inputLead.getSalutation().toString());
        new LightningInput(driver, "Rating").setValue(inputLead.getRating().toString());
        new LightningInput(driver, "leadStatus").setValue(inputLead.getLeadStatus());
        new LightningInput(driver, "Title").setValue(inputLead.getTitle());
        new LightningInput(driver, "Website").setValue(inputLead.getWebsite());

    }

}
