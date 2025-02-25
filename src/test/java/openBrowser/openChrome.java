package openBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;





public class openChrome {
    public static void main(String[] args) throws InterruptedException{
      WebDriver driver = null;
      driver =new ChromeDriver();
     driver.manage().window().maximize();
//     String URL = "https://www.google.com/";
//     driver.navigate().to(URL);
     driver.navigate().to("https://www.google.com/");
     driver.findElement(By.name("q")).sendKeys("AUTOMATION");
//     driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        //THIS  INVALID there are 2 classes with the same name
       // driver.findElement(By.className("gNO89b")).click();
        driver.findElements(By.className("gNO89b")).get(1).click();




     Thread.sleep(3000);
      driver.quit();


    }

}
