package pack1;

import org.testng.annotations.*;

public class Tc1 {
    @Test
    void m1(){
        System.out.println("This is m1 from Testcase1");
    }
    @Test
    void m2(){
        System.out.println("This is m2 from Testcase1");
    }
    @BeforeTest
    void mm(){
        System.out.println("This is mm ");
    }
}
