package tests;


import models.Account;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.AccountsPage;
import pages.LeadDetailsPage;
import pages.modals.NewAccountModal;
import utils.AccountFactory;
import utils.ExpectedMessages;


public class AccountsTest extends BaseTest {
    private AccountsPage accountsPage;
    private NewAccountModal newAccountModal;
    private pages.AccountDetailsPage accountDetailsPage;
    private AccountFactory accountFactory;
    private LeadDetailsPage leadDetailsPage;

    @BeforeClass
    public void initialise() {
        accountsPage = new AccountsPage(driver);
        newAccountModal= new NewAccountModal(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        accountFactory = new AccountFactory();
        leadDetailsPage = new LeadDetailsPage(driver);
    }

    @Test(dataProvider = "AccountTestData")
    public void createAccountTest(Account newAccount) {
        loginPage.waitForPageLoaded();
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openAccountsTab();
        accountsPage.clickNewButton();
        newAccountModal.waitForPageLoaded();
        newAccountModal.fillForm(newAccount);
        newAccountModal.clickSaveButton();
        accountsPage.waitForPageLoaded();
        Assert.assertEquals(homePage.getMessageText(), ExpectedMessages.expectedAccountMessageText(newAccount.getAccountName()));
        leadDetailsPage.clickDetailsButton();
        accountDetailsPage.getAccountInfo();
        Assert.assertEquals(accountDetailsPage.getAccountInfo(), newAccount);
        homePage.waitLForLogoutClickable();
        homePage.clickLogout();
    }
    @DataProvider
    public Object[][] AccountTestData() {
        return new Object[][]{
                {accountFactory.createCompletelyFilledAccount()},
                {accountFactory.createAccountWithMinimumItems()},
        };
    }
}