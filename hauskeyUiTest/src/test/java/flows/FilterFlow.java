package flows;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterFlow {


    @Test
    public   void minprice() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://devwebsite.hauskey.com/main/project-listing?searchCriteria=%7B%22cityId%22:1%7D");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        try {
            Thread.sleep(5000);
            driver.findElement(By.id("filter")).click();

            Thread.sleep(2000);
            driver.findElement(By.id("min_price")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"min_price\"]/select/option[1]")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("max_price")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"max_price\"]/select/option[2]")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("search_filter")).click();

        } catch (Exception e) {
        }
        finally {
            driver.close();
        }

    }
    @Test
    public void maxprice(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://devwebsite.hauskey.com/main/project-listing?searchCriteria=%7B%22cityId%22:1%7D");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        try {
            Thread.sleep(5000);
            driver.findElement(By.id("filter")).click();

            Thread.sleep(2000);
            driver.findElement(By.id("min_price")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"min_price\"]/select/option[1]")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("max_price")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"max_price\"]/select/option[14]")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("search_filter")).click();

        } catch (Exception e) {
        }
        finally {
            driver.close();
        }

    }
    @Test
    public void minArea(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://devwebsite.hauskey.com/main/project-listing?searchCriteria=%7B%22cityId%22:1%7D");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        try {
            Thread.sleep(5000);
            driver.findElement(By.id("filter")).click();

            Thread.sleep(2000);
            driver.findElement(By.id("min_area")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"min_area\"]/select/option[2]")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("max_area")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"max_area\"]/select/option[4]")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("search_filter")).click();

        } catch (Exception e) {
        }
        finally {
            driver.close();
        }
    }
}
