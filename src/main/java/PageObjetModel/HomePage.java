package PageObjetModel;
import org.openqa.selenium.*;

public class HomePage {



    public By headerOptions(String headerName){

        return By.xpath("(//button[contains(.,'"+headerName+"')])[1]");

    }


}
