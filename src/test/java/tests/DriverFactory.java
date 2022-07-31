package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver getDriver(String browserName) throws Exception {
        WebDriver driver;
        if (browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--headless");
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        } else if (browserName.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        } else {
            throw new Exception("Undefined browser type");
        }
        return driver;
    }
}
