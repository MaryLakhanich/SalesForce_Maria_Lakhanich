package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

@Log4j2
public class DropDownForAccount extends BaseElement {
    private final static String BUTTON_ACCOUNT_LOCATOR = "//span[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]/div";
    private final static String OPTIONS_ACCOUNT_LOCATOR = "//div[@class='select-options']/descendant::a[(text()='%s')]";

    public DropDownForAccount(WebDriver driver, String label) {
        super(driver, label);
    }

    public void selectByVisibleAccountText(String visibleAccountText) {
        if (Objects.nonNull(visibleAccountText)) {
            WebElement buttonAccount = driver.findElement(By.xpath(String.format(BUTTON_ACCOUNT_LOCATOR, label)));
            scrollIntoView(buttonAccount);
            buttonAccount.click();
            log.debug(String.format("Setting %s DropdownForAccount locator: %s value = %s", label, OPTIONS_ACCOUNT_LOCATOR, visibleAccountText));
            WebElement optionAccount = driver.findElement(By.xpath(String.format(OPTIONS_ACCOUNT_LOCATOR, visibleAccountText)));
            scrollIntoView(optionAccount);
            optionAccount.click();
        }
    }
}