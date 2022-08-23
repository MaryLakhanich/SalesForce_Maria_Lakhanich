package pages.modals;

import elements.DropDownForAccount;
import elements.InputForAccount;
import elements.SelectAccount;
import elements.TextAreaAccount;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class NewAccountModal extends BaseModal {
    By COPY_CHECKBOX_LOCATOR = By.xpath("//*[contains(text(),'Copy Billing Address to Shipping Address')]/ancestor::div[1]/input[@type='checkbox']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Account inputAccount) {
        log.info("Filling form for a new Account");
        new InputForAccount(driver, "Account Name").setValueAccount(inputAccount.getAccountName());
        new SelectAccount(driver, "Parent Account").selectOption(inputAccount.getParentAccount());
        new InputForAccount(driver, "Phone").setValueAccount(inputAccount.getPhone());
        new InputForAccount(driver, "Website").setValueAccount(inputAccount.getWebsite());
        new InputForAccount(driver, "Employees").setValueAccount(inputAccount.getEmployees());
        new DropDownForAccount(driver, "Type").selectByVisibleAccountText(inputAccount.getAccountType().getChosenAccountType());
        new DropDownForAccount(driver, "Industry").selectByVisibleAccountText(inputAccount.getIndustry().getChosenIndustry());
        new TextAreaAccount(driver, "Description").setValueTextAccount(inputAccount.getDescription());
        new TextAreaAccount(driver, "Billing Street").setValueTextAccount(inputAccount.getBillingStreet());
        new InputForAccount(driver, "Billing City").setValueAccount(inputAccount.getBillingCity());
        new InputForAccount(driver, "Billing State/Province").setValueAccount(inputAccount.getBillingState());
        new InputForAccount(driver, "Billing Zip/Postal Code").setValueAccount(inputAccount.getBillingZip());
        new InputForAccount(driver, "Billing Country").setValueAccount(inputAccount.getBillingCountry());
        new TextAreaAccount(driver, "Shipping Street").setValueTextAccount(inputAccount.getShippingStreet());
        new InputForAccount(driver, "Shipping City").setValueAccount(inputAccount.getShippingCity());
        new InputForAccount(driver, "Shipping State/Province").setValueAccount(inputAccount.getShippingState());
        new InputForAccount(driver, "Shipping Zip/Postal Code").setValueAccount(inputAccount.getShippingZip());
        new InputForAccount(driver, "Shipping Country").setValueAccount(inputAccount.getShippingCountry());
    }

    public void clickCopyCheckbox() {
        driver.findElement(COPY_CHECKBOX_LOCATOR).click();
    }

}
