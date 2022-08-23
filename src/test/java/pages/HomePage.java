package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2

public class HomePage extends BasePage {
    private final static By USER_ICON_LOCATOR = By.cssSelector(".slds-avatar_profile-image-small");
    private final static By LEADS_TAB_LOCATOR = By.xpath("//*[@title='Leads']");
    private final static By ACCOUNTS_TAB_LOCATOR = By.xpath("//a[@title='Accounts']");
    private final static By CONTACTS_TAB_LOCATOR = By.xpath("//a[@title='Contacts']");
    private final static By MESSAGE_LOCATOR = By.xpath("//div[@role='alertdialog']");
    private final static By USER_BUTTON = By.xpath("//button[contains(@class, 'branding-userProfile-button')]");
    private final static By LOGOUT_BUTTON = By.xpath("//a[contains(@class, 'logout')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
    }

    public void waitForUserIconDisplayed() {
        waitForElementDisplayed(USER_ICON_LOCATOR);
    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON_LOCATOR).isDisplayed();
    }

    public void openLeadsTab() {
        jsClick(driver.findElement(LEADS_TAB_LOCATOR));
    }

    public void openAccountsTab() {
        log.info("Click Accounts tab");
        jsClick(driver.findElement(ACCOUNTS_TAB_LOCATOR));
    }

    public void openContactsTab() {
        log.info("Click Contacts tab");
        jsClick(driver.findElement(CONTACTS_TAB_LOCATOR));
    }



    public String getMessageText() {
        log.info("Confirmation message");
        waitForElementDisplayed(MESSAGE_LOCATOR);
        String actualText = driver.findElement(MESSAGE_LOCATOR).getText();
        return actualText;
    }

    public void waitLForLogoutClickable() {
        waitForElementClickable(USER_BUTTON);
    }

    public void clickLogout() {
        log.info("Logout");
        driver.findElement(USER_BUTTON).click();
        driver.findElement(LOGOUT_BUTTON).click();
    }
}
