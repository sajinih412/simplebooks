package TestSuites;

import Pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest{

    @Test
    //Enter the credentials and submit login
    public void testVerifySuccessfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("sajinihansika412@gmail.com");
        loginPage.enterPassword("Abc@1234");
        loginPage.clickLoginButton();

    //Validate successful login by checking the redirected URL
        String expectedURL = "https://tax.simplebooks.com/main/income";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(expectedURL));
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "URL Mismatch: Expected " + expectedURL + " but found " + actualURL);
    }
}
