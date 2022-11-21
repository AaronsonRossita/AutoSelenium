package Mapping;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage {

    WebDriver driver;

    //ItamA
    @FindBy(id ="column-a")
    public static WebElement ItemA;

    //ItamB
    @FindBy(id ="column-b")
    public static WebElement ItemB;
}



