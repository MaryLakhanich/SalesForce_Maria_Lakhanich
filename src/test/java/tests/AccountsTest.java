package tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountsPage;


public class AccountsTest extends BaseTest{

    private AccountsPage accountsPage;
    @BeforeClass
    public void initialise() {
        accountsPage = new AccountsPage(driver);
    }

}
