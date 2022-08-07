package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LightningInput extends BaseElement{

    private final static String INPUT_LOCATOR= "//div[@role='dialog' and @aria-modal='true']//*[text()= '%s']//following::div//input";

    public LightningInput(WebDriver driver, String label) {
        super(driver, label);
    }


    public void setValue(String value){
        WebElement inputElement = driver.findElement(By.xpath(String.format(INPUT_LOCATOR, label)));
        scrollIntoView(inputElement);
        inputElement.sendKeys(value);
    }
}
