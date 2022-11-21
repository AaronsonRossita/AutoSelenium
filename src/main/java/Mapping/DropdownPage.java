package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage {

    WebDriver driver;

    //Dropdown List
    @FindBy(xpath = "//*[@id='dropdown']")
    public static WebElement DropdownList;
}
