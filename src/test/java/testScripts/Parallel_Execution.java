package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import reusable.*;
import PageObjetModel.HomePage;


public class Parallel_Execution {


    private WebDriver driver;
    public Reusable res;
    public HomePage HP;
    public Action AC;


    @BeforeClass
    public void launchApplication(){ res = new Reusable(); HP = new HomePage(); AC = new Action(); }


    @Test
    public void doGooglePageExecution(){

        driver = AC.getDriverwithURL("https://www.google.com");
        System.out.println("The Title of the Google Page is ==>"+driver.getTitle());
        driver.quit();

    }

    @Test
    public void doInfyniageExecution(){

        driver = AC.getDriverwithURL("https://www.infyni.com");
        System.out.println("The Title of the infyni Page is ==>"+driver.getTitle());
        driver.quit();
    }

    @Test
    public void dojetbrainsPageExecution(){

        driver = AC.getDriverwithURL("https://www.jetbrains.com");
        System.out.println("The Title of the jetbrains Page is ==>"+driver.getTitle());
        driver.quit();
    }



    public void tearDown(){
        driver.quit();
    }



}
