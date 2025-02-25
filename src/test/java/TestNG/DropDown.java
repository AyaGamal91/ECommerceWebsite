package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;

public class DropDown {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");


    }
    @Test(priority = 1)
    public  void DrobDownStatic()throws InterruptedException
    {
        WebElement SL = driver.findElement(By.id("dropdown"));
        Select staticList = new Select(SL);
        staticList.selectByIndex(1);
        Thread.sleep(3000);
        staticList.selectByIndex(2);
    }
    @Test(priority = 2)
    public void DynamicDropDown()
    {
        driver.get("https://the-internet.herokuapp.com/");
   List<WebElement> li   = driver.findElements(By.cssSelector("div[id=\"content\"]>ul>li>a"));
int min = 0;
int max = li.size()-1;
int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);
        li.get(random_int).click();
    }


    @AfterMethod
    public void quitBrowser() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }
}
