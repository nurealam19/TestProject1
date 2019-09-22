package testFaceBook;

import commonMethods.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestFaceBook extends CommonMethods {


    @Test
    public void test1(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Facebook - Log In or Sign Up");
    }
}

