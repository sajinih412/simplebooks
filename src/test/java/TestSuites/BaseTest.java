package TestSuites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    public String baseURL = "https://tax.simplebooks.com/login";

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }


    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }



}
