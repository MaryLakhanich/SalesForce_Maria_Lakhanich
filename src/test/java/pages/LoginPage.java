package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage {
    private final static String URL = "https://tmsqa195.my.salesforce.com/";
    private final static By usernameInput = By.id("username");
    private final static By passwordInput= By.id("password");
    private final static By loginButton= By.id("Login");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(usernameInput);
    }

    public void setUserName(String userName) {
        log.info("Setting user name");
        driver.findElement(usernameInput).sendKeys(userName);
    }

    public void setPassword(String password) {
        log.info("Setting password");
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        log.info("Clicking login button");
        driver.findElement(loginButton).click();
    }
    public void open(){
        driver.get(URL);
    }
}
