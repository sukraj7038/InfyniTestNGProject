package reusable;


import org.openqa.selenium.WebDriver;

import java.util.*;
import java.io.*;

public class Reusable {


      /*
        This method can read Application data from properties File
     */


    public String readTestDataFromPropertiesFile(String key)
    {
        String value = null;

        try {
            InputStream input = new FileInputStream(System.getProperty("user.dir")+"/global.properties");

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);
            value = prop.getProperty(key);
        }
        catch(Exception e){e.printStackTrace();}

        return value;
    }










}
