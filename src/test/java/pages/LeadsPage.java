package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class LeadsPage extends EntityBasePage{
    private final static By ICON_LOCATOR = By.cssSelector("//img[@title='Leads']/parent::div");

    public LeadsPage(WebDriver driver) {
        super(driver);
    }
    By lastNameInput = By.xpath("//input[@name='lastName']");
    By companyInput = By.xpath("//input[@name='Company']");
    By errorMessage=By.xpath("//li[@records-recordediterror_recordediterror]//a");

    public void setLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void setCompany(String company) {
        driver.findElement(companyInput).sendKeys(company);
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMessage).getText();
    }

}
