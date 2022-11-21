package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OldWebsiteHomePage {

    WebDriver driver;

    //Sign In Button at Home page
    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    public static WebElement signInButton;

    //Woman tab button at Home page
    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
    public static WebElement womanTabButton;

    //Dresses tab button at Home page
    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
    public static WebElement dressesTabButton;

    //T-Shirts tab button at Home page
    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
    public static WebElement tShirtsTabButton;

    //public HomePage(WebDriver driver){
       // this.driver = driver;
       // PageFactory.initElements(driver, this);
    }


