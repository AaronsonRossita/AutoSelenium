package Mapping;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWebHomePage {

    WebDriver driver;

    //Checkboxes page link
    @FindBy(xpath = "//*[@id='content']/ul/li[6]/a")
    public static WebElement checkboxesPageLink;


    //Dropdown page link
    @FindBy(xpath = "//*[@id='content']/ul/li[11]/a")
    public static WebElement dropdownPageLink;

    //Drag And Drop link
    @FindBy(xpath = "//*[@id=\'content\']/ul/li[10]/a")
    public static WebElement DragAndDropLink;

    //Main page text
    @FindBy(xpath = "//*[@id='content']/h1")
    public static WebElement MainText;

    //Main page text
    @FindBy(xpath = "//*[@id='content']/h2")
    public static WebElement SecoundText;
}
