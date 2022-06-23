package testScripts;
import org.testng.annotations.Test;

public class Grouping {


    @Test(groups= {"Smoke"})
    public void Smoke1()
    {
        System.out.println("sign TC..this is Smoke1");
    }


    @Test(groups= {"Regression"})
    public void Regression2()
    {
        System.out.println("test TC..this is Regression2");
    }
    @Test(groups= {"Regression"})
    public void Regression3()
    {
        System.out.println("test TC..this is Regression3");
    }


    @Test(groups= {"Sanity"})
    public void Sanity1()
    {
        System.out.println("cases TC..this is Sanity1");
    }

    @Test(groups= {"Sanity"})
    public void Sanity2()
    {
        System.out.println("test TC..this is Sanity2");
    }

    @Test(groups= {"Sanity"})
    public void Sanity3()
    {
        System.out.println("test TC..this is Sanity3");
    }

    @Test(groups= {"DevUnitTest"})
    public void DevUnitTest1()
    {
        System.out.println("hello TC..this is DevUnitTest1");
    }

    @Test(groups= {"DevUnitTest"})
    public void DevUnitTest2()
    {
        System.out.println("hello TC..this is DevUnitTest2");
    }

    @Test(groups= {"DevUnitTest"})
    public void DevUnitTest3()
    {
        System.out.println("hello TC..this is DevUnitTest3");
    }

    @Test(groups= {"Smoke"})
    public void Smoke2()
    {
        System.out.println("sign TC..this is Smoke2");
    }
    @Test(groups= {"Smoke"})
    public void Smoke3()
    {
        System.out.println("sign TC..this is Smoke3");
    }

    @Test(groups= {"Regression"})
    public void Regression1()
    {
        System.out.println("test TC..this is Regression1");
    }

}

