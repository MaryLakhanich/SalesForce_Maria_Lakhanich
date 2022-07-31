package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        driver.findElement(usernameInput).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public void open(){
        driver.get(URL);
    }
}
