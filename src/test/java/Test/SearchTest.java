package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Utils.DriverManager;
import Utils.ExtentTestManager;
import Utils.TestListener;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class SearchTest extends BaseTest {

    @Test
    public void searchTest() {

        DriverManager.getDriver()
                .get("https://amazon.com");

        ExtentTestManager.getTest()
                .info("Navigated to Amazon");
    }
}
