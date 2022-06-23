package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reusable.*;
import PageObjetModel.HomePage;

public class HomePageTestCases {

    private WebDriver driver;
    public Reusable res;
    public HomePage HP;
    public Action AC;



    @BeforeClass
    public void launchApplication(){

        res = new Reusable(); HP = new HomePage(); AC = new Action();
        driver = AC.getDriver();


    }



    @Test
    @Parameters({"headeroptions"})
    public void A_testMyHeaderModule(String headeroptions) {

        // Check For Header Primary Bar Options ...

        String[] individualHeaderOptions = headeroptions.split(",");

        for (int i = 0; i < individualHeaderOptions.length; i++) {

            Assert.assertTrue(AC.checkForPresenceOfAWebElement(HP.headerOptions(individualHeaderOptions[i])));
        }


    }


    @AfterClass
    public void quitApp(){

        driver.quit();



    }









}
