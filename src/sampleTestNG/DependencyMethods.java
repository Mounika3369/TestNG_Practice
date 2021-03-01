package sampleTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
    @Test(priority=1)
    void openURL(){
        System.out.println("This is openurl");
        Assert.assertTrue(true);
    }
    @Test(priority=2)
    void login(){
        System.out.println("This is login");
        Assert.assertTrue(true);
    }
    @Test(priority=3,dependsOnMethods = {"login"})
    void search(){
        System.out.println("This is search");
    }
    @Test(priority=4,dependsOnMethods = {"login","search"})
    void advSearch(){
        System.out.println("This is adv search");
    }
    @Test(priority=5)
    void logout(){
        System.out.println("This is logout");
    }
}
