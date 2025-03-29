package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    //Locate the email field
    @FindBy (name = "email")
    private WebElement emailField;

    //Locate the password field
    @FindBy(name = "password")
    private WebElement passwordField;

    //Locate the login button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    //Constructor to initialize WebDriver and PageFactory elements
    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to enter the email
    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    //Method to enter the password
    public void enterPassword (String password){
        passwordField.sendKeys(password);
    }

    //Method to click the Login button
    public void clickLoginButton(){
        loginButton.click();
    }


}
