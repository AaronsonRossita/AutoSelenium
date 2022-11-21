package TestCases;

import Core.BaseDriver;
import Mapping.DropdownPage;
import Mapping.NewWebCheckboxesPage;
import Mapping.NewWebHomePage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownTestCaes  extends BaseDriver {

    @BeforeTest
    public void DropdownTest1() {
        startSession();
        PageFactory.initElements(driver, DropdownPage.class);
        PageFactory.initElements(driver, NewWebHomePage.class);
    }

    @Test
    public void DropdownTestCase() throws InterruptedException {
        Thread.sleep(1000);
        NewWebHomePage.dropdownPageLink.click();
        Thread.sleep(1000);
        Select options = new Select (DropdownPage.DropdownList);
        options.selectByVisibleText("Option 1");
        Thread.sleep(5000);
        options.selectByIndex(2);
        Thread.sleep(5000);






    }

    @AfterTest
    public void DropdownTestFinish(){
        stopSession();
    }
}

