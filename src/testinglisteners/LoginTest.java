package testinglisteners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    void setup(){   //fail
        Assert.assertTrue(false);
    }
    @Test
    void loginByEmail(){   //pass
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods={"setup"})
    void loginByFacebook(){
        Assert.assertTrue(true);
    }
}
