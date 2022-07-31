package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class LeadsPage extends BasePage{
    private final static By NEW_BUTTON = By.cssSelector("a[title=New]");
    private final static By ICON_LOCATOR = By.cssSelector("//img[@title='Leads']/parent::div");

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
