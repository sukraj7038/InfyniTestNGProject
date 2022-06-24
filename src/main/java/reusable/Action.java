package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {

    public WebDriver driver = null;
    public Reusable res;



    // Function to check a Web element is present or not ....


    public boolean checkForPresenceOfAWebElement(By by){

        boolean FLAG = false;
        WebElement ele = driver.findElement(by);
        try{
            if(ele.isDisplayed()){
                FLAG = true;
            }
        }
        catch (Exception e){e.printStackTrace();}

        return FLAG;
    }

    public WebDriver getDriver()
    {
        res = new Reusable();
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(res.readTestDataFromPropertiesFile("url"));
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getDriverwithURL(String url)
    {
        res = new Reusable();
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }



}
