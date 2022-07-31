package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private final static By USER_ICON_LOKATOR=By.cssSelector(".slds-avatar_profile-image-small");
    private final static By LEADS_TAB_LOCATOR = By.xpath("//*[@title='Leads']");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @Override
    public void waitForPageLoaded() {
    }
    public void waitForUserIconDisplayed() {
        waitForElementDisplayed(USER_ICON_LOKATOR);
    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON_LOKATOR).isDisplayed();
    }

    public void openLeadsTab() {
        jsClick(driver.findElement(LEADS_TAB_LOCATOR));
    }
}
