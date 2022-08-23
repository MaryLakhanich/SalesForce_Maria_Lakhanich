package tests;

import models.Lead;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.modals.NewLeadModal;
import utils.ExpectedMessages;
import utils.LeadFactory;

public class LeadsTests extends BaseTest {

    private LeadsPage leadsPage;
    private NewLeadModal newLeadModal;
    private LeadDetailsPage leadDetailsPage;
    private LeadFactory leadFactory;
    @BeforeClass
    public void initialise() {
        leadsPage = new LeadsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        leadDetailsPage = new LeadDetailsPage(driver);
        leadFactory = new LeadFactory();
    }

    @Test(dataProvider = "leadTestData")
    public void createLeadTest(Lead newLead) {
        loginPage.waitForPageLoaded();
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        newLeadModal.fillForm(newLead);
        newLeadModal.clickSaveButton();
        leadDetailsPage.waitForPageLoaded();
        Assert.assertEquals(homePage.getMessageText(), ExpectedMessages.expectedLeadMessageText(newLead.getSalutation().getChosenSalutation(), newLead.getFirstName(), newLead.getLastName()));
        leadDetailsPage.clickDetailsButton();
        leadDetailsPage.getLeadInfo();
        Assert.assertEquals(leadDetailsPage.getLeadInfo(), newLead);
        homePage.clickLogout();
    }
    @DataProvider
    public Object[][] leadTestData() {
        return new Object[][]{
                {leadFactory.createCompletelyFilledLead()},
                {leadFactory.createLeadWithMinimItems()},
        };
    }
}

