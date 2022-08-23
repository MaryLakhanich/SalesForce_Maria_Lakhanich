package pages.modals;

import elements.ComboBox;
import elements.LightningInput;
import elements.Textarea;
import lombok.extern.log4j.Log4j2;
import models.Lead;
import org.openqa.selenium.WebDriver;

@Log4j2
public class NewLeadModal extends BaseModal {
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Lead inputLead) {
        log.info("Filling form for a new Lead");
        new LightningInput(driver, "First Name").setValue(inputLead.getFirstName());
        new LightningInput(driver, "Last Name").setValue(inputLead.getLastName());
        new ComboBox(driver, "Salutation").selectOptionByVisibleText(inputLead.getSalutation().getChosenSalutation());
        new ComboBox(driver, "Lead Status").selectOptionByVisibleText(inputLead.getLeadStatus().getChosenLeadStatus());
        new LightningInput(driver, "Company").setValue(inputLead.getCompany());
        new LightningInput(driver, "Phone").setValue(inputLead.getPhone());
        new LightningInput(driver, "Email").setValue(inputLead.getEmail());
        new ComboBox(driver, "Rating").selectOptionByVisibleText(inputLead.getRating().getChosenRating());
        new LightningInput(driver, "Title").setValue(inputLead.getTitle());
        new Textarea(driver, "Street").setValueText(inputLead.getStreet());
        new LightningInput(driver, "City").setValue(inputLead.getCity());
        new LightningInput(driver, "Zip/Postal Code").setValue(inputLead.getZipCode());
        new LightningInput(driver, "State/Province").setValue(inputLead.getState());
        new LightningInput(driver, "Country").setValue(inputLead.getCountry());
        new LightningInput(driver, "Website").setValue(inputLead.getWebsite());
        new LightningInput(driver, "No. of Employees").setValue(inputLead.getNumberOfEmployees());
        new ComboBox(driver, "Lead Source").selectOptionByVisibleText(inputLead.getLeadSource().getChosenLeadSource());
        new ComboBox(driver, "Industry").selectOptionByVisibleText(inputLead.getIndustry().getChosenIndustry());

    }

    }

