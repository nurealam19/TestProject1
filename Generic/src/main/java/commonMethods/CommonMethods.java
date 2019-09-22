package commonMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public WebDriver driver = null;
    @Parameters({"url"})

    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nurea\\TestProject1\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        //driver.navigate().
    }

    @AfterMethod
    public void clearUP() {
        driver.close();
    }

    @Test
    public void Test1() {
        String title = driver.getTitle();
        //System.out.println(title);
        Assert.assertEquals(title, "Facebook - Log In or Sign Up");
    }
}
