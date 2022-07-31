package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LeadsPage extends BasePage{
    private final static By NEW_BUTTON = By.cssSelector("a[title=New]");

    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(NEW_BUTTON);
    }

    public void clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
    }

}
