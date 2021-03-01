package pack1;

import org.testng.annotations.*;

public class Tc2 {
    @Test
    void m3(){
        System.out.println("This is m3 from Testcase2");
    }
    @Test
    void m4(){
        System.out.println("This is m4 from Testcase2");
    }
    @Test
    void m5(){
        System.out.println("This is m5 from Testcase2");
    }
    @AfterTest
    void nn(){
        System.out.println("This is nn");
    }
}
