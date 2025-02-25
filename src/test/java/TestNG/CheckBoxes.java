package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxes {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");


    }
    @Test
    public  void test()
    {
     boolean chk1Enable = driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).get(0).isEnabled();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(chk1Enable);
        boolean chk1Select = driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).get(0).isSelected();
        soft.assertFalse(chk1Select);

        soft.assertAll();
    }


    @AfterMethod
    public void quitBrowser() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }
}
