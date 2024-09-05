package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize WebDriver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
