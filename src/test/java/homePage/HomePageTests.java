package homePage;

import Pages.HomePage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTests {


    @Test
    public void headerTest() {
     Assert.assertEquals(homePage.getHeaderText(),"Start with more than a blinking cursor");
    }
}
