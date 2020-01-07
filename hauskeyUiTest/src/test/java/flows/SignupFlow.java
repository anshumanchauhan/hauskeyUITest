package flows;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupFlow
{
    @Test

    public  void signup() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://devwebsite.hauskey.com/");
        WebElement signupfield= driver.findElement(By.linkText("SIGN UP"));

        signupfield.click();
        WebElement namefield= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        namefield.sendKeys("Anshuman Chauhan");
        WebElement emailfield= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        emailfield.sendKeys("anshu8559096633@gmail.com");
        WebElement countryfield1= driver.findElement(By.className("iti-arrow"));
        countryfield1.click();
        WebElement countrysearchfield1= driver.findElement(By.id("country-search-box"));
        countrysearchfield1.sendKeys("India");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //WebElement countryfind=driver.findElement(By.className("country-name"));
        WebElement selectcountry1=driver.findElement(By.xpath("//li[@id='in']"));
        selectcountry1.click();
        WebElement phonefield1= driver.findElement(By.id("phone"));
        phonefield1.sendKeys("7569389226");
        WebElement passwordfield1=driver.findElement(By.xpath("//input[@type='password']"));
        passwordfield1.sendKeys("#Ac12345");
        WebElement checkmarkfield= driver.findElement(By.className("checkmark"));
        checkmarkfield.click();
        WebElement loginbuttonfield1= driver.findElement(By.className("btn_primary_sq"));
        loginbuttonfield1.click();
        WebElement iconfield=driver.findElement(By.xpath("//img[@alt='logo_hauskey']"));
        iconfield.click();
        driver.close();

    }
}