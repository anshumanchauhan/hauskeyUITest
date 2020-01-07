package flows;


import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFlow {
    @Test
    public void logintest()     {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String s="https://devwebsite.hauskey.com/";
        driver.navigate().to(s);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement searchfield= driver.findElement(By.linkText("LOGIN"));
        searchfield.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement countryfield= driver.findElement(By.className("iti-arrow"));
        countryfield.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement countrysearchfield= driver.findElement(By.id("country-search-box"));
        countrysearchfield.sendKeys("India");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement countryfind=driver.findElement(By.className("country-name"));
        WebElement selectcountry=driver.findElement(By.xpath("//li[@id='in']"));
        selectcountry.click();
        WebElement phonefield= driver.findElement(By.id("phone"));


        phonefield.sendKeys("7569389226");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement passwordfield=driver.findElement(By.xpath("//input[@type='password']"));
        passwordfield.sendKeys("#Ac12345");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement loginbuttonfield= driver.findElement(By.className("btn_primary_sq"));
        loginbuttonfield.click();
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        String current=driver.getCurrentUrl();
        Assert.assertEquals(s,current);




        //add wait for page to load completely
        //    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //   WebDriverWait wait = new WebDriverWait(driver, 20);
        //    wait.until(ExpectedConditions.urlContains("https://www.hauskey.com/"));

        // System.out.println(driver.getCurrentUrl());

        //if(driver.getCurrentUrl().equals("https://www.hauskey.com/"))
        //.   System.out.println("Success");
        //   else
        //System.out.println("Failure");

        //    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //  js.executeScript("window.scrollBy(0,1000)");

        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("window-size=945,1020");

        //DesiredCapabilities cap = DesiredCapabilities.chrome();
        //cap.setCapability(ChromeOptions.CAPABILITY, options);

        //js.executeScript("window.scrollTo(0,3)");
driver.close();

    }
}


