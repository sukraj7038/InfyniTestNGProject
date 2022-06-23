package testScripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonMethods {

    @BeforeSuite
    public void doMyDataBaseConnection(){

        // Do the DB Connection as per Project ....

    }


    @AfterSuite
    public void DisconnectMyDataBaseConnection(){

        System.out.println("My Database connection is Disconnected ............");
    }





}
