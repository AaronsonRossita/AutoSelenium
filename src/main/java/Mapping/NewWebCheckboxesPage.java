package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWebCheckboxesPage {

    WebDriver driver;

    //Checkbox number 1
    @FindBy(xpath = "//*[@id='checkboxes']/input[1]")
    public static WebElement checkboxesNumber1;

    //Checkbox number 2
    @FindBy(xpath = "//*[@id='checkboxes']/input[2]")
    public static WebElement checkboxesNumber2;
}
