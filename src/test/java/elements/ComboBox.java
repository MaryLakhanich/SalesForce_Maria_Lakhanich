package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

@Log4j2
public class ComboBox extends BaseElement {
    private final static String BUTTON_LOCATOR = "//label[contains(text(),'%s')]/following-sibling::div";
    private final static String OPTION_LOCATOR = "//div/lightning-base-combobox-item/descendant::span[@title='%s']";

    public ComboBox(WebDriver driver, String label) {
        super(driver, label);
    }

    public void selectOptionByVisibleText(String optionVisibleText) {
        if (Objects.nonNull(optionVisibleText)) {
            WebElement button = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR, label)));
            scrollIntoView(button);
            button.click();
            log.debug(String.format("Setting %s ComboBox locator: %s value = %s", label, OPTION_LOCATOR, optionVisibleText));
            WebElement option = driver.findElement(By.xpath(String.format(OPTION_LOCATOR, optionVisibleText)));
            scrollIntoView(option);
            option.click();
        }
    }
}
