package pages;

import elements.LightningFormattedElement;
import enums.AccountType;
import enums.Industry;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SplitForStringData;

@Log4j2
public class AccountDetailsPage extends BasePage {
    private final static By ICON_ACCOUNT_DETAILS_LOCATOR = By.xpath("//records-highlights-icon");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_ACCOUNT_DETAILS_LOCATOR);
    }

    public Account getAccountInfo() {
        log.info("Getting saved Account data");
        String accountName = new LightningFormattedElement(driver, "Account Name").getText();
        Account.AccountBuilder accountBuilder = Account.builder().accountName(accountName);
        String parentAccount = new LightningFormattedElement(driver, "Parent Account").getText();
        if (parentAccount != "") {
            accountBuilder.parentAccount(SplitForStringData.textSplit(parentAccount));
        }
        String phone = new LightningFormattedElement(driver, "Phone").getText();
        if (phone != "") {
            accountBuilder.phone(phone);
        }
        String website = new LightningFormattedElement(driver, "Website").getText();
        if (website != "") {
            accountBuilder.website(website);
        }
        String type = new LightningFormattedElement(driver, "Type").getText();
        if (type != "") {
            accountBuilder.accountType(AccountType.fromString(type));
        }
        String industry = new LightningFormattedElement(driver, "Industry").getText();
        if (industry != "") {
            accountBuilder.industry(Industry.fromString(industry));
        }
        String employees = new LightningFormattedElement(driver, "Employees").getText();
        if (employees != "") {
            accountBuilder.employees((employees));
        }
        String description = new LightningFormattedElement(driver, "Description").getText();
        if (description != "") {
            accountBuilder.description(description);
        }
        String billingAddress = new LightningFormattedElement(driver, "Billing Address").getText();
        String billingStreet;
        String billingCity;
        String billingState;
        String billingZip;
        String billingCountry;
        if (billingAddress != "") {
            billingAddress = billingAddress.replace(",", " ");
            billingAddress = billingAddress.replace("\n", " ");
            billingAddress = billingAddress.replace("  ", " ");
            String[] billingAddressSplit = billingAddress.split("\\s");
            billingStreet = billingAddressSplit[0];
            billingCity = billingAddressSplit[1];
            billingState = billingAddressSplit[2];
            billingZip = billingAddressSplit[3];
            billingCountry = billingAddressSplit[4];
        } else {
            billingStreet = null;
            billingCity = null;
            billingState = null;
            billingZip = null;
            billingCountry = null;
        }
        accountBuilder.billingStreet(billingStreet);
        accountBuilder.billingCity(billingCity);
        accountBuilder.billingState(billingState);
        accountBuilder.billingZip(billingZip);
        accountBuilder.billingCountry(billingCountry);
        String shippingAddress = new LightningFormattedElement(driver, "Shipping Address").getText();
        String shippingStreet;
        String shippingCity;
        String shippingState;
        String shippingZip;
        String shippingCountry;
        if (shippingAddress != "") {
            shippingAddress = shippingAddress.replace(",", " ");
            shippingAddress = shippingAddress.replace("\n", " ");
            shippingAddress = shippingAddress.replace("  ", " ");
            String[] shippingAddressSplit = shippingAddress.split("\\s");
            shippingStreet = shippingAddressSplit[0];
            shippingCity = shippingAddressSplit[1];
            shippingState = shippingAddressSplit[2];
            shippingZip = shippingAddressSplit[3];
            shippingCountry = shippingAddressSplit[4];
        } else {
            shippingStreet = null;
            shippingCity = null;
            shippingState = null;
            shippingZip = null;
            shippingCountry = null;
        }
        accountBuilder.shippingStreet(shippingStreet);
        accountBuilder.shippingCity(shippingCity);
        accountBuilder.shippingState(shippingState);
        accountBuilder.shippingZip(shippingZip);
        accountBuilder.shippingCountry(shippingCountry);

        return accountBuilder.build();

    }

}
