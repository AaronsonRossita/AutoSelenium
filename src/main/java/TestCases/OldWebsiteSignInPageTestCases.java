package TestCases;
import Core.BaseDriver;
import Mapping.OldWebsiteHomePage;
import Mapping.OldWebsiteSignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class OldWebsiteSignInPageTestCases extends BaseDriver {

@BeforeTest
    public void SignInPageTestCases() {
    startSession();
    PageFactory.initElements(driver, OldWebsiteHomePage.class);
    PageFactory.initElements(driver, OldWebsiteSignInPage.class);
}

@Test
    public void CannotLogInWithBadCredentials() throws InterruptedException {
    OldWebsiteHomePage.signInButton.click();
    Thread.sleep(1000);
    OldWebsiteSignInPage.emailTextFiled.sendKeys("dudi@email.com");
    Thread.sleep(1000);
    OldWebsiteSignInPage.passwordTextField.sendKeys("AutomationIsTheBest");
    Thread.sleep(1000);
    OldWebsiteSignInPage.applySignInButton.click();
    String ErrorMSGtext = OldWebsiteSignInPage.authenticationFailedError.getText();
    Assert.assertTrue(ErrorMSGtext.equals("Authentication Failed"));
}



}
