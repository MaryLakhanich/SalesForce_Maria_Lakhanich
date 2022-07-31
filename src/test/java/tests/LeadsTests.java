package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddNewLeadPage;
import pages.LeadsPage;

public class LeadsTests extends BaseTest {
    protected final static String FIRST_NAME = "Mary";
    protected final static String MIDDLE_NAME = "Ann";
    protected final static String LAST_NAME = "Ivanova";
    protected final static String COMPANY = "Baunty SPA";
    protected final static String PHONE = "+3758583636";
    protected final static String MOBILE_PHONE = "+375295448798";
    protected final static String EMAIL = "MaryIvanova@gmail.com";
    protected final static String TITLE = "administrator";
    protected final static String STREET = "Downing Street";
    protected final static String CITY = "Minsk";
    protected final static String ZIP = "12345";
    protected final static String PROVINCE = "Minsk Region";
    protected final static String COUNTRY = "Belarus";
    protected final static String WEBSITE = "bayntyspa.com";
    protected final static String NUMBER_OF_EMPLOYEES = "15";
    protected final static String EXPECTED_NAME = "Mrs. " + FIRST_NAME + " " +MIDDLE_NAME+" "+ LAST_NAME;

    private LeadsPage leadsPage;
    private AddNewLeadPage addNewLeadPage;

    @BeforeClass
    public void initialise() {
        leadsPage = new LeadsPage(driver);
        addNewLeadPage = new AddNewLeadPage(driver);
    }

    @Test
    public void createLeadTest() throws InterruptedException {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        addNewLeadPage.clickLeadStatus();
        addNewLeadPage.clickLeadStatusQualified();
        addNewLeadPage.clickSalutation();
        addNewLeadPage.clickSalutationMrs();
        addNewLeadPage.setFirstName(FIRST_NAME);
        addNewLeadPage.setMiddleName(MIDDLE_NAME);
        addNewLeadPage.setLastName(LAST_NAME);
        addNewLeadPage.setTitle(TITLE);
        addNewLeadPage.setEmail(EMAIL);
        addNewLeadPage.setPhone(PHONE);
        addNewLeadPage.setMobilePhone(MOBILE_PHONE);
        addNewLeadPage.setWebsite(WEBSITE);
        addNewLeadPage.setCompany(COMPANY);
        addNewLeadPage.setNumberOfEmployees(NUMBER_OF_EMPLOYEES);
        addNewLeadPage.setStreet(STREET);
        addNewLeadPage.setCity(CITY);
        addNewLeadPage.setProvince(PROVINCE);
        addNewLeadPage.setZip(ZIP);
        addNewLeadPage.setCountry(COUNTRY);
        addNewLeadPage.clickSaveButton();
        Assert.assertEquals(addNewLeadPage.getAddedLeadName(), EXPECTED_NAME);
        Assert.assertEquals(addNewLeadPage.getAddedLeadTitle(),TITLE);
        Assert.assertEquals(addNewLeadPage.getAddedLeadPhone(),PHONE);

    }
}
