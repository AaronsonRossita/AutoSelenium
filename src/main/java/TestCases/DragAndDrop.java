package TestCases;

import Core.BaseDriver;
import Mapping.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class DragAndDrop extends BaseDriver {

    @BeforeTest
    public void CheckboxesTestCases() {
        startSession();
        PageFactory.initElements(driver, NewWebCheckboxesPage.class);
        PageFactory.initElements(driver, NewWebHomePage.class);
        PageFactory.initElements(driver, DropdownPage.class);
    }

    @Test
    public void checkTheFirstCheckbox() throws InterruptedException {
        NewWebHomePage.DragAndDropLink.click();
        Thread.sleep(1000);

        WebElement elementToMove = driver.findElement(By.id("column-a"));
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.id("column-a"))).build().perform();
        WebElement target = driver.findElement(By.id("column-b"));
        Thread.sleep(1000);
        (new Actions(driver)).dragAndDrop(elementToMove, target).perform();
        action.moveToElement(driver.findElement(By.id("column-b"))).release();
        Thread.sleep(5000);
        (new Actions(driver)).dragAndDrop(target, elementToMove).perform();
        Thread.sleep(5000);
    }

}
