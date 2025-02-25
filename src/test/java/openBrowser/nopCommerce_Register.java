package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class nopCommerce_Register {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("aya");
        driver.findElement(By.id("LastName")).sendKeys("gamal");
        driver.findElement(By.cssSelector("option[value=\"6\"]")).click();
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\" ]//option[@value=\"3\"]")).click();
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\" ]//option[@value=\"1991\"]")).click();
        driver.findElement(By.id("Email")).sendKeys("da1b9f2c37d8@drmail.in");
        driver.findElement(By.id("Company")).sendKeys("N/A");
        driver.findElement(By.id("Password")).sendKeys("Adam2016");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Adam2016");
        driver.findElement(By.id("register-button")).click();
      //  driver.findElement(By.className("ico-login")).click();
       // driver.findElement(By.id("Email")).sendKeys("0ce6feb3fa7f@drmail.in");
        //driver.findElement(By.id("Password")).sendKeys("Adam2016");
       // driver.findElement(By.className("login-button")).click();
        driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
        driver.findElement(By.className("search-box-button")).click();











   Thread.sleep(3000);
    driver.quit();
    }
}
