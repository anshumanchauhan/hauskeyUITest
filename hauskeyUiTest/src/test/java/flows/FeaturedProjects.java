package flows;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FeaturedProjects {
    @Test
    public  void featured() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://devwebsite.hauskey.com/");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-home/app-featuredprojects/section"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WebElement privacy1= driver.findElement(By.xpath("(//div[@id='featured_project']/a/img)[4]"));

       WebElement subMenuOption = driver.findElement(By.className("owl-prev"));
        Actions action = new Actions(driver);
        action.moveToElement(privacy1).click(subMenuOption).build().perform();

  /*    WebElement privacy1= driver.findElement(By.xpath("(//div[@id='featured_project']/a/img)[5]"));
        privacy1.click();
        WebElement element = driver.findElement(By.id("logo"));

        ((JavascriptExecutor)driver).executeScript("var mouseEvent = document.createEvent('MouseEvents');mouseEvent.initEvent('mouseover', true, true); arguments[0].dispatchEvent(mouseEvent);", element);
*/      driver.close();
    }

}

