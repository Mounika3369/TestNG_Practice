package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
    @Parameters({"a","b"})
    @Test
    void m1(String a,String b) {

        System.out.println(a+" "+ b);
    }

    @Test
    void m2() {
        System.out.println("This is m2 from Testcase1");
    }

}
