package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @AfterMethod (alwaysRun = true)
    public void after1() {
        System.out.println("v");
    }

    @BeforeMethod
    public void before1(){
        System.out.println("z");
    }
}



