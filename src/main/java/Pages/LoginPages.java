package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import static ObjectPaths.LoginPaths.*;


public class LoginPages {

    private WebDriver driver;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl() {
        driver.get("https://github.com/login");
    }

    public void enterUserName() {
        WebElement UserName = driver.findElement(userName);
        UserName.sendKeys("bshrr92@gmail.com");

    }

    public void enterPassword() {
        WebElement Password = driver.findElement(password);
        Password.sendKeys("Bshr@123@123");
    }

    public void clickOnLoginBtn(){
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
    }

}
