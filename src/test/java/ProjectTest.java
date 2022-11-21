import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectTest {

    @BeforeTest
    @Test
    void testOne(){
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //WebElement loginField = driver.findElement(By.id("user-name"));
        //WebElement loginField = driver.findElement(By.cssSelector("#user-name"));
        //WebElement loginField = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement loginField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        loginField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginBtn.click();

        //driver.close();
        driver.quit();
    }




}
