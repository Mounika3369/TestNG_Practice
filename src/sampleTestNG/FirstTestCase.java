package sampleTestNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    void openURL(){

        System.out.println("This is open Browser");
    }
    @Test(priority = 3)
    void login(){

        System.out.println("This is login");
        Assert.assertEquals(1,1);
    }
    @Test(priority = 2)
    void logOut(){
        System.out.println("This is logout");
    }
}
