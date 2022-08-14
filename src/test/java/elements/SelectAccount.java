package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

@Log4j2
public class SelectAccount extends BaseElement {
    private final static String SELECT_LOCATOR = "//span[text()= '%s']/ancestor::div[contains(@class, 'uiInput')]//input";
    private final static String SELECT_OPTION_LOCATOR = "//a[@role='option']/descendant::div[contains(@class, 'primaryLabel')]";

    public SelectAccount(WebDriver driver, String label) {
        super(driver, label);
    }

    public void selectOption(String option) {
        if (Objects.nonNull(option)) {
            WebElement button = driver.findElement(By.xpath(String.format(SELECT_LOCATOR, label)));
            scrollIntoView(button);
            button.click();
            log.debug(String.format("Setting %s SelectAccount locator: %s value = %s", label, SELECT_LOCATOR, option));
            List<WebElement> options = driver.findElements(By.xpath(SELECT_OPTION_LOCATOR));
            WebElement selectOption = options.stream().filter(webElement -> webElement.getText().equals(option))
                    .findFirst()
                    .get();
            scrollIntoView(selectOption);
            selectOption.click();
        }
    }

}
