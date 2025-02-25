package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ExplicitWait {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test(priority = 1)
    public  void explicitWait()throws InterruptedException
    {
        driver.findElement(By.cssSelector("a[target=\"_blank\"]")).click();
        WebDriverWait explicit= new WebDriverWait(driver,Duration.ofSeconds(10));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));

    }



    @AfterMethod
    public void quitBrowser() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }
}
