package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChrossBrowserTest {
    WebDriver driver = null;

    //@Parameters("browser")
    @Test
    public void launchbrowser() {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
         driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
    }
}

