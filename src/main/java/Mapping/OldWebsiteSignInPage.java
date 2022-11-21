package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OldWebsiteSignInPage {

    WebDriver driver;

    //Email address text at Sign In page
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/label")
    public static WebElement emailText;

    //Email address text field at Sign In page
    @FindBy(id = "email")
    public static WebElement emailTextFiled;

    //Password text at Sign In page
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/label")
    public static WebElement passwordText;

    //Password text field at Sign In page
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input")
    public static WebElement passwordTextField;

    //Apply Sign In button at Sign In page
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
    public static WebElement applySignInButton;

    //Authentication failed error at Sign In page
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")
    public static WebElement authenticationFailedError;

    //public SignInPage(WebDriver driver){
      //  this.driver = driver;
      //  PageFactory.initElements(driver, this);
    }


