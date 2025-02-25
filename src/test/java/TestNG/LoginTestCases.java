package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTestCases {
    WebDriver driver;
@BeforeMethod
    public void openBrowser()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test(priority = 1)
    public void validLogin()
    {
        SoftAssert soft = new SoftAssert();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
       String actualURL = driver.getCurrentUrl();
      String expectedURL = "https://the-internet.herokuapp.com/secure";
        soft.assertEquals(actualURL,expectedURL);
       String actualMsg = driver.findElement(By.id("flash")).getText();
       String ExpectedMsg ="You logged into a secure area!";
       boolean result = actualMsg.contains(ExpectedMsg);
       soft.assertTrue(result);
String actualColor =driver.findElement(By.id("flash")).getCssValue("background-color");
        //System.out.println(actualColor);
       soft.assertEquals(actualColor,"rgba(93, 164, 35, 1)");
        String actualColorHex = Color.fromString(actualColor).asHex();
       soft.assertEquals(actualColorHex,"#5da423");
        boolean logoutBut  = driver.findElement(By.className("icon-signout")).isDisplayed();
        soft.assertEquals(logoutBut,true);
     //OR-soft.assertTrue(logoutBut);
        int count = driver.findElements(By.cssSelector("button[class=\"radius\"]")).size();
        soft.assertEquals(count,0);
        boolean ss =driver.findElements(By.cssSelector("button[class=\"radius\"]")).isEmpty();
        soft.assertEquals(ss,true);


//        boolean LogInBtn;
//        try
//        {
//            LogInBtn = driver.findElement(By.cssSelector("button[class=\"radius\"]")).isDisplayed();
//        }
//        catch (NoSuchElementException e)
//        {
//            LogInBtn = false;
//            e.printStackTrace();
//        }
        soft.assertAll();

    }
    @Test(priority = 2)
    public void invalidLogin()
    {
        System.out.println("write code to execute invalidLogin");

    }
    @AfterMethod
    public void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        

    }

    }

