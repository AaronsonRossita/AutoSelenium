package TestCases;

import Core.BaseDriver;
import Mapping.DropdownPage;
import Mapping.NewWebCheckboxesPage;
import Mapping.NewWebHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertion extends BaseDriver {

        @BeforeTest
        public void SoftAssertionTestCases() {
            startSession();
            PageFactory.initElements(driver, NewWebCheckboxesPage.class);
            PageFactory.initElements(driver, NewWebHomePage.class);
            PageFactory.initElements(driver, DropdownPage.class);
        }

        @Test(groups="Sanity",enabled=false)
        public void SoftAssertion() throws InterruptedException {
            driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            SoftAssert softAssertion = new SoftAssert();
            softAssertion.assertEquals(NewWebHomePage.MainText.getText(), "Welcome to the-internet");
            WebDriverWait wait= (WebDriverWait) new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='content']/h2")));

            softAssertion.assertEquals(NewWebHomePage.SecoundText.getText(), "Available Examples");
            softAssertion.assertAll();
        }
            @AfterTest
            public void DropdownTestFinish(){
                stopSession();
        }
        }

