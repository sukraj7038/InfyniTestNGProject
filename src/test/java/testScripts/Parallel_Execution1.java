package testScripts;

import PageObjetModel.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reusable.Action;
import reusable.Reusable;


public class Parallel_Execution1 {


    private WebDriver driver;
    public Reusable res;
    public HomePage HP;
    public Action AC;


    @BeforeClass
    public void launchApplication(){ res = new Reusable(); HP = new HomePage(); AC = new Action(); }




    @Test
    public void domanual2AutomationPageExecution(){
        driver = AC.getDriverwithURL("https://www.manual2Automation.com");
        System.out.println("The Title of the manual2Automation Page is ==>"+driver.getTitle());
        driver.quit();

    }

    @Test
    public void dow3SchoolPageExecution(){

        driver = AC.getDriverwithURL("https://www.w3schools.com");
        System.out.println("The Title of the w3schools Page is ==>"+driver.getTitle());
        driver.quit();
    }

    @Test
    public void doYahooPageExecution(){

        driver = AC.getDriverwithURL("https://www.yahoo.com");
        System.out.println("The Title of the yahoo Page is ==>"+driver.getTitle());
        driver.quit();
    }

    public void tearDown(){
        driver.quit();
    }



}
