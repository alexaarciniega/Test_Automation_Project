package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class BaseTest {

    public WebDriver driver = getDriver();

    private WebDriver getDriver() {
        setupDriver("chrome");
        return driver;
    }

    private void setupDriver(String browserName) {
        switch(browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","/Users/aza0822/Automation Testing Bootcamp/Practice1/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/aza0822/Automation Testing Bootcamp/CapstoneProject/Capstone_Project/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Web Driver was not found in directory");
        }
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeTest() {
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        System.out.println("This is the start of the method.");
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        System.out.println("This is the end of the method");
        driver.close();
        driver.quit();

    }

}
