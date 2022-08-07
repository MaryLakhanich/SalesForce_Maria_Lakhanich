package pages;

import elements.LightningFormattedElement;
import enums.Industry;
import enums.LeadSource;
import enums.Rating;
import enums.Salutation;
import models.Lead;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends BasePage {
    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {

    }

    public Lead getLeadInfo() {
        String fullName = new LightningFormattedElement(driver, "Name").getText();
        String company = new LightningFormattedElement(driver, "Company").getText();
        String phone = new LightningFormattedElement(driver, "Phone").getText();
        String mobile = new LightningFormattedElement(driver, "Mobile").getText();
        String email = new LightningFormattedElement(driver, "Email").getText();
        String rating = new LightningFormattedElement(driver, "Rating").getText();
        String website = new LightningFormattedElement(driver, "Website").getText();
        String title = new LightningFormattedElement(driver, "Title").getText();
        String industry = new LightningFormattedElement(driver, "Lead Status").getText();
        String status = new LightningFormattedElement(driver, "Lead Status").getText();
        int numberOfEmployees = Integer.parseInt(new LightningFormattedElement(driver,"No. of Employees").getText());

        return new Lead.LeadBuilder("New", company)
                .fullName(fullName)
                .title(title)
                .mobile(mobile)
                .email(email)
                .phone(phone)
                .mobile(mobile)
                .rating(Rating.fromString(rating))
                .website(website)
                .industry(Industry.fromString(industry))
                .numberOfEmployees(numberOfEmployees)
                .build();
    }
}

