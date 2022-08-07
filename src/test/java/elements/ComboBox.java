package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComboBox extends BaseElement{
    private final static String BUTTON_LOCATOR="//span[text()='%s']/ancestor::div[contains(@class, 'uiInputSelect')]//a[@class= 'select']";
    private final static String OPTION_LOCATOR="//div[contains(@class, 'uiMenuList') and contains(@class, 'select')]//a[contains(text(), '%s')]";

    public ComboBox(WebDriver driver, String label) {
        super(driver, label);
    }
    public void selectOptionByVisibleText(String optionVisibleText) {
        WebElement button = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR, label)));
        scrollIntoView(button);
        button.click();
        System.out.println("log");
        driver.findElement(By.xpath(String.format(OPTION_LOCATOR, label, optionVisibleText)));
        List<WebElement> allItems = driver.findElements(By.xpath(String.format(OPTION_LOCATOR, label))); //lightning-base-combobox-item
        allItems.stream().filter(webElement -> webElement.getText().equals(optionVisibleText))
                .findFirst()
                .get()
                .click();
    }
}
