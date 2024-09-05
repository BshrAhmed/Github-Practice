package GithubWeb;

import Base.BaseClass;
import Pages.GithubPages;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    public void mainPageMethod() throws InterruptedException {
        GithubPages github = new GithubPages(driver);
        github.openGitUrl();
        Thread.sleep(2000);
        github.clickOnDocs();
        Thread.sleep(3000);
    }

    @Test
    public void signInMethod() throws InterruptedException {
        GithubPages signIn = new GithubPages(driver);
        signIn.openGitUrl();
        signIn.clickOnSignInBtn();


        LoginPages login = new LoginPages(driver);
        login.enterUserName();
        login.enterPassword();
        login.clickOnLoginBtn();
    }
}
