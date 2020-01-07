package flows;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlow {
    @Test
    public  void search() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://devwebsite.hauskey.com/");
        try {
            driver.findElement(By.id("search")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("search")).sendKeys("tor");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"cities_click\"]/p")).click();
            Thread.sleep(2000);

        }
        catch(Exception e)
        {

        }
        finally {
            driver.close();
        }



    }
}