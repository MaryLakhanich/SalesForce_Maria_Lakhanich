package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewLeadPage extends LeadsPage {
    private final static By FIRST_NAME_INPUT = By.xpath("//input[@name='firstName']");
    private final static By MIDDLE_NAME_INPUT = By.xpath("//input[@name='middleName']");
    private final static By LAST_NAME_INPUT = By.xpath("//input[@name='lastName']");
    private final static By COMPANY_INPUT = By.xpath("//input[@name='Company']");
    private final static By PHONE_INPUT = By.xpath("//input[@name='Phone']");
    private final static By MOBILE_PHONE_INPUT = By.xpath("//input[@name='MobilePhone']");
    private final static By EMAIL_INPUT = By.xpath("//input[@name='Email']");
    private final static By TITLE_INPUT = By.xpath("//input[@name='Title']");
    private final static By STREET_INPUT = By.xpath("//textarea[@name='street']");
    private final static By CITY_INPUT = By.xpath("//input[@name='city']");
    private final static By ZIP_INPUT = By.xpath("//input[@name='postalCode']");
    private final static By PROVINCE_INPUT = By.xpath("//input[@name='province']");
    private final static By COUNTRY_INPUT = By.xpath("//input[@name='country']");
    private final static By WEBSITE_INPUT = By.xpath("//input[@name='Website']");
    private final static By NUMBER_OF_EMPLOYEES_INPUT = By.xpath("//input[@name='NumberOfEmployees']");
    private final static By LEAD_STATUS = By.xpath("//label[contains(text(),'Lead Status')]");
    private final static By LEAD_STATUS_QUALIFIED = By.xpath("//span[contains(text(),'Qualified')]");
    private final static By SALUTATION = By.xpath("//label[contains(text(),'Salutation')]/following-sibling::div");
    private final static By SALUTATION_MRS = By.xpath("//span[contains(text(),'Mrs.')]");
    private final static By SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");
    private final static By ADDED_LEAD = By.xpath("//lightning-formatted-name[@slot='primaryField']");
    private final static By LEAD_TITLE = By.xpath("//p[contains(text(),'Title')]/parent::div/descendant::lightning-formatted-text");
    private final static By LEAD_PHONE = By.xpath("//p[contains(text(),'Phone (2) ')]/ancestor::button/following-sibling::slot/descendant::a");

    public AddNewLeadPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(FIRST_NAME_INPUT);
    }
    public void setFirstName(String firstName) {
        driver.findElement(FIRST_NAME_INPUT).sendKeys(firstName);
    }
    public void setMiddleName(String middleName){
        driver.findElement(MIDDLE_NAME_INPUT).sendKeys(middleName);
    }

    public void setLastName(String lastName) {
        driver.findElement(LAST_NAME_INPUT).sendKeys(lastName);
    }

    public void setCompany(String company) {
        driver.findElement(COMPANY_INPUT).sendKeys(company);
    }

    public void setPhone(String phone) {
        driver.findElement(PHONE_INPUT).sendKeys(phone);
    }
    public void setMobilePhone(String mobilePhone){
        driver.findElement(MOBILE_PHONE_INPUT).sendKeys(mobilePhone);
    }

    public void setEmail(String email) {
        driver.findElement(EMAIL_INPUT).sendKeys(email);
    }

    public void setTitle(String title) {
        driver.findElement(TITLE_INPUT).sendKeys(title);
    }

    public void setStreet(String street) {
        driver.findElement(STREET_INPUT).sendKeys(street);
    }

    public void setCity(String city) {
        driver.findElement(CITY_INPUT).sendKeys(city);
    }

    public void setZip(String zip) {
        driver.findElement(ZIP_INPUT).sendKeys(zip);
    }

    public void setProvince(String province) {
        driver.findElement(PROVINCE_INPUT).sendKeys(province);
    }

    public void setCountry(String country) {
        driver.findElement(COUNTRY_INPUT).sendKeys(country);
    }

    public void setWebsite(String website) {
        driver.findElement(WEBSITE_INPUT).sendKeys(website);
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        driver.findElement(NUMBER_OF_EMPLOYEES_INPUT).sendKeys(numberOfEmployees);
    }

    public void clickLeadStatus() {
       driver.findElement(LEAD_STATUS).click();
    }

    public void clickLeadStatusQualified() {
        driver.findElement(LEAD_STATUS_QUALIFIED).click();
    }

    public void clickSalutation() {
        driver.findElement(SALUTATION).click();
    }

    public void clickSalutationMrs() {
        driver.findElement(SALUTATION_MRS).click();
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }
    public String getAddedLeadName(){
        String addedLeadName=driver.findElement(ADDED_LEAD).getText();
        return addedLeadName;
    }

    public String getAddedLeadTitle(){
        String addedLeadTitle = driver.findElement(LEAD_TITLE).getText();
        return addedLeadTitle;
    }
    public String getAddedLeadPhone(){
        String addedLeadPhone=driver.findElement(LEAD_PHONE).getText();
        return addedLeadPhone;
    }

    public String getSalutationText() {
        String salutationText = driver.findElement(SALUTATION).getText();
        return salutationText;
    }

}
