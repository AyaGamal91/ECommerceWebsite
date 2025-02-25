package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuappCss {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver;
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.navigate().to("https://the-internet.herokuapp.com/login");
     // driver.findElement(By.cssSelector("div[class=\"large-6 small-12 columns\"] input[type=\"text\
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("tomsmith");
      //driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[contains(@id,\"password\")]")).sendKeys("SuperSecretPassword!");
        // driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
      //driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//form[@id=\"login\"]//button[@class=\"radius\"]")).click();
        //driver.findElement(By.xpath("//button[@class=\"radius\" and @type=\"submit\"]")).click();
      //driver.findElement(By.cssSelector("i[class*=\"-2x fa-sign-in\"]")).click();
         driver.findElement(By.cssSelector("a[target=\"_blank\"]")).click();
       // div[class="large-6 small-12 columns"] input[type="text"]
        driver.findElement(By.className("icon-signout")).click();



        Thread.sleep(3000);
        driver.quit();
    }
}
