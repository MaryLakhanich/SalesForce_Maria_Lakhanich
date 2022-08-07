package tests;

import com.github.javafaker.Faker;
import enums.Industry;
import enums.Rating;
import enums.Salutation;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.modals.NewLeadModal;

public class LeadsTests extends BaseTest {

    private LeadsPage leadsPage;
    private NewLeadModal newLeadModal;
    private LeadDetailsPage leadDetailsPage;

    @BeforeClass
    public void initialise() {
        leadsPage = new LeadsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        leadDetailsPage = new LeadDetailsPage(driver);
    }


    Faker faker = new Faker();
    @Test
    public void createLeadTest() throws InterruptedException {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();


        Lead testLead = new Lead.LeadBuilder("New", faker.company().name())
                .salutation(Salutation.MR)
                .firstName(faker.name().firstName())
                .middleName(faker.name().nameWithMiddle())
                .website(faker.company()+".com")
                .title(faker.job().title())
                .email(faker.name().firstName()+"@mail.ru")
                .phone(faker.phoneNumber().cellPhone())
                .mobile(faker.phoneNumber().cellPhone())
                .numberOfEmployees(faker.number().randomDigit())
                .industry(Industry.BIOTECHNOLOGY)
                .rating(Rating.WARM)
                .street(faker.address().streetName())
                .city(faker.address().city())
                .state(faker.address().state())
                .country(faker.address().country())
                .zipCode(faker.address().countryCode())
                .build();
        newLeadModal.fillForm(testLead);
        newLeadModal.clickSaveButton();
        Assert.assertEquals(leadDetailsPage.getLeadInfo(), testLead);
    }

    @DataProvider
    public Object[][]inputForNegativeLogInTest(){
        return new Object[][]{
                {"","Samsung", "Name"},
                {"Petrova","","Company"},
        };
    }
    @Test(dataProvider = "inputForNegativeLogInTest")
    public void negativeLogInTests(String lastName, String company, String expectedErrorMessage){
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        leadsPage.setLastName(lastName);
        leadsPage.setCompany(company);
        newLeadModal.clickSaveButton();
        Assert.assertEquals(leadsPage.getErrorMessageText(),expectedErrorMessage);
    }
}

