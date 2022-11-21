package TestCases;

import Core.BaseDriver;
import Mapping.NewWebCheckboxesPage;
import Mapping.NewWebHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckboxesTestCases extends BaseDriver {

    @BeforeTest
    public void CheckboxesTestCases() {
        startSession();
        PageFactory.initElements(driver, NewWebCheckboxesPage.class);
        PageFactory.initElements(driver, NewWebHomePage.class);
    }

    @Test
    public void checkTheFirstCheckbox() throws InterruptedException {
        Thread.sleep(1000);
        NewWebHomePage.checkboxesPageLink.click();
        Thread.sleep(1000);
        NewWebCheckboxesPage.checkboxesNumber1.click();
        Thread.sleep(5000);
        NewWebCheckboxesPage.checkboxesNumber2.click();
        Thread.sleep(5000);

        Thread.sleep(1000);
        driver.findElement((xpath = "//*[@id='content']/ul/li[6]/a")).click();
        Thread.sleep(1000);
        driver.findElement((xpath = "//*[@id='checkboxes']/input[1]")).click();
        Thread.sleep(1000);
        driver.findElement((xpath = "//*[@id='checkboxes']/input[2]")).click();



        //WebElement checkBoxElement1 = NewWebCheckboxesPage.checkboxesNumber1;
        boolean isSelected = NewWebCheckboxesPage.checkboxesNumber1.isSelected();
        if (isSelected == true){
            NewWebCheckboxesPage.checkboxesNumber1.click();
            Thread.sleep(5000);

        }
    }

    @AfterTest
    public void CheckboxesTestCasesFinish(){
        stopSession();
    }
}
