package tests;

import models.Contact;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ContactDetailsPage;
import pages.ContactsPage;
import pages.LeadDetailsPage;
import pages.modals.NewContactModal;
import utils.ContactFactory;
import utils.ExpectedMessages;

public class ContactsTest extends BaseTest {

    private pages.ContactsPage contactsPage;
    private NewContactModal newContactModal;
    private pages.ContactDetailsPage contactDetailsPage;
    private LeadDetailsPage leadDetailsPage;
    private ContactFactory contactFactory;

    @BeforeClass
    public void initialise() {
        contactsPage = new ContactsPage(driver);
        newContactModal = new NewContactModal(driver);
        contactDetailsPage = new ContactDetailsPage(driver);
        leadDetailsPage = new LeadDetailsPage(driver);
        contactFactory = new ContactFactory();
    }

    @Test(dataProvider = "ContactTestData")
    public void createContactTest(Contact newContact) {
        loginPage.waitForPageLoaded();
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openContactsTab();
        contactsPage.waitForPageLoaded();
        contactsPage.clickNewButton();
        newContactModal.waitForPageLoaded();
        newContactModal.fillForm(newContact);
        newContactModal.clickSaveButton();
        contactDetailsPage.waitForPageLoaded();
        Assert.assertEquals(homePage.getMessageText(), ExpectedMessages.expectedContactMessageText(newContact.getSalutation().getChosenSalutation(), newContact.getFirstName(), newContact.getLastName()));
        leadDetailsPage.clickDetailsButton();
        contactDetailsPage.getContactInfo();
        Assert.assertEquals(contactDetailsPage.getContactInfo(), newContact);
        homePage.waitLForLogoutClickable();
        homePage.clickLogout();
    }
    @DataProvider
    public Object[][] ContactTestData() {
        return new Object[][]{
                {contactFactory.createCompletelyFilledContact()},
                {contactFactory.createContactWithMinimumItems()},
        };
    }
}
