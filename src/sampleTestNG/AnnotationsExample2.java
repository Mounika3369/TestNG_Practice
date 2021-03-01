package sampleTestNG;
import org.testng.annotations.*;

public class AnnotationsExample2 {
    @BeforeClass
    void login(){
        System.out.println("This is login");
    }
    @AfterClass
    void logout(){
        System.out.println("This is logout");
    }
    @Test(priority=1)
    void search(){
        System.out.println("This is search");
    }
    @Test(priority=2)
    void advSearch(){
        System.out.println("This is adv search");
    }
    @Test(priority=3)
    void recharge(){
        System.out.println("This is recharge");
    }
}
