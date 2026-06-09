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
public class PaymentTest extends BaseTest {

    @Test
    public void paymentTest() {

        DriverManager.getDriver()
                .get("https://flipkart.com");

        ExtentTestManager.getTest()
                .info("Navigated to Flipkart");
    }
}
