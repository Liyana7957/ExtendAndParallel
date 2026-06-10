package Grid;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Utils.DriverManager;
import Utils.ExtentTestManager;
import Utils.TestListener;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class LoginTestGrid extends BaseTestGrid {

    @Test
    public void loginTest() {

        DriverManager.getDriver()
                .get("https://google.com");

        ExtentTestManager.getTest()
                .info("Navigated to Google");
    }
}
