package testScripts;
import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 2)
    public void sign()
    {
        System.out.println("2 TC");
    }

    @Test(priority = 1)
    public void test()
    {
        System.out.println("1 TC");
    }


    @Test(priority = 0)
    public void cases()
    {
        System.out.println("0 TC");
    }
    @Test(groups= {"Smoke"} , priority = 0)
    public void hello()
    {
        System.out.println("This is running from Priority Class File .....");
    }
}
