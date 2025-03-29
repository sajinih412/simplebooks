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

    //Set up the WebDriverManager to manage the ChromeDriver
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    //initialize the WebDriver, maximizes the window, and navigates to the base URL
    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    //Quit the WebDriver instance to close the browser
    @AfterMethod
    public void quit(){
        driver.quit();
    }



}
