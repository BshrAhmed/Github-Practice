package GithubWeb;

import Base.BaseClass;
import Pages.HomePages;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubHomeTest extends BaseClass {

    @Test(groups = {"smoke"})
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);
        login.openUrl();
        login.enterUserName();
        login.enterPassword();
        login.clickOnLoginBtn();
    }

    @Test
    public void HomePageMethod() throws InterruptedException {
        HomePages home = new HomePages(driver);
        loginPageMethod();
        home.clickOnNavigatorBtn();
        home.clickOnRepo();
        home.createNewRepo();
        home.newRepoName();
        home.scrollToPosition(0, 600);
        home.createRepoButton();
    }
}
