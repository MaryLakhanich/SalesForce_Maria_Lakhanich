package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class EntityBasePage extends BasePage {

    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By TABLE_LOCATOR = By.cssSelector("table[role=grid]");
    private final static By ENTITIES_LINKS_LOCATOR = By.cssSelector("table[role=grid]");

    public EntityBasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(NEW_BUTTON);
        waitForElementClickable(NEW_BUTTON);
    }
    public void clickNewButton(){
        driver.findElement(NEW_BUTTON).click();
    }

    public void openEntityByName(String entityName){
        List<WebElement> allLinks = getAllEntitiesLinks();
        allLinks.stream().filter(webElement -> webElement.getText().equals(entityName))
                .findFirst()
                .get()
                .click();
    }

    public void openFirstEntityFromTable(){
        List<WebElement> allLinks=getAllEntitiesLinks();
        allLinks.get(0).click();
    }

    private List<WebElement> getAllEntitiesLinks (){
        return driver.findElements(ENTITIES_LINKS_LOCATOR);
    }
}
