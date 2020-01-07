package flows;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AboutUsFlow {
    @Test

    public  void about() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://devwebsite.hauskey.com/");
        try {
            long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

            while (true) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(2000);

                long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
                if (newHeight == lastHeight) {
                    break;
                }
                lastHeight = newHeight;
            }
            System.out.println("hiiiii");

            Thread.sleep(5000);
            driver.findElement(By.xpath("//li[@id='about_us']/a")).click();
            Thread.sleep(5000);

            String s="https://devwebsite.hauskey.com/settings/settings/aboutUs";
            String redirected=driver.getCurrentUrl();
            Assert.assertEquals(s,redirected);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            driver.close();
        }

    }
}
